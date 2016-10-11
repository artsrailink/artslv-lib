package co.id.artslv.lib.log;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_seatlog")
public class Seatlog {

    @Column(name = "c_seatlog_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wagondet_id", table = "arts_t_seatlog", nullable = false, length = 36)
    private String WagondetId;

    @Column(name = "c_seatlog_date", table = "arts_t_seatlog", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_seatlog_status", table = "arts_t_seatlog", nullable = false)
    private Character Status;

    @Column(name = "c_seatlog_wagonorder", table = "arts_t_seatlog", nullable = false)
    private short Wagonorder;

    @Column(name = "c_seatlog_domain", table = "arts_t_seatlog", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_user_id", table = "arts_t_seatlog", nullable = false, length = 36)
    private String UserId;

    @Column(name = "c_seatlog_object", table = "arts_t_seatlog", nullable = false, length = 50)
    private String Object;

    @Column(name = "c_seatlog_objectid", table = "arts_t_seatlog", nullable = false, length = 36)
    private String Objectid;

    @Column(name = "c_seatlog_action", table = "arts_t_seatlog", nullable = false, length = 50)
    private String Action;

    @Column(name = "c_seatlog_value", table = "arts_t_seatlog", nullable = false, length = 2147483647)
    @Lob
    private String Value;

    @Column(name = "c_seatlog_createdby", table = "arts_t_seatlog", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_seatlog_createdon", table = "arts_t_seatlog", nullable = false)
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

    public String getWagondetId() {
        return WagondetId;
    }

    public void setWagondetId(String WagondetId) {
        this.WagondetId = WagondetId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public Character getStatus() {
        return Status;
    }

    public void setStatus(Character Status) {
        this.Status = Status;
    }

    public short getWagonorder() {
        return Wagonorder;
    }

    public void setWagonorder(short Wagonorder) {
        this.Wagonorder = Wagonorder;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getObject() {
        return Object;
    }

    public void setObject(String Object) {
        this.Object = Object;
    }

    public String getObjectid() {
        return Objectid;
    }

    public void setObjectid(String Objectid) {
        this.Objectid = Objectid;
    }

    public String getAction() {
        return Action;
    }

    public void setAction(String Action) {
        this.Action = Action;
    }

    public String getValue() {
        return Value;
    }

    public void setValue(String Value) {
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
    
    
}
