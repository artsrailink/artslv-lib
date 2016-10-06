/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.manualtrans;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.org.Unit;
import co.id.artslv.lib.schedule.Schedule;
import co.id.artslv.lib.trains.Wagonclass;
import co.id.artslv.lib.users.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_PASEPARTU")
public class Pasepartu implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_PASEPARTU_ID")
    private String id;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_PASEPARTU_DATE")
    private LocalDate date;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;
    @Column(name = "C_STASIUN_IDDEST")
    private String stasiuniddest;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    @Column(name = "C_PASEPARTU_TICKETIDSTART")
    private String ticketidstart;   
    @Column(name = "C_PASEPARTU_TICKETIDEND")
    private String ticketidend;    
    @Column(name = "C_PASEPARTU_TICKETCANCEL")
    private int ticketcancel;       
    @Column(name = "C_PASEPARTU_TICKETREDUCTION")
    private int ticketreduction; 
    @Column(name = "C_PASEPARTU_TOTAMOUNT")
    private BigDecimal totamount;  
    @Column(name = "C_PASEPARTU_STATUS")
    private String status;   
    @Column(name = "C_PASEPARTU_DOMAIN")
    private String domain;      
    @Column(name = "C_PASEPARTU_MODIFIEDBY")
    private String modifiedby; 
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_PASEPARTU_MODIFIEDON")
    private LocalDateTime modifiedon; 
    @Column(name = "C_UNIT_ID")
    private String unitid;     
    @Column(name = "C_STASIUN_IDBOOK")
    private String stasiunidbook;   
    @Column(name = "C_PASEPARTU_PSGNUM")
    private int psgnum;     

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Schedule schedule;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Stasiun stasiunorg;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Stasiun stasiundest;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Stasiun stasiunbook;    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Wagonclass wagonclass;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Unit unit;  
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private int no_urut; 
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private User usermodified;       
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate startdate;    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate enddate;    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuniddest() {
        return stasiuniddest;
    }

    public void setStasiuniddest(String stasiuniddest) {
        this.stasiuniddest = stasiuniddest;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public String getTicketidstart() {
        return ticketidstart;
    }

    public void setTicketidstart(String ticketidstart) {
        this.ticketidstart = ticketidstart;
    }

    public String getTicketidend() {
        return ticketidend;
    }

    public void setTicketidend(String ticketidend) {
        this.ticketidend = ticketidend;
    }

    public int getTicketcancel() {
        return ticketcancel;
    }

    public void setTicketcancel(int ticketcancel) {
        this.ticketcancel = ticketcancel;
    }

    public int getTicketreduction() {
        return ticketreduction;
    }

    public void setTicketreduction(int ticketreduction) {
        this.ticketreduction = ticketreduction;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Stasiun getStasiunorg() {
        return stasiunorg;
    }

    public void setStasiunorg(Stasiun stasiunorg) {
        this.stasiunorg = stasiunorg;
    }

    public Stasiun getStasiundest() {
        return stasiundest;
    }

    public void setStasiundest(Stasiun stasiundest) {
        this.stasiundest = stasiundest;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getStasiunidbook() {
        return stasiunidbook;
    }

    public void setStasiunidbook(String stasiunidbook) {
        this.stasiunidbook = stasiunidbook;
    }

    public Stasiun getStasiunbook() {
        return stasiunbook;
    }

    public void setStasiunbook(Stasiun stasiunbook) {
        this.stasiunbook = stasiunbook;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public int getPsgnum() {
        return psgnum;
    }

    public void setPsgnum(int psgnum) {
        this.psgnum = psgnum;
    }

    public int getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(int no_urut) {
        this.no_urut = no_urut;
    }

    public User getUsermodified() {
        return usermodified;
    }

    public void setUsermodified(User usermodified) {
        this.usermodified = usermodified;
    }
        
}
