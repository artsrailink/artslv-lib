package co.id.artslv.lib.transactions;

import co.id.artslv.lib.org.Stasiun;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Yoga Sefianto
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_CANCELLATIONDET")
public class Cancellationdet implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_CANCELLATIONDET_ID")
    private String id;
    
    @Column(name = "C_CANCELLATIONDET_NETAMOUNT")
    private BigDecimal netamount;
    
    @Column(name = "C_CANCELLATIONDET_STATUS")
    private String status;
    
    @Column(name = "C_CANCELLATIONDET_DOMAIN")
    private String domain;
    
    @Column(name = "C_CANCELLATIONDET_MODIFIEDBY")
    private String modifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_CANCELLATIONDET_MODIFIEDON")
    private LocalDateTime modifiedon;
    
    @Column(name = "C_CANCELLATION_ID")
    private String cancellationid;
    
    @Column(name = "C_TRANSACTIONDETID_CANCELLED")
    private String transactiondetidcancelled;
    
    @Column(name = "C_TRANSACTIONDETID_NEW")
    private String transactiondetidnew;
        
    @Column(name = "C_CANCELLATIONDET_FEE")
    private BigDecimal fee;
    
    @Column(name = "C_CANCELLATIONDET_DIFF")
    private BigDecimal diff;
    
    @Column(name = "C_CANCELLATIONDET_AMOUNTTICKET")
    private BigDecimal ticketamount;
    
    @Transient 
    private Cancellation cancellation;
    @Transient 
    private Transactiondet Transactiondetcancelled;
    @Transient 
    private Transactiondet Transactiondetnew;
    @Transient
    private Stasiun stasiun;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getNetamount() {
        return netamount;
    }

    public void setNetamount(BigDecimal netamount) {
        this.netamount = netamount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getCancellationid() {
        return cancellationid;
    }

    public void setCancellationid(String cancellationid) {
        this.cancellationid = cancellationid;
    }

    public String getTransactiondetidcancelled() {
        return transactiondetidcancelled;
    }

    public void setTransactiondetidcancelled(String transactiondetidcancelled) {
        this.transactiondetidcancelled = transactiondetidcancelled;
    }

    public String getTransactiondetidnew() {
        return transactiondetidnew;
    }

    public void setTransactiondetidnew(String transactiondetidnew) {
        this.transactiondetidnew = transactiondetidnew;
    }

    public BigDecimal getFee() {
        return fee;
    }

    public void setFee(BigDecimal fee) {
        this.fee = fee;
    }

    public BigDecimal getDiff() {
        return diff;
    }

    public void setDiff(BigDecimal diff) {
        this.diff = diff;
    }

    public BigDecimal getTicketamount() {
        return ticketamount;
    }

    public void setTicketamount(BigDecimal ticketamount) {
        this.ticketamount = ticketamount;
    }

    public Cancellation getCancellation() {
        return cancellation;
    }

    public void setCancellation(Cancellation cancellation) {
        this.cancellation = cancellation;
    }

    public Transactiondet getTransactiondetcancelled() {
        return Transactiondetcancelled;
    }

    public void setTransactiondetcancelled(Transactiondet Transactiondetcancelled) {
        this.Transactiondetcancelled = Transactiondetcancelled;
    }

    public Transactiondet getTransactiondetnew() {
        return Transactiondetnew;
    }

    public void setTransactiondetnew(Transactiondet Transactiondetnew) {
        this.Transactiondetnew = Transactiondetnew;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
}