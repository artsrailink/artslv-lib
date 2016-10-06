/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.trains;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
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
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_WAGONCLASS")
public class Wagonclass implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_WAGONCLASS_ID")
    private String id;

    @Column(name = "C_WAGONCLASS_CODE")
    private String wagonclasscode;
    @Column(name = "C_WAGONCLASS_NAME")
    private String wagonclassname;
    @Column(name = "C_WAGONCLASS_STATUS")
    private String wagonclassstatus;
    @Column(name = "C_WAGONCLASS_DOMAIN")
    private String wagonclassdomain;
    @Column(name = "C_WAGONCLASS_MODIFIEDBY")
    private String wagonclassmodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")    
    @Column(name = "C_WAGONCLASS_MODIFIEDON")
    private LocalDateTime wagonclassmodifiedon;

    @Column(name = "C_WAGONCLASS_PRIOR")
    private int wagonclassprior;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public Wagonclass() {
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

    public String getWagonclasscode() {
        return wagonclasscode;
    }

    public void setWagonclasscode(String wagonclasscode) {
        this.wagonclasscode = wagonclasscode;
    }

    public String getWagonclassname() {
        return wagonclassname;
    }

    public void setWagonclassname(String wagonclassname) {
        this.wagonclassname = wagonclassname;
    }

    public String getWagonclassstatus() {
        return wagonclassstatus;
    }

    public void setWagonclassstatus(String wagonclassstatus) {
        this.wagonclassstatus = wagonclassstatus;
    }

    public String getWagonclassdomain() {
        return wagonclassdomain;
    }

    public void setWagonclassdomain(String wagonclassdomain) {
        this.wagonclassdomain = wagonclassdomain;
    }

    public String getWagonclassmodifiedby() {
        return wagonclassmodifiedby;
    }

    public void setWagonclassmodifiedby(String wagonclassmodifiedby) {
        this.wagonclassmodifiedby = wagonclassmodifiedby;
    }

    public int getWagonclassprior() {
        return wagonclassprior;
    }

    public void setWagonclassprior(int wagonclassprior) {
        this.wagonclassprior = wagonclassprior;
    }

    public LocalDateTime getWagonclassmodifiedon() {
        return wagonclassmodifiedon;
    }

    public void setWagonclassmodifiedon(LocalDateTime wagonclassmodifiedon) {
        this.wagonclassmodifiedon = wagonclassmodifiedon;
    }
    
    @Override
    public String toString() {
        return this.wagonclasscode + " (" + this.wagonclassname + ")";
    }
}
