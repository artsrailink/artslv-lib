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
@Table(name = "KAIRTS_T_DAILYTICKET")
public class Dailyticket implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_DAILYTICKET_ID")
    private String id;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_DAILYTICKET_DATE")
    private LocalDate date;
    @Column(name = "C_STASIUN_IDDEST")
    private String stasiuniddest;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_DAILYTICKET_TICKETIDSTART")
    private String ticketidstart;
    @Column(name = "C_DAILYTICKET_TICKETIDNEXT")
    private String ticketidnext;
    @Column(name = "C_DAILYTICKET_AMOUNT")
    private BigDecimal amount;
    @Column(name = "C_DAILYTICKET_TICKETCANCEL")
    private int ticketcancel;
    @Column(name = "C_DAILYTICKET_STATUS")
    private String status;
    @Column(name = "C_DAILYTICKET_DOMAIN")
    private String domain;
    @Column(name = "C_DAILYTICKET_MODIFIEDBY")
    private String modifiedby;
//    @Temporal(TemporalType.TIMESTAMP) 
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_DAILYTICKET_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;
    @Column(name = "C_STASIUN_IDBOOK")
    private String stasiunidbook;
    @Column(name = "C_DAILYTICKET_PSGNUM")
    private int psgnum;    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Wagonclass wagonclass;
    @Transient
    private Stasiun stasiundest;
    @Transient
    private Stasiun stasiunorg;
    @Transient
    private Stasiun stasiunbook;
    @Transient
    private Schedule schedule;
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

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getTicketidstart() {
        return ticketidstart;
    }

    public void setTicketidstart(String ticketidstart) {
        this.ticketidstart = ticketidstart;
    }

    public String getTicketidnext() {
        return ticketidnext;
    }

    public void setTicketidnext(String ticketidnext) {
        this.ticketidnext = ticketidnext;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public int getTicketcancel() {
        return ticketcancel;
    }

    public void setTicketcancel(int ticketcancel) {
        this.ticketcancel = ticketcancel;
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

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiunidbook() {
        return stasiunidbook;
    }

    public void setStasiunidbook(String stasiunidbook) {
        this.stasiunidbook = stasiunidbook;
    }

    public Stasiun getStasiundest() {
        return stasiundest;
    }

    public void setStasiundest(Stasiun stasiundest) {
        this.stasiundest = stasiundest;
    }

    public Stasiun getStasiunorg() {
        return stasiunorg;
    }

    public void setStasiunorg(Stasiun stasiunorg) {
        this.stasiunorg = stasiunorg;
    }

    public Stasiun getStasiunbook() {
        return stasiunbook;
    }

    public void setStasiunbook(Stasiun stasiunbook) {
        this.stasiunbook = stasiunbook;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
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

    public int getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(int no_urut) {
        this.no_urut = no_urut;
    }

    public int getPsgnum() {
        return psgnum;
    }

    public void setPsgnum(int psgnum) {
        this.psgnum = psgnum;
    }

    public User getUsermodified() {
        return usermodified;
    }

    public void setUsermodified(User usermodified) {
        this.usermodified = usermodified;
    }

}
