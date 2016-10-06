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
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_BANK")
public class Bank implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_BANK_ID")
    private String id;

    @Column(name = "C_BANK_CODE")
    private String bankcode;
    @Column(name = "C_BANK_NAME")
    private String bankname;
    @Column(name = "C_BANK_TYPE")
    private String banktype;
    @Column(name = "C_BANK_STATUS")
    private String bankstatus;
    @Column(name = "C_BANK_DOMAIN")
    private String bankdomain;
    @Column(name = "C_BANK_MODIFIEDBY")
    private String bankmodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_BANK_MODIFIEDON")
    private LocalDateTime bankmodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankstatus() {
        return bankstatus;
    }

    public void setBankstatus(String bankstatus) {
        this.bankstatus = bankstatus;
    }

    public String getBankdomain() {
        return bankdomain;
    }

    public void setBankdomain(String bankdomain) {
        this.bankdomain = bankdomain;
    }

    public String getBankmodifiedby() {
        return bankmodifiedby;
    }

    public void setBankmodifiedby(String bankmodifiedby) {
        this.bankmodifiedby = bankmodifiedby;
    }

    public LocalDateTime getBankmodifiedon() {
        return bankmodifiedon;
    }

    public void setBankmodifiedon(LocalDateTime bankmodifiedon) {
        this.bankmodifiedon = bankmodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getBanktype() {
        return banktype;
    }

    public void setBanktype(String banktype) {
        this.banktype = banktype;
    }

    @Override
    public String toString() {
        return this.bankname;
    }
}
