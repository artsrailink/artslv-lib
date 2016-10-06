/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

import co.id.artslv.lib.schedule.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
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
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_DISCOUNTSCH")
public class Discountsch implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_DISCOUNTSCH_ID")
    private String id;

    @Column(name = "C_DISCOUNT_ID")
    private String discountid;
    
//    @Column(name = "C_SCHEDULE_ID")
//    private String scheduleid;
    
    @Column(name = "C_DISCOUNTSCH_DOMAIN")
    private String discountschdomain;
    
    @Column(name = "C_DISCOUNTSCH_STATUS")
    private String discountschstatus;
    
    @Column(name = "C_DISCOUNTSCH_MODIFIEDBY")
    private String discountschmodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_DISCOUNTSCH_MODIFIEDON")
    private LocalDateTime discountschmodifiedon;
    
    @Column(name = "C_DISCOUNTSCH_NOKA")
    private String discountschnoka;    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private List<Schedule> listschedule;

    @Transient
    private Discount discount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDiscountid() {
        return discountid;
    }

    public void setDiscountid(String discountid) {
        this.discountid = discountid;
    }

//    public String getScheduleid() {
//        return scheduleid;
//    }
//
//    public void setScheduleid(String scheduleid) {
//        this.scheduleid = scheduleid;
//    }

    public String getDiscountschdomain() {
        return discountschdomain;
    }

    public void setDiscountschdomain(String discountschdomain) {
        this.discountschdomain = discountschdomain;
    }

    public String getDiscountschstatus() {
        return discountschstatus;
    }

    public void setDiscountschstatus(String discountschstatus) {
        this.discountschstatus = discountschstatus;
    }

    public String getDiscountschmodifiedby() {
        return discountschmodifiedby;
    }

    public void setDiscountschmodifiedby(String discountschmodifiedby) {
        this.discountschmodifiedby = discountschmodifiedby;
    }

    public LocalDateTime getDiscountschmodifiedon() {
        return discountschmodifiedon;
    }

    public void setDiscountschmodifiedon(LocalDateTime discountschmodifiedon) {
        this.discountschmodifiedon = discountschmodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

//    public Schedule getSchedule() {
//        return schedule;
//    }
//
//    public void setSchedule(Schedule schedule) {
//        this.schedule = schedule;
//    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public String getDiscountschnoka() {
        return discountschnoka;
    }

    public void setDiscountschnoka(String discountschnoka) {
        this.discountschnoka = discountschnoka;
    }

    public List<Schedule> getListschedule() {
        return listschedule;
    }

    public void setListschedule(List<Schedule> listschedule) {
        this.listschedule = listschedule;
    }
    
}
