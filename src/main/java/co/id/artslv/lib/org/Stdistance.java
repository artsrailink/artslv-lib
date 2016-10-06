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
@Table(name = "KAIRTS_T_STDISTANCE")
public class Stdistance implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_STDISTANCE_ID")
    private String id;
    @Column(name = "C_STASIUNID_FROM")
    private String stasiunidfrom;
    
    @Column(name = "C_STASIUNID_TO")
    private String stasiunidto;
    @Column(name = "C_STDISTANCE_VALUE")
    private String stdistancevalue;
    
    @Column(name = "C_STDISTANCE_STATUS")
    private String stdistancestatus;
    @Column(name = "C_STDISTANCE_DOMAIN")
    private String stdistancedomain;
    @Column(name = "C_STDISTANCE_MODIFIEDBY")
    private String stdistancemodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_STDISTANCE_MODIFIEDON")
    private LocalDateTime stdistancemodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient 
    private Stasiun stasiunfrom;
    
    @Transient 
    private Stasiun stasiunto;
    
    public Stdistance() {
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

    public String getStasiunidfrom() {
        return stasiunidfrom;
    }

    public void setStasiunidfrom(String stasiunidfrom) {
        this.stasiunidfrom = stasiunidfrom;
    }

    public String getStasiunidto() {
        return stasiunidto;
    }

    public void setStasiunidto(String stasiunidto) {
        this.stasiunidto = stasiunidto;
    }

    public String getStdistancevalue() {
        return stdistancevalue;
    }

    public void setStdistancevalue(String stdistancevalue) {
        this.stdistancevalue = stdistancevalue;
    }

    public String getStdistancestatus() {
        return stdistancestatus;
    }

    public void setStdistancestatus(String stdistancestatus) {
        this.stdistancestatus = stdistancestatus;
    }

    public String getStdistancedomain() {
        return stdistancedomain;
    }

    public void setStdistancedomain(String stdistancedomain) {
        this.stdistancedomain = stdistancedomain;
    }

    public String getStdistancemodifiedby() {
        return stdistancemodifiedby;
    }

    public void setStdistancemodifiedby(String stdistancemodifiedby) {
        this.stdistancemodifiedby = stdistancemodifiedby;
    }

    public LocalDateTime getStdistancemodifiedon() {
        return stdistancemodifiedon;
    }

    public void setStdistancemodifiedon(LocalDateTime stdistancemodifiedon) {
        this.stdistancemodifiedon = stdistancemodifiedon;
    }

    public Stasiun getStasiunfrom() {
        return stasiunfrom;
    }

    public void setStasiunfrom(Stasiun stasiunfrom) {
        this.stasiunfrom = stasiunfrom;
    }

    public Stasiun getStasiunto() {
        return stasiunto;
    }

    public void setStasiunto(Stasiun stasiunto) {
        this.stasiunto = stasiunto;
    }

   
    
}