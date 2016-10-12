package co.id.artslv.lib.org;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_agenttrans")
public class Agenttrans {

    @Column(name = "c_agenttrans_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_agenttrans_vanum")
    private String Vanum;

    @Column(name = "c_agenttrans_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_agenttrans_type")
    private Character Type;

    @Column(name = "c_agentdet_id")
    private String AgentdetId;

    @Column(name = "c_agenttrans_ref")
    private String Ref;

    @Column(name = "c_agenttrans_status")
    private Character Status;

    @Column(name = "c_agenttrans_domain")
    private String Domain;

    @Column(name = "c_agenttrans_modifiedby")
    private String Modifiedby;

    @Column(name = "c_agenttrans_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_agenttrans_beginningbalance")
    private BigDecimal Beginningbalance;

    @Column(name = "c_agenttrans_deposit")
    private BigDecimal Deposit;

    @Column(name = "c_agenttrans_withdrawal")
    private BigDecimal Withdrawal;

    @Column(name = "c_agenttrans_endingbalance")
    private BigDecimal Endingbalance;

    @Column(name = "c_agenttrans_bankcode", table = "arts_t_agenttrans")
    private String Bankcode;

    @Column(name = "c_agenttrans_createdby")
    private String Createdby;

    @Column(name = "c_agenttrans_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVanum() {
        return Vanum;
    }

    public void setVanum(String Vanum) {
        this.Vanum = Vanum;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public Character getType() {
        return Type;
    }

    public void setType(Character Type) {
        this.Type = Type;
    }

    public String getAgentdetId() {
        return AgentdetId;
    }

    public void setAgentdetId(String AgentdetId) {
        this.AgentdetId = AgentdetId;
    }

    public String getRef() {
        return Ref;
    }

    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    public Character getStatus() {
        return Status;
    }

    public void setStatus(Character Status) {
        this.Status = Status;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public String getModifiedby() {
        return Modifiedby;
    }

    public void setModifiedby(String Modifiedby) {
        this.Modifiedby = Modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime Modifiedon) {
        this.Modifiedon = Modifiedon;
    }

    public BigDecimal getBeginningbalance() {
        return Beginningbalance;
    }

    public void setBeginningbalance(BigDecimal Beginningbalance) {
        this.Beginningbalance = Beginningbalance;
    }

    public BigDecimal getDeposit() {
        return Deposit;
    }

    public void setDeposit(BigDecimal Deposit) {
        this.Deposit = Deposit;
    }

    public BigDecimal getWithdrawal() {
        return Withdrawal;
    }

    public void setWithdrawal(BigDecimal Withdrawal) {
        this.Withdrawal = Withdrawal;
    }

    public BigDecimal getEndingbalance() {
        return Endingbalance;
    }

    public void setEndingbalance(BigDecimal Endingbalance) {
        this.Endingbalance = Endingbalance;
    }

    public String getBankcode() {
        return Bankcode;
    }

    public void setBankcode(String Bankcode) {
        this.Bankcode = Bankcode;
    }

    public String getCreatedby() {
        return Createdby;
    }

    public void setCreatedby(String Createdby) {
        this.Createdby = Createdby;
    }

    public LocalDateTime getCreatedon() {
        return Createdon;
    }

    public void setCreatedon(LocalDateTime Createdon) {
        this.Createdon = Createdon;
    }

    
}
