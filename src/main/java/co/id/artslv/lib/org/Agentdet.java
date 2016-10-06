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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_AGENTDET")
public class Agentdet implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    @Column(name = "C_AGENTDET_ID",nullable=false)
    private String id;    
    @Column(name = "C_UNIT_ID",nullable=false)
    private String unitid;
    @Column(name = "C_AGENTDET_TIMEOUT")
    private int agentdettimeout;
    @Column(name = "C_AGENTDET_TYPE")
    private String agentdettype;
    @Column(name = "C_AGENTDET_VANUM")
    private String agentdetvanum;
    @Column(name = "C_AGENTDET_EMAIL")
    private String agentdetemail;
    @Column(name = "C_AGENTDET_ADDRESS")
    private String agentdetaddress;
    @Column(name = "C_AGENTDET_PHONENUM")
    private String agentdetphonenum;
    @Column(name = "C_AGENTDET_IDSAP")
    private String agentdetidsap;
    @Column(name = "C_AGENTDET_STATUS")
    private String agentdetstatus;
    @Column(name = "C_AGENTDET_DOMAIN")
    private String agentdetdomain;
    @Column(name = "C_AGENTDET_MODIFIEDBY")
    private String agentdetmodifiedby;
    @Column(name = "C_AGENTDET_SELLINGTIME")
    private int agentdetsellingtime;    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_AGENTDET_MODIFIEDON")
    private LocalDateTime agentdetmodifiedon;
    @Column(name = "C_AGENTDET_BEGINNINGBALANCE")
    private BigDecimal agentdetbeginningbalance;    
    @Column(name = "C_AGENTDET_DEPOSIT")
    private BigDecimal agentdetdeposit;  
    @Column(name = "C_AGENTDET_WITHDRAWAL")
    private BigDecimal agentdetwithdrawal;  
    @Column(name = "C_AGENTDET_ENDINGBALANCE")
    private BigDecimal agentdetendingbalance;          
      
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    public Agentdet() {
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

    public int getAgentdettimeout() {
        return agentdettimeout;
    }

    public void setAgentdettimeout(int agentdettimeout) {
        this.agentdettimeout = agentdettimeout;
    }

    public String getAgentdettype() {
        return agentdettype;
    }

    public void setAgentdettype(String agentdettype) {
        this.agentdettype = agentdettype;
    }

    public String getAgentdetvanum() {
        return agentdetvanum;
    }

    public void setAgentdetvanum(String agentdetvanum) {
        this.agentdetvanum = agentdetvanum;
    }

    public String getAgentdetemail() {
        return agentdetemail;
    }

    public void setAgentdetemail(String agentdetemail) {
        this.agentdetemail = agentdetemail;
    }

    public String getAgentdetaddress() {
        return agentdetaddress;
    }

    public void setAgentdetaddress(String agentdetaddress) {
        this.agentdetaddress = agentdetaddress;
    }

    public String getAgentdetphonenum() {
        return agentdetphonenum;
    }

    public void setAgentdetphonenum(String agentdetphonenum) {
        this.agentdetphonenum = agentdetphonenum;
    }

    public BigDecimal getAgentdetdeposit() {
        return agentdetdeposit;
    }

    public void setAgentdetdeposit(BigDecimal agentdetdeposit) {
        this.agentdetdeposit = agentdetdeposit;
    }

    public String getAgentdetstatus() {
        return agentdetstatus;
    }

    public void setAgentdetstatus(String agentdetstatus) {
        this.agentdetstatus = agentdetstatus;
    }

    public String getAgentdetdomain() {
        return agentdetdomain;
    }

    public void setAgentdetdomain(String agentdetdomain) {
        this.agentdetdomain = agentdetdomain;
    }

    public String getAgentdetmodifiedby() {
        return agentdetmodifiedby;
    }

    public void setAgentdetmodifiedby(String agentdetmodifiedby) {
        this.agentdetmodifiedby = agentdetmodifiedby;
    }

    public LocalDateTime getAgentdetmodifiedon() {
        return agentdetmodifiedon;
    }

    public void setAgentdetmodifiedon(LocalDateTime agentdetmodifiedon) {
        this.agentdetmodifiedon = agentdetmodifiedon;
    }

    public String getAgentdetidsap() {
        return agentdetidsap;
    }

    public void setAgentdetidsap(String agentdetidsap) {
        this.agentdetidsap = agentdetidsap;
    }

    public BigDecimal getAgentdetwithdrawal() {
        return agentdetwithdrawal;
    }

    public void setAgentdetwithdrawal(BigDecimal agentdetwithdrawal) {
        this.agentdetwithdrawal = agentdetwithdrawal;
    }

    public BigDecimal getAgentdetendingbalance() {
        return agentdetendingbalance;
    }

    public void setAgentdetendingbalance(BigDecimal agentdetendingbalance) {
        this.agentdetendingbalance = agentdetendingbalance;
    }

    public BigDecimal getAgentdetbeginningbalance() {
        return agentdetbeginningbalance;
    }

    public void setAgentdetbeginningbalance(BigDecimal agentdetbeginningbalance) {
        this.agentdetbeginningbalance = agentdetbeginningbalance;
    }

    public int getAgentdetsellingtime() {
        return agentdetsellingtime;
    }

    public void setAgentdetsellingtime(int agentdetsellingtime) {
        this.agentdetsellingtime = agentdetsellingtime;
    }

}