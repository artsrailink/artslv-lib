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
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_ticketsaleoffset")
public class Ticketsaleoffset {

    @Column(name = "c_ticketsaleoffset_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_ticketsaleoffset_value", table = "arts_t_ticketsaleoffset", nullable = false)
    private long Value;

    @Column(name = "c_ticketsaleoffset_reason", table = "arts_t_ticketsaleoffset", nullable = false, length = 100)
    private String Reason;

    @Column(name = "c_stasiun_id", table = "arts_t_ticketsaleoffset", nullable = false, length = 36)
    private String cStasiunId;

    @Column(name = "c_ticketsaleoffset_status", table = "arts_t_ticketsaleoffset", nullable = false)
    private Character Status;

    @Column(name = "c_ticketsaleoffset_domain", table = "arts_t_ticketsaleoffset", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_ticketsaleoffset_modifiedby", table = "arts_t_ticketsaleoffset", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_ticketsaleoffset_modifiedon", table = "arts_t_ticketsaleoffset", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_trip_id", table = "arts_t_ticketsaleoffset", nullable = false, length = 36)
    private String TripId;

    @Column(name = "c_ticketsaleoffset_tripdate", table = "arts_t_ticketsaleoffset", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Tripdate;

    @Column(name = "c_ticketsaleoffset_noka", table = "arts_t_ticketsaleoffset", nullable = false, length = 50)
    private String Noka;

    @Column(name = "c_ticketsaleoffset_createdby", table = "arts_t_ticketsaleoffset", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_ticketsaleoffset_createdon", table = "arts_t_ticketsaleoffset", nullable = false)
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

    public long getValue() {
        return Value;
    }

    public void setValue(long Value) {
        this.Value = Value;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String Reason) {
        this.Reason = Reason;
    }

    public String getcStasiunId() {
        return cStasiunId;
    }

    public void setcStasiunId(String cStasiunId) {
        this.cStasiunId = cStasiunId;
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

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String TripId) {
        this.TripId = TripId;
    }

    public LocalDate getTripdate() {
        return Tripdate;
    }

    public void setTripdate(LocalDate Tripdate) {
        this.Tripdate = Tripdate;
    }

    public String getNoka() {
        return Noka;
    }

    public void setNoka(String Noka) {
        this.Noka = Noka;
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
