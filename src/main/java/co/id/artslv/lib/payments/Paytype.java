/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "KAIRTS_T_PAYTYPE")
public class Paytype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_PAYTYPE_ID")
    private String id;

    @Column(name = "C_PAYTYPE_NAME")
    private String paytypename;
    @Column(name = "C_PAYTYPE_FEE")
    private long paytypefee;
    @Column(name = "C_PAYTYPE_STATUS")
    private String paytypestatus;
    @Column(name = "C_PAYTYPE_DOMAIN")
    private String paytypedomain;
    @Column(name = "C_PAYTYPE_MODIFIEDBY")
    private String paytypemodifiedby;
    @Column(name = "C_PAYTYPE_TIMEOUT")
    private int paytypetimeout;
    @Column(name = "C_PAYTYPE_TIMEOUTSTAT")
    private String paytypetimeoutstat;
//    @Column(name = "C_PAYTYPE_FEEAMOUNT")
//    private String paytypefeeamount;
    @Column(name = "C_PAYTYPE_AMOUNTTYPE")
    private String paytypeamounttype;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")    
    @Column(name = "C_PAYTYPE_MODIFIEDON")
    private LocalDateTime paytypemodifiedon;

    @Column(name = "C_PAYTYPE_CODE")
    private String paytypecode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

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

    public String getPaytypename() {
        return paytypename;
    }

    public void setPaytypename(String paytypename) {
        this.paytypename = paytypename;
    }

    public long getPaytypefee() {
        return paytypefee;
    }

    public void setPaytypefee(long paytypefee) {
        this.paytypefee = paytypefee;
    }

    public String getPaytypestatus() {
        return paytypestatus;
    }

    public void setPaytypestatus(String paytypestatus) {
        this.paytypestatus = paytypestatus;
    }

    public String getPaytypedomain() {
        return paytypedomain;
    }

    public void setPaytypedomain(String paytypedomain) {
        this.paytypedomain = paytypedomain;
    }

    public String getPaytypemodifiedby() {
        return paytypemodifiedby;
    }

    public void setPaytypemodifiedby(String paytypemodifiedby) {
        this.paytypemodifiedby = paytypemodifiedby;
    }

    public int getPaytypetimeout() {
        return paytypetimeout;
    }

    public void setPaytypetimeout(int paytypetimeout) {
        this.paytypetimeout = paytypetimeout;
    }

    public String getPaytypetimeoutstat() {
        return paytypetimeoutstat;
    }

    public void setPaytypetimeoutstat(String paytypetimeoutstat) {
        this.paytypetimeoutstat = paytypetimeoutstat;
    }

//    public String getPaytypefeeamount() {
//        return paytypefeeamount;
//    }
//
//    public void setPaytypefeeamount(String paytypefeeamount) {
//        this.paytypefeeamount = paytypefeeamount;
//    }

    public String getPaytypeamounttype() {
        return paytypeamounttype;
    }

    public void setPaytypeamounttype(String paytypeamounttype) {
        this.paytypeamounttype = paytypeamounttype;
    }

    public LocalDateTime getPaytypemodifiedon() {
        return paytypemodifiedon;
    }

    public void setPaytypemodifiedon(LocalDateTime paytypemodifiedon) {
        this.paytypemodifiedon = paytypemodifiedon;
    }

    @Override
    public String toString() {
        return this.paytypename;
    }

    public String getPaytypecode() {
        return paytypecode;
    }

    public void setPaytypecode(String paytypecode) {
        this.paytypecode = paytypecode;
    }
}
