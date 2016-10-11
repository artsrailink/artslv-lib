package co.id.artslv.lib.members;

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
@Table(name = "arts_t_memmemtype")
public class Memmemtype {

    @Column(name = "c_memmemtype_id", table = "arts_t_memmemtype", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_membertype_id", table = "arts_t_memmemtype", nullable = false, length = 36)
    private String MembertypeId;

    @Column(name = "c_member_id", table = "arts_t_memmemtype", nullable = false, length = 36)
    private String MemberId;

    @Column(name = "c_memmemtype_idnum", table = "arts_t_memmemtype", nullable = false, length = 50)
    private String Idnum;

    @Column(name = "c_memmemtype_status", table = "arts_t_memmemtype", nullable = false)
    private Character Status;

    @Column(name = "c_memmemtype_domain", table = "arts_t_memmemtype", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_memmemtype_modifiedby", table = "arts_t_memmemtype", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_memmemtype_modifiedon", table = "arts_t_memmemtype", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_memmemtype_startdate", table = "arts_t_memmemtype", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Startdate;

    @Column(name = "c_memmemtype_enddate", table = "arts_t_memmemtype", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Enddate;

    @Column(name = "c_user_idapp1", table = "arts_t_memmemtype", length = 36)
    private String UserIdapp1;

    @Column(name = "c_memmemtype_appdate1", table = "arts_t_memmemtype")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Appdate1;

    @Column(name = "c_memmemtype_memcode", table = "arts_t_memmemtype", length = 50)
    private String Memcode;

    @Column(name = "c_memmemtype_createdby", table = "arts_t_memmemtype", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_memmemtype_createdon", table = "arts_t_memmemtype", nullable = false)
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

    public String getMembertypeId() {
        return MembertypeId;
    }

    public void setMembertypeId(String MembertypeId) {
        this.MembertypeId = MembertypeId;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public String getIdnum() {
        return Idnum;
    }

    public void setIdnum(String Idnum) {
        this.Idnum = Idnum;
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

    public LocalDate getStartdate() {
        return Startdate;
    }

    public void setStartdate(LocalDate Startdate) {
        this.Startdate = Startdate;
    }

    public LocalDate getEnddate() {
        return Enddate;
    }

    public void setEnddate(LocalDate Enddate) {
        this.Enddate = Enddate;
    }

    public String getUserIdapp1() {
        return UserIdapp1;
    }

    public void setUserIdapp1(String UserIdapp1) {
        this.UserIdapp1 = UserIdapp1;
    }

    public LocalDate getAppdate1() {
        return Appdate1;
    }

    public void setAppdate1(LocalDate Appdate1) {
        this.Appdate1 = Appdate1;
    }

    public String getMemcode() {
        return Memcode;
    }

    public void setMemcode(String Memcode) {
        this.Memcode = Memcode;
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
