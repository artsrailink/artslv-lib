package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigDecimal;
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
@Table(name = "arts_t_grpreservationsrv")
public class Grpreservationsrv {

    @Column(name = "c_grpreservationsrv_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_grpreservationpsg_id", table = "arts_t_grpreservationsrv", nullable = false, length = 36)
    private String GrpreservationpsgId;

    @Column(name = "c_service_id", table = "arts_t_grpreservationsrv", nullable = false, length = 36)
    private String ServiceId;

    @Column(name = "c_grpreservationsrv_amount", table = "arts_t_grpreservationsrv", nullable = false, scale = 2, precision = 11)
    private BigDecimal Amount;

    @Column(name = "c_grpreservationsrv_note", table = "arts_t_grpreservationsrv", length = 500)
    private String Note;

    @Column(name = "c_grpreservationsrv_status", table = "arts_t_grpreservationsrv", nullable = false)
    private Character Status;

    @Column(name = "c_grpreservationsrv_domain", table = "arts_t_grpreservationsrv", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_grpreservationsrv_modifiedby", table = "arts_t_grpreservationsrv", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_grpreservationsrv_modifiedon", table = "arts_t_grpreservationsrv", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_grpreservationsrv_createdby", table = "arts_t_grpreservationsrv", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_grpreservationsrv_createdon", table = "arts_t_grpreservationsrv", nullable = false)
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

    public String getGrpreservationpsgId() {
        return GrpreservationpsgId;
    }

    public void setGrpreservationpsgId(String GrpreservationpsgId) {
        this.GrpreservationpsgId = GrpreservationpsgId;
    }

    public String getServiceId() {
        return ServiceId;
    }

    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
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
