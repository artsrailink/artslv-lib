/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;

import co.id.artslv.lib.location.City;
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
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_STASIUN")
@XmlRootElement(name = "stasiun")
public class Stasiun implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_STASIUN_ID")
    private String id;
    @Column(name = "C_STASIUN_PROFITCENTER")
    private String stasiunprofitcenter;

    @Column(name = "C_STASIUN_NAME")
    private String stasiunname;
    @Column(name = "C_STASIUN_CODE")
    private String stasiuncode;
    @Column(name = "C_STASIUN_PEMBATALAN")
    private String stasiunpembatalan;
    @Column(name = "C_STASIUN_PENGEMBALIANBEA")
    private String stasiunpengembalianbea;
//    @Column(name = "C_STASIUN_HIDENOKA")
//    private String stasiunhidenoka;

    @Column(name = "C_AREA_ID")
    private String areaid;
    @Column(name = "C_CITY_ID")
    private String cityid;

    @Column(name = "C_STASIUN_STATUS")
    private String stasiunstatus;
    @Column(name = "C_STASIUN_DOMAIN")
    private String stasiundomain;
    @Column(name = "C_STASIUN_MODIFIEDBY")
    private String stasiunmodifiedby;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_STASIUN_MODIFIEDON")
    private LocalDateTime stasiunmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    @Transient
    private Area area;
    @Transient
    private City city;

    public Stasiun() {
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

    public String getStasiunprofitcenter() {
        return stasiunprofitcenter;
    }

    public void setStasiunprofitcenter(String stasiunprofitcenter) {
        this.stasiunprofitcenter = stasiunprofitcenter;
    }

    public String getStasiunname() {
        return stasiunname;
    }

    public void setStasiunname(String stasiunname) {
        this.stasiunname = stasiunname;
    }

    public String getStasiuncode() {
        return stasiuncode;
    }

    public void setStasiuncode(String stasiuncode) {
        this.stasiuncode = stasiuncode;
    }

    public String getStasiunpembatalan() {
        return stasiunpembatalan;
    }

    public void setStasiunpembatalan(String stasiunpembatalan) {
        this.stasiunpembatalan = stasiunpembatalan;
    }

    public String getStasiunpengembalianbea() {
        return stasiunpengembalianbea;
    }

    public void setStasiunpengembalianbea(String stasiunpengembalianbea) {
        this.stasiunpengembalianbea = stasiunpengembalianbea;
    }

    public String getAreaid() {
        return areaid;
    }

    public void setAreaid(String areaid) {
        this.areaid = areaid;
    }

    public String getStasiunstatus() {
        return stasiunstatus;
    }

    public void setStasiunstatus(String stasiunstatus) {
        this.stasiunstatus = stasiunstatus;
    }

    public String getStasiundomain() {
        return stasiundomain;
    }

    public void setStasiundomain(String stasiundomain) {
        this.stasiundomain = stasiundomain;
    }

    public String getStasiunmodifiedby() {
        return stasiunmodifiedby;
    }

    public void setStasiunmodifiedby(String stasiunmodifiedby) {
        this.stasiunmodifiedby = stasiunmodifiedby;
    }

    public LocalDateTime getStasiunmodifiedon() {
        return stasiunmodifiedon;
    }

    public void setStasiunmodifiedon(LocalDateTime stasiunmodifiedon) {
        this.stasiunmodifiedon = stasiunmodifiedon;
    }

    public Area getArea() {
        return area;
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return this.stasiuncode + " (" + this.stasiunname + ")";
    }
}
