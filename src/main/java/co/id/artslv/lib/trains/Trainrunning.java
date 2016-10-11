package co.id.artslv.lib.trains;

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
@Table(name = "arts_t_trainrunning")
public class Trainrunning {

    @Column(name = "c_trainrunning_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_trainrunning_name", table = "arts_t_trainrunning", nullable = false, length = 200)
    private String Name;

    @Column(name = "c_trainrunning_status", table = "arts_t_trainrunning", nullable = false)
    private Character Status;

    @Column(name = "c_trainrunning_domain", table = "arts_t_trainrunning", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_trainrunning_modifiedby", table = "arts_t_trainrunning", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_trainrunning_modifiedon", table = "arts_t_trainrunning", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_trainrunning_value", table = "arts_t_trainrunning", nullable = false)
    private short Value;

    @Column(name = "c_trainrunning_createdby", table = "arts_t_trainrunning", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_trainrunning_createdon", table = "arts_t_trainrunning", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    @Column(name = "c_trainrunning_code", table = "arts_t_trainrunning", nullable = false, length = 10)
    private String Code;

    @Column(name = "c_trainrunning_note", table = "arts_t_trainrunning", length = 100)
    private String Note;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public short getValue() {
        return Value;
    }

    public void setValue(short Value) {
        this.Value = Value;
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

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    
}
