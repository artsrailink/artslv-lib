package co.id.artslv.lib.comservice;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_service")
public class Service {

    @Column(name = "c_service_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_service_name", table = "arts_t_service", nullable = false, length = 100)
    private String Name;

    @Column(name = "c_service_price", table = "arts_t_service", nullable = false, scale = 2, precision = 11)
    private BigDecimal Price;

    @Column(name = "c_service_status", table = "arts_t_service", nullable = false)
    private Character Status;

    @Column(name = "c_service_domain", table = "arts_t_service", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_service_modifiedby", table = "arts_t_service", nullable = false, length = 40)
    private String Modifiedby;

    @Column(name = "c_service_modifiedon", table = "arts_t_service", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_service_subprice1", table = "arts_t_service", scale = 2, precision = 11)
    private BigDecimal Subprice1;

    @Column(name = "c_service_subprice2", table = "arts_t_service", scale = 2, precision = 11)
    private BigDecimal Subprice2;

    @Column(name = "c_service_startdate", table = "arts_t_service", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Startdate;

    @Column(name = "c_service_enddate", table = "arts_t_service", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Enddate;

    @Column(name = "c_serviceprv_id", table = "arts_t_service", nullable = false, length = 36)
    private String ServiceprvId;

    @Column(name = "c_service_createdby", table = "arts_t_service", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_service_createdon", table = "arts_t_service", nullable = false)
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

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public BigDecimal getPrice() {
        return Price;
    }

    public void setPrice(BigDecimal Price) {
        this.Price = Price;
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

    public String getModifiedby() {
        return Modifiedby;
    }

    public void setModifiedby(String Modifiedby) {
        this.Modifiedby = Modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime Modifiedon) {
        this.Modifiedon = Modifiedon;
    }

    public BigDecimal getSubprice1() {
        return Subprice1;
    }

    public void setSubprice1(BigDecimal Subprice1) {
        this.Subprice1 = Subprice1;
    }

    public BigDecimal getSubprice2() {
        return Subprice2;
    }

    public void setSubprice2(BigDecimal Subprice2) {
        this.Subprice2 = Subprice2;
    }

    public LocalDate getStartdate() {
        return Startdate;
    }

    public void setStartdate(LocalDate Startdate) {
        this.Startdate = Startdate;
    }

    public LocalDate getEnddate() {
        return Enddate;
    }

    public void setEnddate(LocalDate Enddate) {
        this.Enddate = Enddate;
    }

    public String getServiceprvId() {
        return ServiceprvId;
    }

    public void setServiceprvId(String ServiceprvId) {
        this.ServiceprvId = ServiceprvId;
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
