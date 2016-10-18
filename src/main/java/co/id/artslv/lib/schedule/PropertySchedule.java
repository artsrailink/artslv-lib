package co.id.artslv.lib.schedule;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by root on 13/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Table(name = "arts_t_prop_schedule")
@Entity
public class PropertySchedule {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name="c_id")
    private String id;
    @Column(name="c_schedule_id")
    private String scheduleid;

    @Column(name="c_schedule_noka")
    private String noka;
    @Column(name="c_train_name")
    private String trainname;
    @Column(name="c_trip_id")
    private String tripid;

    @Column(name="c_trip_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name="c_stasiun_idorg")
    private String stasiunidorg;

    @Column(name="c_stasiun_codeorg")
    private String stasiuncodeorg;

    @Column(name="c_stasiun_nameorg")
    private String stasiunnameorg;

    @Column(name="c_stop_departure")
    private String stopdeparture;

    @Column(name="c_stasiun_iddes")
    private String stasiuniddes;

    @Column(name="c_stasiun_codedes")
    private String stasiuncodedes;

    @Column(name="c_stasiun_namedes")
    private String stasiunnamedes;

    @Column(name="c_stop_arrival")
    private String stoparrival;

    @Column(name="c_transit")
    private int transit;

    @Column(name="c_duration")
    private int duration;

    @Column(name="c_subclass_id")
    private String subclassid;

    @Column(name="c_subclass_code")
    private String subclasscode;

    @Column(name="c_fare_id")
    private String fareid;

    @Column(name="c_fare_totamount")
    private int faretotamount;

    @Column(name="c_seatavailable")
    private int seatavailable;

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

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
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

    public String getStasiuncodeorg() {
        return stasiuncodeorg;
    }

    public void setStasiuncodeorg(String stasiuncodeorg) {
        this.stasiuncodeorg = stasiuncodeorg;
    }

    public String getStasiunnameorg() {
        return stasiunnameorg;
    }

    public void setStasiunnameorg(String stasiunnameorg) {
        this.stasiunnameorg = stasiunnameorg;
    }

    public String getStopdeparture() {
        return stopdeparture;
    }

    public void setStopdeparture(String stopdeparture) {
        this.stopdeparture = stopdeparture;
    }

    public String getStasiuncodedes() {
        return stasiuncodedes;
    }

    public void setStasiuncodedes(String stasiuncodedes) {
        this.stasiuncodedes = stasiuncodedes;
    }

    public String getStasiunnamedes() {
        return stasiunnamedes;
    }

    public void setStasiunnamedes(String stasiunnamedes) {
        this.stasiunnamedes = stasiunnamedes;
    }

    public String getStoparrival() {
        return stoparrival;
    }

    public void setStoparrival(String stoparrival) {
        this.stoparrival = stoparrival;
    }

    public int getTransit() {
        return transit;
    }

    public void setTransit(int transit) {
        this.transit = transit;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
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

    public String getFareid() {
        return fareid;
    }

    public void setFareid(String fareid) {
        this.fareid = fareid;
    }

    public int getFaretotamount() {
        return faretotamount;
    }

    public void setFaretotamount(int faretotamount) {
        this.faretotamount = faretotamount;
    }

    public int getSeatavailable() {
        return seatavailable;
    }

    public void setSeatavailable(int seatavailable) {
        this.seatavailable = seatavailable;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuniddes() {
        return stasiuniddes;
    }

    public void setStasiuniddes(String stasiuniddes) {
        this.stasiuniddes = stasiuniddes;
    }
    
}
