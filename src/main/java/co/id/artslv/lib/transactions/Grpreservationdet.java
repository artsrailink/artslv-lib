package co.id.artslv.lib.transactions;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.schedule.Trip;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "KAIRTS_T_GRPRESERVATIONDET")
public class Grpreservationdet implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_GRPRESERVATIONDET_ID")
    private String id;
    @Column(name = "C_GRPRESERVATIONDET_AMOUNT")
    private BigDecimal amount;
    @Column(name = "C_GRPRESERVATIONDET_UNITPRICE")
    private BigDecimal unitprice;
    @Column(name = "C_GRPRESERVATIONDET_PSGNUM")
    private int psgnum;
    @Column(name = "C_GRPRESERVATIONDET_STATUS")
    private String status;
    @Column(name = "C_GRPRESERVATIONDET_DOMAIN")
    private String domain;
    @Column(name = "C_GRPRESERVATIONDET_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_GRPRESERVATIONDET_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_GRPRESERVATION_ID")
    private String grpreservationid;
    @Column(name = "C_TRIP_ID")
    private String tripid;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;
    @Column(name = "C_STASIUN_IDDEST")
    private String stasiuniddest;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    
    @Transient 
    private Stasiun stasiunorg;
    @Transient 
    private Stasiun stasiundest;
    @Transient 
    private Trip trip;
    @Transient 
    private Grpreservation Grpreservation;
    @Transient 
    private List<Grpreservationpsg> listgrpreservationpsg;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getUnitprice() {
        return unitprice;
    }

    public void setUnitprice(BigDecimal unitprice) {
        this.unitprice = unitprice;
    }

    public int getPsgnum() {
        return psgnum;
    }

    public void setPsgnum(int psgnum) {
        this.psgnum = psgnum;
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

    public String getGrpreservationid() {
        return grpreservationid;
    }

    public void setGrpreservationid(String grpreservationid) {
        this.grpreservationid = grpreservationid;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
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

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public Stasiun getStasiunorg() {
        return stasiunorg;
    }

    public void setStasiunorg(Stasiun stasiunorg) {
        this.stasiunorg = stasiunorg;
    }

    public Stasiun getStasiundest() {
        return stasiundest;
    }

    public void setStasiundest(Stasiun stasiundest) {
        this.stasiundest = stasiundest;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Grpreservation getGrpreservation() {
        return Grpreservation;
    }

    public void setGrpreservation(Grpreservation Grpreservation) {
        this.Grpreservation = Grpreservation;
    }

    public List<Grpreservationpsg> getListgrpreservationpsg() {
        return listgrpreservationpsg;
    }

    public void setListgrpreservationpsg(List<Grpreservationpsg> listgrpreservationpsg) {
        this.listgrpreservationpsg = listgrpreservationpsg;
    }

}