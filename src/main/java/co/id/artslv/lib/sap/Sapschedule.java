/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.sap;

import co.id.artslv.lib.schedule.Schedule;
import co.id.artslv.lib.trains.Wagonclass;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDate;
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
 * @author Arif
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SAPSCHEDULE")
public class Sapschedule implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SAPSCHEDULE_ID")
    private String id;
    @Column(name = "C_SAPSCHEDULE_PC")
    private String sapschedulepc;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_SAPSCHEDULE_STATUS")
    private String sapschedulestatus;
    @Column(name = "C_SAPSCHEDULE_DOMAIN")
    private String sapscheduledomain;
    @Column(name = "C_SAPSCHEDULE_MODIFIEDBY")
    private String sapschedulemodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SAPSCHEDULE_MODIFIEDON")
    private LocalDateTime sapschedulemodifiedon;
    
     //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SAPSCHEDULE_STARTDATE")
    private LocalDate sapschedulestartdate;
    
     //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SAPSCHEDULE_ENDDATE")
    private LocalDate sapscheduleenddate;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient 
    private Schedule schedule;
    @Transient 
    private Wagonclass wagonclass;
    public Sapschedule() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSapschedulepc() {
        return sapschedulepc;
    }

    public void setSapschedulepc(String sapschedulepc) {
        this.sapschedulepc = sapschedulepc;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getSapschedulestatus() {
        return sapschedulestatus;
    }

    public void setSapschedulestatus(String sapschedulestatus) {
        this.sapschedulestatus = sapschedulestatus;
    }

    public String getSapscheduledomain() {
        return sapscheduledomain;
    }

    public void setSapscheduledomain(String sapscheduledomain) {
        this.sapscheduledomain = sapscheduledomain;
    }

    public String getSapschedulemodifiedby() {
        return sapschedulemodifiedby;
    }

    public void setSapschedulemodifiedby(String sapschedulemodifiedby) {
        this.sapschedulemodifiedby = sapschedulemodifiedby;
    }

    public LocalDateTime getSapschedulemodifiedon() {
        return sapschedulemodifiedon;
    }

    public void setSapschedulemodifiedon(LocalDateTime sapschedulemodifiedon) {
        this.sapschedulemodifiedon = sapschedulemodifiedon;
    }
    
    public LocalDate getSapschedulestartdate() {
        return sapschedulestartdate;
    }

    public void setSapschedulestartdate(LocalDate sapschedulestartdate) {
        this.sapschedulestartdate = sapschedulestartdate;
    }

    public LocalDate getSapscheduleenddate() {
        return sapscheduleenddate;
    }

    public void setSapscheduleenddate(LocalDate sapscheduleenddate) {
        this.sapscheduleenddate = sapscheduleenddate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }
}