/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.users;


import co.id.artslv.lib.org.Unit;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_UNITUSER")
public class UnitUser implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_UNITUSER_ID")
    private String id;
    
    @Column(name = "C_USER_ID")
    private String userid;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    @Column(name = "C_UNITUSER_STATUS")
    private String unituserstatus;
    @Column(name = "C_UNITUSER_DOMAIN")
    private String unituserdomain;
    @Column(name = "C_UNITUSER_MODIFIEDBY")
    private String unitusermodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_UNITUSER_MODIFIEDON")
    private LocalDateTime unitusermodifiedon;
    @JsonInclude(Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient 
    private Unit unit;
    @Transient 
    private User user;
    
    public UnitUser(){
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getUnituserstatus() {
        return unituserstatus;
    }

    public void setUnituserstatus(String unituserstatus) {
        this.unituserstatus = unituserstatus;
    }

    public String getUnituserdomain() {
        return unituserdomain;
    }

    public void setUnituserdomain(String unituserdomain) {
        this.unituserdomain = unituserdomain;
    }

    public String getUnitusermodifiedby() {
        return unitusermodifiedby;
    }

    public void setUnitusermodifiedby(String unitusermodifiedby) {
        this.unitusermodifiedby = unitusermodifiedby;
    }

    public LocalDateTime getUnitusermodifiedon() {
        return unitusermodifiedon;
    }

    public void setUnitusermodifiedon(LocalDateTime unitusermodifiedon) {
        this.unitusermodifiedon = unitusermodifiedon;
    }


}
