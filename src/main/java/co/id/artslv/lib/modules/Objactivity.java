/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.modules;

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
@Table(name = "KAIRTS_T_OBJACTIVITY")
public class Objactivity implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_OBJACTIVITY_ID")
    private String id;
    @Column(name = "C_OBJACTIVITY_NAME")
    private String objactivityname;
    @Column(name = "C_OBJACTIVITY_CODE")
    private String objactivitycode;
    @Column(name = "C_MODULE_ID")
    private String moduleid;
    @Column(name = "C_OBJACTIVITY_STATUS")
    private String objactivitystatus;
    @Column(name = "C_OBJACTIVITY_DOMAIN")
    private String objactivitydomain;
    @Column(name = "C_OBJACTIVITY_MODIFIEDBY")
    private String objactivitymodifiedby;
    @Column(name = "C_OBJACTIVITY_MODIFIEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime objactivitymodifiedon;
    
    @Transient 
    private Module module;
     
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Objactivity() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjactivityname() {
        return objactivityname;
    }

    public void setObjactivityname(String objactivityname) {
        this.objactivityname = objactivityname;
    }

    
    public String getObjactivitystatus() {
        return objactivitystatus;
    }

    public void setObjactivitystatus(String objactivitystatus) {
        this.objactivitystatus = objactivitystatus;
    }

    public String getObjactivitydomain() {
        return objactivitydomain;
    }

    public void setObjactivitydomain(String objactivitydomain) {
        this.objactivitydomain = objactivitydomain;
    }

    public LocalDateTime getObjactivitymodifiedon() {
        return objactivitymodifiedon;
    }

    public void setObjactivitymodifiedon(LocalDateTime objactivitymodifiedon) {
        this.objactivitymodifiedon = objactivitymodifiedon;
    }

    public String getObjactivitymodifiedby() {
        return objactivitymodifiedby;
    }

    public void setObjactivitymodifiedby(String objactivitymodifiedby) {
        this.objactivitymodifiedby = objactivitymodifiedby;
    }

    public String getObjactivitycode() {
        return objactivitycode;
    }

    public void setObjactivitycode(String objactivitycode) {
        this.objactivitycode = objactivitycode;
    }

    public String getModuleid() {
        return moduleid;
    }

    public void setModuleid(String moduleid) {
        this.moduleid = moduleid;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    
    
}