/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.schedule;

import co.id.artslv.lib.trains.Train;
import co.id.artslv.lib.trains.Trainmiles;
import co.id.artslv.lib.trains.Traintype;
import co.id.artslv.lib.trains.Trainrunning;
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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SCHEDULE")
public class Schedule implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SCHEDULE_ID")
    private String id;

    @Column(name = "C_SCHEDULE_NOKA")
    private String noka;
    @Column(name = "C_SCHEDULE_NOTE")
    private String note;
    @Column(name = "C_SCHEDULE_LOCALSTAT")
    private String localstat;
    
    @Column(name = "C_SCHEDULE_STATUS")
    private String status;
    @Column(name = "C_SCHEDULE_DOMAIN")
    private String domain;
    @Column(name = "C_SCHEDULE_VALIDDAYS")
    private String validdays;
    @Column(name = "C_SCHEDULE_NOSEATALLOC")
    private int noseatalloc;
    @Column(name = "C_SCHEDULE_NOSEATTYPE")
    private String noseattype;
    @Column(name = "C_SCHEDULE_ROUTEDESC")
    private String routedesc;
    
    @Column(name = "C_SCHEDULE_MODIFIEDBY")
    private String modifiedby;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SCHEDULE_MODIFIEDON")
    private LocalDateTime modifiedon;
    
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SCHEDULE_STARTDATE")
    private LocalDate startdate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SCHEDULE_ENDDATE")
    private LocalDate enddate;
    
    @Column(name = "C_TRAIN_ID")
    private String trainid;
    @Column(name = "C_TRAINTYPE_ID")
    private String traintypeid;
    @Column(name = "C_TRAINMILES_ID")
    private String trainmilesid;
    @Column(name = "C_TRAINRUNNING_ID")
    private String trainrunningid;
    
    @Transient
    private Traintype traintype;
    @Transient
    private Train train;
    @Transient
    private Trainmiles trainmiles;
    @Transient
    private Trainrunning trainrunning;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getLocalstat() {
        return localstat;
    }

    public void setLocalstat(String localstat) {
        this.localstat = localstat;
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

    public String getValiddays() {
        return validdays;
    }

    public void setValiddays(String validdays) {
        this.validdays = validdays;
    }

    public int getNoseatalloc() {
        return noseatalloc;
    }

    public void setNoseatalloc(int noseatalloc) {
        this.noseatalloc = noseatalloc;
    }

    public String getNoseattype() {
        return noseattype;
    }

    public void setNoseattype(String noseattype) {
        this.noseattype = noseattype;
    }

    public String getRoutedesc() {
        return routedesc;
    }

    public void setRoutedesc(String routedesc) {
        this.routedesc = routedesc;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid;
    }

    public String getTraintypeid() {
        return traintypeid;
    }

    public void setTraintypeid(String traintypeid) {
        this.traintypeid = traintypeid;
    }

    public String getTrainmilesid() {
        return trainmilesid;
    }

    public void setTrainmilesid(String trainmilesid) {
        this.trainmilesid = trainmilesid;
    }

    public String getTrainrunningid() {
        return trainrunningid;
    }

    public void setTrainrunningid(String trainrunningid) {
        this.trainrunningid = trainrunningid;
    }

    public Traintype getTraintype() {
        return traintype;
    }

    public void setTraintype(Traintype traintype) {
        this.traintype = traintype;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Trainmiles getTrainmiles() {
        return trainmiles;
    }

    public void setTrainmiles(Trainmiles trainmiles) {
        this.trainmiles = trainmiles;
    }

    public Trainrunning getTrainrunning() {
        return trainrunning;
    }

    public void setTrainrunning(Trainrunning trainrunning) {
        this.trainrunning = trainrunning;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    
    @Override
    public String toString() {
        return this.noka;
    }   

}
