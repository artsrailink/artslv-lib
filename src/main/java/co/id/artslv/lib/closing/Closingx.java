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
@Table(name = "arts_t_closingx")
public class Closingx {

    @Column(name = "c_closing_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_closing_date", table = "arts_t_closingx", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_stasiun_idsell", table = "arts_t_closingx", nullable = false, length = 36)
    private String StasiunIdsell;

    @Column(name = "c_closing_docnum", table = "arts_t_closingx", nullable = false, length = 36)
    private String Docnum;

    @Column(name = "c_closing_totamount", table = "arts_t_closingx", nullable = false)
    private BigInteger Totamount;

    @Column(name = "c_closing_a8date", table = "arts_t_closingx", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate A8date;

    @Column(name = "c_closing_a8num", table = "arts_t_closingx", nullable = false, length = 36)
    private String A8num;

    @Column(name = "c_closing_modifiedon", table = "arts_t_closingx", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_shift_id", table = "arts_t_closingx", nullable = false, length = 36)
    private String ShiftId;

    @Column(name = "c_closing_modifiedby", table = "arts_t_closingx", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_closing_status", table = "arts_t_closingx", nullable = false)
    private Character Status;

    @Column(name = "c_closing_domain", table = "arts_t_closingx", nullable = false, length = 36)
    private String Domain;

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

    public String getStasiunIdsell() {
        return StasiunIdsell;
    }

    public void setStasiunIdsell(String StasiunIdsell) {
        this.StasiunIdsell = StasiunIdsell;
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
}
