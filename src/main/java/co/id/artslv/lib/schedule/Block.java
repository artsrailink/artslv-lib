package co.id.artslv.lib.schedule;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_block")
public class Block {

    @Column(name = "c_block_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wagondet_id")
    private String WagondetId;

    @Column(name = "c_block_status")
    private Character Status;

    @Column(name = "c_block_domain")
    private String Domain;

    @Column(name = "c_block_modifiedby")
    private String Modifiedby;

    @Column(name = "c_block_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_subclass_id")
    private String SubclassId;

    @Column(name = "c_stamformdet_id")
    private String StamformdetId;

    @Column(name = "c_trip_id")
    private String TripId;

    @Column(name = "c_stop_idorg")
    private String StopIdorg;

    @Column(name = "c_stop_iddest")
    private String StopIddest;

    @Column(name = "c_block_legval")
    private String Legval;

    @Column(name = "c_block_createdby")
    private String Createdby;

    @Column(name = "c_block_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWagondetId() {
        return WagondetId;
    }

    public void setWagondetId(String WagondetId) {
        this.WagondetId = WagondetId;
    }

    public Character getStatus() {
        return Status;
    }

    public void setStatus(Character Status) {
        this.Status = Status;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public String getModifiedby() {
        return Modifiedby;
    }

    public void setModifiedby(String Modifiedby) {
        this.Modifiedby = Modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime Modifiedon) {
        this.Modifiedon = Modifiedon;
    }

    public String getSubclassId() {
        return SubclassId;
    }

    public void setSubclassId(String SubclassId) {
        this.SubclassId = SubclassId;
    }

    public String getStamformdetId() {
        return StamformdetId;
    }

    public void setStamformdetId(String StamformdetId) {
        this.StamformdetId = StamformdetId;
    }

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String TripId) {
        this.TripId = TripId;
    }

    public String getStopIdorg() {
        return StopIdorg;
    }

    public void setStopIdorg(String StopIdorg) {
        this.StopIdorg = StopIdorg;
    }

    public String getStopIddest() {
        return StopIddest;
    }

    public void setStopIddest(String StopIddest) {
        this.StopIddest = StopIddest;
    }

    public String getLegval() {
        return Legval;
    }

    public void setLegval(String Legval) {
        this.Legval = Legval;
    }

    public String getCreatedby() {
        return Createdby;
    }

    public void setCreatedby(String Createdby) {
        this.Createdby = Createdby;
    }

    public LocalDateTime getCreatedon() {
        return Createdon;
    }

    public void setCreatedon(LocalDateTime Createdon) {
        this.Createdon = Createdon;
    }

        
}
