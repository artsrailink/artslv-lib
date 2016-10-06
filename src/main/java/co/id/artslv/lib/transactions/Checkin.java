package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.hibernate.annotations.Type;

import java.time.LocalDate;

/**
 * Created by Irpan Budiana on 6/23/16.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Checkin {
    private String transactionid;
    private String transactiondetid;
    private String tripid;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate departdate;
    private String bookcode;
    private String numcode;
    private String psgname;
    private String titlecode;
    private String noka;
    private String trainname;
    private String wagonname;
    private Integer seatrow;
    private String seatcol;
    private String checkinnum;
    private String transdetstatus;
    private String passengerid;
    private String passengertype;
    private String staorgname;
    private String stadestname;
    private String departdatetimeorg;
    private String arrivedatetimedest;
    private String reductionid;
    private String reductionname;
    private String stamformdetid;
    private String stamformdetorder;
//
//    @Transient
//    private Reduction reduction;

    public Checkin() {
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactiondetid() {
        return transactiondetid;
    }

    public void setTransactiondetid(String transactiondetid) {
        this.transactiondetid = transactiondetid;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public LocalDate getDepartdate() {
        return departdate;
    }

    public void setDepartdate(LocalDate departdate) {
        this.departdate = departdate;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getNumcode() {
        return numcode;
    }

    public void setNumcode(String numcode) {
        this.numcode = numcode;
    }

    public String getPsgname() {
        return psgname;
    }

    public void setPsgname(String psgname) {
        this.psgname = psgname;
    }

    public String getTitlecode() {
        return titlecode;
    }

    public void setTitlecode(String titlecode) {
        this.titlecode = titlecode;
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

    public String getWagonname() {
        return wagonname;
    }

    public void setWagonname(String wagonname) {
        this.wagonname = wagonname;
    }

    public Integer getSeatrow() {
        return seatrow;
    }

    public void setSeatrow(Integer seatrow) {
        this.seatrow = seatrow;
    }

    public String getSeatcol() {
        return seatcol;
    }

    public void setSeatcol(String seatcol) {
        this.seatcol = seatcol;
    }

    public String getCheckinnum() {
        return checkinnum;
    }

    public void setCheckinnum(String checkinnum) {
        this.checkinnum = checkinnum;
    }

    public String getTransdetstatus() {
        return transdetstatus;
    }

    public void setTransdetstatus(String transdetstatus) {
        this.transdetstatus = transdetstatus;
    }

    public String getPassengerid() {
        return passengerid;
    }

    public void setPassengerid(String passengerid) {
        this.passengerid = passengerid;
    }

    public String getPassengertype() {
        return passengertype;
    }

    public void setPassengertype(String passengertype) {
        this.passengertype = passengertype;
    }

    public String getDepartdatetimeorg() {
        return departdatetimeorg;
    }

    public void setDepartdatetimeorg(String departdatetimeorg) {
        this.departdatetimeorg = departdatetimeorg;
    }

    public String getArrivedatetimedest() {
        return arrivedatetimedest;
    }

    public void setArrivedatetimedest(String arrivedatetimedest) {
        this.arrivedatetimedest = arrivedatetimedest;
    }

    public String getStaorgname() {
        return staorgname;
    }

    public void setStaorgname(String staorgname) {
        this.staorgname = staorgname;
    }

    public String getStadestname() {
        return stadestname;
    }

    public void setStadestname(String stadestname) {
        this.stadestname = stadestname;
    }

    public String getReductionid() {
        return reductionid;
    }

    public void setReductionid(String reductionid) {
        this.reductionid = reductionid;
    }

    public String getReductionname() {
        return reductionname;
    }

    public void setReductionname(String reductionname) {
        this.reductionname = reductionname;
    }

    public String getStamformdetid() {
        return stamformdetid;
    }

    public void setStamformdetid(String stamformdetid) {
        this.stamformdetid = stamformdetid;
    }

    public String getStamformdetorder() {
        return stamformdetorder;
    }

    public void setStamformdetorder(String stamformdetorder) {
        this.stamformdetorder = stamformdetorder;
    }
}
