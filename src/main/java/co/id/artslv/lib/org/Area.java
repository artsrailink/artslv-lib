/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;

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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_AREA")
public class Area implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_AREA_ID")
    private String id;
    
    @Column(name = "C_AREA_NAME")
    private String areaname;
    
    @Column(name = "C_AREA_BISNIS")
    private String areabisnis;
    
    @Column(name = "C_AREA_STATUS")
    private String areastatus;
    @Column(name = "C_AREA_DOMAIN")
    private String areadomain;
    @Column(name = "C_AREA_MODIFIEDBY")
    private String areamodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_AREA_MODIFIEDON")
    private LocalDateTime areamodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;    
    
    public Area() {
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

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getAreabisnis() {
        return areabisnis;
    }

    public void setAreabisnis(String areabisnis) {
        this.areabisnis = areabisnis;
    }

    public String getAreastatus() {
        return areastatus;
    }

    public void setAreastatus(String areastatus) {
        this.areastatus = areastatus;
    }

    public String getAreadomain() {
        return areadomain;
    }

    public void setAreadomain(String areadomain) {
        this.areadomain = areadomain;
    }

    public String getAreamodifiedby() {
        return areamodifiedby;
    }

    public void setAreamodifiedby(String areamodifiedby) {
        this.areamodifiedby = areamodifiedby;
    }

    public LocalDateTime getAreamodifiedon() {
        return areamodifiedon;
    }

    public void setAreamodifiedon(LocalDateTime areamodifiedon) {
        this.areamodifiedon = areamodifiedon;
    }

       
    
}