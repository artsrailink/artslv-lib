/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.log;

import co.id.artslv.lib.trains.Wagondet;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SEATLOG")
public class Seatlog implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SEATLOG_ID")
    private String id;
    
    @Column(name = "C_WAGONDET_ID")
    private String wagondetid;
    @Column(name = "C_USER_ID")
    private String userid;
    @Column(name = "C_SEATLOG_STATUS")
    private String status;
    @Column(name = "C_SEATLOG_DOMAIN")
    private String domain;
    @Column(name = "C_SEATLOG_WAGONORDER")
    private int wagonorder;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SEATLOG_DATE")
    private LocalDateTime date;
    @Column(name = "C_SEATLOG_OBJECT")
    private String object;
    @Column(name = "C_SEATLOG_OBJECTID")
    private String objectid;
    @Column(name = "C_SEATLOG_ACTION")
    private String action;
    @Lob
    @Column(name = "C_SEATLOG_VALUE")
    private String value;
    
    @Transient 
    private Wagondet wagondet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWagondetid() {
        return wagondetid;
    }

    public void setWagondetid(String wagondetid) {
        this.wagondetid = wagondetid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
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

    public int getWagonorder() {
        return wagonorder;
    }

    public void setWagonorder(int wagonorder) {
        this.wagonorder = wagonorder;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getObjectid() {
        return objectid;
    }

    public void setObjectid(String objectid) {
        this.objectid = objectid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public Wagondet getWagondet() {
        return wagondet;
    }

    public void setWagondet(Wagondet wagondet) {
        this.wagondet = wagondet;
    }
   
    
}