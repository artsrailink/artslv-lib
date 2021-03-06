package co.id.artslv.lib.members;

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
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_reduction")
public class Reduction {

    @Column(name = "c_reduction_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_reduction_name")
    private String Name;

    @Column(name = "c_reduction_amount")
    private BigDecimal Amount;

    @Column(name = "c_reduction_amounttype")
    private String Amounttype;

    @Column(name = "c_reduction_startdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Startdate;

    @Column(name = "c_reduction_enddate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Enddate;

    @Column(name = "c_reduction_sellstartdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Sellstartdate;

    @Column(name = "c_reduction_sellenddate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Sellenddate;

    @Column(name = "c_reduction_note", table = "arts_t_reduction")
    @Lob
    private String Note;

    @Column(name = "c_reduction_status")
    private Character Status;

    @Column(name = "c_reduction_modifiedby")
    private String Modifiedby;

    @Column(name = "c_reduction_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_membertype_id")
    private String MembertypeId;

    @Column(name = "c_reduction_maxbook")
    private short Maxbook;

    @Column(name = "c_reduction_domain")
    private String Domain;

    @Column(name = "c_reduction_validdays")
    private String Validdays;

    @Column(name = "c_wagonclass_id", table = "arts_t_reduction")
    private String WagonclassId;

    @Column(name = "c_reduction_holidaystat")
    private Character Holidaystat;

    @Column(name = "c_reduction_createdby")
    private String Createdby;

    @Column(name = "c_reduction_createdon")
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

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public String getAmounttype() {
        return Amounttype;
    }

    public void setAmounttype(String Amounttype) {
        this.Amounttype = Amounttype;
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

    public String getNote() {
        return Note;
    }

    public void setNote(String Note) {
        this.Note = Note;
    }

    public Character getStatus() {
        return Status;
    }

    public void setStatus(Character Status) {
        this.Status = Status;
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

    public String getMembertypeId() {
        return MembertypeId;
    }

    public void setMembertypeId(String MembertypeId) {
        this.MembertypeId = MembertypeId;
    }

    public short getMaxbook() {
        return Maxbook;
    }

    public void setMaxbook(short Maxbook) {
        this.Maxbook = Maxbook;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public String getValiddays() {
        return Validdays;
    }

    public void setValiddays(String Validdays) {
        this.Validdays = Validdays;
    }

    public String getWagonclassId() {
        return WagonclassId;
    }

    public void setWagonclassId(String WagonclassId) {
        this.WagonclassId = WagonclassId;
    }

    public Character getHolidaystat() {
        return Holidaystat;
    }

    public void setHolidaystat(Character Holidaystat) {
        this.Holidaystat = Holidaystat;
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
