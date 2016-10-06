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
@Table(name = "KAIRTS_T_SUBCLASS")
public class Subclass implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SUBCLASS_ID")
    private String id;
    @Column(name = "C_SUBCLASS_CODE")
    private String subclasscode;
    @Column(name = "C_SUBCLASS_STATUS")
    private String subclassstatus;
    @Column(name = "C_SUBCLASS_DOMAIN")
    private String subclassdomain;
    @Column(name = "C_SUBCLASS_MODIFIEDBY")
    private String subclassmodifiedby;
    @Column(name = "C_SUBCLASS_NOTE")
    private String subclassnote;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SUBCLASS_MODIFIEDON")
    private LocalDateTime subclassmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private Wagonclass wagonclass;

    public Subclass() {
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

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public String getSubclassstatus() {
        return subclassstatus;
    }

    public void setSubclassstatus(String subclassstatus) {
        this.subclassstatus = subclassstatus;
    }

    public String getSubclassdomain() {
        return subclassdomain;
    }

    public void setSubclassdomain(String subclassdomain) {
        this.subclassdomain = subclassdomain;
    }

    public String getSubclassmodifiedby() {
        return subclassmodifiedby;
    }

    public void setSubclassmodifiedby(String subclassmodifiedby) {
        this.subclassmodifiedby = subclassmodifiedby;
    }

    public String getSubclassnote() {
        return subclassnote;
    }

    public void setSubclassnote(String subclassnote) {
        this.subclassnote = subclassnote;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }

    public LocalDateTime getSubclassmodifiedon() {
        return subclassmodifiedon;
    }

    public void setSubclassmodifiedon(LocalDateTime subclassmodifiedon) {
        this.subclassmodifiedon = subclassmodifiedon;
    }

    @Override
    public String toString() {
        return this.getSubclasscode();
    }
}
