/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.modules;

import co.id.artslv.lib.users.Usergroup;
import com.fasterxml.jackson.annotation.JsonFormat;
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
@Entity
@Table(name = "KAIRTS_T_USRGRPOBJACTV")
public class Privileges implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_USRGRPOBJACTV_ID")
    private String id;
    
    @Column(name = "C_USERGROUP_ID")
    private String usergroupid;
    
    @Column(name = "C_OBJACTIVITY_ID")
    private String objactivityid;
    
    @Column(name = "C_USRGRPOBJACTV_STATUS")
    private String privilegesstatus;
    @Column(name = "C_USRGRPOBJACTV_DOMAIN")
    private String privilegesdomain;
    @Column(name = "C_USRGRPOBJACTV_MODIFIEDBY")
    private String privilegesmodifiedby;
    @Column(name = "C_USRGRPOBJACTV_MODIFIEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime privilegesmodifiedon;
    
    @Transient 
    private Objactivity objactivity;
    @Transient 
    private Usergroup usergroup;
    
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Privileges() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(String usergroupid) {
        this.usergroupid = usergroupid;
    }

    public String getObjactivityid() {
        return objactivityid;
    }

    public void setObjactivityid(String objactivityid) {
        this.objactivityid = objactivityid;
    }

    public String getPrivilegesstatus() {
        return privilegesstatus;
    }

    public void setPrivilegesstatus(String privilegesstatus) {
        this.privilegesstatus = privilegesstatus;
    }

    public String getPrivilegesdomain() {
        return privilegesdomain;
    }

    public void setPrivilegesdomain(String privilegesdomain) {
        this.privilegesdomain = privilegesdomain;
    }

    public String getPrivilegesmodifiedby() {
        return privilegesmodifiedby;
    }

    public void setPrivilegesmodifiedby(String privilegesmodifiedby) {
        this.privilegesmodifiedby = privilegesmodifiedby;
    }

    public LocalDateTime getPrivilegesmodifiedon() {
        return privilegesmodifiedon;
    }

    public void setPrivilegesmodifiedon(LocalDateTime privilegesmodifiedon) {
        this.privilegesmodifiedon = privilegesmodifiedon;
    }

    public Objactivity getObjactivity() {
        return objactivity;
    }

    public void setObjactivity(Objactivity objactivity) {
        this.objactivity = objactivity;
    }

    public Usergroup getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(Usergroup usergroup) {
        this.usergroup = usergroup;
    }
    
}