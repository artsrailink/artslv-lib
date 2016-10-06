/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

import co.id.artslv.lib.org.Unit;
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
@Table(name = "KAIRTS_T_DISCOUNTUNIT")
public class Discountunit implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_DISCOUNTUNIT_ID")
    private String id;

    @Column(name = "C_DISCOUNT_ID")
    private String discountid;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    @Column(name = "C_DISCOUNTUNIT_DOMAIN")
    private String discountunitdomain;
    @Column(name = "C_DISCOUNTUNIT_STATUS")
    private String discountunitstatus;
    @Column(name = "C_DISCOUNTUNIT_MODIFIEDBY")
    private String discountunitmodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_DISCOUNTUNIT_MODIFIEDON")
    private LocalDateTime discountunitmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private Unit unit;

    @Transient
    private Discount discount;

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

    public String getDiscountid() {
        return discountid;
    }

    public void setDiscountid(String discountid) {
        this.discountid = discountid;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getDiscountunitdomain() {
        return discountunitdomain;
    }

    public void setDiscountunitdomain(String discountunitdomain) {
        this.discountunitdomain = discountunitdomain;
    }

    public String getDiscountunitstatus() {
        return discountunitstatus;
    }

    public void setDiscountunitstatus(String discountunitstatus) {
        this.discountunitstatus = discountunitstatus;
    }

    public String getDiscountunitmodifiedby() {
        return discountunitmodifiedby;
    }

    public void setDiscountunitmodifiedby(String discountunitmodifiedby) {
        this.discountunitmodifiedby = discountunitmodifiedby;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public Discount getDiscount() {
        return discount;
    }

    public void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public LocalDateTime getDiscountunitmodifiedon() {
        return discountunitmodifiedon;
    }

    public void setDiscountunitmodifiedon(LocalDateTime discountunitmodifiedon) {
        this.discountunitmodifiedon = discountunitmodifiedon;
    }

}
