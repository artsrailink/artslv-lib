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
@Table(name = "arts_t_pasepartu")
public class Pasepartu  {

    @Column(name = "c_pasepartu_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_pasepartu_date", table = "arts_t_pasepartu", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_schedule_id", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String ScheduleId;

    @Column(name = "c_stasiun_idorg", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String StasiunIdorg;

    @Column(name = "c_stasiun_iddest", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String StasiunIddest;

    @Column(name = "c_wagonclass_id", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String WagonclassId;

    @Column(name = "c_pasepartu_ticketidstart", table = "arts_t_pasepartu", nullable = false, length = 20)
    private String Ticketidstart;

    @Column(name = "c_pasepartu_ticketidend", table = "arts_t_pasepartu", nullable = false, length = 20)
    private String Ticketidend;

    @Column(name = "c_pasepartu_ticketcancel", table = "arts_t_pasepartu", nullable = false)
    private int Ticketcancel;

    @Column(name = "c_pasepartu_ticketreduction", table = "arts_t_pasepartu", nullable = false)
    private int Ticketreduction;

    @Column(name = "c_pasepartu_totamount", table = "arts_t_pasepartu", nullable = false, scale = 2, precision = 11)
    private BigDecimal Totamount;

    @Column(name = "c_pasepartu_status", table = "arts_t_pasepartu", nullable = false)
    private Character Status;

    @Column(name = "c_pasepartu_domain", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_pasepartu_modifiedby", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_pasepartu_modifiedon", table = "arts_t_pasepartu", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_unit_id", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String UnitId;

    @Column(name = "c_stasiun_idbook", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String StasiunIdbook;

    @Column(name = "c_pasepartu_psgnum", table = "arts_t_pasepartu", nullable = false)
    private int Psgnum;

    @Column(name = "c_pasepartu_createdby", table = "arts_t_pasepartu", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_pasepartu_createdon", table = "arts_t_pasepartu", nullable = false)
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

    public String getTicketidstart() {
        return Ticketidstart;
    }

    public void setTicketidstart(String Ticketidstart) {
        this.Ticketidstart = Ticketidstart;
    }

    public String getTicketidend() {
        return Ticketidend;
    }

    public void setTicketidend(String Ticketidend) {
        this.Ticketidend = Ticketidend;
    }

    public int getTicketcancel() {
        return Ticketcancel;
    }

    public void setTicketcancel(int Ticketcancel) {
        this.Ticketcancel = Ticketcancel;
    }

    public int getTicketreduction() {
        return Ticketreduction;
    }

    public void setTicketreduction(int Ticketreduction) {
        this.Ticketreduction = Ticketreduction;
    }

    public BigDecimal getTotamount() {
        return Totamount;
    }

    public void setTotamount(BigDecimal Totamount) {
        this.Totamount = Totamount;
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
