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
import java.util.List;

import org.hibernate.annotations.Type;

/**
 *
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class AgentBalance implements Serializable {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rqid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String unit_code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String unit_name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String agent_code;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String agent_name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate payment_date;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String type;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal amount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ref_no;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal agent_balance;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String modifiedby;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String bank_code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private List<AgentTrans> listagenttrans;

    public String getRqid() {
        return rqid;
    }

    public void setRqid(String rqid) {
        this.rqid = rqid;
    }

    public LocalDate getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(LocalDate payment_date) {
        this.payment_date = payment_date;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRef_no() {
        return ref_no;
    }

    public void setRef_no(String ref_no) {
        this.ref_no = ref_no;
    }

    public BigDecimal getAgent_balance() {
        return agent_balance;
    }

    public void setAgent_balance(BigDecimal agent_balance) {
        this.agent_balance = agent_balance;
    }

    public List<AgentTrans> getListagenttrans() {
        return listagenttrans;
    }

    public void setListagenttrans(List<AgentTrans> listagenttrans) {
        this.listagenttrans = listagenttrans;
    }

    public String getUnit_code() {
        return unit_code;
    }

    public void setUnit_code(String unit_code) {
        this.unit_code = unit_code;
    }

    public String getUnit_name() {
        return unit_name;
    }

    public void setUnit_name(String unit_name) {
        this.unit_name = unit_name;
    }

    public String getAgent_code() {
        return agent_code;
    }

    public void setAgent_code(String agent_code) {
        this.agent_code = agent_code;
    }

    public String getAgent_name() {
        return agent_name;
    }

    public void setAgent_name(String agent_name) {
        this.agent_name = agent_name;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public String getBank_code() {
        return bank_code;
    }

    public void setBank_code(String bank_code) {
        this.bank_code = bank_code;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

}
