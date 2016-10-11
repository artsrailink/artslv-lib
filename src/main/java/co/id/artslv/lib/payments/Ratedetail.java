package co.id.artslv.lib.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigDecimal;
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
@Table(name = "arts_t_ratedetail")
public class Ratedetail {

    @Column(name = "c_ratedetail_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_ratedetail_amount", table = "arts_t_ratedetail", nullable = false, scale = 2, precision = 11)
    private BigDecimal Amount;

    @Column(name = "c_rate_id", table = "arts_t_ratedetail", nullable = false, length = 36)
    private String RateId;

    @Column(name = "c_ratedetail_status", table = "arts_t_ratedetail", nullable = false)
    private Character Status;

    @Column(name = "c_ratedetail_domain", table = "arts_t_ratedetail", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_ratedetail_modifiedby", table = "arts_t_ratedetail", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_ratedetail_modifiedon", table = "arts_t_ratedetail", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_ratetype_id", table = "arts_t_ratedetail", nullable = false, length = 36)
    private String RatetypeId;

    @Column(name = "c_ratedetail_createdby", table = "arts_t_ratedetail", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_ratedetail_createdon", table = "arts_t_ratedetail", nullable = false)
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

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public String getRateId() {
        return RateId;
    }

    public void setRateId(String RateId) {
        this.RateId = RateId;
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

    public String getRatetypeId() {
        return RatetypeId;
    }

    public void setRatetypeId(String RatetypeId) {
        this.RatetypeId = RatetypeId;
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
