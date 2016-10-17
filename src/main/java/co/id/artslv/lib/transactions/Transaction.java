package co.id.artslv.lib.transactions;

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
@Table(name = "arts_t_transaction")
public class Transaction {

    @Column(name = "c_transaction_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_transaction_bookcode")
    private String bookcode;

    @Column(name = "c_transaction_paycode")
    private String paycode;

    @Column(name = "c_transaction_transdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime transdate;

    @Column(name = "c_transaction_departdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate departdate;

    @Column(name = "c_transaction_totamount")
    private Double totamount;

    @Column(name = "c_transaction_extrafee")
    private Double extrafee;

    @Column(name = "c_transaction_netamount")
    private Double netamount;

    @Column(name = "c_transaction_paidamount")
    private Double paidamount;

    @Column(name = "c_transaction_custname")
    private String custname;

    @Column(name = "c_transaction_phonenum")
    private String phonenum;

    @Column(name = "c_transaction_email")
    private String email;

    @Column(name = "c_transaction_totpsgadult")
    private int totpsgadult;

    @Column(name = "c_transaction_totpsgchild")
    private int totpsgchild;

    @Column(name = "c_transaction_totpsginfant")
    private int totpsginfant;

    @Column(name = "c_stasiun_idorg")
    private String stasiunidorg;

    @Column(name = "c_stasiun_codeorg")
    private String stasiuncodeorg;

    @Column(name = "c_stasiun_iddes")
    private String stasiuniddes;

    @Column(name = "c_stasiun_codedes")
    private String stasiuncodedes;

    @Column(name = "c_schedule_id")
    private String scheduleid;

    @Column(name = "c_schedule_noka")
    private String schedulenoka;

    @Column(name = "c_schedule_localstat")
    private String schedulelocalstat;

    @Column(name = "c_schedule_trainname")
    private String scheduleTrainname;

    @Column(name = "c_trip_id")
    private String tripid;

    @Column(name = "c_trip_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name = "c_subclass_id")
    private String subclassid;

    @Column(name = "c_subclass_code")
    private String subclasscode;

    @Column(name = "c_paytype_id")
    private String paytypeid;

    @Column(name = "c_paytype_code")
    private String paytypecode;

    @Column(name = "c_user_idbook")
    private String useridbook;

    @Column(name = "c_user_fullnamebook")
    private String userfullnamebook;

    @Column(name = "c_unit_idbook")
    private String unitidbook;

    @Column(name = "c_unit_codebook")
    private String unitcodebook;

    @Column(name = "c_shift_idbook")
    private String shiftidbook;

    @Column(name = "c_channel_idbook")
    private String channelidbook;

    @Column(name = "c_channel_codebook")
    private String channelcodebook;

    @Column(name = "c_user_idpay")
    private String useridpay;

    @Column(name = "c_user_fullnamepay")
    private String userfullnamepay;

    @Column(name = "c_unit_idpay")
    private String unitidpay;

    @Column(name = "c_unit_codepay")
    private String unitcodepay;

    @Column(name = "c_shift_idpay")
    private String shiftidpay;

    @Column(name = "c_channel_idpay")
    private String channelidpay;

    @Column(name = "c_channel_codepay")
    private String channelcodepay;

    @Column(name = "c_transaction_bookedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime bookedon;

    @Column(name = "c_transaction_booktimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime booktimeouton;

    @Column(name = "c_transaction_paytimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime paytimeouton;

    @Column(name = "c_transaction_paidon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime paidon;

    @Column(name = "c_transaction_smsbooksent")
    private String smsbooksent;

    @Column(name = "c_transaction_emailbooksent")
    private String emailbooksent;

    @Column(name = "c_transaction_smspaysent")
    private String smspaysent;

    @Column(name = "c_transaction_emailpaysent")
    private String emailpaysent;

    @Column(name = "c_transaction_reroutestat")
    private String reroutestat;

    @Column(name = "c_transaction_flexiredeemstat")
    private String flexiredeemstat;

    @Column(name = "c_transaction_ref1")
    private String ref1;

    @Column(name = "c_transaction_ref2")
    private String ref2;

    @Column(name = "c_transaction_ref3")
    private String ref3;

    @Column(name = "c_voucher_id")
    private String voucherid;

    @Column(name = "c_voucher_code")
    private String vouchercode;

    @Column(name = "c_voucher_amount")
    private String voucheramount;

    @Column(name = "c_voucher_amounttype")
    private String voucheramounttype;

    @Column(name = "c_voucher_amountconvert")
    private String voucheramountconvert;

    @Column(name = "c_transaction_status")
    private String status;

    @Column(name = "c_transaction_domain")
    private String domain;

    @Column(name = "c_transaction_createdby")
    private String createdby;

    @Column(name = "c_transaction_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    @Column(name = "c_transaction_modifiedby")
    private String modifiedby;

    @Column(name = "c_transaction_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public LocalDateTime getTransdate() {
        return transdate;
    }

    public void setTransdate(LocalDateTime transdate) {
        this.transdate = transdate;
    }

    public LocalDate getDepartdate() {
        return departdate;
    }

    public void setDepartdate(LocalDate departdate) {
        this.departdate = departdate;
    }

    public Double getTotamount() {
        return totamount;
    }

    public void setTotamount(Double totamount) {
        this.totamount = totamount;
    }

    public Double getExtrafee() {
        return extrafee;
    }

    public void setExtrafee(Double extrafee) {
        this.extrafee = extrafee;
    }

    public Double getNetamount() {
        return netamount;
    }

    public void setNetamount(Double netamount) {
        this.netamount = netamount;
    }

    public Double getPaidamount() {
        return paidamount;
    }

    public void setPaidamount(Double paidamount) {
        this.paidamount = paidamount;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
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

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuncodeorg() {
        return stasiuncodeorg;
    }

    public void setStasiuncodeorg(String stasiuncodeorg) {
        this.stasiuncodeorg = stasiuncodeorg;
    }

    public String getStasiuniddes() {
        return stasiuniddes;
    }

    public void setStasiuniddes(String stasiuniddes) {
        this.stasiuniddes = stasiuniddes;
    }

    public String getStasiuncodedes() {
        return stasiuncodedes;
    }

    public void setStasiuncodedes(String stasiuncodedes) {
        this.stasiuncodedes = stasiuncodedes;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getSchedulenoka() {
        return schedulenoka;
    }

    public void setSchedulenoka(String schedulenoka) {
        this.schedulenoka = schedulenoka;
    }

    public String getSchedulelocalstat() {
        return schedulelocalstat;
    }

    public void setSchedulelocalstat(String schedulelocalstat) {
        this.schedulelocalstat = schedulelocalstat;
    }

    public String getScheduleTrainname() {
        return scheduleTrainname;
    }

    public void setScheduleTrainname(String scheduleTrainname) {
        this.scheduleTrainname = scheduleTrainname;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public String getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(String paytypeid) {
        this.paytypeid = paytypeid;
    }

    public String getPaytypecode() {
        return paytypecode;
    }

    public void setPaytypecode(String paytypecode) {
        this.paytypecode = paytypecode;
    }

    public String getUseridbook() {
        return useridbook;
    }

    public void setUseridbook(String useridbook) {
        this.useridbook = useridbook;
    }

    public String getUserfullnamebook() {
        return userfullnamebook;
    }

    public void setUserfullnamebook(String userfullnamebook) {
        this.userfullnamebook = userfullnamebook;
    }

    public String getUnitidbook() {
        return unitidbook;
    }

    public void setUnitidbook(String unitidbook) {
        this.unitidbook = unitidbook;
    }

    public String getUnitcodebook() {
        return unitcodebook;
    }

    public void setUnitcodebook(String unitcodebook) {
        this.unitcodebook = unitcodebook;
    }

    public String getShiftidbook() {
        return shiftidbook;
    }

    public void setShiftidbook(String shiftidbook) {
        this.shiftidbook = shiftidbook;
    }

    public String getChannelidbook() {
        return channelidbook;
    }

    public void setChannelidbook(String channelidbook) {
        this.channelidbook = channelidbook;
    }

    public String getChannelcodebook() {
        return channelcodebook;
    }

    public void setChannelcodebook(String channelcodebook) {
        this.channelcodebook = channelcodebook;
    }

    public String getUseridpay() {
        return useridpay;
    }

    public void setUseridpay(String useridpay) {
        this.useridpay = useridpay;
    }

    public String getUserfullnamepay() {
        return userfullnamepay;
    }

    public void setUserfullnamepay(String userfullnamepay) {
        this.userfullnamepay = userfullnamepay;
    }

    public String getUnitidpay() {
        return unitidpay;
    }

    public void setUnitidpay(String unitidpay) {
        this.unitidpay = unitidpay;
    }

    public String getUnitcodepay() {
        return unitcodepay;
    }

    public void setUnitcodepay(String unitcodepay) {
        this.unitcodepay = unitcodepay;
    }

    public String getShiftidpay() {
        return shiftidpay;
    }

    public void setShiftidpay(String shiftidpay) {
        this.shiftidpay = shiftidpay;
    }

    public String getChannelidpay() {
        return channelidpay;
    }

    public void setChannelidpay(String channelidpay) {
        this.channelidpay = channelidpay;
    }

    public String getChannelcodepay() {
        return channelcodepay;
    }

    public void setChannelcodepay(String channelcodepay) {
        this.channelcodepay = channelcodepay;
    }

    public LocalDateTime getBookedon() {
        return bookedon;
    }

    public void setBookedon(LocalDateTime bookedon) {
        this.bookedon = bookedon;
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

    public String getSmsbooksent() {
        return smsbooksent;
    }

    public void setSmsbooksent(String smsbooksent) {
        this.smsbooksent = smsbooksent;
    }

    public String getEmailbooksent() {
        return emailbooksent;
    }

    public void setEmailbooksent(String emailbooksent) {
        this.emailbooksent = emailbooksent;
    }

    public String getSmspaysent() {
        return smspaysent;
    }

    public void setSmspaysent(String smspaysent) {
        this.smspaysent = smspaysent;
    }

    public String getEmailpaysent() {
        return emailpaysent;
    }

    public void setEmailpaysent(String emailpaysent) {
        this.emailpaysent = emailpaysent;
    }

    public String getReroutestat() {
        return reroutestat;
    }

    public void setReroutestat(String reroutestat) {
        this.reroutestat = reroutestat;
    }

    public String getFlexiredeemstat() {
        return flexiredeemstat;
    }

    public void setFlexiredeemstat(String flexiredeemstat) {
        this.flexiredeemstat = flexiredeemstat;
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

    public String getVoucherid() {
        return voucherid;
    }

    public void setVoucherid(String voucherid) {
        this.voucherid = voucherid;
    }

    public String getVouchercode() {
        return vouchercode;
    }

    public void setVouchercode(String vouchercode) {
        this.vouchercode = vouchercode;
    }

    public String getVoucheramount() {
        return voucheramount;
    }

    public void setVoucheramount(String voucheramount) {
        this.voucheramount = voucheramount;
    }

    public String getVoucheramounttype() {
        return voucheramounttype;
    }

    public void setVoucheramounttype(String voucheramounttype) {
        this.voucheramounttype = voucheramounttype;
    }

    public String getVoucheramountconvert() {
        return voucheramountconvert;
    }

    public void setVoucheramountconvert(String voucheramountconvert) {
        this.voucheramountconvert = voucheramountconvert;
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

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
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


}
