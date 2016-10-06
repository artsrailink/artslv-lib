/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.comservice;

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
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SERVICEPROVIDER")
public class Serviceprovider implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SERVICEPRV_ID")
    private String id;

    @Column(name = "C_SERVICEPRV_NAME")
    private String serviceprvname;

    @Column(name = "C_SERVICEPRV_PHONENUM")
    private String serviceprvphonenum;

    @Column(name = "C_SERVICEPRV_ADDRESS")
    private String serviceprvaddress;
    
    @Column(name = "C_SERVICEPRV_CP")
    private String serviceprvcp;

    @Column(name = "C_SERVICEPRV_STATUS")
    private String serviceprvstatus;

    @Column(name = "C_SERVICEPRV_DOMAIN")
    private String serviceprvdomain;

    @Column(name = "C_SERVICEPRV_MODIFIEDBY")
    private String serviceprvmodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SERVICEPRV_MODIFIEDON")
    private LocalDateTime serviceprvmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceprvname() {
        return serviceprvname;
    }

    public void setServiceprvname(String serviceprvname) {
        this.serviceprvname = serviceprvname;
    }

    public String getServiceprvphonenum() {
        return serviceprvphonenum;
    }

    public void setServiceprvphonenum(String serviceprvphonenum) {
        this.serviceprvphonenum = serviceprvphonenum;
    }

    public String getServiceprvaddress() {
        return serviceprvaddress;
    }

    public void setServiceprvaddress(String serviceprvaddress) {
        this.serviceprvaddress = serviceprvaddress;
    }

    public String getServiceprvcp() {
        return serviceprvcp;
    }

    public void setServiceprvcp(String serviceprvcp) {
        this.serviceprvcp = serviceprvcp;
    }

    public String getServiceprvstatus() {
        return serviceprvstatus;
    }

    public void setServiceprvstatus(String serviceprvstatus) {
        this.serviceprvstatus = serviceprvstatus;
    }

    public String getServiceprvdomain() {
        return serviceprvdomain;
    }

    public void setServiceprvdomain(String serviceprvdomain) {
        this.serviceprvdomain = serviceprvdomain;
    }

    public String getServiceprvmodifiedby() {
        return serviceprvmodifiedby;
    }

    public void setServiceprvmodifiedby(String serviceprvmodifiedby) {
        this.serviceprvmodifiedby = serviceprvmodifiedby;
    }

    public LocalDateTime getServiceprvmodifiedon() {
        return serviceprvmodifiedon;
    }

    public void setServiceprvmodifiedon(LocalDateTime serviceprvmodifiedon) {
        this.serviceprvmodifiedon = serviceprvmodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

}
