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
@Table(name = "KAIRTS_T_TRAIN")
public class Train implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRAIN_ID")
    private String id;
    @Column(name = "C_TRAIN_NAME")
    private String trainname;
    @Column(name = "C_TRAIN_STATUS")
    private String trainstatus;
    @Column(name = "C_TRAIN_DOMAIN")
    private String traindomain;
    @Column(name = "C_TRAIN_MODIFIEDBY")
    private String trainmodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRAIN_MODIFIEDON")
    private LocalDateTime trainmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public Train() {
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

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getTrainstatus() {
        return trainstatus;
    }

    public void setTrainstatus(String trainstatus) {
        this.trainstatus = trainstatus;
    }

    public String getTraindomain() {
        return traindomain;
    }

    public void setTraindomain(String traindomain) {
        this.traindomain = traindomain;
    }

    public String getTrainmodifiedby() {
        return trainmodifiedby;
    }

    public void setTrainmodifiedby(String trainmodifiedby) {
        this.trainmodifiedby = trainmodifiedby;
    }

    public LocalDateTime getTrainmodifiedon() {
        return trainmodifiedon;
    }

    public void setTrainmodifiedon(LocalDateTime trainmodifiedon) {
        this.trainmodifiedon = trainmodifiedon;
    }

}
