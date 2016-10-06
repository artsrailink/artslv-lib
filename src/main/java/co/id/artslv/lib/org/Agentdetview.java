/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_V_AGENTDET")
public class Agentdetview implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "AGENTDET_ID", nullable = false)
    private String id;
    @Column(name = "AGENTDET_UNITCODE")
    private String unitcode;
    @Column(name = "AGENTDET_UNITNAME")
    private String unitname;
    @Column(name = "AGENTDET_VANUM")
    private String vanum;
    @Column(name = "AGENTDET_EMAIL")
    private String email;
    @Column(name = "AGENTDET_ADDRESS")
    private String address;
    @Column(name = "AGENTDET_PHONENUM")
    private String phonenum;
    @Column(name = "AGENTDET_TIMEOUT")
    private int timeout;
    @Column(name = "AGENTDET_TYPE")
    private String type;
    @Column(name = "AGENTDET_DEPOSIT")
    private BigDecimal deposit;
    @Column(name = "AGENTDET_BEGINNINGBALANCE")
    private BigDecimal beginningbalance;
    @Column(name = "AGENTDET_WITHDRAWAL")
    private BigDecimal withdrawal;
    @Column(name = "AGENTDET_ENDINGBALANCE")
    private BigDecimal endingbalance;
    @Column(name = "AGENTDET_IDSAP")
    private String idsap;
    @Column(name = "AGENTDET_STATUS")
    private String status;
    @Column(name = "AGENTDET_DOMAIN")
    private String domain;
    @Column(name = "AGENTDET_MODIFIEDBY")
    private String modifiedby;
    @Column(name = "AGENTDET_MODIFIEDON")
    private String modifiedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getVanum() {
        return vanum;
    }

    public void setVanum(String vanum) {
        this.vanum = vanum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getDeposit() {
        return deposit;
    }

    public void setDeposit(BigDecimal deposit) {
        this.deposit = deposit;
    }

    public String getIdsap() {
        return idsap;
    }

    public void setIdsap(String idsap) {
        this.idsap = idsap;
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

    public String getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(String modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public BigDecimal getBeginningbalance() {
        return beginningbalance;
    }

    public void setBeginningbalance(BigDecimal beginningbalance) {
        this.beginningbalance = beginningbalance;
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

}
