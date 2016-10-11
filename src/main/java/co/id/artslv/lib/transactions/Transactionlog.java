package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_transactionlog")
public class Transactionlog {

    @Column(name = "c_transactionlog_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_transaction_id", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String TransactionId;

    @Column(name = "c_transaction_bookcode", table = "arts_t_transactionlog", nullable = false, length = 7)
    private String TransactionBookcode;

    @Column(name = "c_transactiondet_id", table = "arts_t_transactionlog", length = 36)
    private String TransactiondetId;

    @Column(name = "c_cancellation_id", table = "arts_t_transactionlog", length = 36)
    private String CancellationId;

    @Column(name = "c_cancellationdet_id", table = "arts_t_transactionlog", length = 36)
    private String CancellationdetId;

    @Column(name = "c_transactionlog_time", table = "arts_t_transactionlog", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Time;

    @Column(name = "c_transactionlog_type", table = "arts_t_transactionlog", length = 50)
    private String Type;

    @Column(name = "c_transactionlog_value", table = "arts_t_transactionlog", nullable = false, length = 2147483647)
    @Lob
    private String Value;

    @Column(name = "c_user_id", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String UserId;

    @Column(name = "c_user_fullname", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String UserFullname;

    @Column(name = "c_stasiun_id", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String StasiunId;

    @Column(name = "c_stasiun_code", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String StasiunCode;

    @Column(name = "c_unit_id", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String UnitId;

    @Column(name = "c_unit_code", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String UnitCode;

    @Column(name = "c_shift_id", table = "arts_t_transactionlog", length = 36)
    private String ShiftId;

    @Column(name = "c_transactionlog_status", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String Status;

    @Column(name = "c_transactionlog_domain", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_transactionlog_createdby", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_transactionlog_createdon", table = "arts_t_transactionlog", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    @Column(name = "c_transactionlog_modifiedby", table = "arts_t_transactionlog", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_transactionlog_modifiedon", table = "arts_t_transactionlog", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    public String getTransactionBookcode() {
        return TransactionBookcode;
    }

    public void setTransactionBookcode(String TransactionBookcode) {
        this.TransactionBookcode = TransactionBookcode;
    }

    public String getTransactiondetId() {
        return TransactiondetId;
    }

    public void setTransactiondetId(String TransactiondetId) {
        this.TransactiondetId = TransactiondetId;
    }

    public String getCancellationId() {
        return CancellationId;
    }

    public void setCancellationId(String CancellationId) {
        this.CancellationId = CancellationId;
    }

    public String getCancellationdetId() {
        return CancellationdetId;
    }

    public void setCancellationdetId(String CancellationdetId) {
        this.CancellationdetId = CancellationdetId;
    }

    public LocalDate getTime() {
        return Time;
    }

    public void setTime(LocalDate Time) {
        this.Time = Time;
    }

    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
        this.Value = Value;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUserFullname() {
        return UserFullname;
    }

    public void setUserFullname(String UserFullname) {
        this.UserFullname = UserFullname;
    }

    public String getStasiunId() {
        return StasiunId;
    }

    public void setStasiunId(String StasiunId) {
        this.StasiunId = StasiunId;
    }

    public String getStasiunCode() {
        return StasiunCode;
    }

    public void setStasiunCode(String StasiunCode) {
        this.StasiunCode = StasiunCode;
    }

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    public String getUnitCode() {
        return UnitCode;
    }

    public void setUnitCode(String UnitCode) {
        this.UnitCode = UnitCode;
    }

    public String getShiftId() {
        return ShiftId;
    }

    public void setShiftId(String ShiftId) {
        this.ShiftId = ShiftId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
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

    
}
