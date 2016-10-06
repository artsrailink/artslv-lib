/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
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
public class Seatmap {
    private String noka;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;
    private String trainrelation;
    private String stamformcode;
    private String seatrow;
    private String seatcol;
    private int status;
    private String subclass;
    private String scheduleid;
    private String tripid;
    private String stamformdetid;
    private String wagonid;
    private String wagondetid;
    private String stasiunidorg;
    private String stasiuniddest;
    private String subclasscode;
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

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getTrainrelation() {
        return trainrelation;
    }

    public void setTrainrelation(String trainrelation) {
        this.trainrelation = trainrelation;
    }

    public String getStamformcode() {
        return stamformcode;
    }

    public void setStamformcode(String stamformcode) {
        this.stamformcode = stamformcode;
    }

    public String getSeatrow() {
        return seatrow;
    }

    public void setSeatrow(String seatrow) {
        this.seatrow = seatrow;
    }

    public String getSeatcol() {
        return seatcol;
    }

    public void setSeatcol(String seatcol) {
        this.seatcol = seatcol;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getStamformdetid() {
        return stamformdetid;
    }

    public void setStamformdetid(String stamformdetid) {
        this.stamformdetid = stamformdetid;
    }

    public String getWagonid() {
        return wagonid;
    }

    public void setWagonid(String wagonid) {
        this.wagonid = wagonid;
    }

    public String getWagondetid() {
        return wagondetid;
    }

    public void setWagondetid(String wagondetid) {
        this.wagondetid = wagondetid;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuniddest() {
        return stasiuniddest;
    }

    public void setStasiuniddest(String stasiuniddest) {
        this.stasiuniddest = stasiuniddest;
    }

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }
}
