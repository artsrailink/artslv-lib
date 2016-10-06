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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_TRAINRUNNING")
public class Trainrunning implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRAINRUNNING_ID")
    private String id;
    @Column(name = "C_TRAINRUNNING_NAME")
    private String trainrunningname;
    @Column(name = "C_TRAINRUNNING_VALUE")
    private int trainrunningvalue;
    @Column(name = "C_TRAINRUNNING_STATUS")
    private String trainrunningstatus;
    @Column(name = "C_TRAINRUNNING_DOMAIN")
    private String trainrunningdomain;
    @Column(name = "C_TRAINRUNNING_MODIFIEDBY")
    private String trainrunningmodifiedby;
    
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")    
    @Column(name = "C_TRAINRUNNING_MODIFIEDON")
    private LocalDateTime trainrunningmodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    
    public Trainrunning() {
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

    public String getTrainrunningname() {
        return trainrunningname;
    }

    public void setTrainrunningname(String trainrunningname) {
        this.trainrunningname = trainrunningname;
    }

    public int getTrainrunningvalue() {
        return trainrunningvalue;
    }

    public void setTrainrunningvalue(int trainrunningvalue) {
        this.trainrunningvalue = trainrunningvalue;
    }

    public String getTrainrunningstatus() {
        return trainrunningstatus;
    }

    public void setTrainrunningstatus(String trainrunningstatus) {
        this.trainrunningstatus = trainrunningstatus;
    }

    public String getTrainrunningdomain() {
        return trainrunningdomain;
    }

    public void setTrainrunningdomain(String trainrunningdomain) {
        this.trainrunningdomain = trainrunningdomain;
    }

    public String getTrainrunningmodifiedby() {
        return trainrunningmodifiedby;
    }

    public void setTrainrunningmodifiedby(String trainrunningmodifiedby) {
        this.trainrunningmodifiedby = trainrunningmodifiedby;
    }

    public LocalDateTime getTrainrunningmodifiedon() {
        return trainrunningmodifiedon;
    }

    public void setTrainrunningmodifiedon(LocalDateTime trainrunningmodifiedon) {
        this.trainrunningmodifiedon = trainrunningmodifiedon;
    }

}