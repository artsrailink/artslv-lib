package co.id.artslv.lib.schedule;

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
import java.util.List;

/**
 *
 * @author Yoga Sefianto
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_V_TRIPSCHEDULE")
public class Tripschedule implements Serializable {
    @Id
    @Column(name = "TRIP_ID")
    private String tripid;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "TRIP_DATE")
    private LocalDate tripdate;
    @Column(name = "TRIP_MAXCAPACITY")
    private int maxcapacity;
    @Column(name = "TRIP_STATUS")
    private String tripstatus;
    @Column(name = "TRIP_DOMAIN")
    private String tripdomain;
    @Column(name = "TRIP_MODIFIEDBY")
    private String tripmodifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "TRIP_MODIFIEDON")
    private LocalDateTime tripmodifiedon;

    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "SCHEDULE_STATUS")
    private String schedulestatus;
    @Column(name = "NOKA")
    private String noka;
    @Column(name = "SCHEDULE_ROUTEDESC")
    private String routedesc;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "SCHEDULE_STARTDATE")
    private LocalDate startdate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "SCHEDULE_ENDDATE")
    private LocalDate enddate;
    @Column(name = "SCHEDULE_LOCALSTAT")
    private String localstat;
    @Column(name = "SCHEDULE_NOSEATALLOC")
    private String noseatalloc;
    @Column(name = "SCHEDULE_NOSEATTYPE")
    private String noseattype;
    @Column(name = "SCHEDULE_VALIDDAYS")
    private String validdays;

    @Column(name = "TRAIN_ID")
    private String trainid;
    @Column(name = "TRAINMILES_ID")
    private String trainmilesid;
    @Column(name = "TRAINTYPE_ID")
    private String traintypeid;

    @Column(name = "TRAINRUNNING_ID")
    private String trainrunningid;
    @Column(name = "TRAINRUNNING_NAME")
    private String trainrunningname;
    @Column(name = "TRAINRUNNING_STATUS")
    private String trainrunningstatus;
    @Column(name = "TRAINRUNNING_VALUE")
    private int value;


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

    public int getMaxcapacity() {
        return maxcapacity;
    }

    public void setMaxcapacity(int maxcapacity) {
        this.maxcapacity = maxcapacity;
    }

    public String getTripstatus() {
        return tripstatus;
    }

    public void setTripstatus(String tripstatus) {
        this.tripstatus = tripstatus;
    }

    public String getTripdomain() {
        return tripdomain;
    }

    public void setTripdomain(String tripdomain) {
        this.tripdomain = tripdomain;
    }

    public String getTripmodifiedby() {
        return tripmodifiedby;
    }

    public void setTripmodifiedby(String tripmodifiedby) {
        this.tripmodifiedby = tripmodifiedby;
    }

    public LocalDateTime getTripmodifiedon() {
        return tripmodifiedon;
    }

    public void setTripmodifiedon(LocalDateTime tripmodifiedon) {
        this.tripmodifiedon = tripmodifiedon;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getSchedulestatus() {
        return schedulestatus;
    }

    public void setSchedulestatus(String schedulestatus) {
        this.schedulestatus = schedulestatus;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getRoutedesc() {
        return routedesc;
    }

    public void setRoutedesc(String routedesc) {
        this.routedesc = routedesc;
    }

    public String getLocalstat() {
        return localstat;
    }

    public void setLocalstat(String localstat) {
        this.localstat = localstat;
    }

    public String getNoseatalloc() {
        return noseatalloc;
    }

    public void setNoseatalloc(String noseatalloc) {
        this.noseatalloc = noseatalloc;
    }

    public String getNoseattype() {
        return noseattype;
    }

    public void setNoseattype(String noseattype) {
        this.noseattype = noseattype;
    }

    public String getValiddays() {
        return validdays;
    }

    public void setValiddays(String validdays) {
        this.validdays = validdays;
    }

    public String getTrainid() {
        return trainid;
    }

    public void setTrainid(String trainid) {
        this.trainid = trainid;
    }

    public String getTrainmilesid() {
        return trainmilesid;
    }

    public void setTrainmilesid(String trainmilesid) {
        this.trainmilesid = trainmilesid;
    }

    public String getTraintypeid() {
        return traintypeid;
    }

    public void setTraintypeid(String traintypeid) {
        this.traintypeid = traintypeid;
    }

    public String getTrainrunningid() {
        return trainrunningid;
    }

    public void setTrainrunningid(String trainrunningid) {
        this.trainrunningid = trainrunningid;
    }

    public String getTrainrunningname() {
        return trainrunningname;
    }

    public void setTrainrunningname(String trainrunningname) {
        this.trainrunningname = trainrunningname;
    }

    public String getTrainrunningstatus() {
        return trainrunningstatus;
    }

    public void setTrainrunningstatus(String trainrunningstatus) {
        this.trainrunningstatus = trainrunningstatus;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }
}