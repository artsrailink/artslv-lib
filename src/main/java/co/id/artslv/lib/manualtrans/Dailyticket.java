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
@Table(name = "arts_t_dailyticket")
public class Dailyticket {

    @Column(name = "c_dailyticket_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_dailyticket_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_stasiun_iddest")
    private String StasiunIddest;

    @Column(name = "c_wagonclass_id")
    private String WagonclassId;

    @Column(name = "c_schedule_id")
    private String ScheduleId;

    @Column(name = "c_dailyticket_ticketidstart")
    private String Ticketidstart;

    @Column(name = "c_dailyticket_ticketidnext")
    private String Ticketidnext;

    @Column(name = "c_dailyticket_amount")
    private BigDecimal Amount;

    @Column(name = "c_dailyticket_ticketcancel")
    private int Ticketcancel;

    @Column(name = "c_dailyticket_status")
    private Character Status;

    @Column(name = "c_dailyticket_domain")
    private String Domain;

    @Column(name = "c_dailyticket_modifiedby")
    private String Modifiedby;

    @Column(name = "c_dailyticket_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_unit_id")
    private String UnitId;

    @Column(name = "c_stasiun_idorg")
    private String StasiunIdorg;

    @Column(name = "c_stasiun_idbook")
    private String StasiunIdbook;

    @Column(name = "c_dailyticket_psgnum")
    private int Psgnum;

    @Column(name = "c_dailyticket_createdby")
    private String Createdby;

    @Column(name = "c_dailyticket_createdon")
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

    public String getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getTicketidstart() {
        return Ticketidstart;
    }

    public void setTicketidstart(String Ticketidstart) {
        this.Ticketidstart = Ticketidstart;
    }

    public String getTicketidnext() {
        return Ticketidnext;
    }

    public void setTicketidnext(String Ticketidnext) {
        this.Ticketidnext = Ticketidnext;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public int getTicketcancel() {
        return Ticketcancel;
    }

    public void setTicketcancel(int Ticketcancel) {
        this.Ticketcancel = Ticketcancel;
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

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    public String getStasiunIdorg() {
        return StasiunIdorg;
    }

    public void setStasiunIdorg(String StasiunIdorg) {
        this.StasiunIdorg = StasiunIdorg;
    }

    public String getStasiunIdbook() {
        return StasiunIdbook;
    }

    public void setStasiunIdbook(String StasiunIdbook) {
        this.StasiunIdbook = StasiunIdbook;
    }

    public int getPsgnum() {
        return Psgnum;
    }

    public void setPsgnum(int Psgnum) {
        this.Psgnum = Psgnum;
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
