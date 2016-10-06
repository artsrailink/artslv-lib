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
@Table(name = "KAIRTS_T_WAGONDET")
public class Wagondet implements Serializable {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_WAGONDET_ID")
    private String id;    
    
    @Column(name = "C_WAGONDET_ROW")
    private String wagondetrow;
    @Column(name = "C_WAGONDET_COL")
    private String wagondetcol;
    @Column(name = "C_WAGON_ID")
    private String wagonid;
    @Column(name = "C_WAGONDET_STATUS")
    private String wagondetstatus;
    @Column(name = "C_WAGONDET_DOMAIN")
    private String wagondetdomain;
    @Column(name = "C_WAGONDET_MODIFIEDBY")
    private String wagondetmodifiedby;   
    
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")    
    @Column(name = "C_WAGONDET_MODIFIEDON")
    private LocalDateTime wagondetmodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;    
    
    @Transient 
    private Wagon wagon;

    public Wagondet() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWagondetrow() {
        return wagondetrow;
    }

    public void setWagondetrow(String wagondetrow) {
        this.wagondetrow = wagondetrow;
    }

    public String getWagondetcol() {
        return wagondetcol;
    }

    public void setWagondetcol(String wagondetcol) {
        this.wagondetcol = wagondetcol;
    }

    public String getWagonid() {
        return wagonid;
    }

    public void setWagonid(String wagonid) {
        this.wagonid = wagonid;
    }

    public String getWagondetstatus() {
        return wagondetstatus;
    }

    public void setWagondetstatus(String wagondetstatus) {
        this.wagondetstatus = wagondetstatus;
    }

    public String getWagondetdomain() {
        return wagondetdomain;
    }

    public void setWagondetdomain(String wagondetdomain) {
        this.wagondetdomain = wagondetdomain;
    }

    public String getWagondetmodifiedby() {
        return wagondetmodifiedby;
    }

    public void setWagondetmodifiedby(String wagondetmodifiedby) {
        this.wagondetmodifiedby = wagondetmodifiedby;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Wagon getWagon() {
        return wagon;
    }

    public void setWagon(Wagon wagon) {
        this.wagon = wagon;
    } 

    public LocalDateTime getWagondetmodifiedon() {
        return wagondetmodifiedon;
    }

    public void setWagondetmodifiedon(LocalDateTime wagondetmodifiedon) {
        this.wagondetmodifiedon = wagondetmodifiedon;
    }

}
