/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.time.LocalDate;
import org.hibernate.annotations.Type;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Availability {
    private String noka;
    private String scheduleid;
    private String tripid;
    private String trainname;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;
    private String stasiunidorg;
    private String stasiunorg;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate departuredate;
    private String departuretime;
    private String stasiuniddest;
    private String stasiundest;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate arrivaldate;
    private String arrivaltime;
    private int transit;
    private String subclassid;
    private String subclass;
    private String avail;
    private String legval;
    private String wagonclassid;
    private String wagonclass;
    private long fareadult;
    private long fareinfant;
    private String rateidadult;
    private String rateidinfant;
    private String localstat;
    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiunorg() {
        return stasiunorg;
    }

    public void setStasiunorg(String stasiunorg) {
        this.stasiunorg = stasiunorg;
    }

    public LocalDate getDeparturedate() {
        return departuredate;
    }

    public void setDeparturedate(LocalDate departuredate) {
        this.departuredate = departuredate;
    }

    public String getDeparturetime() {
        return departuretime;
    }

    public void setDeparturetime(String departuretime) {
        this.departuretime = departuretime;
    }

    public String getStasiuniddest() {
        return stasiuniddest;
    }

    public void setStasiuniddest(String stasiuniddest) {
        this.stasiuniddest = stasiuniddest;
    }

    public String getStasiundest() {
        return stasiundest;
    }

    public void setStasiundest(String stasiundest) {
        this.stasiundest = stasiundest;
    }

    public LocalDate getArrivaldate() {
        return arrivaldate;
    }

    public void setArrivaldate(LocalDate arrivaldate) {
        this.arrivaldate = arrivaldate;
    }

    public String getArrivaltime() {
        return arrivaltime;
    }

    public void setArrivaltime(String arrivaltime) {
        this.arrivaltime = arrivaltime;
    }

    public int getTransit() {
        return transit;
    }

    public void setTransit(int transit) {
        this.transit = transit;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getAvail() {
        return avail;
    }

    public void setAvail(String avail) {
        this.avail = avail;
    }

    public String getLegval() {
        return legval;
    }

    public void setLegval(String legval) {
        this.legval = legval;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public String getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(String wagonclass) {
        this.wagonclass = wagonclass;
    }
    public long getFareadult() {
        return fareadult;
    }

    public void setFareadult(long fareadult) {
        this.fareadult = fareadult;
    }

    public long getFareinfant() {
        return fareinfant;
    }

    public void setFareinfant(long fareinfant) {
        this.fareinfant = fareinfant;
    }

    public String getRateidadult() {
        return rateidadult;
    }

    public void setRateidadult(String rateidadult) {
        this.rateidadult = rateidadult;
    }

    public String getRateidinfant() {
        return rateidinfant;
    }

    public void setRateidinfant(String rateidinfant) {
        this.rateidinfant = rateidinfant;
    }

    public String getLocalstat() {
        return localstat;
    }

    public void setLocalstat(String localstat) {
        this.localstat = localstat;
    }
}
