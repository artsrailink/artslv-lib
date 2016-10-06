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
import java.util.List;
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
@Table(name = "KAIRTS_T_CANCELLATION")
public class Cancellation implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_CANCELLATION_ID")
    private String id;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_CANCELLATION_DATE")    
    private LocalDateTime date;
    
    @Column(name = "C_CANCELLATION_TOTAMOUNT")
    private BigDecimal totamount;
    
    @Column(name = "C_CANCELLATION_STATUS")
    private String status;
    
    @Column(name = "C_TRANSACTIONID_CANCELLED")
    private String transactionidcancelled;
    
    @Column(name = "C_TRANSACTIONID_NEW")
    private String transactionidnew;
    
    @Column(name = "C_CANCELLATION_DOMAIN")
    private String domain;
    
    @Column(name = "C_CANCELLATION_MODIFIEDBY")
    private String modifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_CANCELLATION_MODIFIEDON")
    private LocalDateTime modifiedon;
    
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;
    
    @Column(name = "C_CANCELLATIONTYPE_ID")
    private String cancellationtypeid;
    
    @Column(name = "C_CANCELREASON_ID")
    private String cancelreasonid;
    
    @Column(name = "C_SHIFT_ID")
    private String shiftid;
    
    @Column(name = "C_CANCELLATION_NOKA")
    private String noka;
    
    @Column(name = "C_CANCELLATION_TRAINNAME")
    private String trainname;
    
    @Column(name = "C_CANCELLATION_MAXPRINT")
    private Integer maxprint;
    
    @Column(name = "C_CANCELLATION_CANCELNUM")
    private String cancelnum;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_CANCELLATION_PRINTEDON")
    private LocalDateTime printedon;

    @Transient 
    private Stasiun stasiun;
    @Transient 
    private Cancellationtype cancellationtype;
    @Transient 
    private Transaction Transactioncancelled;
    @Transient 
    private Transaction Transactionnew;
    @Transient
    private Cancelreason cancelreason;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    @Transient 
    private List<Cancellationdet> listcancellationdet;
    @Transient
    private List<Transaction> listtransaction;

    @Transient
    private String bookcode;
    @Transient
    private String numcode;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTransactionidcancelled() {
        return transactionidcancelled;
    }

    public void setTransactionidcancelled(String transactionidcancelled) {
        this.transactionidcancelled = transactionidcancelled;
    }

    public String getTransactionidnew() {
        return transactionidnew;
    }

    public void setTransactionidnew(String transactionidnew) {
        this.transactionidnew = transactionidnew;
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

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getCancellationtypeid() {
        return cancellationtypeid;
    }

    public void setCancellationtypeid(String cancellationtypeid) {
        this.cancellationtypeid = cancellationtypeid;
    }

    public String getCancelreasonid() {
        return cancelreasonid;
    }

    public void setCancelreasonid(String cancelreasonid) {
        this.cancelreasonid = cancelreasonid;
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public Integer getMaxprint() {
        return maxprint;
    }

    public void setMaxprint(Integer maxprint) {
        this.maxprint = maxprint;
    }

    public String getCancelnum() {
        return cancelnum;
    }

    public void setCancelnum(String cancelnum) {
        this.cancelnum = cancelnum;
    }

    public LocalDateTime getPrintedon() {
        return printedon;
    }

    public void setPrintedon(LocalDateTime printedon) {
        this.printedon = printedon;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

    public Cancellationtype getCancellationtype() {
        return cancellationtype;
    }

    public void setCancellationtype(Cancellationtype cancellationtype) {
        this.cancellationtype = cancellationtype;
    }

    public Transaction getTransactioncancelled() {
        return Transactioncancelled;
    }

    public void setTransactioncancelled(Transaction Transactioncancelled) {
        this.Transactioncancelled = Transactioncancelled;
    }

    public Transaction getTransactionnew() {
        return Transactionnew;
    }

    public void setTransactionnew(Transaction Transactionnew) {
        this.Transactionnew = Transactionnew;
    }

    public Cancelreason getCancelreason() {
        return cancelreason;
    }

    public void setCancelreason(Cancelreason cancelreason) {
        this.cancelreason = cancelreason;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public List<Cancellationdet> getListcancellationdet() {
        return listcancellationdet;
    }

    public void setListcancellationdet(List<Cancellationdet> listcancellationdet) {
        this.listcancellationdet = listcancellationdet;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getNumcode() {
        return numcode;
    }

    public void setNumcode(String numcode) {
        this.numcode = numcode;
    }

    public List<Transaction> getListtransaction() {
        return listtransaction;
    }

    public void setListtransaction(List<Transaction> listtransaction) {
        this.listtransaction = listtransaction;
    }
}