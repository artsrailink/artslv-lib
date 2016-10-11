package co.id.artslv.lib.payments;

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
@Table(name = "arts_t_rate")
public class Rate {

    @Column(name = "c_rate_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_rate_totamount", table = "arts_t_rate", nullable = false, scale = 2, precision = 11)
    private BigDecimal Totamount;

    @Column(name = "c_rate_startdate", table = "arts_t_rate", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Startdate;

    @Column(name = "c_rate_enddate", table = "arts_t_rate", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Enddate;

    @Column(name = "c_stasiun_idorg", table = "arts_t_rate", nullable = false, length = 36)
    private String StasiunIdorg;

    @Column(name = "c_rate_sellstartdate", table = "arts_t_rate", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Sellstartdate;

    @Column(name = "c_rate_sellenddate", table = "arts_t_rate", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Sellenddate;

    @Column(name = "c_rate_status", table = "arts_t_rate", nullable = false)
    private Character Status;

    @Column(name = "c_rate_domain", table = "arts_t_rate", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_rate_modifiedby", table = "arts_t_rate", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_rate_modifiedon", table = "arts_t_rate", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_rate_psgtype", table = "arts_t_rate")
    private Character Psgtype;

    @Column(name = "c_stasiun_iddest", table = "arts_t_rate", nullable = false, length = 36)
    private String StasiunIddest;

    @Column(name = "c_rate_refunddays", table = "arts_t_rate")
    private Integer Refunddays;

    @Column(name = "c_rate_refundable", table = "arts_t_rate", nullable = false)
    private Character Refundable;

    @Column(name = "c_rate_cancelable", table = "arts_t_rate", nullable = false)
    private Character Cancelable;

    @Column(name = "c_rate_reductible", table = "arts_t_rate", nullable = false)
    private Character Reductible;

    @Column(name = "c_rate_reschedulable", table = "arts_t_rate", nullable = false)
    private Character Reschedulable;

    @Column(name = "c_rate_reseatable", table = "arts_t_rate", nullable = false)
    private Character Reseatable;

    @Column(name = "c_rate_renamable", table = "arts_t_rate", nullable = false)
    private Character Renamable;

    @Column(name = "c_subclass_id", table = "arts_t_rate", nullable = false, length = 36)
    private String SubclassId;

    @Column(name = "c_rate_schedulenoka", table = "arts_t_rate", length = 50)
    private String Schedulenoka;

    @Column(name = "c_rate_createdby", table = "arts_t_rate", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_rate_createdon", table = "arts_t_rate", nullable = false)
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

    public BigDecimal getTotamount() {
        return Totamount;
    }

    public void setTotamount(BigDecimal Totamount) {
        this.Totamount = Totamount;
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

    public String getStasiunIdorg() {
        return StasiunIdorg;
    }

    public void setStasiunIdorg(String StasiunIdorg) {
        this.StasiunIdorg = StasiunIdorg;
    }

    public LocalDate getSellstartdate() {
        return Sellstartdate;
    }

    public void setSellstartdate(LocalDate Sellstartdate) {
        this.Sellstartdate = Sellstartdate;
    }

    public LocalDate getSellenddate() {
        return Sellenddate;
    }

    public void setSellenddate(LocalDate Sellenddate) {
        this.Sellenddate = Sellenddate;
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

    public Character getPsgtype() {
        return Psgtype;
    }

    public void setPsgtype(Character Psgtype) {
        this.Psgtype = Psgtype;
    }

    public String getStasiunIddest() {
        return StasiunIddest;
    }

    public void setStasiunIddest(String StasiunIddest) {
        this.StasiunIddest = StasiunIddest;
    }

    public Integer getRefunddays() {
        return Refunddays;
    }

    public void setRefunddays(Integer Refunddays) {
        this.Refunddays = Refunddays;
    }

    public Character getRefundable() {
        return Refundable;
    }

    public void setRefundable(Character Refundable) {
        this.Refundable = Refundable;
    }

    public Character getCancelable() {
        return Cancelable;
    }

    public void setCancelable(Character Cancelable) {
        this.Cancelable = Cancelable;
    }

    public Character getReductible() {
        return Reductible;
    }

    public void setReductible(Character Reductible) {
        this.Reductible = Reductible;
    }

    public Character getReschedulable() {
        return Reschedulable;
    }

    public void setReschedulable(Character Reschedulable) {
        this.Reschedulable = Reschedulable;
    }

    public Character getReseatable() {
        return Reseatable;
    }

    public void setReseatable(Character Reseatable) {
        this.Reseatable = Reseatable;
    }

    public Character getRenamable() {
        return Renamable;
    }

    public void setRenamable(Character Renamable) {
        this.Renamable = Renamable;
    }

    public String getSubclassId() {
        return SubclassId;
    }

    public void setSubclassId(String SubclassId) {
        this.SubclassId = SubclassId;
    }

    public String getSchedulenoka() {
        return Schedulenoka;
    }

    public void setSchedulenoka(String Schedulenoka) {
        this.Schedulenoka = Schedulenoka;
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
