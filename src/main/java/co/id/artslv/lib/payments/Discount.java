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
@Table(name = "arts_t_discount")
public class Discount {

    @Column(name = "c_discount_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_discount_value")
    private BigDecimal Value;

    @Column(name = "c_discount_startdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Startdate;

    @Column(name = "c_discount_enddate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Enddate;

    @Column(name = "c_discount_status")
    private Character Status;

    @Column(name = "c_discount_domain")
    private String Domain;

    @Column(name = "c_discount_modifiedby")
    private String Modifiedby;

    @Column(name = "c_discount_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_discount_psgnum")
    private Short Psgnum;

    @Column(name = "c_discount_psgcount")
    private Short Psgcount;

    @Column(name = "c_discount_sellstartdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Sellstartdate;

    @Column(name = "c_discount_sellenddate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Sellenddate;

    @Column(name = "c_discount_valuetype")
    private Character Valuetype;

    @Column(name = "c_discount_validdays")
    private String Validdays;

    @Column(name = "c_discount_holidaystat")
    private Character Holidaystat;

    @Column(name = "c_discounttype_id")
    private String typeId;

    @Column(name = "c_discount_createdby")
    private String Createdby;

    @Column(name = "c_discount_createdon")
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

    public BigDecimal getValue() {
        return Value;
    }

    public void setValue(BigDecimal Value) {
        this.Value = Value;
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

    public Short getPsgnum() {
        return Psgnum;
    }

    public void setPsgnum(Short Psgnum) {
        this.Psgnum = Psgnum;
    }

    public Short getPsgcount() {
        return Psgcount;
    }

    public void setPsgcount(Short Psgcount) {
        this.Psgcount = Psgcount;
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

    public Character getValuetype() {
        return Valuetype;
    }

    public void setValuetype(Character Valuetype) {
        this.Valuetype = Valuetype;
    }

    public String getValiddays() {
        return Validdays;
    }

    public void setValiddays(String Validdays) {
        this.Validdays = Validdays;
    }

    public Character getHolidaystat() {
        return Holidaystat;
    }

    public void setHolidaystat(Character Holidaystat) {
        this.Holidaystat = Holidaystat;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
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
