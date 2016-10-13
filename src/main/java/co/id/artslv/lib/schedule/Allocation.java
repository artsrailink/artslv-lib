package co.id.artslv.lib.schedule;

import co.id.artslv.lib.payments.Fare;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by root on 07/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "arts_t_allocation")
public class Allocation {
    @Column(name="c_allocation_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name="c_schedule_id")
    private String scheduleid;

    @Column(name="c_schedule_noka")
    private String schedulenoka;

    @Column(name="c_trip_id")
    private String tripid;

    @Column(name="c_trip_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name="c_stop_idorg")
    private String stopidorg;

    @Column(name="c_stasiun_idorg")
    private String stasiunidorg;

    @Column(name="c_stasiun_codeorg")
    private String stasiuncodeorg;

    @Column(name="c_stop_orderorg")
    private int stoporderorg;

    @Column(name="c_stop_iddes")
    private String stopiddes;

    @Column(name="c_stasiun_iddes")
    private String stasiuniddes;

    @Column(name="c_stasiun_codedes")
    private String stasiuncodedes;

    @Column(name="c_stop_orderdes")
    private int stoporderdes;

    @Column(name="c_subclass_id")
    private String subclassid;

    @Column(name="c_subclass_code")
    private String subclasscode;

    @Column(name="c_allocation_status")
    private String status;

    @Column(name="c_allocation_domain")
    private String domain;

    @Column(name="c_allocation_createdby")
    private String createdby;

    @Column(name="c_allocation_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    @Column(name="c_allocation_modifiedby")
    private String modifiedby;

    @Column(name="c_allocation_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name="c_allocation_maxsell")
    private int maxsells;

    @Column(name="c_allocation_noseatable")
    private String noseatable;

    @Transient
    private Fare fare;



    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getSchedulenoka() {
        return schedulenoka;
    }

    public void setSchedulenoka(String schedulenoka) {
        this.schedulenoka = schedulenoka;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getStopidorg() {
        return stopidorg;
    }

    public void setStopidorg(String stopidorg) {
        this.stopidorg = stopidorg;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuncodeorg() {
        return stasiuncodeorg;
    }

    public void setStasiuncodeorg(String stasiuncodeorg) {
        this.stasiuncodeorg = stasiuncodeorg;
    }

    public int getStoporderorg() {
        return stoporderorg;
    }

    public void setStoporderorg(int stoporderorg) {
        this.stoporderorg = stoporderorg;
    }

    public String getStopiddes() {
        return stopiddes;
    }

    public void setStopiddes(String stopiddes) {
        this.stopiddes = stopiddes;
    }

    public String getStasiuniddes() {
        return stasiuniddes;
    }

    public void setStasiuniddes(String stasiuniddes) {
        this.stasiuniddes = stasiuniddes;
    }

    public String getStasiuncodedes() {
        return stasiuncodedes;
    }

    public void setStasiuncodedes(String stasiuncodedes) {
        this.stasiuncodedes = stasiuncodedes;
    }

    public int getStoporderdes() {
        return stoporderdes;
    }

    public void setStoporderdes(int stoporderdes) {
        this.stoporderdes = stoporderdes;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public int getMaxsells() {
        return maxsells;
    }

    public void setMaxsells(int maxsells) {
        this.maxsells = maxsells;
    }

    public String getNoseatable() {
        return noseatable;
    }

    public void setNoseatable(String noseatable) {
        this.noseatable = noseatable;
    }

    public Fare getFare() {
        return fare;
    }

    public void setFare(Fare fare) {
        this.fare = fare;
    }

}
