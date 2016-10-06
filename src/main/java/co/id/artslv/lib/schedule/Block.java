package co.id.artslv.lib.schedule;

import co.id.artslv.lib.trains.Subclass;
import co.id.artslv.lib.trains.Wagondet;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
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
@Table(name = "KAIRTS_T_BLOCK")
public class Block implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_BLOCK_ID")
    private String id;
    
    @Column(name = "C_WAGONDET_ID")
    private String wagondetid;
    
    @Column(name = "C_BLOCK_STATUS")
    private String status;
    
    @Column(name = "C_BLOCK_DOMAIN")
    private String domain;
    
    @Column(name = "C_BLOCK_MODIFIEDBY")
    private String modifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_BLOCK_MODIFIEDON")
    private LocalDateTime modifiedon;

    @Column(name = "C_SUBCLASS_ID")
    private String subclassid;
    
    @Column(name = "C_STAMFORMDET_ID")
    private String stamformdetid;
    
    @Column(name = "C_TRIP_ID")
    private String tripid;
    
    @Column(name = "C_STOP_IDORG")
    private String stopidorg;
    
    @Column(name = "C_STOP_IDDEST")
    private String stopiddest;
    
    @Column(name = "C_BLOCK_LEGVAL")
    private String legval;
    
    
    @Transient
    Wagondet wagondet;
    @Transient
    Subclass subclass;
    @Transient
    Stamformdet stamformdet;
    @Transient
    Trip trip;
    
    @Transient
    Stop stoporg;
    
    @Transient
    Stop stopdest;
            
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWagondetid() {
        return wagondetid;
    }

    public void setWagondetid(String wagondetid) {
        this.wagondetid = wagondetid;
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

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getStamformdetid() {
        return stamformdetid;
    }

    public void setStamformdetid(String stamformdetid) {
        this.stamformdetid = stamformdetid;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public String getStopidorg() {
        return stopidorg;
    }

    public void setStopidorg(String stopidorg) {
        this.stopidorg = stopidorg;
    }

    public String getStopiddest() {
        return stopiddest;
    }

    public void setStopiddest(String stopiddest) {
        this.stopiddest = stopiddest;
    }

    public String getLegval() {
        return legval;
    }

    public void setLegval(String legval) {
        this.legval = legval;
    }

    public Wagondet getWagondet() {
        return wagondet;
    }

    public void setWagondet(Wagondet wagondet) {
        this.wagondet = wagondet;
    }

    public Subclass getSubclass() {
        return subclass;
    }

    public void setSubclass(Subclass subclass) {
        this.subclass = subclass;
    }

    public Stamformdet getStamformdet() {
        return stamformdet;
    }

    public void setStamformdet(Stamformdet stamformdet) {
        this.stamformdet = stamformdet;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Stop getStoporg() {
        return stoporg;
    }

    public void setStoporg(Stop stoporg) {
        this.stoporg = stoporg;
    }

    public Stop getStopdest() {
        return stopdest;
    }

    public void setStopdest(Stop stopdest) {
        this.stopdest = stopdest;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
}
