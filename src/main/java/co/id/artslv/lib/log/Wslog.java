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
@Table(name = "arts_t_wslog")
public class Wslog {

    @Column(name = "c_wslog_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wslog_reqtime", table = "arts_t_wslog", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Reqtime;

    @Column(name = "c_wslog_ip", table = "arts_t_wslog", nullable = false, length = 20)
    private String Ip;

    @Column(name = "c_wslog_req", table = "arts_t_wslog", nullable = false, length = 2147483647)
    @Lob
    private String Req;

    @Column(name = "c_wslog_res", table = "arts_t_wslog", length = 2147483647)
    @Lob
    private String Res;

    @Column(name = "c_wslog_errcode", table = "arts_t_wslog", length = 10)
    private String Errcode;
    
    @Column(name = "c_wslog_status", table = "arts_t_wslog", nullable = false)
    private Character Status;
    
    @Column(name = "c_wslog_domain", table = "arts_t_wslog", length = 36)
    private String Domain;
    
    @Column(name = "c_user_id", table = "arts_t_wslog", length = 36)
    private String UserId;
    
    @Column(name = "c_wslog_restime", table = "arts_t_wslog")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Restime;

    @Column(name = "c_wslog_createdby", table = "arts_t_wslog", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_wslog_createdon", table = "arts_t_wslog", nullable = false)
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

    public LocalDate getReqtime() {
        return Reqtime;
    }

    public void setReqtime(LocalDate Reqtime) {
        this.Reqtime = Reqtime;
    }

    public String getIp() {
        return Ip;
    }

    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    public String getReq() {
        return Req;
    }

    public void setReq(String Req) {
        this.Req = Req;
    }

    public String getRes() {
        return Res;
    }

    public void setRes(String Res) {
        this.Res = Res;
    }

    public String getErrcode() {
        return Errcode;
    }

    public void setErrcode(String Errcode) {
        this.Errcode = Errcode;
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

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public LocalDate getRestime() {
        return Restime;
    }

    public void setRestime(LocalDate Restime) {
        this.Restime = Restime;
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
