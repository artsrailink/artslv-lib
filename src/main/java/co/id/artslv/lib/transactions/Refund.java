package co.id.artslv.lib.transactions;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.payments.Bank;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
 * @author Yoga Sefianto
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_REFUND")
public class Refund implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_REFUND_ID")
    private String id;
    @Column(name = "C_REFUND_STATUS")
    private String status;
    @Column(name = "C_REFUND_DOMAIN")
    private String domain;
    @Column(name = "C_REFUND_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_REFUND_MODIFIEDON")
    private LocalDateTime modifiedon;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REFUND_PAYSTARTDATE")
    private LocalDate paystartdate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REFUND_PAYENDDATE")
    private LocalDate payenddate;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_REFUND_PAYDATE")
    private LocalDateTime paydate;
    @Column(name = "C_REFUND_PAYTYPE")
    private String paytype;
    @Column(name = "C_REFUND_BANKACCNUM")
    private String bankaccnum;
    @Column(name = "C_REFUND_BANKACCNAME")
    private String bankaccname;
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;
    @Column(name = "C_BANK_ID")
    private String bankid;
    @Column(name = "C_CANCELLATION_ID")
    private String cancellationid;
    
    @Column(name = "C_REFUND_MAXPRINT")
    private int maxprint;
    
    @Column(name = "C_REFUND_REFUNDNUM")
    private String refundnum;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_REFUND_PRINTEDON")
    private LocalDateTime printedon;
    
    @Column(name = "C_REFUND_TOTAMOUNT")
    private BigDecimal totamount;
    
    @Column(name = "C_REFUND_PHONENUM")
    private String phonenum;

    @Column(name = "C_SHIFT_ID")
    private String shiftid;
    
    @Column(name = "C_REFUND_NOKA")
    private String noka;

    @Column(name = "C_REFUND_CONTACTNAME")
    private String contactname;

    @Transient
    private Cancellation cancellation;
    @Transient 
    private Bank bank;
    @Transient 
    private Stasiun stasiun;
    @Transient
    private List<Refund> listrefund;
    @Transient
    private String bookcode;
    @Transient
    private String numcode;
    @Transient
    private String cancelnum;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public LocalDate getPaystartdate() {
        return paystartdate;
    }

    public void setPaystartdate(LocalDate paystartdate) {
        this.paystartdate = paystartdate;
    }

    public LocalDate getPayenddate() {
        return payenddate;
    }

    public void setPayenddate(LocalDate payenddate) {
        this.payenddate = payenddate;
    }

    public LocalDateTime getPaydate() {
        return paydate;
    }

    public void setPaydate(LocalDateTime paydate) {
        this.paydate = paydate;
    }

    public String getPaytype() {
        return paytype;
    }

    public void setPaytype(String paytype) {
        this.paytype = paytype;
    }

    public String getBankaccnum() {
        return bankaccnum;
    }

    public void setBankaccnum(String bankaccnum) {
        this.bankaccnum = bankaccnum;
    }

    public String getBankaccname() {
        return bankaccname;
    }

    public void setBankaccname(String bankaccname) {
        this.bankaccname = bankaccname;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getCancellationid() {
        return cancellationid;
    }

    public void setCancellationid(String cancellationid) {
        this.cancellationid = cancellationid;
    }

    public Cancellation getCancellation() {
        return cancellation;
    }

    public void setCancellation(Cancellation cancellation) {
        this.cancellation = cancellation;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

    public int getMaxprint() {
        return maxprint;
    }

    public void setMaxprint(int maxprint) {
        this.maxprint = maxprint;
    }

    public String getRefundnum() {
        return refundnum;
    }

    public void setRefundnum(String refundnum) {
        this.refundnum = refundnum;
    }

    public LocalDateTime getPrintedon() {
        return printedon;
    }

    public void setPrintedon(LocalDateTime printedon) {
        this.printedon = printedon;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public List<Refund> getListrefund() {
        return listrefund;
    }

    public void setListrefund(List<Refund> listrefund) {
        this.listrefund = listrefund;
    }

    public String getContactname() {
        return contactname;
    }

    public void setContactname(String contactname) {
        this.contactname = contactname;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getNumcode() {
        return numcode;
    }

    public void setNumcode(String numcode) {
        this.numcode = numcode;
    }

    public String getCancelnum() {
        return cancelnum;
    }

    public void setCancelnum(String cancelnum) {
        this.cancelnum = cancelnum;
    }
}