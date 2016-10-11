package co.id.artslv.lib.transactions;

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
@Table(name = "arts_t_cancellationdet")
public class Cancellationdet {

    @Column(name = "c_cancellationdet_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_cancellationdet_netamount", table = "arts_t_cancellationdet", nullable = false)
    private long Netamount;

    @Column(name = "c_cancellationdet_status", table = "arts_t_cancellationdet", nullable = false)
    private Character Status;

    @Column(name = "c_cancellationdet_domain", table = "arts_t_cancellationdet", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_cancellationdet_modifiedby", table = "arts_t_cancellationdet", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_cancellationdet_modifiedon", table = "arts_t_cancellationdet", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_cancellation_id", table = "arts_t_cancellationdet", nullable = false, length = 36)
    private String CancellationId;

    @Column(name = "c_transactiondetid_cancelled", table = "arts_t_cancellationdet", nullable = false, length = 36)
    private String TransactiondetidCancelled;

    @Column(name = "c_transactiondetid_new", table = "arts_t_cancellationdet", length = 36)
    private String TransactiondetidNew;

    @Column(name = "c_cancellationdet_fee", table = "arts_t_cancellationdet", nullable = false)
    private long Fee;

    @Column(name = "c_cancellationdet_diff", table = "arts_t_cancellationdet", nullable = false)
    private long Diff;

    @Column(name = "c_cancellationdet_amountticket", table = "arts_t_cancellationdet", scale = 2, precision = 11)
    private BigDecimal Amountticket;

    @Column(name = "c_cancellationdet_createdby", table = "arts_t_cancellationdet", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_cancellationdet_createdon", table = "arts_t_cancellationdet", nullable = false)
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

    public long getNetamount() {
        return Netamount;
    }

    public void setNetamount(long Netamount) {
        this.Netamount = Netamount;
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

    public String getCancellationId() {
        return CancellationId;
    }

    public void setCancellationId(String CancellationId) {
        this.CancellationId = CancellationId;
    }

    public String getTransactiondetidCancelled() {
        return TransactiondetidCancelled;
    }

    public void setTransactiondetidCancelled(String TransactiondetidCancelled) {
        this.TransactiondetidCancelled = TransactiondetidCancelled;
    }

    public String getTransactiondetidNew() {
        return TransactiondetidNew;
    }

    public void setTransactiondetidNew(String TransactiondetidNew) {
        this.TransactiondetidNew = TransactiondetidNew;
    }

    public long getFee() {
        return Fee;
    }

    public void setFee(long Fee) {
        this.Fee = Fee;
    }

    public long getDiff() {
        return Diff;
    }

    public void setDiff(long Diff) {
        this.Diff = Diff;
    }

    public BigDecimal getAmountticket() {
        return Amountticket;
    }

    public void setAmountticket(BigDecimal Amountticket) {
        this.Amountticket = Amountticket;
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
