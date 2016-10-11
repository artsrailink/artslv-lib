package co.id.artslv.lib.trains;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Created by root on 07/10/16.
 */
public class Subclass {
    @Column(name= "c_subclass_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name= "c_subclass_code")
    private String subclasscode;

    @Column(name= "c_subclass_status")
    private String status;

    @Column(name= "c_subclass_domain")
    private String domain;

    @Column(name= "c_subclass_modifiedby")
    private String modifedby;

    @Column(name= "c_subclass_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name= "c_wagonclass_id")
    private String wagonclassid;

    @Column(name= "c_subclass_note")
    private String note;

    @Column(name= "c_subclass_createdby")
    private String createdby;

    @Column(name= "c_subclass_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getModifedby() {
        return modifedby;
    }

    public void setModifedby(String modifedby) {
        this.modifedby = modifedby;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }
}
