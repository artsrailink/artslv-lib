package co.id.artslv.lib.closing;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigInteger;
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
@Table(name = "arts_t_closing")
public class Closing {

    @Column(name = "c_closing_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_closing_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_closing_docnum")
    private String Docnum;

    @Column(name = "c_closing_totamount")
    private BigInteger Totamount;

    @Column(name = "c_closing_a8date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate A8date;

    @Column(name = "c_closing_a8num")
    private String A8num;

    @Column(name = "c_closing_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_shift_id")
    private String ShiftId;

    @Column(name = "c_closing_modifiedby")
    private String Modifiedby;

    @Column(name = "c_closing_status")
    private Character Status;

    @Column(name = "c_closing_domain")
    private String Domain;

    @Column(name = "c_closing_stasiuncode")
    private String Stasiuncode;

    @Column(name = "c_closing_pic")
    private String Pic;

    @Column(name = "c_closing_areacode")
    private String Areacode;

    @Column(name = "c_closing_stasiunpc")
    private String Stasiunpc;

    @Column(name = "c_closing_docnumsap")
    private String Docnumsap;

    @Column(name = "c_closing_postingdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Postingdate;

    @Column(name = "c_closing_createdby")
    private String Createdby;

    @Column(name = "c_closing_createdon")
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

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getDocnum() {
        return Docnum;
    }

    public void setDocnum(String Docnum) {
        this.Docnum = Docnum;
    }

    public BigInteger getTotamount() {
        return Totamount;
    }

    public void setTotamount(BigInteger Totamount) {
        this.Totamount = Totamount;
    }

    public LocalDate getA8date() {
        return A8date;
    }

    public void setA8date(LocalDate A8date) {
        this.A8date = A8date;
    }

    public String getA8num() {
        return A8num;
    }

    public void setA8num(String A8num) {
        this.A8num = A8num;
    }

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime Modifiedon) {
        this.Modifiedon = Modifiedon;
    }

    public String getShiftId() {
        return ShiftId;
    }

    public void setShiftId(String ShiftId) {
        this.ShiftId = ShiftId;
    }

    public String getModifiedby() {
        return Modifiedby;
    }

    public void setModifiedby(String Modifiedby) {
        this.Modifiedby = Modifiedby;
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

    public String getStasiuncode() {
        return Stasiuncode;
    }

    public void setStasiuncode(String Stasiuncode) {
        this.Stasiuncode = Stasiuncode;
    }

    public String getPic() {
        return Pic;
    }

    public void setPic(String Pic) {
        this.Pic = Pic;
    }

    public String getAreacode() {
        return Areacode;
    }

    public void setAreacode(String Areacode) {
        this.Areacode = Areacode;
    }

    public String getStasiunpc() {
        return Stasiunpc;
    }

    public void setStasiunpc(String Stasiunpc) {
        this.Stasiunpc = Stasiunpc;
    }

    public String getDocnumsap() {
        return Docnumsap;
    }

    public void setDocnumsap(String Docnumsap) {
        this.Docnumsap = Docnumsap;
    }

    public LocalDate getPostingdate() {
        return Postingdate;
    }

    public void setPostingdate(LocalDate Postingdate) {
        this.Postingdate = Postingdate;
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
