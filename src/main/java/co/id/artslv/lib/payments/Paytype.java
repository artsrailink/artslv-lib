package co.id.artslv.lib.payments;

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
@Table(name = "arts_t_paytype")
public class Paytype {

    @Column(name = "c_paytype_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_paytype_name", table = "arts_t_paytype", nullable = false, length = 100)
    private String Name;

    @Column(name = "c_paytype_fee", table = "arts_t_paytype", nullable = false, scale = 2, precision = 11)
    private BigDecimal Fee;

    @Column(name = "c_paytype_status", table = "arts_t_paytype", nullable = false)
    private Character Status;

    @Column(name = "c_paytype_domain", table = "arts_t_paytype", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_paytype_modifiedby", table = "arts_t_paytype", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_paytype_modifiedon", table = "arts_t_paytype", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_paytype_timeout", table = "arts_t_paytype", nullable = false)
    private short Timeout;

    @Column(name = "c_paytype_timeoutstat", table = "arts_t_paytype", nullable = false)
    private Character Timeoutstat;

    @Column(name = "c_paytype_amounttype", table = "arts_t_paytype", nullable = false)
    private Character Amounttype;

    @Column(name = "c_paytype_code", table = "arts_t_paytype", nullable = false, length = 50)
    private String Code;

    @Column(name = "c_paytype_createdby", table = "arts_t_paytype", length = 36)
    private String Createdby;

    @Column(name = "c_paytype_createdon", table = "arts_t_paytype")
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public BigDecimal getFee() {
        return Fee;
    }

    public void setFee(BigDecimal Fee) {
        this.Fee = Fee;
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

    public short getTimeout() {
        return Timeout;
    }

    public void setTimeout(short Timeout) {
        this.Timeout = Timeout;
    }

    public Character getTimeoutstat() {
        return Timeoutstat;
    }

    public void setTimeoutstat(Character Timeoutstat) {
        this.Timeoutstat = Timeoutstat;
    }

    public Character getAmounttype() {
        return Amounttype;
    }

    public void setAmounttype(Character Amounttype) {
        this.Amounttype = Amounttype;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
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
