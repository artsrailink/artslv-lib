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
@Table(name = "KAIRTS_T_MODULETYPE")
public class Moduletype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MODULETYPE_ID")
    private String id;
    @Column(name = "C_MODULETYPE_CODE")
    private String moduletypecode;
    @Column(name = "C_MODULETYPE_NAME")
    private String moduletypename;
    @Column(name = "C_MODULETYPE_STATUS")
    private String moduletypestatus;
    @Column(name = "C_MODULETYPE_DOMAIN")
    private String moduletypedomain;
    @Column(name = "C_MODULETYPE_MODIFIEDBY")
    private String moduletypemodifiedby;
    @Column(name = "C_MODULETYPE_MODIFIEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime moduletypemodifiedon;
    
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Moduletype() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModuletypename() {
        return moduletypename;
    }

    public void setModuletypename(String moduletypename) {
        this.moduletypename = moduletypename;
    }

    public String getModuletypestatus() {
        return moduletypestatus;
    }

    public void setModuletypestatus(String moduletypestatus) {
        this.moduletypestatus = moduletypestatus;
    }

    public String getModuletypedomain() {
        return moduletypedomain;
    }

    public void setModuletypedomain(String moduletypedomain) {
        this.moduletypedomain = moduletypedomain;
    }

    public String getModuletypemodifiedby() {
        return moduletypemodifiedby;
    }

    public void setModuletypemodifiedby(String moduletypemodifiedby) {
        this.moduletypemodifiedby = moduletypemodifiedby;
    }

    public LocalDateTime getModuletypemodifiedon() {
        return moduletypemodifiedon;
    }

    public void setModuletypemodifiedon(LocalDateTime moduletypemodifiedon) {
        this.moduletypemodifiedon = moduletypemodifiedon;
    }

    public String getModuletypecode() {
        return moduletypecode;
    }

    public void setModuletypecode(String moduletypecode) {
        this.moduletypecode = moduletypecode;
    }

    
    
    
}