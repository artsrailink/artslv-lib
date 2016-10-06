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
@Table(name = "KAIRTS_T_TRAINMILES")
public class Trainmiles implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRAINMILES_ID")
    private String id;
    @Column(name = "C_TRAINMILES_NAME")
    private String trainmilesname;
    @Column(name = "C_TRAINMILES_STATUS")
    private String trainmilesstatus;
    @Column(name = "C_TRAINMILES_DOMAIN")
    private String trainmilesdomain;
    @Column(name = "C_TRAINMILES_MODIFIEDBY")
    private String trainmilesmodifiedby;
    
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")    
    @Column(name = "C_TRAINMILES_MODIFIEDON")
    private LocalDateTime trainmilesmodifiedon;

    @Column(name = "C_TRAINMILES_NOTE")
    private String trainmilesnote;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    
    public Trainmiles() {
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

    public String getTrainmilesname() {
        return trainmilesname;
    }

    public void setTrainmilesname(String trainmilesname) {
        this.trainmilesname = trainmilesname;
    }

    public String getTrainmilesstatus() {
        return trainmilesstatus;
    }

    public void setTrainmilesstatus(String trainmilesstatus) {
        this.trainmilesstatus = trainmilesstatus;
    }

    public String getTrainmilesdomain() {
        return trainmilesdomain;
    }

    public void setTrainmilesdomain(String trainmilesdomain) {
        this.trainmilesdomain = trainmilesdomain;
    }

    public String getTrainmilesmodifiedby() {
        return trainmilesmodifiedby;
    }

    public void setTrainmilesmodifiedby(String trainmilesmodifiedby) {
        this.trainmilesmodifiedby = trainmilesmodifiedby;
    }

    public String getTrainmilesnote() {
        return trainmilesnote;
    }

    public void setTrainmilesnote(String trainmilesnote) {
        this.trainmilesnote = trainmilesnote;
    }

    public LocalDateTime getTrainmilesmodifiedon() {
        return trainmilesmodifiedon;
    }

    public void setTrainmilesmodifiedon(LocalDateTime trainmilesmodifiedon) {
        this.trainmilesmodifiedon = trainmilesmodifiedon;
    }

}