/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;

import co.id.artslv.lib.schedule.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
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
@Table(name = "KAIRTS_T_HIDENOKA")
public class Hidenoka implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_HIDENOKA_ID")
    private String id;
    
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;
    @Column(name = "C_HIDENOKA_SCHEDULENOKA")
    private String noka;
    
    @Column(name = "C_HIDENOKA_STATUS")
    private String hidenokastatus;
    @Column(name = "C_HIDENOKA_DOMAIN")
    private String hidenokadomain;
    @Column(name = "C_HIDENOKA_MODIFIEDBY")
    private String hidenokamodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_HIDENOKA_MODIFIEDON")
    private LocalDateTime hidenokamodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;   
     @Transient 
    private List<Schedule> listschedule;
    
    public Hidenoka() {
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

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getHidenokastatus() {
        return hidenokastatus;
    }

    public void setHidenokastatus(String hidenokastatus) {
        this.hidenokastatus = hidenokastatus;
    }

    public String getHidenokadomain() {
        return hidenokadomain;
    }

    public void setHidenokadomain(String hidenokadomain) {
        this.hidenokadomain = hidenokadomain;
    }

    public String getHidenokamodifiedby() {
        return hidenokamodifiedby;
    }

    public void setHidenokamodifiedby(String hidenokamodifiedby) {
        this.hidenokamodifiedby = hidenokamodifiedby;
    }

    public LocalDateTime getHidenokamodifiedon() {
        return hidenokamodifiedon;
    }

    public void setHidenokamodifiedon(LocalDateTime hidenokamodifiedon) {
        this.hidenokamodifiedon = hidenokamodifiedon;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public List<Schedule> getListschedule() {
        return listschedule;
    }

    public void setListschedule(List<Schedule> listschedule) {
        this.listschedule = listschedule;
    }
}