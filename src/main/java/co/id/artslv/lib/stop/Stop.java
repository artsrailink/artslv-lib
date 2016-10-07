package co.id.artslv.lib.stop;

import com.fasterxml.jackson.annotation.JsonFormat;
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
@Entity
@Table(name = "arts_t_stop")
public class Stop {
    @Column(name="c_stop_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name="c_stop_order")
    private int stoporder;

    @Column(name="c_stop_arrival")
    private String stoparrival;

    @Column(name="c_stop_departure")
    private String stopdeparture;

    @Column(name="c_stasiun_id")
    private String stasiunid;

    @Column(name="c_stop_status")
    private String status;

    @Column(name="c_stop_domain")
    private String domain;

    @Column(name="c_stop_modifiedby")
    private String modifiedby;

    @Column(name="c_stop_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name="c_stop_arrivedateadd")
    private int arrivedateadd;

    @Column(name="c_stop_departdateadd")
    private int departdateadd;

    @Column(name="c_trip_id")
    private String tripid;

    @Column(name="c_stop_createdby")
    private String createdby;

    @Column(name="c_stop_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    @Column(name="c_schedule_id")
    private String scheduleid;

    @Column(name="c_schedule_noka")
    private String schedulenoka;

    @Column(name="c_trip_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name="c_stasiun_code")
    private String statsiuncode;

    public Stop() {
    }

    public Stop(int stoporder, String stoparrival, String stopdeparture, String stasiunid, String status, String domain, String modifiedby, LocalDateTime modifiedon, int arrivedateadd, int departdateadd, String tripid, String createdby, LocalDateTime createdon, String scheduleid, String schedulenoka, LocalDate tripdate, String statsiuncode) {
        this.stoporder = stoporder;
        this.stoparrival = stoparrival;
        this.stopdeparture = stopdeparture;
        this.stasiunid = stasiunid;
        this.status = status;
        this.domain = domain;
        this.modifiedby = modifiedby;
        this.modifiedon = modifiedon;
        this.arrivedateadd = arrivedateadd;
        this.departdateadd = departdateadd;
        this.tripid = tripid;
        this.createdby = createdby;
        this.createdon = createdon;
        this.scheduleid = scheduleid;
        this.schedulenoka = schedulenoka;
        this.tripdate = tripdate;
        this.statsiuncode = statsiuncode;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getStoporder() {
        return stoporder;
    }

    public void setStoporder(int stoporder) {
        this.stoporder = stoporder;
    }

    public String getStoparrival() {
        return stoparrival;
    }

    public void setStoparrival(String stoparrival) {
        this.stoparrival = stoparrival;
    }

    public String getStopdeparture() {
        return stopdeparture;
    }

    public void setStopdeparture(String stopdeparture) {
        this.stopdeparture = stopdeparture;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
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

    public int getArrivedateadd() {
        return arrivedateadd;
    }

    public void setArrivedateadd(int arrivedateadd) {
        this.arrivedateadd = arrivedateadd;
    }

    public int getDepartdateadd() {
        return departdateadd;
    }

    public void setDepartdateadd(int departdateadd) {
        this.departdateadd = departdateadd;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
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

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getStatsiuncode() {
        return statsiuncode;
    }

    public void setStatsiuncode(String statsiuncode) {
        this.statsiuncode = statsiuncode;
    }
}
