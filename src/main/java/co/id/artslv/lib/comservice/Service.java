/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.comservice;

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
import java.math.BigDecimal;
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
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SERVICE")
public class Service implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_SERVICE_ID")
    private String id;

    @Column(name = "C_SERVICE_NAME")
    private String servicename;
    @Column(name = "C_SERVICEPRV_ID")
    private String serviceprvid;
    
    @Column(name = "C_SERVICE_PRICE")
    private BigDecimal serviceprice;
    @Column(name = "C_SERVICE_SUBPRICE1")
    private BigDecimal servicesubprice1;
    @Column(name = "C_SERVICE_SUBPRICE2")
    private BigDecimal servicesubprice2;

    @Column(name = "C_SERVICE_STATUS")
    private String servicestatus;

    @Column(name = "C_SERVICE_DOMAIN")
    private String servicedomain;

    @Column(name = "C_SERVICE_MODIFIEDBY")
    private String servicemodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_SERVICE_MODIFIEDON")
    private LocalDateTime servicemodifiedon;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SERVICE_STARTDATE")
    private LocalDate servicestartdate;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_SERVICE_ENDDATE")
    private LocalDate serviceenddate;
    
    @Transient
    private Serviceprovider serviceprovider;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServicename() {
        return servicename;
    }

    public void setServicename(String servicename) {
        this.servicename = servicename;
    }

    public String getServiceprvid() {
        return serviceprvid;
    }

    public void setServiceprvid(String serviceprvid) {
        this.serviceprvid = serviceprvid;
    }

    public BigDecimal getServiceprice() {
        return serviceprice;
    }

    public void setServiceprice(BigDecimal serviceprice) {
        this.serviceprice = serviceprice;
    }

    public BigDecimal getServicesubprice1() {
        return servicesubprice1;
    }

    public void setServicesubprice1(BigDecimal servicesubprice1) {
        this.servicesubprice1 = servicesubprice1;
    }

    public BigDecimal getServicesubprice2() {
        return servicesubprice2;
    }

    public void setServicesubprice2(BigDecimal servicesubprice2) {
        this.servicesubprice2 = servicesubprice2;
    }

    public String getServicestatus() {
        return servicestatus;
    }

    public void setServicestatus(String servicestatus) {
        this.servicestatus = servicestatus;
    }

    public String getServicedomain() {
        return servicedomain;
    }

    public void setServicedomain(String servicedomain) {
        this.servicedomain = servicedomain;
    }

    public String getServicemodifiedby() {
        return servicemodifiedby;
    }

    public void setServicemodifiedby(String servicemodifiedby) {
        this.servicemodifiedby = servicemodifiedby;
    }

    public LocalDateTime getServicemodifiedon() {
        return servicemodifiedon;
    }

    public void setServicemodifiedon(LocalDateTime servicemodifiedon) {
        this.servicemodifiedon = servicemodifiedon;
    }

    public LocalDate getServicestartdate() {
        return servicestartdate;
    }

    public void setServicestartdate(LocalDate servicestartdate) {
        this.servicestartdate = servicestartdate;
    }

    public LocalDate getServiceenddate() {
        return serviceenddate;
    }

    public void setServiceenddate(LocalDate serviceenddate) {
        this.serviceenddate = serviceenddate;
    }

    

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Serviceprovider getServiceprovider() {
        return serviceprovider;
    }

    public void setServiceprovider(Serviceprovider serviceprovider) {
        this.serviceprovider = serviceprovider;
    }

}
