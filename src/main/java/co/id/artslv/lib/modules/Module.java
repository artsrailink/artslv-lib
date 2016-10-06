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
@Table(name = "KAIRTS_T_MODULE")
public class Module implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MODULE_ID")
    private String id;
    @Column(name = "C_MODULE_NAME")
    private String modulename;
    @Column(name = "C_MODULETYPE_ID")
    private String moduletypeid;
    @Column(name = "C_MODULE_SEQ")
    private String moduleseq;
    @Column(name = "C_MODULE_LINK")
    private String modulelink;
    @Column(name = "C_MODULE_PARENT")
    private String moduleparent;
    @Column(name = "C_MODULE_APPTYPE")
    private String moduleapptype;
    @Column(name = "C_MODULE_STATUS")
    private String modulestatus;
    @Column(name = "C_MODULE_DOMAIN")
    private String moduledomain;
    @Column(name = "C_MODULE_MODIFIEDBY")
    private String modulemodifiedby;
    @Column(name = "C_MODULE_MODIFIEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modulemodifiedon;
    
    @Transient 
    private Moduletype moduletype;
    
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Module() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModulename() {
        return modulename;
    }

    public void setModulename(String modulename) {
        this.modulename = modulename;
    }

    public String getModuletypeid() {
        return moduletypeid;
    }

    public void setModuletypeid(String moduletypeid) {
        this.moduletypeid = moduletypeid;
    }

    public Moduletype getModuletype() {
        return moduletype;
    }

    public void setModuletype(Moduletype moduletype) {
        this.moduletype = moduletype;
    }

    public String getModuleseq() {
        return moduleseq;
    }

    public void setModuleseq(String moduleseq) {
        this.moduleseq = moduleseq;
    }

    public String getModuleparent() {
        return moduleparent;
    }

    public void setModuleparent(String moduleparent) {
        this.moduleparent = moduleparent;
    }

    public String getModulelink() {
        return modulelink;
    }

    public void setModulelink(String modulelink) {
        this.modulelink = modulelink;
    }

    public String getModulestatus() {
        return modulestatus;
    }

    public void setModulestatus(String modulestatus) {
        this.modulestatus = modulestatus;
    }

    public String getModuledomain() {
        return moduledomain;
    }

    public void setModuledomain(String moduledomain) {
        this.moduledomain = moduledomain;
    }

    public String getModulemodifiedby() {
        return modulemodifiedby;
    }

    public void setModulemodifiedby(String modulemodifiedby) {
        this.modulemodifiedby = modulemodifiedby;
    }

    public LocalDateTime getModulemodifiedon() {
        return modulemodifiedon;
    }

    public void setModulemodifiedon(LocalDateTime modulemodifiedon) {
        this.modulemodifiedon = modulemodifiedon;
    }

    public String getModuleapptype() {
        return moduleapptype;
    }

    public void setModuleapptype(String moduleapptype) {
        this.moduleapptype = moduleapptype;
    }
    
}