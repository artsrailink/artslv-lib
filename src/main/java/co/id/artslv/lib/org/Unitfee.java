/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;

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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_UNITFEE")
public class Unitfee implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    @Column(name = "C_UNITFEE_ID",nullable=false)
    private String id;
    
    @Column(name = "C_UNIT_ID",nullable=false)
    private String unitid;
//    @Column(name = "C_UNITFEE_NAME")
//    private String unitfeename;
//    @Column(name = "C_UNITFEE_FEETYPE")
//    private String unitfeefeetype;
//    @Column(name = "C_UNITFEE_AMOUNTTYPE")
//    private String unitfeeamounttype;
    
//    @Column(name = "C_UNITFEE_TOTAMOUNT")
//    private long unitfeetotamount;
    @Column(name = "C_UNITFEE_AMOUNTKAI")
    private long unitfeeamountkai;
    @Column(name = "C_UNITFEE_AMOUNTAGENT")
    private long unitfeeamountagent;
    
    
    @Column(name = "C_UNITFEE_STATUS")
    private String unitfeestatus;
    @Column(name = "C_UNITFEE_DOMAIN")
    private String unitfeedomain;
    @Column(name = "C_UNITFEE_MODIFIEDBY")
    private String unitfeemodifiedby;
    
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_UNITFEE_MODIFIEDON")
    private LocalDateTime unitfeemodifiedon;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_UNITFEE_STARTDATE")
    private LocalDate unitfeestartdate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_UNITFEE_ENDDATE")
    private LocalDate unitfeeenddate;
    
    @Transient 
    private Unit unit;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient
    private long unitfeeamounttotal;
     
    public Unitfee() {
    }

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

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public long getUnitfeeamountkai() {
        return unitfeeamountkai;
    }

    public void setUnitfeeamountkai(long unitfeeamountkai) {
        this.unitfeeamountkai = unitfeeamountkai;
    }

    public long getUnitfeeamountagent() {
        return unitfeeamountagent;
    }

    public void setUnitfeeamountagent(long unitfeeamountagent) {
        this.unitfeeamountagent = unitfeeamountagent;
    }

    public String getUnitfeestatus() {
        return unitfeestatus;
    }

    public void setUnitfeestatus(String unitfeestatus) {
        this.unitfeestatus = unitfeestatus;
    }

    public String getUnitfeedomain() {
        return unitfeedomain;
    }

    public void setUnitfeedomain(String unitfeedomain) {
        this.unitfeedomain = unitfeedomain;
    }

    public String getUnitfeemodifiedby() {
        return unitfeemodifiedby;
    }

    public void setUnitfeemodifiedby(String unitfeemodifiedby) {
        this.unitfeemodifiedby = unitfeemodifiedby;
    }

    public LocalDateTime getUnitfeemodifiedon() {
        return unitfeemodifiedon;
    }

    public void setUnitfeemodifiedon(LocalDateTime unitfeemodifiedon) {
        this.unitfeemodifiedon = unitfeemodifiedon;
    }

    public LocalDate getUnitfeestartdate() {
        return unitfeestartdate;
    }

    public void setUnitfeestartdate(LocalDate unitfeestartdate) {
        this.unitfeestartdate = unitfeestartdate;
    }

    public LocalDate getUnitfeeenddate() {
        return unitfeeenddate;
    }

    public void setUnitfeeenddate(LocalDate unitfeeenddate) {
        this.unitfeeenddate = unitfeeenddate;
    }


    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public long getUnitfeeamounttotal() {
        return unitfeeamounttotal;
    }

    public void setUnitfeeamounttotal(long unitfeeamounttotal) {
        this.unitfeeamounttotal = unitfeeamounttotal;
    }
    
    

}