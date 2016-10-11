package co.id.artslv.lib.responses;

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
@Table(name = "arts_t_paramrep")
public class Paramrep {

    @Column(name = "c_paramrep_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_paramrep_repcode", table = "arts_t_paramrep", nullable = false, length = 100)
    private String Repcode;

    @Column(name = "c_paramrep_repname", table = "arts_t_paramrep", nullable = false, length = 200)
    private String Repname;

    @Column(name = "c_paramrep_caption", table = "arts_t_paramrep", nullable = false, length = 200)
    private String Caption;

    @Column(name = "c_paramrep_paramcode", table = "arts_t_paramrep", nullable = false, length = 100)
    private String Paramcode;

    @Column(name = "c_paramrep_status", table = "arts_t_paramrep", nullable = false)
    private Character Status;

    @Column(name = "c_paramrep_domain", table = "arts_t_paramrep", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_paramrep_modifiedby", table = "arts_t_paramrep", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_paramrep_modifiedon", table = "arts_t_paramrep", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_paramrep_createdby", table = "arts_t_paramrep", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_paramrep_createdon", table = "arts_t_paramrep", nullable = false)
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

    public String getRepcode() {
        return Repcode;
    }

    public void setRepcode(String Repcode) {
        this.Repcode = Repcode;
    }

    public String getRepname() {
        return Repname;
    }

    public void setRepname(String Repname) {
        this.Repname = Repname;
    }

    public String getCaption() {
        return Caption;
    }

    public void setCaption(String Caption) {
        this.Caption = Caption;
    }

    public String getParamcode() {
        return Paramcode;
    }

    public void setParamcode(String Paramcode) {
        this.Paramcode = Paramcode;
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
