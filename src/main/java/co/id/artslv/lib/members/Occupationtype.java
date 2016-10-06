/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.members;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
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
@Table(name = "KAIRTS_T_OCCUPATIONTYPE")
public class Occupationtype {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_OCCUPATIONTYPE_ID")
    private String id;

    @Column(name = "C_OCCUPATIONTYPE_NAME")
    private String occupationtypename;

    @Column(name = "C_OCCUPATIONTYPE_CODE")
    private String occupationtypecode;

    @Column(name = "C_OCCUPATIONTYPE_STATUS")
    private String occupationtypestatus;

    @Column(name = "C_OCCUPATIONTYPE_DOMAIN")
    private String occupationtypedomain;

    @Column(name = "C_OCCUPATIONTYPE_MODIFIEDBY")
    private String occupationtypemodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_OCCUPATIONTYPE_MODIFIEDON")
    private LocalDateTime occupationtypemodifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    public Occupationtype() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOccupationtypename() {
        return occupationtypename;
    }

    public void setOccupationtypename(String occupationtypename) {
        this.occupationtypename = occupationtypename;
    }

    public String getOccupationtypecode() {
        return occupationtypecode;
    }

    public void setOccupationtypecode(String occupationtypecode) {
        this.occupationtypecode = occupationtypecode;
    }

    public String getOccupationtypestatus() {
        return occupationtypestatus;
    }

    public void setOccupationtypestatus(String occupationtypestatus) {
        this.occupationtypestatus = occupationtypestatus;
    }

    public String getOccupationtypedomain() {
        return occupationtypedomain;
    }

    public void setOccupationtypedomain(String occupationtypedomain) {
        this.occupationtypedomain = occupationtypedomain;
    }

    public String getOccupationtypemodifiedby() {
        return occupationtypemodifiedby;
    }

    public void setOccupationtypemodifiedby(String occupationtypemodifiedby) {
        this.occupationtypemodifiedby = occupationtypemodifiedby;
    }

    public LocalDateTime getOccupationtypemodifiedon() {
        return occupationtypemodifiedon;
    }

    public void setOccupationtypemodifiedon(LocalDateTime occupationtypemodifiedon) {
        this.occupationtypemodifiedon = occupationtypemodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
}
