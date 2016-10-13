package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
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
@Table(name = "arts_t_cancellation")
public class Cancellation {

    @Column(name = "c_cancellation_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_cancellation_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_cancellation_totamount")
    private long Totamount;

    @Column(name = "c_cancellation_status")
    private Character Status;

    @Column(name = "c_transactionid_cancelled")
    private String TransactionidCancelled;

    @Column(name = "c_transactionid_new")
    private String TransactionidNew;

    @Column(name = "c_cancellation_domain")
    private String Domain;

    @Column(name = "c_cancellation_modifiedby")
    private String Modifiedby;

    @Column(name = "c_cancellation_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_stasiun_id")
    private String StasiunId;

    @Column(name = "c_cancellationtype_id")
    private String CancellationtypeId;

    @Column(name = "c_cancelreason_id")
    private String CancelreasonId;

    @Column(name = "c_shift_id")
    private String ShiftId;

    @Column(name = "c_cancellation_noka")
    private String Noka;

    @Column(name = "c_cancellation_trainname")
    private String Trainname;

    @Column(name = "c_cancellation_maxprint")
    private Short Maxprint;

    @Column(name = "c_cancellation_cancelnum")
    private String Cancelnum;

    @Column(name = "c_cancellation_printedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Printedon;

    @Column(name = "c_cancellation_createdby")
    private String Createdby;

    @Column(name = "c_cancellation_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    public String getId() {
        return id;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public long getTotamount() {
        return Totamount;
    }

    public void setTotamount(long Totamount) {
        this.Totamount = Totamount;
    }

    public Character getStatus() {
        return Status;
    }

    public void setStatus(Character Status) {
        this.Status = Status;
    }

    public String getTransactionidCancelled() {
        return TransactionidCancelled;
    }

    public void setTransactionidCancelled(String TransactionidCancelled) {
        this.TransactionidCancelled = TransactionidCancelled;
    }

    public String getTransactionidNew() {
        return TransactionidNew;
    }

    public void setTransactionidNew(String TransactionidNew) {
        this.TransactionidNew = TransactionidNew;
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

    public String getStasiunId() {
        return StasiunId;
    }

    public void setStasiunId(String StasiunId) {
        this.StasiunId = StasiunId;
    }

    public String getCancellationtypeId() {
        return CancellationtypeId;
    }

    public void setCancellationtypeId(String CancellationtypeId) {
        this.CancellationtypeId = CancellationtypeId;
    }

    public String getCancelreasonId() {
        return CancelreasonId;
    }

    public void setCancelreasonId(String CancelreasonId) {
        this.CancelreasonId = CancelreasonId;
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

    public String getTrainname() {
        return Trainname;
    }

    public void setTrainname(String Trainname) {
        this.Trainname = Trainname;
    }

    public Short getMaxprint() {
        return Maxprint;
    }

    public void setMaxprint(Short Maxprint) {
        this.Maxprint = Maxprint;
    }

    public String getCancelnum() {
        return Cancelnum;
    }

    public void setCancelnum(String Cancelnum) {
        this.Cancelnum = Cancelnum;
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
