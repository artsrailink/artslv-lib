package co.id.artslv.lib.transactions;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.schedule.Trip;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Yoga Sefianto
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_TICKETSALEOFFSET")
public class Ticketsaleoffset implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TICKETSALEOFFSET_ID")
    private String id;
    
    @Column(name = "C_TICKETSALEOFFSET_VALUE")
    private int value;
    @Column(name = "C_TICKETSALEOFFSET_STATUS")
    private String status;
    @Column(name = "C_TICKETSALEOFFSET_DOMAIN")
    private String domain;
    @Column(name = "C_TICKETSALEOFFSET_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TICKETSALEOFFSET_MODIFIEDON")
    private LocalDateTime modifiedon;

    @Column(name = "C_TICKETSALEOFFSET_REASON")
    private String reason;
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;

    @Column(name = "C_TRIP_ID")
    private String tripid;

    @JsonSerialize(
            using = LocalDateSerializer.class
    )
    @JsonDeserialize(
            using = LocalDateDeserializer.class
    )
    @JsonFormat(
            pattern = "yyyy-MM-dd"
    )
    @Type(
            type = "org.hibernate.type.LocalDateType"
    )
    @Column(name = "C_TICKETSALEOFFSET_TRIPDATE")
    private LocalDate tripdate;

    @Column(name = "C_TICKETSALEOFFSET_NOKA")
    private String noka;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    @Transient 
    private Trip trip;
    @Transient
    private Stasiun stasiun;
    @Transient
    private int no_urut;

    @Transient
    private String stopDepartDateTime;
    
    public int getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(int no_urut) {
        this.no_urut = no_urut;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
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

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getStopDepartDateTime() {
        return stopDepartDateTime;
    }

    public void setStopDepartDateTime(String stopDepartDateTime) {
        this.stopDepartDateTime = stopDepartDateTime;
    }
}