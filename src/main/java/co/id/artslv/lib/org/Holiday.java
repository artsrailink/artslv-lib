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
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "KAIRTS_T_HOLIDAY")
public class Holiday implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_HOLIDAY_ID")
    private String id;
    
    @Column(name = "C_HOLIDAY_NAME")
    private String holidayname;
    
    @Column(name = "C_HOLIDAY_STATUS")
    private String holidaystatus;
    @Column(name = "C_HOLIDAY_DOMAIN")
    private String holidaydomain;
    @Column(name = "C_HOLIDAY_MODIFIEDBY")
    private String holidaymodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_HOLIDAY_MODIFIEDON")
    private LocalDateTime holidaymodifiedon;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_HOLIDAY_DATE")
    private LocalDate holidaydate;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;    
    
    public Holiday() {
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

    public String getHolidayname() {
        return holidayname;
    }

    public void setHolidayname(String holidayname) {
        this.holidayname = holidayname;
    }

    public String getHolidaystatus() {
        return holidaystatus;
    }

    public void setHolidaystatus(String holidaystatus) {
        this.holidaystatus = holidaystatus;
    }

    public String getHolidaydomain() {
        return holidaydomain;
    }

    public void setHolidaydomain(String holidaydomain) {
        this.holidaydomain = holidaydomain;
    }

    public String getHolidaymodifiedby() {
        return holidaymodifiedby;
    }

    public void setHolidaymodifiedby(String holidaymodifiedby) {
        this.holidaymodifiedby = holidaymodifiedby;
    }

    public LocalDateTime getHolidaymodifiedon() {
        return holidaymodifiedon;
    }

    public void setHolidaymodifiedon(LocalDateTime holidaymodifiedon) {
        this.holidaymodifiedon = holidaymodifiedon;
    }

    public LocalDate getHolidaydate() {
        return holidaydate;
    }

    public void setHolidaydate(LocalDate holidaydate) {
        this.holidaydate = holidaydate;
    }

}