/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.log;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;
/**
 *
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_TRANSACTIONLOG")
public class Transactionlog implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRANSACTIONLOG_ID")
    private String id;
    @Column(name = "C_TRANSACTIONLOG_TYPE")
    private String type;
    @Column(name = "C_TRANSACTIONLOG_DOMAIN")
    private String domain;
    @Column(name = "C_TRANSACTION_ID")
    private String transactionid;
    @Column(name = "C_TRANSACTIONDET_ID")
    private String transactiondetid;
    @Column(name = "C_CANCELLATION_ID")
    private String cancellationid;
    @Column(name = "C_CANCELLATIONDET_ID")
    private String cancellationdetid;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTIONLOG_TIME")
    private LocalDateTime time;
            
    @Column(name = "C_USER_ID")
    private String userid;
    
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;
    
    @Column(name = "C_UNIT_ID")
    private String unitid;
    
    @Column(name = "C_SHIFT_ID")
    private String shiftid;
    
    @Column(name = "C_TRANSACTIONLOG_VALUE")
    @Lob
    private String value;
    @Column(name = "C_TRANSACTIONLOG_TRANSBOOKCODE")
    private String transbookcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactiondetid() {
        return transactiondetid;
    }

    public void setTransactiondetid(String transactiondetid) {
        this.transactiondetid = transactiondetid;
    }

    public String getCancellationid() {
        return cancellationid;
    }

    public void setCancellationid(String cancellationid) {
        this.cancellationid = cancellationid;
    }

    public String getCancellationdetid() {
        return cancellationdetid;
    }

    public void setCancellationdetid(String cancellationdetid) {
        this.cancellationdetid = cancellationdetid;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


    public String getTransbookcode() {
        return transbookcode;
    }

    public void setTransbookcode(String transbookcode) {
        this.transbookcode = transbookcode;
    }
}