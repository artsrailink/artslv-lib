package co.id.artslv.lib.modules;

import com.fasterxml.jackson.annotation.JsonFormat;
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
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_module")
public class Module implements Serializable {

    @Column(name = "c_module_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_module_name", table = "arts_t_module", nullable = false, length = 100)
    private String Name;

    @Column(name = "c_module_parent", table = "arts_t_module", length = 36)
    private String Parent;

    @Column(name = "c_module_link", table = "arts_t_module")
    private String Link;

    @Column(name = "c_module_seq", table = "arts_t_module", nullable = false, length = 10)
    private String Seq;

    @Column(name = "c_module_status", table = "arts_t_module", nullable = false)
    private Character Status;

    @Column(name = "c_module_domain", table = "arts_t_module", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_module_modifiedby", table = "arts_t_module", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_module_modifiedon", table = "arts_t_module", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_moduletype_id", table = "arts_t_module", nullable = false, length = 36)
    private String ModuletypeId;

    @Column(name = "c_module_apptype", table = "arts_t_module", nullable = false)
    private Character Apptype;

    @Column(name = "c_module_createdby", table = "arts_t_module", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_module_createdon", table = "arts_t_module", nullable = false)
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getParent() {
        return Parent;
    }

    public void setParent(String Parent) {
        this.Parent = Parent;
    }

    public String getLink() {
        return Link;
    }

    public void setLink(String Link) {
        this.Link = Link;
    }

    public String getSeq() {
        return Seq;
    }

    public void setSeq(String Seq) {
        this.Seq = Seq;
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

    public String getModuletypeId() {
        return ModuletypeId;
    }

    public void setModuletypeId(String ModuletypeId) {
        this.ModuletypeId = ModuletypeId;
    }

    public Character getApptype() {
        return Apptype;
    }

    public void setApptype(Character Apptype) {
        this.Apptype = Apptype;
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
