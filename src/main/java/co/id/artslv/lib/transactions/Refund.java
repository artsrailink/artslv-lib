package co.id.artslv.lib.transactions;

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
@Table(name = "arts_t_refund")
public class Refund {

    @Column(name = "c_refund_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_cancellation_id", table = "arts_t_refund", nullable = false, length = 36)
    private String CancellationId;

    @Column(name = "c_refund_paytype", table = "arts_t_refund", nullable = false)
    private Character Paytype;

    @Column(name = "c_refund_paystartdate", table = "arts_t_refund", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Paystartdate;

    @Column(name = "c_refund_payenddate", table = "arts_t_refund", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Payenddate;

    @Column(name = "c_refund_paydate", table = "arts_t_refund")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Paydate;

    @Column(name = "c_refund_bankaccnum", table = "arts_t_refund", length = 100)
    private String Bankaccnum;

    @Column(name = "c_refund_bankaccname", table = "arts_t_refund", length = 100)
    private String Bankaccname;

    @Column(name = "c_refund_status", table = "arts_t_refund", nullable = false)
    private Character Status;

    @Column(name = "c_refund_domain", table = "arts_t_refund", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_refund_modifiedby", table = "arts_t_refund", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_refund_modifiedon", table = "arts_t_refund", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_bank_id", table = "arts_t_refund", length = 36)
    private String BankId;

    @Column(name = "c_stasiun_id", table = "arts_t_refund", length = 36)
    private String StasiunId;

    @Column(name = "c_refund_maxprint", table = "arts_t_refund")
    private Short Maxprint;

    @Column(name = "c_refund_refundnum", table = "arts_t_refund", length = 50)
    private String Refundnum;

    @Column(name = "c_refund_printedon", table = "arts_t_refund")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Printedon;

    @Column(name = "c_refund_totamount", table = "arts_t_refund", nullable = false, scale = 2, precision = 11)
    private BigDecimal Totamount;

    @Column(name = "c_refund_phonenum", table = "arts_t_refund", length = 50)
    private String Phonenum;

    @Column(name = "c_shift_id", table = "arts_t_refund", length = 36)
    private String ShiftId;

    @Column(name = "c_refund_noka", table = "arts_t_refund", nullable = false, length = 50)
    private String Noka;

    @Column(name = "c_refund_contactname", table = "arts_t_refund", length = 100)
    private String Contactname;

    @Column(name = "c_refund_createdby", table = "arts_t_refund", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_refund_createdon", table = "arts_t_refund", nullable = false)
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

    public String getCancellationId() {
        return CancellationId;
    }

    public void setCancellationId(String CancellationId) {
        this.CancellationId = CancellationId;
    }

    public Character getPaytype() {
        return Paytype;
    }

    public void setPaytype(Character Paytype) {
        this.Paytype = Paytype;
    }

    public LocalDate getPaystartdate() {
        return Paystartdate;
    }

    public void setPaystartdate(LocalDate Paystartdate) {
        this.Paystartdate = Paystartdate;
    }

    public LocalDate getPayenddate() {
        return Payenddate;
    }

    public void setPayenddate(LocalDate Payenddate) {
        this.Payenddate = Payenddate;
    }

    public LocalDate getPaydate() {
        return Paydate;
    }

    public void setPaydate(LocalDate Paydate) {
        this.Paydate = Paydate;
    }

    public String getBankaccnum() {
        return Bankaccnum;
    }

    public void setBankaccnum(String Bankaccnum) {
        this.Bankaccnum = Bankaccnum;
    }

    public String getBankaccname() {
        return Bankaccname;
    }

    public void setBankaccname(String Bankaccname) {
        this.Bankaccname = Bankaccname;
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

    public String getBankId() {
        return BankId;
    }

    public void setBankId(String BankId) {
        this.BankId = BankId;
    }

    public String getStasiunId() {
        return StasiunId;
    }

    public void setStasiunId(String StasiunId) {
        this.StasiunId = StasiunId;
    }

    public Short getMaxprint() {
        return Maxprint;
    }

    public void setMaxprint(Short Maxprint) {
        this.Maxprint = Maxprint;
    }

    public String getRefundnum() {
        return Refundnum;
    }

    public void setRefundnum(String Refundnum) {
        this.Refundnum = Refundnum;
    }

    public LocalDate getPrintedon() {
        return Printedon;
    }

    public void setPrintedon(LocalDate Printedon) {
        this.Printedon = Printedon;
    }

    public BigDecimal getTotamount() {
        return Totamount;
    }

    public void setTotamount(BigDecimal Totamount) {
        this.Totamount = Totamount;
    }

    public String getPhonenum() {
        return Phonenum;
    }

    public void setPhonenum(String Phonenum) {
        this.Phonenum = Phonenum;
    }

    public String getShiftId() {
        return ShiftId;
    }

    public void setShiftId(String ShiftId) {
        this.ShiftId = ShiftId;
    }

    public String getNoka() {
        return Noka;
    }

    public void setNoka(String Noka) {
        this.Noka = Noka;
    }

    public String getContactname() {
        return Contactname;
    }

    public void setContactname(String Contactname) {
        this.Contactname = Contactname;
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
