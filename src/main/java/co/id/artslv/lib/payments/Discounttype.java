/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

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
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_DISCOUNTTYPE")
public class Discounttype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_DISCOUNTTYPE_ID")
    private String id;

    @Column(name = "C_DISCOUNTTYPE_NAME")
    private String discounttypename;
    @Column(name = "C_DISCOUNTTYPE_STATUS")
    private String discounttypestatus;
    @Column(name = "C_DISCOUNTTYPE_DOMAIN")
    private String discounttypedomain;
    @Column(name = "C_DISCOUNTTYPE_MODIFIEDBY")
    private String discounttypemodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_DISCOUNTTYPE_MODIFIEDON")
    private LocalDateTime discounttypemodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDiscounttypename() {
        return discounttypename;
    }

    public void setDiscounttypename(String discounttypename) {
        this.discounttypename = discounttypename;
    }

    public String getDiscounttypestatus() {
        return discounttypestatus;
    }

    public void setDiscounttypestatus(String discounttypestatus) {
        this.discounttypestatus = discounttypestatus;
    }

    public String getDiscounttypedomain() {
        return discounttypedomain;
    }

    public void setDiscounttypedomain(String discounttypedomain) {
        this.discounttypedomain = discounttypedomain;
    }

    public String getDiscounttypemodifiedby() {
        return discounttypemodifiedby;
    }

    public void setDiscounttypemodifiedby(String discounttypemodifiedby) {
        this.discounttypemodifiedby = discounttypemodifiedby;
    }

    public LocalDateTime getDiscounttypemodifiedon() {
        return discounttypemodifiedon;
    }

    public void setDiscounttypemodifiedon(LocalDateTime discounttypemodifiedon) {
        this.discounttypemodifiedon = discounttypemodifiedon;
    }

}
