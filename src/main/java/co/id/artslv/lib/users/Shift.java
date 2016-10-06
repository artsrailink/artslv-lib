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
@Table(name = "KAIRTS_T_SHIFT")
public class Shift implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SHIFT_ID")
    private String id;
    
    @Column(name = "C_USER_ID")
    private String userid;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    
    @Column(name = "C_SHIFT_NAME")
    private String shiftname;
    @Column(name = "C_SHIFT_DOCNUM")
    private String shiftdocnum;
    
    @Column(name = "C_SHIFT_STATUS")
    private String shiftstatus;
    @Column(name = "C_SHIFT_DOMAIN")
    private String shiftdomain;
    @Column(name = "C_SHIFT_MODIFIEDBY")
    private String shiftmodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SHIFT_MODIFIEDON")
    private LocalDateTime shiftmodifiedon;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SHIFT_OPENON")
    private LocalDateTime shiftopenon;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SHIFT_CLOSEDON")
    private LocalDateTime shiftclosedon;
    
    @JsonInclude(Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient 
    private Unit unit;
    @Transient 
    private User user;
    
    public Shift(){
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

    public String getShiftname() {
        return shiftname;
    }

    public void setShiftname(String shiftname) {
        this.shiftname = shiftname;
    }

    public String getShiftdocnum() {
        return shiftdocnum;
    }

    public void setShiftdocnum(String shiftdocnum) {
        this.shiftdocnum = shiftdocnum;
    }

    public String getShiftstatus() {
        return shiftstatus;
    }

    public void setShiftstatus(String shiftstatus) {
        this.shiftstatus = shiftstatus;
    }

    public String getShiftdomain() {
        return shiftdomain;
    }

    public void setShiftdomain(String shiftdomain) {
        this.shiftdomain = shiftdomain;
    }

    public String getShiftmodifiedby() {
        return shiftmodifiedby;
    }

    public void setShiftmodifiedby(String shiftmodifiedby) {
        this.shiftmodifiedby = shiftmodifiedby;
    }

    public LocalDateTime getShiftmodifiedon() {
        return shiftmodifiedon;
    }

    public void setShiftmodifiedon(LocalDateTime shiftmodifiedon) {
        this.shiftmodifiedon = shiftmodifiedon;
    }

    public LocalDateTime getShiftopenon() {
        return shiftopenon;
    }

    public void setShiftopenon(LocalDateTime shiftopenon) {
        this.shiftopenon = shiftopenon;
    }

    public LocalDateTime getShiftclosedon() {
        return shiftclosedon;
    }

    public void setShiftclosedon(LocalDateTime shiftclosedon) {
        this.shiftclosedon = shiftclosedon;
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

}
