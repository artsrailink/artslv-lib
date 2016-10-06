/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.responses;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "KAIRTS_T_PARAMETER")
public class Parameter implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_PARAMETER_ID")
    private String id;
    @Column(name = "C_PARAMETER_CODE")
    private String parametercode;
    @Column(name = "C_PARAMETER_NAME")
    private String parametername;
    @Column(name = "C_PARAMETER_VALTYPE")
    private String parametervaltype;
    @Column(name = "C_PARAMETER_VALUE")
    private String parametervalue;
    
    @Column(name = "C_PARAMETER_STATUS")
    private String parameterstatus;

    @Column(name = "C_PARAMETER_DOMAIN")
    private String parameterdomain;

    @Column(name = "C_PARAMETER_MODIFIEDBY")
    private String parametermodifiedby;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_PARAMETER_MODIFIEDON")
    private LocalDateTime parametermodifiedon;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_PARAMETER_STARTDATE")
    private LocalDate parameterstartdate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_PARAMETER_ENDDATE")
    private LocalDate parameterenddate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getParametercode() {
        return parametercode;
    }

    public void setParametercode(String parametercode) {
        this.parametercode = parametercode;
    }

    public String getParametername() {
        return parametername;
    }

    public void setParametername(String parametername) {
        this.parametername = parametername;
    }

    public String getParametervaltype() {
        return parametervaltype;
    }

    public void setParametervaltype(String parametervaltype) {
        this.parametervaltype = parametervaltype;
    }

    public String getParametervalue() {
        return parametervalue;
    }

    public void setParametervalue(String parametervalue) {
        this.parametervalue = parametervalue;
    }

    public String getParameterstatus() {
        return parameterstatus;
    }

    public void setParameterstatus(String parameterstatus) {
        this.parameterstatus = parameterstatus;
    }

    public String getParameterdomain() {
        return parameterdomain;
    }

    public void setParameterdomain(String parameterdomain) {
        this.parameterdomain = parameterdomain;
    }

    public String getParametermodifiedby() {
        return parametermodifiedby;
    }

    public void setParametermodifiedby(String parametermodifiedby) {
        this.parametermodifiedby = parametermodifiedby;
    }

    public LocalDateTime getParametermodifiedon() {
        return parametermodifiedon;
    }

    public void setParametermodifiedon(LocalDateTime parametermodifiedon) {
        this.parametermodifiedon = parametermodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public LocalDate getParameterstartdate() {
        return parameterstartdate;
    }

    public void setParameterstartdate(LocalDate parameterstartdate) {
        this.parameterstartdate = parameterstartdate;
    }

    public LocalDate getParameterenddate() {
        return parameterenddate;
    }

    public void setParameterenddate(LocalDate parameterenddate) {
        this.parameterenddate = parameterenddate;
    }


}
