/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.trains;

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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_TRAINTYPE")
public class Traintype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRAINTYPE_ID")
    private String id;
    @Column(name = "C_TRAINTYPE_NAME")
    private String traintypename;
    @Column(name = "C_TRAINTYPE_CODE")
    private String traintypecode;
    @Column(name = "C_TRAINTYPE_STATUS")
    private String traintypestatus;
    @Column(name = "C_TRAINTYPE_DOMAIN")
    private String traintypedomain;
    @Column(name = "C_TRAINTYPE_MODIFIEDBY")
    private String traintypemodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRAINTYPE_MODIFIEDON")
    private LocalDateTime traintypemodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public Traintype() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTraintypename() {
        return traintypename;
    }

    public void setTraintypename(String traintypename) {
        this.traintypename = traintypename;
    }

    public String getTraintypecode() {
        return traintypecode;
    }

    public void setTraintypecode(String traintypecode) {
        this.traintypecode = traintypecode;
    }

    public String getTraintypestatus() {
        return traintypestatus;
    }

    public void setTraintypestatus(String traintypestatus) {
        this.traintypestatus = traintypestatus;
    }

    public String getTraintypedomain() {
        return traintypedomain;
    }

    public void setTraintypedomain(String traintypedomain) {
        this.traintypedomain = traintypedomain;
    }

    public String getTraintypemodifiedby() {
        return traintypemodifiedby;
    }

    public void setTraintypemodifiedby(String traintypemodifiedby) {
        this.traintypemodifiedby = traintypemodifiedby;
    }

    public LocalDateTime getTraintypemodifiedon() {
        return traintypemodifiedon;
    }

    public void setTraintypemodifiedon(LocalDateTime traintypemodifiedon) {
        this.traintypemodifiedon = traintypemodifiedon;
    }

}
