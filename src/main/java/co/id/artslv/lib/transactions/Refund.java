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

    @Column(name = "c_cancellation_id")
    private String CancellationId;

    @Column(name = "c_refund_paytype")
    private Character Paytype;

    @Column(name = "c_refund_paystartdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Paystartdate;

    @Column(name = "c_refund_payenddate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Payenddate;

    @Column(name = "c_refund_paydate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Paydate;

    @Column(name = "c_refund_bankaccnum")
    private String Bankaccnum;

    @Column(name = "c_refund_bankaccname")
    private String Bankaccname;

    @Column(name = "c_refund_status")
    private Character Status;

    @Column(name = "c_refund_domain")
    private String Domain;

    @Column(name = "c_refund_modifiedby")
    private String Modifiedby;

    @Column(name = "c_refund_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_bank_id")
    private String BankId;

    @Column(name = "c_stasiun_id")
    private String StasiunId;

    @Column(name = "c_refund_maxprint")
    private Short Maxprint;

    @Column(name = "c_refund_refundnum")
    private String Refundnum;

    @Column(name = "c_refund_printedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Printedon;

    @Column(name = "c_refund_totamount")
    private BigDecimal Totamount;

    @Column(name = "c_refund_phonenum")
    private String Phonenum;

    @Column(name = "c_shift_id")
    private String ShiftId;

    @Column(name = "c_refund_noka")
    private String Noka;

    @Column(name = "c_refund_contactname")
    private String Contactname;

    @Column(name = "c_refund_createdby")
    private String Createdby;

    @Column(name = "c_refund_createdon")
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
