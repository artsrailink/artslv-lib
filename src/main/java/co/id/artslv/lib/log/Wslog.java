/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.log;

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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
/**
 *
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_WSLOG")
public class Wslog implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_WSLOG_ID")
    private String id;
    
    
    @Column(name = "C_WSLOG_REQTIME")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime wslogreqtime;
    
    @Column(name = "C_WSLOG_IP")
    private String wslogip;
    
    @Column(name = "C_WSLOG_REQ")
    @Lob    
    private String wslogreq;
    
    @Column(name = "C_WSLOG_RES")
    @Lob
    private String wslogres;
    
    @Column(name = "C_WSLOG_ERRCODE")
    private String wslogerrcode;
    
    @Column(name = "C_WSLOG_STATUS")
    private String wslogstatus;
    
    @Column(name = "C_WSLOG_DOMAIN")
    private String wslogdomain; 
            
    @Column(name = "C_USER_ID")
    private String userid;
    
    @Column(name = "C_WSLOG_RESTIME")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime wslogrestime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }
    
    public Wslog() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getWslogreqtime() {
        return wslogreqtime;
    }

    public void setWslogreqtime(LocalDateTime wslogreqtime) {
        this.wslogreqtime = wslogreqtime;
    }

    public String getWslogip() {
        return wslogip;
    }

    public void setWslogip(String wslogip) {
        this.wslogip = wslogip;
    }

    public String getWslogreq() {
        return wslogreq;
    }

    public void setWslogreq(String wslogreq) {
        this.wslogreq = wslogreq;
    }

    public String getWslogres() {
        return wslogres;
    }

    public void setWslogres(String wslogres) {
        this.wslogres = wslogres;
    }

    public String getWslogerrcode() {
        return wslogerrcode;
    }

    public void setWslogerrcode(String wslogerrcode) {
        this.wslogerrcode = wslogerrcode;
    }

    public String getWslogstatus() {
        return wslogstatus;
    }

    public void setWslogstatus(String wslogstatus) {
        this.wslogstatus = wslogstatus;
    }

    public String getWslogdomain() {
        return wslogdomain;
    }

    public void setWslogdomain(String wslogdomain) {
        this.wslogdomain = wslogdomain;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public LocalDateTime getWslogrestime() {
        return wslogrestime;
    }

    public void setWslogrestime(LocalDateTime wslogrestime) {
        this.wslogrestime = wslogrestime;
    } 
}