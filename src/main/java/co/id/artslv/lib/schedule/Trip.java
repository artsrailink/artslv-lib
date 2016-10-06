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
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
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
@Table(name = "KAIRTS_T_TRIP")
public class Trip implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRIP_ID")
    private String id;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_TRIP_DATE")
    private LocalDate date;
    
//    @Column(name = "C_SCHEDULE_ID")
//    private String scheduleid;
    @Column(name = "C_TRIP_STATUS")
    private String status;
    @Column(name = "C_TRIP_DOMAIN")
    private String domain;
    @Column(name = "C_TRIP_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRIP_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_TRIP_MAXCAPACITY")
    private int maxcapacity;
//    @Column(name = "C_TRIP_ROUTEDESC")
//    private String routedesc;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Transient 
    private Schedule schedule;
    @Transient
    private List<Stamformdet> liststamformdet;
    @Transient
    private List<Stop> liststop;
    @Transient
    private List<Allocdet> listallocdet;
    @Transient
    private boolean getallocdet;
    @Transient
    private boolean getstop;
    @Transient
    private boolean getstamformdet;
    @Transient
    private boolean getbooked;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
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

    public int getMaxcapacity() {
        return maxcapacity;
    }

    public void setMaxcapacity(int maxcapacity) {
        this.maxcapacity = maxcapacity;
    }

//    public String getRoutedesc() {
//        return routedesc;
//    }
//
//    public void setRoutedesc(String routedesc) {
//        this.routedesc = routedesc;
//    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public List<Stamformdet> getListstamformdet() {
        return liststamformdet;
    }

    public void setListstamformdet(List<Stamformdet> liststamformdet) {
        this.liststamformdet = liststamformdet;
    }

    public List<Stop> getListstop() {
        return liststop;
    }

    public void setListstop(List<Stop> liststop) {
        this.liststop = liststop;
    }

    public List<Allocdet> getListallocdet() {
        return listallocdet;
    }

    public void setListallocdet(List<Allocdet> listallocdet) {
        this.listallocdet = listallocdet;
    }


    public boolean isGetallocdet() {
        return getallocdet;
    }

    public void setGetallocdet(boolean getallocdet) {
        this.getallocdet = getallocdet;
    }

    public boolean isGetstop() {
        return getstop;
    }

    public void setGetstop(boolean getstop) {
        this.getstop = getstop;
    }

    public boolean isGetstamformdet() {
        return getstamformdet;
    }

    public void setGetstamformdet(boolean getstamformdet) {
        this.getstamformdet = getstamformdet;
    }

    public boolean isGetbooked() {
        return getbooked;
    }

    public void setGetbooked(boolean getbooked) {
        this.getbooked = getbooked;
    }
}