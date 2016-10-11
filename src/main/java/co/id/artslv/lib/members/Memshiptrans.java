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
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_memshiptrans")
public class Memshiptrans {

    @Column(name = "c_memshiptrans_id", table = "arts_t_memshiptrans", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_memshiptrans_validdate", table = "arts_t_memshiptrans")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Validdate;

    @Column(name = "c_memshiptrans_expdate", table = "arts_t_memshiptrans", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Expdate;

    @Column(name = "c_memshiptrans_type", table = "arts_t_memshiptrans", nullable = false)
    private Character Type;

    @Column(name = "c_memshiptrans_status", table = "arts_t_memshiptrans", nullable = false)
    private Character Status;

    @Column(name = "c_memshiptrans_domain", table = "arts_t_memshiptrans", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_memshiptrans_modifiedby", table = "arts_t_memshiptrans", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_memshiptrans_modifiedon", table = "arts_t_memshiptrans", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_membership_id", table = "arts_t_memshiptrans", nullable = false, length = 36)
    private String MembershipId;

    @Column(name = "c_memshiptrans_date", table = "arts_t_memshiptrans", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_memshiptrans_ref", table = "arts_t_memshiptrans", length = 100)
    private String Ref;

    @Column(name = "c_memshiptrans_beginningbal", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    private BigDecimal Beginningbal;

    @Column(name = "c_memshiptrans_earnpoint", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    private BigDecimal Earnpoint;

    @Column(name = "c_memshiptrans_redeempoint", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    private BigDecimal Redeempoint;

    @Column(name = "c_memshiptrans_endingbal", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    private BigDecimal Endingbal;

    @Column(name = "c_memshiptrans_createdby", table = "arts_t_memshiptrans", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_memshiptrans_createdon", table = "arts_t_memshiptrans", nullable = false)
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

    public LocalDate getValiddate() {
        return Validdate;
    }

    public void setValiddate(LocalDate Validdate) {
        this.Validdate = Validdate;
    }

    public LocalDate getExpdate() {
        return Expdate;
    }

    public void setExpdate(LocalDate Expdate) {
        this.Expdate = Expdate;
    }

    public Character getType() {
        return Type;
    }

    public void setType(Character Type) {
        this.Type = Type;
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

    public String getMembershipId() {
        return MembershipId;
    }

    public void setMembershipId(String MembershipId) {
        this.MembershipId = MembershipId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getRef() {
        return Ref;
    }

    public void setRef(String Ref) {
        this.Ref = Ref;
    }

    public BigDecimal getBeginningbal() {
        return Beginningbal;
    }

    public void setBeginningbal(BigDecimal Beginningbal) {
        this.Beginningbal = Beginningbal;
    }

    public BigDecimal getEarnpoint() {
        return Earnpoint;
    }

    public void setEarnpoint(BigDecimal Earnpoint) {
        this.Earnpoint = Earnpoint;
    }

    public BigDecimal getRedeempoint() {
        return Redeempoint;
    }

    public void setRedeempoint(BigDecimal Redeempoint) {
        this.Redeempoint = Redeempoint;
    }

    public BigDecimal getEndingbal() {
        return Endingbal;
    }

    public void setEndingbal(BigDecimal Endingbal) {
        this.Endingbal = Endingbal;
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
