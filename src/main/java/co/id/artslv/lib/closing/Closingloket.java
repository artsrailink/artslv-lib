package co.id.artslv.lib.closing;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigInteger;
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
@Table(name = "arts_t_closingloket")
public class Closingloket {

    @Column(name = "c_closingloket_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_closingloket_docnum", table = "arts_t_closingloket", nullable = false, length = 36)
    private String Docnum;

    @Column(name = "c_stasiun_idsell", table = "arts_t_closingloket", nullable = false, length = 36)
    private String StasiunIdsell;

    @Column(name = "c_stasiun_idorg", table = "arts_t_closingloket", nullable = false, length = 36)
    private String StasiunIdorg;

    @Column(name = "c_closingloket_noka", table = "arts_t_closingloket", nullable = false, length = 50)
    private String Noka;

    @Column(name = "c_wagonclass_id", table = "arts_t_closingloket", nullable = false, length = 36)
    private String WagonclassId;

    @Column(name = "c_closingloket_date", table = "arts_t_closingloket", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_trip_id", table = "arts_t_closingloket", nullable = false, length = 36)
    private String TripId;

    @Column(name = "c_closingloket_psgnum", table = "arts_t_closingloket", nullable = false)
    private BigInteger Psgnum;

    @Column(name = "c_closingloket_amount", table = "arts_t_closingloket", nullable = false)
    private BigInteger Amount;

    @Column(name = "c_shift_id", table = "arts_t_closingloket", nullable = false, length = 36)
    private String ShiftId;

    @Column(name = "c_paytype_id", table = "arts_t_closingloket", nullable = false, length = 36)
    private String PaytypeId;

    @Column(name = "c_closingloket_type", table = "arts_t_closingloket", nullable = false)
    private Character Type;

    @Column(name = "c_closingloket_fee", table = "arts_t_closingloket", nullable = false)
    private BigInteger Fee;

    @Column(name = "c_closingloket_modifiedon", table = "arts_t_closingloket", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_closingloket_headerstat", table = "arts_t_closingloket", nullable = false)
    private Character Headerstat;

    @Column(name = "c_closingloket_postingstat", table = "arts_t_closingloket", nullable = false)
    private Character Postingstat;

    @Column(name = "c_sapcoa_id", table = "arts_t_closingloket", nullable = false, length = 36)
    private String SapcoaId;

    @Column(name = "c_closingloket_ba", table = "arts_t_closingloket", length = 36)
    private String Ba;

    @Column(name = "c_closingloket_cc", table = "arts_t_closingloket", length = 36)
    private String Cc;

    @Column(name = "c_closingloket_pc", table = "arts_t_closingloket", length = 36)
    private String Pc;

    @Column(name = "c_closingloket_arrivedate", table = "arts_t_closingloket")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Arrivedate;

    @Column(name = "c_closingloket_idccstasal", table = "arts_t_closingloket", length = 36)
    private String Idccstasal;

    @Column(name = "c_closingloket_idccsttrans", table = "arts_t_closingloket", length = 36)
    private String Idccsttrans;

    @Column(name = "c_schedule_id", table = "arts_t_closingloket", nullable = false, length = 36)
    private String ScheduleId;

    @Column(name = "c_closingloket_modifiedby", table = "arts_t_closingloket", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_closingloket_status", table = "arts_t_closingloket", nullable = false)
    private Character Status;

    @Column(name = "c_closingloket_domain", table = "arts_t_closingloket", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_closingloket_createdby", table = "arts_t_closingloket", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_closingloket_createdon", table = "arts_t_closingloket", nullable = false)
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

    public String getDocnum() {
        return Docnum;
    }

    public void setDocnum(String Docnum) {
        this.Docnum = Docnum;
    }

    public String getStasiunIdsell() {
        return StasiunIdsell;
    }

    public void setStasiunIdsell(String StasiunIdsell) {
        this.StasiunIdsell = StasiunIdsell;
    }

    public String getStasiunIdorg() {
        return StasiunIdorg;
    }

    public void setStasiunIdorg(String StasiunIdorg) {
        this.StasiunIdorg = StasiunIdorg;
    }

    public String getNoka() {
        return Noka;
    }

    public void setNoka(String Noka) {
        this.Noka = Noka;
    }

    public String getWagonclassId() {
        return WagonclassId;
    }

    public void setWagonclassId(String WagonclassId) {
        this.WagonclassId = WagonclassId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String TripId) {
        this.TripId = TripId;
    }

    public BigInteger getPsgnum() {
        return Psgnum;
    }

    public void setPsgnum(BigInteger Psgnum) {
        this.Psgnum = Psgnum;
    }

    public BigInteger getAmount() {
        return Amount;
    }

    public void setAmount(BigInteger Amount) {
        this.Amount = Amount;
    }

    public String getShiftId() {
        return ShiftId;
    }

    public void setShiftId(String ShiftId) {
        this.ShiftId = ShiftId;
    }

    public String getPaytypeId() {
        return PaytypeId;
    }

    public void setPaytypeId(String PaytypeId) {
        this.PaytypeId = PaytypeId;
    }

    public Character getType() {
        return Type;
    }

    public void setType(Character Type) {
        this.Type = Type;
    }

    public BigInteger getFee() {
        return Fee;
    }

    public void setFee(BigInteger Fee) {
        this.Fee = Fee;
    }

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime Modifiedon) {
        this.Modifiedon = Modifiedon;
    }

    public Character getHeaderstat() {
        return Headerstat;
    }

    public void setHeaderstat(Character Headerstat) {
        this.Headerstat = Headerstat;
    }

    public Character getPostingstat() {
        return Postingstat;
    }

    public void setPostingstat(Character Postingstat) {
        this.Postingstat = Postingstat;
    }

    public String getSapcoaId() {
        return SapcoaId;
    }

    public void setSapcoaId(String SapcoaId) {
        this.SapcoaId = SapcoaId;
    }

    public String getBa() {
        return Ba;
    }

    public void setBa(String Ba) {
        this.Ba = Ba;
    }

    public String getCc() {
        return Cc;
    }

    public void setCc(String Cc) {
        this.Cc = Cc;
    }

    public String getPc() {
        return Pc;
    }

    public void setPc(String Pc) {
        this.Pc = Pc;
    }

    public LocalDate getArrivedate() {
        return Arrivedate;
    }

    public void setArrivedate(LocalDate Arrivedate) {
        this.Arrivedate = Arrivedate;
    }

    public String getIdccstasal() {
        return Idccstasal;
    }

    public void setIdccstasal(String Idccstasal) {
        this.Idccstasal = Idccstasal;
    }

    public String getIdccsttrans() {
        return Idccsttrans;
    }

    public void setIdccsttrans(String Idccsttrans) {
        this.Idccsttrans = Idccsttrans;
    }

    public String getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getModifiedby() {
        return Modifiedby;
    }

    public void setModifiedby(String Modifiedby) {
        this.Modifiedby = Modifiedby;
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
