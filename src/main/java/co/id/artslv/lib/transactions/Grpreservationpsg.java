package co.id.artslv.lib.transactions;

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
@Table(name = "arts_t_grpreservationpsg")
public class Grpreservationpsg {

    @Column(name = "c_grpreservationpsg_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_grpreservationpsg_psgname", table = "arts_t_grpreservationpsg", nullable = false, length = 100)
    private String Psgname;

    @Column(name = "c_grpreservationpsg_infantname", table = "arts_t_grpreservationpsg", length = 100)
    private String Infantname;

    @Column(name = "c_grpreservationpsg_psgid", table = "arts_t_grpreservationpsg", nullable = false, length = 50)
    private String Psgid;

    @Column(name = "c_grpreservationdet_id", table = "arts_t_grpreservationpsg", nullable = false, length = 36)
    private String GrpreservationdetId;

    @Column(name = "c_grpreservationpsg_status", table = "arts_t_grpreservationpsg", nullable = false)
    private Character Status;

    @Column(name = "c_grpreservationpsg_domain", table = "arts_t_grpreservationpsg", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_grpreservationpsg_modifiedby", table = "arts_t_grpreservationpsg", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_grpreservationpsg_modifiedon", table = "arts_t_grpreservationpsg", nullable = false, length = 36)
    private String Modifiedon;

    @Column(name = "c_grpreservationpsg_createdby", table = "arts_t_grpreservationpsg", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_grpreservationpsg_createdon", table = "arts_t_grpreservationpsg", nullable = false)
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

    public String getPsgname() {
        return Psgname;
    }

    public void setPsgname(String Psgname) {
        this.Psgname = Psgname;
    }

    public String getInfantname() {
        return Infantname;
    }

    public void setInfantname(String Infantname) {
        this.Infantname = Infantname;
    }

    public String getPsgid() {
        return Psgid;
    }

    public void setPsgid(String Psgid) {
        this.Psgid = Psgid;
    }

    public String getGrpreservationdetId() {
        return GrpreservationdetId;
    }

    public void setGrpreservationdetId(String GrpreservationdetId) {
        this.GrpreservationdetId = GrpreservationdetId;
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

    public String getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(String Modifiedon) {
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
