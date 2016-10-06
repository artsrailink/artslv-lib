package co.id.artslv.lib.transactions;

import co.id.artslv.lib.org.Channel;
import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.org.Unit;
import co.id.artslv.lib.org.Unitfee;
import co.id.artslv.lib.payments.Bank;
import co.id.artslv.lib.schedule.Trip;
import co.id.artslv.lib.payments.Paytype;
import co.id.artslv.lib.trains.Subclass;
import co.id.artslv.lib.users.Shift;
import co.id.artslv.lib.users.User;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDate;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "KAIRTS_T_TRANSACTION")
public class Transaction implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRANSACTION_ID")
    private String id;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTION_DATE")
    private LocalDateTime date;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_TRANSACTION_DEPARTDATE")
    private LocalDate departdate;
    
    @Column(name = "C_TRANSACTION_PAYCODE")
    private String paycode;
    @Column(name = "C_TRANSACTION_TOTAMOUNT")
    private Long totamount;
    @Column(name = "C_TRANSACTION_STATUS")
    private String status;
    @Column(name = "C_TRANSACTION_DOMAIN")
    private String domain;
    @Column(name = "C_TRANSACTION_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTION_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_TRIP_ID")
    private String tripid;
    @Column(name = "C_TRANSACTION_BOOKCODE")
    private String bookcode;
    @Column(name = "C_TRANSACTION_PHONENUM")
    private String phonenum;
    @Column(name = "C_TRANSACTION_EMAIL")
    private String email;
    @Column(name = "C_TRANSACTION_REF1")
    private String ref1;
    @Column(name = "C_TRANSACTION_REF2")
    private String ref2;
    @Column(name = "C_TRANSACTION_REF3")
    private String ref3;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;
    @Column(name = "C_STASIUN_IDDEST")
    private String stasiuniddest;
    @Column(name = "C_SUBCLASS_ID")
    private String subclassid;
    @Column(name = "C_PAYTYPE_ID")
    private String paytypeid;
    @Column(name = "C_USER_IDBOOK")
    private String useridbook;
    @Column(name = "C_UNITFEE_ID")
    private String unitfeeid;
    @Column(name = "C_GRPRESERVATIONDET_ID")
    private String grpreservationdetid;
    @Column(name = "C_UNIT_IDBOOK")
    private String unitidbook;
    @Column(name = "C_UNIT_IDPAY")
    private String unitidpay;
    @Column(name = "C_BANK_ID")
    private String bankid;
    @Column(name = "C_USER_IDPAY")
    private String useridpay;
    @Column(name = "C_SHIFT_ID")
    private String shiftid;
    @Column(name = "C_TRANSACTION_TOTPSGADULT")
    private int totpsgadult;
    @Column(name = "C_TRANSACTION_TOTPSGCHILD")
    private int totpsgchild;
    @Column(name = "C_TRANSACTION_TOTPSGINFANT")
    private int totpsginfant;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTION_CREATEDON")
    private LocalDateTime createdon;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTION_BOOKTIMEOUTON")
    private LocalDateTime booktimeouton;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTION_PAYTIMEOUTON")
    private LocalDateTime paytimeouton;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTION_PAIDON")
    private LocalDateTime paidon;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_TRANSACTION_NOKA")
    private String noka;
    @Column(name = "C_TRANSACTION_TRAINNAME")
    private String trainname;
    @Column(name = "C_CHANNEL_ID")
    private String channelid;
    @Column(name = "C_TRANSACTION_EXTRAFEE")
    private Long extrafee;
    @Column(name = "C_TRANSACTION_PAIDAMOUNT")
    private long paidamount;

    @Column(name = "C_TRANSACTION_SMSSENT")
    private String smssent;
    @Column(name = "C_TRANSACTION_EMAILSENT")
    private String emailsent;
    @Column(name = "C_TRANSACTION_REROUTESTAT")
    private String reroutestat;
    @Column(name = "C_TRANSACTION_LOCALSTAT")
    private String localstat;

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

    public LocalDate getDepartdate() {
        return departdate;
    }

    public void setDepartdate(LocalDate departdate) {
        this.departdate = departdate;
    }

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public Long getTotamount() {
        return totamount;
    }

    public void setTotamount(Long totamount) {
        this.totamount = totamount;
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

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getPhonenum() {
        return phonenum;
    }

    public void setPhonenum(String phonenum) {
        this.phonenum = phonenum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public String getRef2() {
        return ref2;
    }

    public void setRef2(String ref2) {
        this.ref2 = ref2;
    }

    public String getRef3() {
        return ref3;
    }

    public void setRef3(String ref3) {
        this.ref3 = ref3;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuniddest() {
        return stasiuniddest;
    }

    public void setStasiuniddest(String stasiuniddest) {
        this.stasiuniddest = stasiuniddest;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(String paytypeid) {
        this.paytypeid = paytypeid;
    }

    public String getUseridbook() {
        return useridbook;
    }

    public void setUseridbook(String useridbook) {
        this.useridbook = useridbook;
    }

    public String getUnitfeeid() {
        return unitfeeid;
    }

    public void setUnitfeeid(String unitfeeid) {
        this.unitfeeid = unitfeeid;
    }

    public String getGrpreservationdetid() {
        return grpreservationdetid;
    }

    public void setGrpreservationdetid(String grpreservationdetid) {
        this.grpreservationdetid = grpreservationdetid;
    }

    public String getUnitidbook() {
        return unitidbook;
    }

    public void setUnitidbook(String unitidbook) {
        this.unitidbook = unitidbook;
    }

    public String getUnitidpay() {
        return unitidpay;
    }

    public void setUnitidpay(String unitidpay) {
        this.unitidpay = unitidpay;
    }

    public String getBankid() {
        return bankid;
    }

    public void setBankid(String bankid) {
        this.bankid = bankid;
    }

    public String getUseridpay() {
        return useridpay;
    }

    public void setUseridpay(String useridpay) {
        this.useridpay = useridpay;
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public int getTotpsgadult() {
        return totpsgadult;
    }

    public void setTotpsgadult(int totpsgadult) {
        this.totpsgadult = totpsgadult;
    }

    public int getTotpsgchild() {
        return totpsgchild;
    }

    public void setTotpsgchild(int totpsgchild) {
        this.totpsgchild = totpsgchild;
    }

    public int getTotpsginfant() {
        return totpsginfant;
    }

    public void setTotpsginfant(int totpsginfant) {
        this.totpsginfant = totpsginfant;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }

    public LocalDateTime getBooktimeouton() {
        return booktimeouton;
    }

    public void setBooktimeouton(LocalDateTime booktimeouton) {
        this.booktimeouton = booktimeouton;
    }

    public LocalDateTime getPaytimeouton() {
        return paytimeouton;
    }

    public void setPaytimeouton(LocalDateTime paytimeouton) {
        this.paytimeouton = paytimeouton;
    }

    public LocalDateTime getPaidon() {
        return paidon;
    }

    public void setPaidon(LocalDateTime paidon) {
        this.paidon = paidon;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
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

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public Long getExtrafee() {
        return extrafee;
    }

    public void setExtrafee(Long extrafee) {
        this.extrafee = extrafee;
    }

    public long getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(long paidamount) {
        this.paidamount = paidamount;
    }

    public String getSmssent() {
        return smssent;
    }

    public void setSmssent(String smssent) {
        this.smssent = smssent;
    }

    public String getEmailsent() {
        return emailsent;
    }

    public void setEmailsent(String emailsent) {
        this.emailsent = emailsent;
    }

    public String getReroutestat() {
        return reroutestat;
    }

    public void setReroutestat(String reroutestat) {
        this.reroutestat = reroutestat;
    }

    public String getLocalstat() {
        return localstat;
    }

    public void setLocalstat(String localstat) {
        this.localstat = localstat;
    }
}