/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

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
@Table(name = "KAIRTS_T_DISCOUNT")
public class Discount implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_DISCOUNT_ID")
    private String id;

    @Column(name = "C_DISCOUNT_VALUE")
    private BigDecimal discountvalue;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_DISCOUNT_STARTDATE")
    private LocalDate discountstartdate;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_DISCOUNT_ENDDATE")
    private LocalDate discountenddate;
//    @Column(name = "C_SCHEDULE_ID")
//    private String scheduleid;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_DISCOUNT_SELLSTARTDATE")
    private LocalDate discountsellstartdate;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_DISCOUNT_SELLENDDATE")
    private LocalDate discountsellenddate;
    @Column(name = "C_DISCOUNT_STATUS")
    private String discountstatus;
    @Column(name = "C_DISCOUNT_DOMAIN")
    private String discountdomain;
    @Column(name = "C_DISCOUNT_MODIFIEDBY")
    private String discountmodifiedby;
    @Column(name = "C_DISCOUNT_PSGCOUNT")
    private int discountpsgcount;
    @Column(name = "C_DISCOUNT_PSGNUM")
    private int discountpsgnum;
    @Column(name = "C_DISCOUNT_VALUETYPE")
    private String discountvaluetype;
    @Column(name = "C_DISCOUNT_VALIDDAYS")
    private String discountvaliddays;
    @Column(name = "C_DISCOUNT_HOLIDAYSTAT")
    private String discountholidaystat;
    @Column(name = "C_DISCOUNTTYPE_ID")
    private String discounttypeid;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_DISCOUNT_MODIFIEDON")
    private LocalDateTime discountmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

//    @Transient
//    private Schedule schedule;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Discounttype discounttype;

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

    public BigDecimal getDiscountvalue() {
        return discountvalue;
    }

    public void setDiscountvalue(BigDecimal discountvalue) {
        this.discountvalue = discountvalue;
    }

    public String getDiscountstatus() {
        return discountstatus;
    }

    public void setDiscountstatus(String discountstatus) {
        this.discountstatus = discountstatus;
    }

    public String getDiscountdomain() {
        return discountdomain;
    }

    public void setDiscountdomain(String discountdomain) {
        this.discountdomain = discountdomain;
    }

    public String getDiscountmodifiedby() {
        return discountmodifiedby;
    }

    public void setDiscountmodifiedby(String discountmodifiedby) {
        this.discountmodifiedby = discountmodifiedby;
    }

    public int getDiscountpsgcount() {
        return discountpsgcount;
    }

    public void setDiscountpsgcount(int discountpsgcount) {
        this.discountpsgcount = discountpsgcount;
    }

    public int getDiscountpsgnum() {
        return discountpsgnum;
    }

    public void setDiscountpsgnum(int discountpsgnum) {
        this.discountpsgnum = discountpsgnum;
    }

    public String getDiscountvaluetype() {
        return discountvaluetype;
    }

    public void setDiscountvaluetype(String discountvaluetype) {
        this.discountvaluetype = discountvaluetype;
    }

    public String getDiscountvaliddays() {
        return discountvaliddays;
    }

    public void setDiscountvaliddays(String discountvaliddays) {
        this.discountvaliddays = discountvaliddays;
    }

    public String getDiscountholidaystat() {
        return discountholidaystat;
    }

    public void setDiscountholidaystat(String discountholidaystat) {
        this.discountholidaystat = discountholidaystat;
    }

    public String getDiscounttypeid() {
        return discounttypeid;
    }

    public void setDiscounttypeid(String discounttypeid) {
        this.discounttypeid = discounttypeid;
    }

    public Discounttype getDiscounttype() {
        return discounttype;
    }

    public void setDiscounttype(Discounttype discounttype) {
        this.discounttype = discounttype;
    }

    public LocalDate getDiscountstartdate() {
        return discountstartdate;
    }

    public void setDiscountstartdate(LocalDate discountstartdate) {
        this.discountstartdate = discountstartdate;
    }

    public LocalDate getDiscountenddate() {
        return discountenddate;
    }

    public void setDiscountenddate(LocalDate discountenddate) {
        this.discountenddate = discountenddate;
    }

    public LocalDate getDiscountsellstartdate() {
        return discountsellstartdate;
    }

    public void setDiscountsellstartdate(LocalDate discountsellstartdate) {
        this.discountsellstartdate = discountsellstartdate;
    }

    public LocalDate getDiscountsellenddate() {
        return discountsellenddate;
    }

    public void setDiscountsellenddate(LocalDate discountsellenddate) {
        this.discountsellenddate = discountsellenddate;
    }

    public LocalDateTime getDiscountmodifiedon() {
        return discountmodifiedon;
    }

    public void setDiscountmodifiedon(LocalDateTime discountmodifiedon) {
        this.discountmodifiedon = discountmodifiedon;
    }

}
