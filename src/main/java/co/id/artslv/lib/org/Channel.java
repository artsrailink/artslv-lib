package co.id.artslv.lib.org;

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
@Table(name = "arts_t_channel")
public class Channel {

    @Column(name = "c_channel_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_channel_code", table = "arts_t_channel", nullable = false, length = 50)
    private String Code;

    @Column(name = "c_channel_name", table = "arts_t_channel", nullable = false, length = 100)
    private String Name;

    @Column(name = "c_channel_status", table = "arts_t_channel", nullable = false)
    private Character Status;

    @Column(name = "c_channel_domain", table = "arts_t_channel", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_channel_modifiedby", table = "arts_t_channel", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_channel_modifiedon", table = "arts_t_channel", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_channel_extrafee", table = "arts_t_channel", nullable = false)
    private Character Extrafee;

    @Column(name = "c_channel_paymethod", table = "arts_t_channel", nullable = false)
    private Character Paymethod;

    @Column(name = "c_channel_type", table = "arts_t_channel", nullable = false)
    private Character Type;

    @Column(name = "c_channel_createdby", table = "arts_t_channel", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_channel_createdon", table = "arts_t_channel", nullable = false)
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

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
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

    public Character getExtrafee() {
        return Extrafee;
    }

    public void setExtrafee(Character Extrafee) {
        this.Extrafee = Extrafee;
    }

    public Character getPaymethod() {
        return Paymethod;
    }

    public void setPaymethod(Character Paymethod) {
        this.Paymethod = Paymethod;
    }

    public Character getType() {
        return Type;
    }

    public void setType(Character Type) {
        this.Type = Type;
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
