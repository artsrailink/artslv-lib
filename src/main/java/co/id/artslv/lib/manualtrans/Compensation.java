package co.id.artslv.lib.manualtrans;

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
@Table(name = "arts_t_compensation")
public class Compensation {

    @Column(name = "c_compensation_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_compensation_date", table = "arts_t_compensation", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_compensation_doctitle", table = "arts_t_compensation", nullable = false, length = 20)
    private String Doctitle;

    @Column(name = "c_compensation_docnum", table = "arts_t_compensation", nullable = false)
    private double Docnum;

    @Column(name = "c_schedule_id", table = "arts_t_compensation", nullable = false, length = 36)
    private String ScheduleId;

    @Column(name = "c_stasiun_idorg", table = "arts_t_compensation", nullable = false, length = 36)
    private String StasiunIdorg;

    @Column(name = "c_stasiun_iddest", table = "arts_t_compensation", nullable = false, length = 36)
    private String StasiunIddest;

    @Column(name = "c_wagonclass_id", table = "arts_t_compensation", nullable = false, length = 36)
    private String WagonclassId;

    @Column(name = "c_compensation_type", table = "arts_t_compensation", nullable = false)
    private Character Type;

    @Column(name = "c_compensation_refundamount", table = "arts_t_compensation", nullable = false, scale = 2, precision = 11)
    private BigDecimal Refundamount;

    @Column(name = "c_compensation_reason", table = "arts_t_compensation", nullable = false, length = 200)
    private String Reason;

    @Column(name = "c_compensation_status", table = "arts_t_compensation", nullable = false)
    private Character Status;

    @Column(name = "c_compensation_domain", table = "arts_t_compensation", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_compensation_modifiedby", table = "arts_t_compensation", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_compensation_modifiedon", table = "arts_t_compensation", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_stasiun_idrefund", table = "arts_t_compensation", nullable = false, length = 36)
    private String StasiunIdrefund;

    @Column(name = "c_shift_id", table = "arts_t_compensation", nullable = false, length = 36)
    private String ShiftId;

    @Column(name = "c_compensation_bookcode", table = "arts_t_compensation", length = 1000)
    private String Bookcode;

    @Column(name = "c_compensation_ticketnum", table = "arts_t_compensation", length = 1000)
    private String Ticketnum;

    @Column(name = "c_compensation_createdby", table = "arts_t_compensation", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_compensation_createdon", table = "arts_t_compensation", nullable = false)
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

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getDoctitle() {
        return Doctitle;
    }

    public void setDoctitle(String Doctitle) {
        this.Doctitle = Doctitle;
    }

    public double getDocnum() {
        return Docnum;
    }

    public void setDocnum(double Docnum) {
        this.Docnum = Docnum;
    }

    public String getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getStasiunIdorg() {
        return StasiunIdorg;
    }

    public void setStasiunIdorg(String StasiunIdorg) {
        this.StasiunIdorg = StasiunIdorg;
    }

    public String getStasiunIddest() {
        return StasiunIddest;
    }

    public void setStasiunIddest(String StasiunIddest) {
        this.StasiunIddest = StasiunIddest;
    }

    public String getWagonclassId() {
        return WagonclassId;
    }

    public void setWagonclassId(String WagonclassId) {
        this.WagonclassId = WagonclassId;
    }

    public Character getType() {
        return Type;
    }

    public void setType(Character Type) {
        this.Type = Type;
    }

    public BigDecimal getRefundamount() {
        return Refundamount;
    }

    public void setRefundamount(BigDecimal Refundamount) {
        this.Refundamount = Refundamount;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
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

    public String getStasiunIdrefund() {
        return StasiunIdrefund;
    }

    public void setStasiunIdrefund(String StasiunIdrefund) {
        this.StasiunIdrefund = StasiunIdrefund;
    }

    public String getShiftId() {
        return ShiftId;
    }

    public void setShiftId(String ShiftId) {
        this.ShiftId = ShiftId;
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
