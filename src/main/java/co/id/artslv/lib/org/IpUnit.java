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
@Table(name = "KAIRTS_T_IPUNIT")
public class IpUnit implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    @Column(name = "C_IPUNIT_ID",nullable=false)
    private String id;
    
    @Column(name = "C_UNIT_ID",nullable=false)
    private String unitid;
    
    @Column(name = "C_IP_ID",nullable=false)
    private String ipid;
    
    @Column(name = "C_IPUNIT_STATUS")
    private String ipunitstatus;
    @Column(name = "C_IPUNIT_DOMAIN")
    private String ipunitdomain;
    @Column(name = "C_IPUNIT_MODIFIEDBY")
    private String ipunitmodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_IPUNIT_MODIFIEDON")
    private LocalDateTime ipunitmodifiedon;
    
    @Transient 
    private Unit unit;
    @Transient 
    private Ip ip;
      
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    public IpUnit() {
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

    public String getIpid() {
        return ipid;
    }

    public void setIpid(String ipid) {
        this.ipid = ipid;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Ip getIp() {
        return ip;
    }

    public void setIp(Ip ip) {
        this.ip = ip;
    }

    public String getIpunitstatus() {
        return ipunitstatus;
    }

    public void setIpunitstatus(String ipunitstatus) {
        this.ipunitstatus = ipunitstatus;
    }

    public String getIpunitdomain() {
        return ipunitdomain;
    }

    public void setIpunitdomain(String ipunitdomain) {
        this.ipunitdomain = ipunitdomain;
    }

    public String getIpunitmodifiedby() {
        return ipunitmodifiedby;
    }

    public void setIpunitmodifiedby(String ipunitmodifiedby) {
        this.ipunitmodifiedby = ipunitmodifiedby;
    }

    public LocalDateTime getIpunitmodifiedon() {
        return ipunitmodifiedon;
    }

    public void setIpunitmodifiedon(LocalDateTime ipunitmodifiedon) {
        this.ipunitmodifiedon = ipunitmodifiedon;
    }

}