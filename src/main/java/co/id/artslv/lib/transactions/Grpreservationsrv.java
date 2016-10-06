package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "KAIRTS_T_GRPRESERVATIONSRV")
public class Grpreservationsrv implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_GRPRESERVATIONSRV_ID")
    private String id;
    @Column(name = "C_GRPRESERVATIONSRV_AMOUNT")
    private BigDecimal amount;
    @Column(name = "C_GRPRESERVATIONSRV_STATUS")
    private String status;
    @Column(name = "C_GRPRESERVATIONSRV_DOMAIN")
    private String domain;
    @Column(name = "C_GRPRESERVATIONSRV_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_GRPRESERVATIONSRV_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_GRPRESERVATIONPSG_ID")
    private String grpreservationpsgid;
    @Column(name = "C_GRPRESERVATIONSRV_NOTE")
    private String note;
    @Column(name = "C_SERVICE_ID")
    private String serviceid;
    
    @Transient 
    private Grpreservationpsg grpreservationpsg;
    
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

    public String getGrpreservationpsgid() {
        return grpreservationpsgid;
    }

    public void setGrpreservationpsgid(String grpreservationpsgid) {
        this.grpreservationpsgid = grpreservationpsgid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public Grpreservationpsg getGrpreservationpsg() {
        return grpreservationpsg;
    }

    public void setGrpreservationpsg(Grpreservationpsg grpreservationpsg) {
        this.grpreservationpsg = grpreservationpsg;
    }

}