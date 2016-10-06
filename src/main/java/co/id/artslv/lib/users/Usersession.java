/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.users;


import co.id.artslv.lib.org.Ip;
import co.id.artslv.lib.org.Unit;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.*;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_USERSESSION")
public class Usersession implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_USERSESSION_ID")
    private String id;

    @Column(name = "C_USER_ID")
    private String userid;

    @Column(name = "C_UNIT_ID")
    private String unitid;

    @Column(name = "C_USERSESSION_IP")
    private String usersessionip;


    @Column(name = "C_USERSESSION_APP")
    private String usersessionapp;
    @Column(name = "C_USERSESSION_NOTE")
    private String usersessionnote;
    
    @Column(name = "C_USERSESSION_LOGINON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime usersessionloginon;
    @Column(name = "C_USERSESSION_LOGOUTON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime usersessionlogouton;
    
    @Column(name = "C_USERSESSION_STATUS")
    private String usersessionstatus;
    @Column(name = "C_USERSESSION_DOMAIN")
    private String usersessiondomain;
    @Column(name = "C_USERSESSION_MODIFIEDBY")
    private String usersessionmodifiedby;
    @Column(name = "C_USERSESSION_MODIFIEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime usersessionmodifiedon;
    
    @JsonInclude(Include.NON_NULL)
    @Transient 
    private String action;

    @Transient
    private User user;

    @Transient
    private Unit unit;

    @Transient
    private Ip ip;
    
    @Transient
    private String username;
    @Transient
    private String unitcode;
    @Transient
    private String ipaddress;
    
    
    public Usersession(){
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUsersessionip() {
        return usersessionip;
    }

    public void setUsersessionip(String usersessionip) {
        this.usersessionip = usersessionip;
    }

    public String getUsersessionapp() {
        return usersessionapp;
    }

    public void setUsersessionapp(String usersessionapp) {
        this.usersessionapp = usersessionapp;
    }

    public String getUsersessionnote() {
        return usersessionnote;
    }

    public void setUsersessionnote(String usersessionnote) {
        this.usersessionnote = usersessionnote;
    }

    public LocalDateTime getUsersessionloginon() {
        return usersessionloginon;
    }

    public void setUsersessionloginon(LocalDateTime usersessionloginon) {
        this.usersessionloginon = usersessionloginon;
    }

    public LocalDateTime getUsersessionlogouton() {
        return usersessionlogouton;
    }

    public void setUsersessionlogouton(LocalDateTime usersessionlogouton) {
        this.usersessionlogouton = usersessionlogouton;
    }

    public String getUsersessionstatus() {
        return usersessionstatus;
    }

    public void setUsersessionstatus(String usersessionstatus) {
        this.usersessionstatus = usersessionstatus;
    }

    public String getUsersessiondomain() {
        return usersessiondomain;
    }

    public void setUsersessiondomain(String usersessiondomain) {
        this.usersessiondomain = usersessiondomain;
    }

    public String getUsersessionmodifiedby() {
        return usersessionmodifiedby;
    }

    public void setUsersessionmodifiedby(String usersessionmodifiedby) {
        this.usersessionmodifiedby = usersessionmodifiedby;
    }

    public LocalDateTime getUsersessionmodifiedon() {
        return usersessionmodifiedon;
    }

    public void setUsersessionmodifiedon(LocalDateTime usersessionmodifiedon) {
        this.usersessionmodifiedon = usersessionmodifiedon;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    
}
