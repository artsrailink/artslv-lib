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
@Table(name = "KAIRTS_T_SUPLISI")
public class Suplisi implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SUPLISI_ID")
    private String id;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SUPLISI_DATE")
    private LocalDate date;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SUPLISI_DOCDATE")
    private LocalDate docdate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SUPLISI_TRIPDATE")
    private LocalDate tripdate;
    @Column(name = "C_SUPLISI_DOCNUM")
    private String docnum;
    @Column(name = "C_SUPLISI_ORDERNUM")
    private String ordernum;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;
    @Column(name = "C_STASIUN_IDDEST")
    private String stasiuniddest;
    @Column(name = "C_SUPLISI_TOTAMOUNT")
    private BigDecimal totamount;
    @Column(name = "C_SUPLISI_STATUS")
    private String status;
    @Column(name = "C_SUPLISI_DOMAIN")
    private String domain;
    @Column(name = "C_SUPLISI_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SUPLISI_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    @Column(name = "C_STASIUN_IDBOOK")
    private String stasiunidbook;
    @Column(name = "C_SUPLISI_TYPE")
    private String type;
    @Column(name = "C_SUPLISI_WEIGHT")
    private float weight;
    @Column(name = "C_SUPLISI_PSGNUM")
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
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    LocalDate startdate, enddate, tripstartdate, tripenddate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String trainname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private User usermodified;       

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

    public LocalDate getDocdate() {
        return docdate;
    }

    public void setDocdate(LocalDate docdate) {
        this.docdate = docdate;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
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

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
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

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
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

    public LocalDate getTripstartdate() {
        return tripstartdate;
    }

    public void setTripstartdate(LocalDate tripstartdate) {
        this.tripstartdate = tripstartdate;
    }

    public LocalDate getTripenddate() {
        return tripenddate;
    }

    public void setTripenddate(LocalDate tripenddate) {
        this.tripenddate = tripenddate;
    }

    public String getStasiunidbook() {
        return stasiunidbook;
    }

    public void setStasiunidbook(String stasiunidbook) {
        this.stasiunidbook = stasiunidbook;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPsgnum() {
        return psgnum;
    }

    public void setPsgnum(int psgnum) {
        this.psgnum = psgnum;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public User getUsermodified() {
        return usermodified;
    }

    public void setUsermodified(User usermodified) {
        this.usermodified = usermodified;
    }

}
