/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.raws;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.Basic;
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
@Table(name = "arts_t_activitylog")
public class Activitylog {

    @Column(name = "c_activitylog_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_activitylog_object")
    private String cActivitylogObject;

    @Column(name = "c_activitylog_objectid")
    private String cActivitylogObjectid;

    @Column(name = "c_activitylog_action")
    private String cActivitylogAction;

    @Column(name = "c_activitylog_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate cActivitylogDate;

    @Column(name = "c_activitylog_value")
    @Lob
    private String cActivitylogValue;

    @Column(name = "c_activitylog_domain")
    private String cActivitylogDomain;

    @Column(name = "c_user_id")
    private String cUserId;

    @Column(name = "c_wslog_id")
    private String cWslogId;

    @Column(name = "c_unit_id")
    private String cUnitId;

    @Column(name = "c_activitylog_createdby")
    private String cActivitylogCreatedby;

    @Column(name = "c_activitylog_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime cActivitylogCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcActivitylogObject() {
        return cActivitylogObject;
    }

    public void setcActivitylogObject(String cActivitylogObject) {
        this.cActivitylogObject = cActivitylogObject;
    }

    public String getcActivitylogObjectid() {
        return cActivitylogObjectid;
    }

    public void setcActivitylogObjectid(String cActivitylogObjectid) {
        this.cActivitylogObjectid = cActivitylogObjectid;
    }

    public String getcActivitylogAction() {
        return cActivitylogAction;
    }

    public void setcActivitylogAction(String cActivitylogAction) {
        this.cActivitylogAction = cActivitylogAction;
    }

    public LocalDate getcActivitylogDate() {
        return cActivitylogDate;
    }

    public void setcActivitylogDate(LocalDate cActivitylogDate) {
        this.cActivitylogDate = cActivitylogDate;
    }
    
    
    public String getcActivitylogValue() {
        return cActivitylogValue;
    }

    public void setcActivitylogValue(String cActivitylogValue) {
        this.cActivitylogValue = cActivitylogValue;
    }

    public String getcActivitylogDomain() {
        return cActivitylogDomain;
    }

    public void setcActivitylogDomain(String cActivitylogDomain) {
        this.cActivitylogDomain = cActivitylogDomain;
    }

    public String getcUserId() {
        return cUserId;
    }

    public void setcUserId(String cUserId) {
        this.cUserId = cUserId;
    }

    public String getcWslogId() {
        return cWslogId;
    }

    public void setcWslogId(String cWslogId) {
        this.cWslogId = cWslogId;
    }

    public String getcUnitId() {
        return cUnitId;
    }

    public void setcUnitId(String cUnitId) {
        this.cUnitId = cUnitId;
    }

    public String getcActivitylogCreatedby() {
        return cActivitylogCreatedby;
    }

    public void setcActivitylogCreatedby(String cActivitylogCreatedby) {
        this.cActivitylogCreatedby = cActivitylogCreatedby;
    }

    public LocalDateTime getcActivitylogCreatedon() {
        return cActivitylogCreatedon;
    }

    public void setcActivitylogCreatedon(LocalDateTime cActivitylogCreatedon) {
        this.cActivitylogCreatedon = cActivitylogCreatedon;
    }
}
