package co.id.artslv.lib.transactions;

import co.id.artslv.lib.schedule.Stamformdet;
import co.id.artslv.lib.schedule.Trip;
import co.id.artslv.lib.trains.Wagondet;
import co.id.artslv.lib.schedule.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SEATBOOKTMP")
public class Seatbooktmp implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SEATBOOKTMP_ID")
    private String id;
//    @Column(name = "C_SEATBOOKTMP_STATUS")
//    private String status;
    @Column(name = "C_SEATBOOKTMP_DOMAIN")
    private String domain;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SEATBOOKTMP_TRIPDATE")
    private LocalDate tripdate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SEATBOOKTMP_EXPDATE")
    private LocalDate expdate;
    @Column(name = "C_TRIP_ID")
    private String tripid;
    @Column(name = "C_STAMFORMDET_ID")
    private String stamformdetid;
    @Column(name = "C_WAGONDET_ID")
    private String wagondetid;
    @Column(name = "C_SEATBOOKTMP_LEGVAL")
    private String legval;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_SEATBOOKTMP_NOKA")
    private String noka;
    @Column(name = "C_SEATBOOKTMP_SFDORDER")
    private int sfdorder;
    @Column(name = "C_SEATBOOKTMP_WGDROW")
    private int wgdrow;
    @Column(name = "C_SEATBOOKTMP_WGDCOL")
    private String wgdcol;
    @Column(name = "C_SEATBOOKTMP_SFDCODE")
    private String sfdcode;

    @Transient
    private Trip trip;
    @Transient
    private Stamformdet stamformdet;
    @Transient
    private Wagondet wagondet;
    @Transient
    private Schedule schedule;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public LocalDate getExpdate() {
        return expdate;
    }

    public void setExpdate(LocalDate expdate) {
        this.expdate = expdate;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public String getStamformdetid() {
        return stamformdetid;
    }

    public void setStamformdetid(String stamformdetid) {
        this.stamformdetid = stamformdetid;
    }

    public String getWagondetid() {
        return wagondetid;
    }

    public void setWagondetid(String wagondetid) {
        this.wagondetid = wagondetid;
    }
    public String getLegval() {
        return legval;
    }

    public void setLegval(String legval) {
        this.legval = legval;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public int getSfdorder() {
        return sfdorder;
    }

    public void setSfdorder(int sfdorder) {
        this.sfdorder = sfdorder;
    }

    public int getWgdrow() {
        return wgdrow;
    }

    public void setWgdrow(int wgdrow) {
        this.wgdrow = wgdrow;
    }

    public String getWgdcol() {
        return wgdcol;
    }

    public void setWgdcol(String wgdcol) {
        this.wgdcol = wgdcol;
    }

    public String getSfdcode() {
        return sfdcode;
    }

    public void setSfdcode(String sfdcode) {
        this.sfdcode = sfdcode;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Stamformdet getStamformdet() {
        return stamformdet;
    }

    public void setStamformdet(Stamformdet stamformdet) {
        this.stamformdet = stamformdet;
    }

    public Wagondet getWagondet() {
        return wagondet;
    }

    public void setWagondet(Wagondet wagondet) {
        this.wagondet = wagondet;
    }
    
    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

}
