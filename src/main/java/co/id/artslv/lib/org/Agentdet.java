package co.id.artslv.lib.org;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigDecimal;
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
@Table(name = "arts_t_agentdet")
public class Agentdet {

    @Column(name = "c_agentdet_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_unit_id")
    private String UnitId;

    @Column(name = "c_agentdet_timeout")
    private short Timeout;

    @Column(name = "c_agentdet_type")
    private Character Type;

    @Column(name = "c_agentdet_vanum")
    private String Vanum;

    @Column(name = "c_agentdet_email")
    private String Email;

    @Column(name = "c_agentdet_address")
    private String Address;

    @Column(name = "c_agentdet_phonenum")
    private String Phonenum;

    @Column(name = "c_agentdet_status")
    private Character Status;

    @Column(name = "c_agentdet_domain")
    private String Domain;

    @Column(name = "c_agentdet_modifiedby")
    private String Modifiedby;

    @Column(name = "c_agentdet_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_agentdet_idsap")
    private String Idsap;

    @Column(name = "c_agentdet_sellingtime")
    private int Sellingtime;

    @Column(name = "c_agentdet_beginningbalance")
    private BigDecimal Beginningbalance;

    @Column(name = "c_agentdet_deposit")
    private BigDecimal Deposit;

    @Column(name = "c_agentdet_withdrawal")
    private BigDecimal Withdrawal;

    @Column(name = "c_agentdet_endingbalance")
    private BigDecimal Endingbalance;

    @Column(name = "c_agentdet_createdby")
    private String Createdby;

    @Column(name = "c_agentdet_createdon")
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

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    public short getTimeout() {
        return Timeout;
    }

    public void setTimeout(short Timeout) {
        this.Timeout = Timeout;
    }

    public Character getType() {
        return Type;
    }

    public void setType(Character Type) {
        this.Type = Type;
    }

    public String getVanum() {
        return Vanum;
    }

    public void setVanum(String Vanum) {
        this.Vanum = Vanum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhonenum() {
        return Phonenum;
    }

    public void setPhonenum(String Phonenum) {
        this.Phonenum = Phonenum;
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

    public String getIdsap() {
        return Idsap;
    }

    public void setIdsap(String Idsap) {
        this.Idsap = Idsap;
    }

    public int getSellingtime() {
        return Sellingtime;
    }

    public void setSellingtime(int Sellingtime) {
        this.Sellingtime = Sellingtime;
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
