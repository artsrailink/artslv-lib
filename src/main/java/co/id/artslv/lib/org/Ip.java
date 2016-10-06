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
@Table(name = "KAIRTS_T_IP")
public class Ip implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_IP_ID")
    private String id;
    
    @Column(name = "C_IP_NAME")
    private String ipname;
    @Column(name = "C_IP_IP")
    private String ipip;
    
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;
    
    @Column(name = "C_IP_STATUS")
    private String ipstatus;
    @Column(name = "C_IP_DOMAIN")
    private String ipdomain;
    @Column(name = "C_IP_MODIFIEDBY")
    private String ipmodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_IP_MODIFIEDON")
    private LocalDateTime ipmodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;    
    
    @Transient 
    private Stasiun stasiun;
    
    public Ip() {
    }
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIpname() {
        return ipname;
    }

    public void setIpname(String ipname) {
        this.ipname = ipname;
    }

    public String getIpip() {
        return ipip;
    }

    public void setIpip(String ipip) {
        this.ipip = ipip;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getIpstatus() {
        return ipstatus;
    }

    public void setIpstatus(String ipstatus) {
        this.ipstatus = ipstatus;
    }

    public String getIpdomain() {
        return ipdomain;
    }

    public void setIpdomain(String ipdomain) {
        this.ipdomain = ipdomain;
    }

    public String getIpmodifiedby() {
        return ipmodifiedby;
    }

    public void setIpmodifiedby(String ipmodifiedby) {
        this.ipmodifiedby = ipmodifiedby;
    }

    public LocalDateTime getIpmodifiedon() {
        return ipmodifiedon;
    }

    public void setIpmodifiedon(LocalDateTime ipmodifiedon) {
        this.ipmodifiedon = ipmodifiedon;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }
       
    
}