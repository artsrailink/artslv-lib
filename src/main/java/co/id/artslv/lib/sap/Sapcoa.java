/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.sap;

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
import java.util.Date;
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
 * @author Arif
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SAPCOA")
public class Sapcoa implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SAPCOA_ID")
    private String id;
    @Column(name = "C_SAPCOA_ACCOUNT")
    private String sapcoaaccount;
    @Column(name = "C_SAPCOA_DESCRIPTION")
    private String sapcoadescription;
    @Column(name = "C_SAPCOA_STATUS")
    private String sapcoastatus;
    @Column(name = "C_SAPCOA_DOMAIN")
    private String sapcoadomain;
    @Column(name = "C_SAPCOA_MODIFIEDBY")
    private String sapcoamodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SAPCOA_MODIFIEDON")
    private LocalDateTime sapcoamodifiedon;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SAPCOA_STARTDATE")
    private LocalDate sapcoastartdate;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SAPCOA_ENDDATE")
    private Date sapcoaenddate;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    public Sapcoa() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSapcoaaccount() {
        return sapcoaaccount;
    }

    public void setSapcoaaccount(String sapcoaaccount) {
        this.sapcoaaccount = sapcoaaccount;
    }

    public String getSapcoadescription() {
        return sapcoadescription;
    }

    public void setSapcoadescription(String sapcoadescription) {
        this.sapcoadescription = sapcoadescription;
    }

    public String getSapcoastatus() {
        return sapcoastatus;
    }

    public void setSapcoastatus(String sapcoastatus) {
        this.sapcoastatus = sapcoastatus;
    }

    public String getSapcoadomain() {
        return sapcoadomain;
    }

    public void setSapcoadomain(String sapcoadomain) {
        this.sapcoadomain = sapcoadomain;
    }

    public String getSapcoamodifiedby() {
        return sapcoamodifiedby;
    }

    public void setSapcoamodifiedby(String sapcoamodifiedby) {
        this.sapcoamodifiedby = sapcoamodifiedby;
    }

    public LocalDateTime getSapcoamodifiedon() {
        return sapcoamodifiedon;
    }

    public void setSapcoamodifiedon(LocalDateTime sapcoamodifiedon) {
        this.sapcoamodifiedon = sapcoamodifiedon;
    }

    public LocalDate getSapcoastartdate() {
        return sapcoastartdate;
    }

    public void setSapcoastartdate(LocalDate sapcoastartdate) {
        this.sapcoastartdate = sapcoastartdate;
    }

   

    public Date getSapcoaenddate() {
        return sapcoaenddate;
    }

    public void setSapcoaenddate(Date sapcoaenddate) {
        this.sapcoaenddate = sapcoaenddate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
    
}