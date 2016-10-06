package co.id.artslv.lib.schedule;

import co.id.artslv.lib.trains.Subclass;
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
@Table(name = "KAIRTS_T_ALLOCDETSUBCL")
public class Allocdetsubcl implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_ADSC_ID")
    private String id;
    @Column(name = "C_ADSC_MAXSELL")
    private int maxsell;
    
    @Column(name = "C_ADSC_STATUS")
    private String status;
    @Column(name = "C_ADSC_DOMAIN")
    private String domain;
    @Column(name = "C_ADSC_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_ADSC_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_SUBCLASS_ID")
    private String subclassid;
    @Column(name = "C_ALLOCDET_ID")
    private String allocdetid;
    
    @Column(name = "C_STOP_ID")
    private String stopid;
    @Column(name = "C_ADSC_NOSEATABLE")
    private String noseatable;
    @Column(name = "C_ADSC_ORDER")
    private int order;
    @Transient
    private Stop stop;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    @Transient 
    private Subclass subclass;
    @Transient 
    private Allocdet allocdet;
    @Transient
    private int booked;
    @Transient
    private int availability;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getMaxsell() {
        return maxsell;
    }

    public void setMaxsell(int maxsell) {
        this.maxsell = maxsell;
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

    public String getAllocdetid() {
        return allocdetid;
    }

    public void setAllocdetid(String allocdetid) {
        this.allocdetid = allocdetid;
    }

    public String getStopid() {
        return stopid;
    }

    public void setStopid(String stopid) {
        this.stopid = stopid;
    }

    public String getNoseatable() {
        return noseatable;
    }

    public void setNoseatable(String noseatable) {
        this.noseatable = noseatable;
    }

    public Stop getStop() {
        return stop;
    }

    public void setStop(Stop stop) {
        this.stop = stop;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Subclass getSubclass() {
        return subclass;
    }

    public void setSubclass(Subclass subclass) {
        this.subclass = subclass;
    }

    public Allocdet getAllocdet() {
        return allocdet;
    }

    public void setAllocdet(Allocdet allocdet) {
        this.allocdet = allocdet;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getBooked() {
        return booked;
    }

    public void setBooked(int booked) {
        this.booked = booked;
    }

    public int getAvailability() {
        return availability;
    }

    public void setAvailability(int availability) {
        this.availability = availability;
    }
}