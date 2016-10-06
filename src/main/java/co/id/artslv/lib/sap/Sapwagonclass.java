/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.sap;

import co.id.artslv.lib.trains.Trainmiles;
import co.id.artslv.lib.trains.Wagonclass;
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
 * @author Arif
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SAPWAGONCLASS")
public class Sapwagonclass implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SAPWAGONCLASS_ID")
    private String id;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    @Column(name = "C_TRAINMILES_ID")
    private String trainmilesid;
    @Column(name = "C_SAPCOA_ID")
    private String sapcoaid;
    @Column(name = "C_SAPWAGONCLASS_STATUS")
    private String sapwagonclassstatus;
    @Column(name = "C_SAPWAGONCLASS_DOMAIN")
    private String sapwagonclassdomain;
    @Column(name = "C_SAPWAGONCLASS_MODIFIEDBY")
    private String sapwagonclassmodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SAPWAGONCLASS_MODIFIEDON")
    private LocalDateTime sapwagonclassmodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient 
    private Wagonclass wagonclass;
    @Transient
    private Trainmiles trainmiles;
    @Transient
    private Sapcoa sapcoa;
    
    public Sapwagonclass() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public String getTrainmilesid() {
        return trainmilesid;
    }

    public void setTrainmilesid(String trainmilesid) {
        this.trainmilesid = trainmilesid;
    }

    public String getSapcoaid() {
        return sapcoaid;
    }

    public void setSapcoaid(String sapcoaid) {
        this.sapcoaid = sapcoaid;
    }

    public String getSapwagonclassstatus() {
        return sapwagonclassstatus;
    }

    public void setSapwagonclassstatus(String sapwagonclassstatus) {
        this.sapwagonclassstatus = sapwagonclassstatus;
    }

    public String getSapwagonclassdomain() {
        return sapwagonclassdomain;
    }

    public void setSapwagonclassdomain(String sapwagonclassdomain) {
        this.sapwagonclassdomain = sapwagonclassdomain;
    }
    
    public String getSapwagonclassmodifiedby() {
        return sapwagonclassmodifiedby;
    }

    public void setSapwagonclassmodifiedby(String sapwagonclassmodifiedby) {
        this.sapwagonclassmodifiedby = sapwagonclassmodifiedby;
    }

    public LocalDateTime getSapwagonclassmodifiedon() {
        return sapwagonclassmodifiedon;
    }

    public void setSapwagonclassmodifiedon(LocalDateTime sapwagonclassmodifiedon) {
        this.sapwagonclassmodifiedon = sapwagonclassmodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }

    public Trainmiles getTrainmiles() {
        return trainmiles;
    }

    public void setTrainmiles(Trainmiles trainmiles) {
        this.trainmiles = trainmiles;
    }

    public Sapcoa getSapcoa() {
        return sapcoa;
    }

    public void setSapcoa(Sapcoa sapcoa) {
        this.sapcoa = sapcoa;
    }
    
}