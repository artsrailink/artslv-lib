package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
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
@Table(name = "arts_t_grpreservation")
public class Grpreservation {

    @Column(name = "c_grpreservation_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_grpreservation_docnum", table = "arts_t_grpreservation", nullable = false, length = 36)
    private String Docnum;

    @Column(name = "c_grpreservation_custname", table = "arts_t_grpreservation", nullable = false, length = 100)
    private String Custname;

    @Column(name = "c_grpreservation_address", table = "arts_t_grpreservation", nullable = false)
    private String Address;

    @Column(name = "c_grpreservation_phonenum1", table = "arts_t_grpreservation", nullable = false, length = 50)
    private String Phonenum1;

    @Column(name = "c_grpreservation_email", table = "arts_t_grpreservation", length = 100)
    private String Email;

    @Column(name = "c_unit_id", table = "arts_t_grpreservation", nullable = false, length = 36)
    private String UnitId;

    @Column(name = "c_grpreservation_date", table = "arts_t_grpreservation", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_grpreservation_totpsg", table = "arts_t_grpreservation", nullable = false)
    private short Totpsg;

    @Column(name = "c_grpreservation_totamount", table = "arts_t_grpreservation", nullable = false)
    private long Totamount;

    @Column(name = "c_grpreservation_dpamount", table = "arts_t_grpreservation", nullable = false)
    private long Dpamount;

    @Column(name = "c_grpreservation_duedatedp", table = "arts_t_grpreservation", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Duedatedp;

    @Column(name = "c_grpreservation_duedatepay", table = "arts_t_grpreservation", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Duedatepay;

    @Column(name = "c_grpreservation_status", table = "arts_t_grpreservation", nullable = false)
    private Character Status;

    @Column(name = "c_grpreservation_domain", table = "arts_t_grpreservation", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_grpreservation_modifiedby", table = "arts_t_grpreservation", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_grpreservation_modifiedon", table = "arts_t_grpreservation", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_grpreservation_groupname", table = "arts_t_grpreservation", length = 100)
    private String Groupname;

    @Column(name = "c_grpreservation_phonenum2", table = "arts_t_grpreservation", length = 50)
    private String Phonenum2;

    @Column(name = "c_grpreservation_createdby", table = "arts_t_grpreservation", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_grpreservation_createdon", table = "arts_t_grpreservation", nullable = false)
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

    public String getDocnum() {
        return Docnum;
    }

    public void setDocnum(String Docnum) {
        this.Docnum = Docnum;
    }

    public String getCustname() {
        return Custname;
    }

    public void setCustname(String Custname) {
        this.Custname = Custname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhonenum1() {
        return Phonenum1;
    }

    public void setPhonenum1(String Phonenum1) {
        this.Phonenum1 = Phonenum1;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public short getTotpsg() {
        return Totpsg;
    }

    public void setTotpsg(short Totpsg) {
        this.Totpsg = Totpsg;
    }

    public long getTotamount() {
        return Totamount;
    }

    public void setTotamount(long Totamount) {
        this.Totamount = Totamount;
    }

    public long getDpamount() {
        return Dpamount;
    }

    public void setDpamount(long Dpamount) {
        this.Dpamount = Dpamount;
    }

    public LocalDate getDuedatedp() {
        return Duedatedp;
    }

    public void setDuedatedp(LocalDate Duedatedp) {
        this.Duedatedp = Duedatedp;
    }

    public LocalDate getDuedatepay() {
        return Duedatepay;
    }

    public void setDuedatepay(LocalDate Duedatepay) {
        this.Duedatepay = Duedatepay;
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

    public String getGroupname() {
        return Groupname;
    }

    public void setGroupname(String Groupname) {
        this.Groupname = Groupname;
    }

    public String getPhonenum2() {
        return Phonenum2;
    }

    public void setPhonenum2(String Phonenum2) {
        this.Phonenum2 = Phonenum2;
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
