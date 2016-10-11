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
@Table(name = "arts_t_closingcallcenter")
public class Closingcallcenter {

    @Column(name = "c_closingcc_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_closingcc_docnum", table = "arts_t_closingcallcenter", nullable = false, length = 36)
    private String Docnum;

    @Column(name = "c_stasiun_idorg", table = "arts_t_closingcallcenter", nullable = false, length = 36)    
    private String StasiunIdorg;

    @Column(name = "c_closingcc_noka", table = "arts_t_closingcallcenter", nullable = false, length = 50)
    private String Noka;

    @Column(name = "c_wagonclass_id", table = "arts_t_closingcallcenter", nullable = false, length = 36)
    private String WagonclassId;

    @Column(name = "c_closingcc_date", table = "arts_t_closingcallcenter", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_trip_id", table = "arts_t_closingcallcenter", nullable = false, length = 36)
    private String TripId;

    @Column(name = "c_closingcc_psgnum", table = "arts_t_closingcallcenter", nullable = false)
    private BigInteger Psgnum;

    @Column(name = "c_closingcc_amount", table = "arts_t_closingcallcenter", nullable = false)
    private BigInteger Amount;

    @Column(name = "c_closingcc_modifiedon", table = "arts_t_closingcallcenter", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_closingcc_postingstat", table = "arts_t_closingcallcenter", nullable = false)
    private Character Postingstat;

    @Column(name = "c_closingcc_arrivedate", table = "arts_t_closingcallcenter")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Arrivedate;

    @Column(name = "c_closingcc_status", table = "arts_t_closingcallcenter", nullable = false)
    private Character Status;

    @Column(name = "c_closingcc_domain", table = "arts_t_closingcallcenter", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_closingcc_modifiedby", table = "arts_t_closingcallcenter", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_closingcallcenter_createdby", table = "arts_t_closingcallcenter", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_closingcallcenter_createdon", table = "arts_t_closingcallcenter", nullable = false)
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

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime Modifiedon) {
        this.Modifiedon = Modifiedon;
    }

    public Character getPostingstat() {
        return Postingstat;
    }

    public void setPostingstat(Character Postingstat) {
        this.Postingstat = Postingstat;
    }

    public LocalDate getArrivedate() {
        return Arrivedate;
    }

    public void setArrivedate(LocalDate Arrivedate) {
        this.Arrivedate = Arrivedate;
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
