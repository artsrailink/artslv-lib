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
@Table(name = "KAIRTS_T_BAGGAGETRANS")
public class Baggagetrans implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_BAGGAGETRANS_ID")
    private String id;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    @Column(name = "C_BAGGAGE_ID")
    private String baggageid;
    @Column(name = "C_BAGGAGETRANS_DOCTITLE")
    private String doctitle;
    @Column(name = "C_BAGGAGETRANS_DOCNUM")
    private int docnum;
    @Column(name = "C_BAGGAGETRANS_WEIGHT")
    private float weight;
    @Column(name = "C_BAGGAGETRANS_AMOUNT")
    private BigDecimal amount;
    @Column(name = "C_BAGGAGETRANS_TOTAMOUNT")
    private BigDecimal totamount;
    @Column(name = "C_BAGGAGETRANS_STATUS")
    private String status;
    @Column(name = "C_BAGGAGETRANS_DOMAIN")
    private String domain;
    @Column(name = "C_BAGGAGETRANS_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_BAGGAGETRANS_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_BAGGAGETRANS_DATE")
    private LocalDate date;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Wagonclass wagonclass;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Schedule schedule;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Baggage baggage;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Unit unit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Stasiun stasiunorg;    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private int no_urut;
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
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private User usermodified;       

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public String getBaggageid() {
        return baggageid;
    }

    public void setBaggageid(String baggageid) {
        this.baggageid = baggageid;
    }

    public String getDoctitle() {
        return doctitle;
    }

    public void setDoctitle(String doctitle) {
        this.doctitle = doctitle;
    }

    public int getDocnum() {
        return docnum;
    }

    public void setDocnum(int docnum) {
        this.docnum = docnum;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
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

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Baggage getBaggage() {
        return baggage;
    }

    public void setBaggage(Baggage baggage) {
        this.baggage = baggage;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public int getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(int no_urut) {
        this.no_urut = no_urut;
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

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public Stasiun getStasiunorg() {
        return stasiunorg;
    }

    public void setStasiunorg(Stasiun stasiunorg) {
        this.stasiunorg = stasiunorg;
    }

    public User getUsermodified() {
        return usermodified;
    }

    public void setUsermodified(User usermodified) {
        this.usermodified = usermodified;
    }

}
