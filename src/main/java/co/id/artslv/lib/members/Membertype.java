package co.id.artslv.lib.members;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_MEMBERTYPE")
public class Membertype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MEMBERTYPE_ID")
    private String id;

    @Column(name = "C_MEMBERTYPE_CODE")
    private String membertypecode;

    @Column(name = "C_MEMBERTYPE_NAME")
    private String membertypename;

    @Column(name = "C_MEMBERTYPE_STATUS")
    private String membertypestatus;

    @Column(name = "C_MEMBERTYPE_DOMAIN")
    private String membertypedomain;

    @Column(name = "C_MEMBERTYPE_MODIFIEDBY")
    private String membertypemodifiedby;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MEMBERTYPE_MODIFIEDON")
    private LocalDateTime membertypemodifiedon;
    
    @Column(name = "C_MEMBERTYPE_VALIDDAYS")
    private int membertypevaliddays;
    
    @Column(name = "C_MEMBERTYPE_TYPE")
    private String membertypetype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMembertypecode() {
        return membertypecode;
    }

    public void setMembertypecode(String membertypecode) {
        this.membertypecode = membertypecode;
    }

    public String getMembertypename() {
        return membertypename;
    }

    public void setMembertypename(String membertypename) {
        this.membertypename = membertypename;
    }

    public String getMembertypestatus() {
        return membertypestatus;
    }

    public void setMembertypestatus(String membertypestatus) {
        this.membertypestatus = membertypestatus;
    }

    public String getMembertypedomain() {
        return membertypedomain;
    }

    public void setMembertypedomain(String membertypedomain) {
        this.membertypedomain = membertypedomain;
    }

    public String getMembertypemodifiedby() {
        return membertypemodifiedby;
    }

    public void setMembertypemodifiedby(String membertypemodifiedby) {
        this.membertypemodifiedby = membertypemodifiedby;
    }

    public LocalDateTime getMembertypemodifiedon() {
        return membertypemodifiedon;
    }

    public void setMembertypemodifiedon(LocalDateTime membertypemodifiedon) {
        this.membertypemodifiedon = membertypemodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    @Override
    public String toString() {
        return this.getMembertypecode();
    }

    public int getMembertypevaliddays() {
        return membertypevaliddays;
    }

    public void setMembertypevaliddays(int membertypevaliddays) {
        this.membertypevaliddays = membertypevaliddays;
    }

    public String getMembertypetype() {
        return membertypetype;
    }

    public void setMembertypetype(String membertypetype) {
        this.membertypetype = membertypetype;
    }
}
