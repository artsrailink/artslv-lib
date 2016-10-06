/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;

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
@Table(name = "KAIRTS_T_DOMAIN")
public class Domain implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_DOMAIN_ID")
    private String id;
    
    
    @Column(name = "C_DOMAIN_COMPCODE")
    private String domaincompcode;
    @Column(name = "C_DOMAIN_NAME")
    
    private String domainname;
    @Column(name = "C_DOMAIN_STATUS")
    private String domainstatus;
    @Column(name = "C_DOMAIN_MODIFIEDBY")
    private String domainmodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_DOMAIN_MODIFIEDON")
    private LocalDateTime domainmodifiedon;
    
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Domain() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDomaincompcode() {
        return domaincompcode;
    }

    public void setDomaincompcode(String domaincompcode) {
        this.domaincompcode = domaincompcode;
    }

    public String getDomainname() {
        return domainname;
    }

    public void setDomainname(String domainname) {
        this.domainname = domainname;
    }

    public String getDomainstatus() {
        return domainstatus;
    }

    public void setDomainstatus(String domainstatus) {
        this.domainstatus = domainstatus;
    }

    public String getDomainmodifiedby() {
        return domainmodifiedby;
    }

    public void setDomainmodifiedby(String domainmodifiedby) {
        this.domainmodifiedby = domainmodifiedby;
    }

    public LocalDateTime getDomainmodifiedon() {
        return domainmodifiedon;
    }

    public void setDomainmodifiedon(LocalDateTime domainmodifiedon) {
        this.domainmodifiedon = domainmodifiedon;
    }

    
}