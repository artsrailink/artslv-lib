package co.id.artslv.lib.sap;

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
@Table(name = "arts_t_sapwagonclass")
public class Sapwagonclass {

    @Column(name = "c_sapwagonclass_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wagonclass_id", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    private String WagonclassId;

    @Column(name = "c_trainmiles_id", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    private String TrainmilesId;

    @Column(name = "c_sapcoa_id", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    private String SapcoaId;

    @Column(name = "c_sapwagonclass_status", table = "arts_t_sapwagonclass", nullable = false)
    private Character Status;

    @Column(name = "c_sapwagonclass_domain", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_sapwagonclass_modifiedby", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_sapwagonclass_modifiedon", table = "arts_t_sapwagonclass", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_sapwagonclass_createdby", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_sapwagonclass_createdon", table = "arts_t_sapwagonclass", nullable = false)
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

    public String getWagonclassId() {
        return WagonclassId;
    }

    public void setWagonclassId(String WagonclassId) {
        this.WagonclassId = WagonclassId;
    }

    public String getTrainmilesId() {
        return TrainmilesId;
    }

    public void setTrainmilesId(String TrainmilesId) {
        this.TrainmilesId = TrainmilesId;
    }

    public String getSapcoaId() {
        return SapcoaId;
    }

    public void setSapcoaId(String SapcoaId) {
        this.SapcoaId = SapcoaId;
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
