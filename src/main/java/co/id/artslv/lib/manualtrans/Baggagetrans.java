package co.id.artslv.lib.manualtrans;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigDecimal;
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
@Table(name = "arts_t_baggagetrans")
public class Baggagetrans {

    @Column(name = "c_baggagetrans_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_schedule_id", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String ScheduleId;

    @Column(name = "c_wagonclass_id", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String WagonclassId;

    @Column(name = "c_baggage_id", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String BaggageId;

    @Column(name = "c_baggagetrans_doctitle", table = "arts_t_baggagetrans", nullable = false, length = 20)
    private String Doctitle;

    @Column(name = "c_baggagetrans_docnum", table = "arts_t_baggagetrans", nullable = false)
    private BigInteger Docnum;

    @Column(name = "c_baggagetrans_weight", table = "arts_t_baggagetrans", nullable = false, scale = 2, precision = 5)
    private BigDecimal Weight;

    @Column(name = "c_baggagetrans_amount", table = "arts_t_baggagetrans", nullable = false, scale = 2, precision = 11)
    private BigDecimal Amount;

    @Column(name = "c_baggagetrans_totamount", table = "arts_t_baggagetrans", nullable = false, scale = 2, precision = 11)
    private BigDecimal Totamount;

    @Column(name = "c_baggagetrans_status", table = "arts_t_baggagetrans", nullable = false)
    private Character Status;

    @Column(name = "c_baggagetrans_domain", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_baggagetrans_modifiedby", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_baggagetrans_modifiedon", table = "arts_t_baggagetrans", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_unit_id", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String UnitId;

    @Column(name = "c_baggagetrans_date", table = "arts_t_baggagetrans", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_stasiun_idorg", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String StasiunIdorg;

    @Column(name = "c_baggagetrans_createdby", table = "arts_t_baggagetrans", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_baggagetrans_createdon", table = "arts_t_baggagetrans", nullable = false)
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

    public String getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getWagonclassId() {
        return WagonclassId;
    }

    public void setWagonclassId(String WagonclassId) {
        this.WagonclassId = WagonclassId;
    }

    public String getBaggageId() {
        return BaggageId;
    }

    public void setBaggageId(String BaggageId) {
        this.BaggageId = BaggageId;
    }

    public String getDoctitle() {
        return Doctitle;
    }

    public void setDoctitle(String Doctitle) {
        this.Doctitle = Doctitle;
    }

    public BigInteger getDocnum() {
        return Docnum;
    }

    public void setDocnum(BigInteger Docnum) {
        this.Docnum = Docnum;
    }

    public BigDecimal getWeight() {
        return Weight;
    }

    public void setWeight(BigDecimal Weight) {
        this.Weight = Weight;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
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

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getStasiunIdorg() {
        return StasiunIdorg;
    }

    public void setStasiunIdorg(String StasiunIdorg) {
        this.StasiunIdorg = StasiunIdorg;
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
