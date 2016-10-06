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
import java.math.BigDecimal;
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
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_V_AGENTTRANS")
public class AgentTransview implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "AGENTTRANS_ID", nullable = false)
    private String id;
    @Column(name = "AGENTTRANS_UNITCODE")
    private String unitcode;
    @Column(name = "AGENTTRANS_VANUM")
    private String vanum;
    @Column(name = "AGENTTRANS_BANKCODE")
    private String bankcode;
//    @Column(name = "AGENTTRANS_BANKNAME")
//    private String bankname;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "AGENTTRANS_DATE")
    private LocalDate date;
    @Column(name = "AGENTTRANS_TYPE")
    private String type;
    @Column(name = "AGENTTRANS_BEGINNINGBALANCE")
    private BigDecimal beginningbalance;
    @Column(name = "AGENTTRANS_DEPOSIT")
    private BigDecimal deposit;
    @Column(name = "AGENTTRANS_WITHDRAWAL")
    private BigDecimal withdrawal;
    @Column(name = "AGENTTRANS_ENDINGBALANCE")
    private BigDecimal endingbalance;
    @Column(name = "AGENTTRANS_REF")
    private String ref;
    @Column(name = "AGENTTRANS_STATUS")
    private String status;
    @Column(name = "AGENTTRANS_DOMAIN")
    private String domain;
    @Column(name = "AGENTTRANS_MODIFIEDBY")
    private String modifiedby;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "AGENTTRANS_MODIFIEDON")
    private LocalDateTime modifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    Agentdet agentdet;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVanum() {
        return vanum;
    }

    public void setVanum(String vanum) {
        this.vanum = vanum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public Agentdet getAgentdet() {
        return agentdet;
    }

    public void setAgentdet(Agentdet agentdet) {
        this.agentdet = agentdet;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public BigDecimal getBeginningbalance() {
        return beginningbalance;
    }

    public void setBeginningbalance(BigDecimal beginningbalance) {
        this.beginningbalance = beginningbalance;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public BigDecimal getWithdrawal() {
        return withdrawal;
    }

    public void setWithdrawal(BigDecimal withdrawal) {
        this.withdrawal = withdrawal;
    }

    public BigDecimal getEndingbalance() {
        return endingbalance;
    }

    public void setEndingbalance(BigDecimal endingbalance) {
        this.endingbalance = endingbalance;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

}
