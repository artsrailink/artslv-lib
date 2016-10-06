/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.trains.Subclass;
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
import java.util.List;
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
@Table(name = "KAIRTS_T_RATE")
public class Rate implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_RATE_ID")
    private String id;

    @Column(name = "C_RATE_TOTAMOUNT")
    private BigDecimal ratetotamount;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_RATE_STARTDATE")
    private LocalDate ratestartdate;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_RATE_ENDDATE")
    private LocalDate rateenddate;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;
    @Column(name = "C_STASIUN_IDDEST")
    private String stasiuniddest;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_RATE_SELLSTARTDATE")
    private LocalDate ratesellstartdate;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_RATE_SELLENDDATE")
    private LocalDate ratesellenddate;
    @Column(name = "C_RATE_STATUS")
    private String ratestatus;
    @Column(name = "C_RATE_DOMAIN")
    private String ratedomain;
    @Column(name = "C_RATE_MODIFIEDBY")
    private String ratemodifiedby;
    @Column(name = "C_RATE_PSGTYPE")
    private String ratepsgtype;
    @Column(name = "C_RATE_REFUNDDAYS")
    private int raterefunddays;
    @Column(name = "C_RATE_REFUNDABLE")
    private String raterefundable;
    @Column(name = "C_RATE_CANCELABLE")
    private String ratecancelable;
    @Column(name = "C_RATE_REDUCTIBLE")
    private String ratereductiable;
    @Column(name = "C_RATE_RESCHEDULABLE")
    private String ratereschedulable;
    @Column(name = "C_RATE_RESEATABLE")
    private String ratereseatable;
    @Column(name = "C_RATE_RENAMABLE")
    private String raterenamable;
    @Column(name = "C_SUBCLASS_ID")
    private String subclassid;
    @Column(name = "C_RATE_SCHEDULENOKA")
    private String rateschedulenoka;    

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_RATE_MODIFIEDON")
    private LocalDateTime ratemodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private Stasiun stasiunorg;

    @Transient
    private Stasiun stasiundest;

    @Transient
    private Subclass subclass;

    @Transient
    private List<Ratedetail> listratedetail;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public BigDecimal getRatetotamount() {
        return ratetotamount;
    }

    public void setRatetotamount(BigDecimal ratetotamount) {
        this.ratetotamount = ratetotamount;
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

    public String getRatestatus() {
        return ratestatus;
    }

    public void setRatestatus(String ratestatus) {
        this.ratestatus = ratestatus;
    }

    public String getRatedomain() {
        return ratedomain;
    }

    public void setRatedomain(String ratedomain) {
        this.ratedomain = ratedomain;
    }

    public String getRatemodifiedby() {
        return ratemodifiedby;
    }

    public void setRatemodifiedby(String ratemodifiedby) {
        this.ratemodifiedby = ratemodifiedby;
    }

    public String getRatepsgtype() {
        return ratepsgtype;
    }

    public void setRatepsgtype(String ratepsgtype) {
        this.ratepsgtype = ratepsgtype;
    }

    public int getRaterefunddays() {
        return raterefunddays;
    }

    public void setRaterefunddays(int raterefunddays) {
        this.raterefunddays = raterefunddays;
    }

    public String getRaterefundable() {
        return raterefundable;
    }

    public void setRaterefundable(String raterefundable) {
        this.raterefundable = raterefundable;
    }

    public String getRatecancelable() {
        return ratecancelable;
    }

    public void setRatecancelable(String ratecancelable) {
        this.ratecancelable = ratecancelable;
    }

    public String getRatereductiable() {
        return ratereductiable;
    }

    public void setRatereductiable(String ratereductiable) {
        this.ratereductiable = ratereductiable;
    }

    public String getRatereschedulable() {
        return ratereschedulable;
    }

    public void setRatereschedulable(String ratereschedulable) {
        this.ratereschedulable = ratereschedulable;
    }

    public String getRatereseatable() {
        return ratereseatable;
    }

    public void setRatereseatable(String ratereseatable) {
        this.ratereseatable = ratereseatable;
    }

    public String getRaterenamable() {
        return raterenamable;
    }

    public void setRaterenamable(String raterenamable) {
        this.raterenamable = raterenamable;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public Subclass getSubclass() {
        return subclass;
    }

    public void setSubclass(Subclass subclass) {
        this.subclass = subclass;
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

    public List<Ratedetail> getListratedetail() {
        return listratedetail;
    }

    public void setListratedetail(List<Ratedetail> listratedetail) {
        this.listratedetail = listratedetail;
    }

    public LocalDate getRatestartdate() {
        return ratestartdate;
    }

    public void setRatestartdate(LocalDate ratestartdate) {
        this.ratestartdate = ratestartdate;
    }

    public LocalDate getRateenddate() {
        return rateenddate;
    }

    public void setRateenddate(LocalDate rateenddate) {
        this.rateenddate = rateenddate;
    }

    public LocalDate getRatesellstartdate() {
        return ratesellstartdate;
    }

    public void setRatesellstartdate(LocalDate ratesellstartdate) {
        this.ratesellstartdate = ratesellstartdate;
    }

    public LocalDate getRatesellenddate() {
        return ratesellenddate;
    }

    public void setRatesellenddate(LocalDate ratesellenddate) {
        this.ratesellenddate = ratesellenddate;
    }

    public LocalDateTime getRatemodifiedon() {
        return ratemodifiedon;
    }

    public void setRatemodifiedon(LocalDateTime ratemodifiedon) {
        this.ratemodifiedon = ratemodifiedon;
    }

    public String getRateschedulenoka() {
        return rateschedulenoka;
    }

    public void setRateschedulenoka(String rateschedulenoka) {
        this.rateschedulenoka = rateschedulenoka;
    }

}
