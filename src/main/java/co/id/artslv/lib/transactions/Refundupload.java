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
@Table(name = "arts_t_refundupload")
public class Refundupload {

    @Column(name = "c_refundupload_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_refundupload_bookcode", table = "arts_t_refundupload", nullable = false, length = 7)
    private String Bookcode;

    @Column(name = "c_refundupload_ticketnum", table = "arts_t_refundupload", nullable = false, length = 50)
    private String Ticketnum;

    @Column(name = "c_refundupload_stcodeorg", table = "arts_t_refundupload", nullable = false, length = 10)
    private String Stcodeorg;

    @Column(name = "c_refundupload_stcodedest", table = "arts_t_refundupload", nullable = false, length = 10)
    private String Stcodedest;

    @Column(name = "c_refundupload_psgname", table = "arts_t_refundupload", nullable = false, length = 100)
    private String Psgname;

    @Column(name = "c_refundupload_amount", table = "arts_t_refundupload", nullable = false, scale = 2, precision = 11)
    private BigDecimal Amount;

    @Column(name = "c_refundupload_canceldate", table = "arts_t_refundupload", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Canceldate;

    @Column(name = "c_refundupload_refunddatemin", table = "arts_t_refundupload", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Refunddatemin;

    @Column(name = "c_refundupload_refunddatemax", table = "arts_t_refundupload")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Refunddatemax;

    @Column(name = "c_refundupload_refundtype", table = "arts_t_refundupload", nullable = false)
    private Character Refundtype;

    @Column(name = "c_refundupload_stcoderefund", table = "arts_t_refundupload", length = 10)
    private String Stcoderefund;

    @Column(name = "c_user_id", table = "arts_t_refundupload", length = 36)
    private String UserId;

    @Column(name = "c_unit_id", table = "arts_t_refundupload", length = 36)
    private String UnitId;

    @Column(name = "c_refundupload_refunddate", table = "arts_t_refundupload")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Refunddate;

    @Column(name = "c_stasiun_idrefund", table = "arts_t_refundupload", length = 36)
    private String StasiunIdrefund;

    @Column(name = "c_refundupload_status", table = "arts_t_refundupload", nullable = false)
    private Character Status;

    @Column(name = "c_refundupload_domain", table = "arts_t_refundupload", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_refundupload_modifiedby", table = "arts_t_refundupload", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_refundupload_modifiedon", table = "arts_t_refundupload", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_refundupload_bankname", table = "arts_t_refundupload", length = 100)
    private String Bankname;

    @Column(name = "c_refundupload_bankaccname", table = "arts_t_refundupload", length = 100)
    private String Bankaccname;

    @Column(name = "c_refundupload_bankaccnum", table = "arts_t_refundupload", length = 100)
    private String Bankaccnum;

    @Column(name = "c_refundupload_maxprint", table = "arts_t_refundupload")
    private Short Maxprint;

    @Column(name = "c_refundupload_refundnum", table = "arts_t_refundupload", length = 50)
    private String Refundnum;

    @Column(name = "c_refundupload_printedon", table = "arts_t_refundupload")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Printedon;

    @Column(name = "c_refundupload_createdby", table = "arts_t_refundupload", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_refundupload_createdon", table = "arts_t_refundupload", nullable = false)
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

    public String getBookcode() {
        return Bookcode;
    }

    public void setBookcode(String Bookcode) {
        this.Bookcode = Bookcode;
    }

    public String getTicketnum() {
        return Ticketnum;
    }

    public void setTicketnum(String Ticketnum) {
        this.Ticketnum = Ticketnum;
    }

    public String getStcodeorg() {
        return Stcodeorg;
    }

    public void setStcodeorg(String Stcodeorg) {
        this.Stcodeorg = Stcodeorg;
    }

    public String getStcodedest() {
        return Stcodedest;
    }

    public void setStcodedest(String Stcodedest) {
        this.Stcodedest = Stcodedest;
    }

    public String getPsgname() {
        return Psgname;
    }

    public void setPsgname(String Psgname) {
        this.Psgname = Psgname;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public LocalDate getCanceldate() {
        return Canceldate;
    }

    public void setCanceldate(LocalDate Canceldate) {
        this.Canceldate = Canceldate;
    }

    public LocalDate getRefunddatemin() {
        return Refunddatemin;
    }

    public void setRefunddatemin(LocalDate Refunddatemin) {
        this.Refunddatemin = Refunddatemin;
    }

    public LocalDate getRefunddatemax() {
        return Refunddatemax;
    }

    public void setRefunddatemax(LocalDate Refunddatemax) {
        this.Refunddatemax = Refunddatemax;
    }

    public Character getRefundtype() {
        return Refundtype;
    }

    public void setRefundtype(Character Refundtype) {
        this.Refundtype = Refundtype;
    }

    public String getStcoderefund() {
        return Stcoderefund;
    }

    public void setStcoderefund(String Stcoderefund) {
        this.Stcoderefund = Stcoderefund;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    public LocalDate getRefunddate() {
        return Refunddate;
    }

    public void setRefunddate(LocalDate Refunddate) {
        this.Refunddate = Refunddate;
    }

    public String getStasiunIdrefund() {
        return StasiunIdrefund;
    }

    public void setStasiunIdrefund(String StasiunIdrefund) {
        this.StasiunIdrefund = StasiunIdrefund;
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

    public String getBankname() {
        return Bankname;
    }

    public void setBankname(String Bankname) {
        this.Bankname = Bankname;
    }

    public String getBankaccname() {
        return Bankaccname;
    }

    public void setBankaccname(String Bankaccname) {
        this.Bankaccname = Bankaccname;
    }

    public String getBankaccnum() {
        return Bankaccnum;
    }

    public void setBankaccnum(String Bankaccnum) {
        this.Bankaccnum = Bankaccnum;
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
