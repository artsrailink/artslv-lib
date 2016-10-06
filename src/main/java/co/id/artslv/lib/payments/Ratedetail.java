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
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "KAIRTS_T_RATEDETAIL")
public class Ratedetail implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_RATEDETAIL_ID")
    private String id;

    @Column(name = "C_RATEDETAIL_AMOUNT")
    private BigDecimal ratedetailamount;
    @Column(name = "C_RATE_ID")
    private String rateid;
    @Column(name = "C_RATEDETAIL_STATUS")
    private String ratedetailstatus;
    @Column(name = "C_RATEDETAIL_DOMAIN")
    private String ratedetaildomain;
    @Column(name = "C_RATETYPE_ID")
    private String ratetypeid;
    @Column(name = "C_RATEDETAIL_MODIFIEDBY")
    private String ratedetailmodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_RATEDETAIL_MODIFIEDON")
    private LocalDateTime ratedetailmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private Rate rate;

    @Transient
    private Ratetype ratetype;

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

    public BigDecimal getRatedetailamount() {
        return ratedetailamount;
    }

    public void setRatedetailamount(BigDecimal ratedetailamount) {
        this.ratedetailamount = ratedetailamount;
    }

    public String getRateid() {
        return rateid;
    }

    public void setRateid(String rateid) {
        this.rateid = rateid;
    }

    public String getRatedetaildomain() {
        return ratedetaildomain;
    }

    public void setRatedetaildomain(String ratedetaildomain) {
        this.ratedetaildomain = ratedetaildomain;
    }

    public String getRatetypeid() {
        return ratetypeid;
    }

    public void setRatetypeid(String ratetypeid) {
        this.ratetypeid = ratetypeid;
    }

    public String getRatedetailmodifiedby() {
        return ratedetailmodifiedby;
    }

    public void setRatedetailmodifiedby(String ratedetailmodifiedby) {
        this.ratedetailmodifiedby = ratedetailmodifiedby;
    }

    public Rate getRate() {
        return rate;
    }

    public void setRate(Rate rate) {
        this.rate = rate;
    }

    public Ratetype getRatetype() {
        return ratetype;
    }

    public void setRatetype(Ratetype ratetype) {
        this.ratetype = ratetype;
    }

    public String getRatedetailstatus() {
        return ratedetailstatus;
    }

    public void setRatedetailstatus(String ratedetailstatus) {
        this.ratedetailstatus = ratedetailstatus;
    }

    public LocalDateTime getRatedetailmodifiedon() {
        return ratedetailmodifiedon;
    }

    public void setRatedetailmodifiedon(LocalDateTime ratedetailmodifiedon) {
        this.ratedetailmodifiedon = ratedetailmodifiedon;
    }

}
