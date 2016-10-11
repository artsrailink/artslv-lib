package co.id.artslv.lib.users;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
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
@Table(name = "arts_t_shift")
public class Shift {

    @Column(name = "c_shift_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_shift_name")
    private String Name;

    @Column(name = "c_shift_openon", table = "arts_t_shift", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Openon;

    @Column(name = "c_shift_closedon", table = "arts_t_shift")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Closedon;

    @Column(name = "c_shift_docnum", table = "arts_t_shift", length = 50)
    private String Docnum;

    @Column(name = "c_shift_status", table = "arts_t_shift", nullable = false)
    private Character Status;

    @Column(name = "c_shift_domain", table = "arts_t_shift", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_shift_modifiedby", table = "arts_t_shift", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_shift_modifiedon", table = "arts_t_shift", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_user_id", table = "arts_t_shift", nullable = false, length = 36)
    private String UserId;

    @Column(name = "c_unit_id", table = "arts_t_shift", nullable = false, length = 36)
    private String UnitId;

    @Column(name = "c_shift_createdby", table = "arts_t_shift", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_shift_createdon", table = "arts_t_shift", nullable = false)
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

    public LocalDate getOpenon() {
        return Openon;
    }

    public void setOpenon(LocalDate Openon) {
        this.Openon = Openon;
    }

    public LocalDate getClosedon() {
        return Closedon;
    }

    public void setClosedon(LocalDate Closedon) {
        this.Closedon = Closedon;
    }

    public String getDocnum() {
        return Docnum;
    }

    public void setDocnum(String Docnum) {
        this.Docnum = Docnum;
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

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
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
