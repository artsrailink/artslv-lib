package co.id.artslv.lib.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by root on 07/10/16.
 */
@Entity
@Table(name="arts_t_fare")
public class Fare {
    @Column(name="c_fare_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name="c_fare_tripstartdate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripstartdate;

    @Column(name="c_fare_tripenddate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripenddate;

    @Column(name="c_fare_sellstartdate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate sellstartdate;

    @Column(name="c_fare_sellenddate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate sellenddate;

    @Column(name="c_fare_psgtype")
    private String psgtype;

    @Column(name="c_stasiun_codeorg")
    private String codeorg;

    @Column(name="c_stasiun_codedes")
    private String codedes;

    @Column(name="c_subclass_code")
    private String subclasscode;

    @Column(name="c_schedule_noka")
    private String schedulenoka;

    @Column(name="c_fare_refundays")
    private int refundays;

    @Column(name="c_fare_refundable")
    private String refundable;

    @Column(name="c_fare_cancelable")
    private String cancelable;

    @Column(name="c_fare_reductible")
    private String reductible;

    @Column(name="c_fare_reschedulable")
    private String reschedulable;

    @Column(name="c_fare_reseatable")
    public String reseatable;

    @Column(name="c_fare_renamable")
    private String renamable;

    @Column(name="c_fare_basicfare")
    private BigDecimal basicfare;

    @Column(name="c_fare_tuslahfee")
    private BigDecimal tuslahfee;

    @Column(name="c_fare_rsvfee")
    private BigDecimal rsvfee;

    @Column(name="c_fare_stfee")
    private BigDecimal stfee;

    @Column(name="c_fare_addfee")
    private BigDecimal addfee;

    @Column(name="c_fare_compinsurance")
    private BigDecimal compinsurance;

    @Column(name="c_fare_addinsurance")
    private BigDecimal addinsurance;

    @Column(name="c_fare_psofare")
    private BigDecimal psofare;

    @Column(name="c_fare_totamount")
    private BigDecimal totamount;

    @Column(name="c_fare_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name="c_fare_modifiedby")
    private String modifiedby;

    @Column(name="c_fare_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    @Column(name="c_fare_createdby")
    private String createdby;

    @Column(name="c_fare_status")
    private String status;

    @Column(name="c_fare_domain")
    private String domain;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDate getSellstartdate() {
        return sellstartdate;
    }

    public void setSellstartdate(LocalDate sellstartdate) {
        this.sellstartdate = sellstartdate;
    }

    public LocalDate getSellenddate() {
        return sellenddate;
    }

    public void setSellenddate(LocalDate sellenddate) {
        this.sellenddate = sellenddate;
    }

    public String getPsgtype() {
        return psgtype;
    }

    public void setPsgtype(String psgtype) {
        this.psgtype = psgtype;
    }

    public String getCodeorg() {
        return codeorg;
    }

    public void setCodeorg(String codeorg) {
        this.codeorg = codeorg;
    }

    public String getCodedes() {
        return codedes;
    }

    public void setCodedes(String codedes) {
        this.codedes = codedes;
    }

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public String getSchedulenoka() {
        return schedulenoka;
    }

    public void setSchedulenoka(String schedulenoka) {
        this.schedulenoka = schedulenoka;
    }

    public int getRefundays() {
        return refundays;
    }

    public void setRefundays(int refundays) {
        this.refundays = refundays;
    }

    public String getRefundable() {
        return refundable;
    }

    public void setRefundable(String refundable) {
        this.refundable = refundable;
    }

    public String getCancelable() {
        return cancelable;
    }

    public void setCancelable(String cancelable) {
        this.cancelable = cancelable;
    }

    public String getReductible() {
        return reductible;
    }

    public void setReductible(String reductible) {
        this.reductible = reductible;
    }

    public String getReschedulable() {
        return reschedulable;
    }

    public void setReschedulable(String reschedulable) {
        this.reschedulable = reschedulable;
    }

    public String getReseatable() {
        return reseatable;
    }

    public void setReseatable(String reseatable) {
        this.reseatable = reseatable;
    }

    public String getRenamable() {
        return renamable;
    }

    public void setRenamable(String renamable) {
        this.renamable = renamable;
    }

    public BigDecimal getBasicfare() {
        return basicfare;
    }

    public void setBasicfare(BigDecimal basicfare) {
        this.basicfare = basicfare;
    }

    public BigDecimal getTuslahfee() {
        return tuslahfee;
    }

    public void setTuslahfee(BigDecimal tuslahfee) {
        this.tuslahfee = tuslahfee;
    }

    public BigDecimal getRsvfee() {
        return rsvfee;
    }

    public void setRsvfee(BigDecimal rsvfee) {
        this.rsvfee = rsvfee;
    }

    public BigDecimal getStfee() {
        return stfee;
    }

    public void setStfee(BigDecimal stfee) {
        this.stfee = stfee;
    }

    public BigDecimal getAddfee() {
        return addfee;
    }

    public void setAddfee(BigDecimal addfee) {
        this.addfee = addfee;
    }

    public BigDecimal getCompinsurance() {
        return compinsurance;
    }

    public void setCompinsurance(BigDecimal compinsurance) {
        this.compinsurance = compinsurance;
    }

    public BigDecimal getAddinsurance() {
        return addinsurance;
    }

    public void setAddinsurance(BigDecimal addinsurance) {
        this.addinsurance = addinsurance;
    }

    public BigDecimal getPsofare() {
        return psofare;
    }

    public void setPsofare(BigDecimal psofare) {
        this.psofare = psofare;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
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
}
