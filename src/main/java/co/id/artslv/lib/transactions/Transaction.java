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
    private String Bookcode;

    @Column(name = "c_transaction_paycode")
    private String Paycode;

    @Column(name = "c_transaction_transdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Transdate;

    private LocalDate Departdate;

    @Column(name = "c_transaction_totamount")
    private BigDecimal Totamount;

    @Column(name = "c_transaction_extrafee")
    private BigDecimal Extrafee;

    @Column(name = "c_transaction_netamount")
    private BigDecimal Netamount;

    @Column(name = "c_transaction_paidamount")
    private BigDecimal Paidamount;

    @Column(name = "c_transaction_custname")
    private BigDecimal Custname;

    @Column(name = "c_transaction_phonenum")
    private String Phonenum;

    @Column(name = "c_transaction_email")
    private String Email;

    @Column(name = "c_transaction_totpsgadult")
    private double Totpsgadult;

    @Column(name = "c_transaction_totpsgchild")
    private Double Totpsgchild;

    @Column(name = "c_transaction_totpsginfant")
    private Double Totpsginfant;

    @Column(name = "c_stasiun_idorg")
    private String StasiunIdorg;

    @Column(name = "c_stasiun_codeorg")
    private String StasiunCodeorg;

    @Column(name = "c_stasiun_iddes")
    private String StasiunIddes;

    @Column(name = "c_stasiun_codedes")
    private String StasiunCodedes;

    @Column(name = "c_schedule_id")
    private String ScheduleId;

    @Column(name = "c_schedule_noka")
    private String ScheduleNoka;

    @Column(name = "c_schedule_localstat")
    private Character ScheduleLocalstat;

    @Column(name = "c_schedule_trainname")
    private Character ScheduleTrainname;

    @Column(name = "c_trip_id")
    private String TripId;

    @Column(name = "c_trip_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate TripDate;

    @Column(name = "c_subclass_id")
    private String SubclassId;

    @Column(name = "c_subclass_code")
    private String SubclassCode;

    @Column(name = "c_paytype_id")
    private String PaytypeId;

    @Column(name = "c_paytype_code")
    private String PaytypeCode;

    @Column(name = "c_user_idbook")
    private String UserIdbook;

    @Column(name = "c_user_fullnamebook")
    private String UserFullnamebook;

    @Column(name = "c_unit_idbook")
    private String UnitIdbook;

    @Column(name = "c_unit_codebook")
    private String UnitCodebook;

    @Column(name = "c_shift_idbook")
    private String cShiftIdbook;

    @Column(name = "c_channel_idbook")
    private String ChannelIdbook;

    @Column(name = "c_channel_codebook")
    private String ChannelCodebook;

    @Column(name = "c_user_idpay")
    private String UserIdpay;

    @Column(name = "c_user_fullnamepay")
    private String UserFullnamepay;

    @Column(name = "c_unit_idpay")
    private String UnitIdpay;

    @Column(name = "c_unit_codepay")
    private String UnitCodepay;

    @Column(name = "c_shift_idpay")
    private String ShiftIdpay;

    @Column(name = "c_channel_idpay")
    private String ChannelIdpay;

    @Column(name = "c_channel_codepay")
    private String ChannelCodepay;

    @Column(name = "c_transaction_bookedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Bookedon;

    @Column(name = "c_transaction_booktimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Booktimeouton;

    @Column(name = "c_transaction_paytimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Paytimeouton;

    @Column(name = "c_transaction_paidon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Paidon;

    @Column(name = "c_transaction_smsbooksent")
    private Character Smsbooksent;

    @Column(name = "c_transaction_emailbooksent")
    private Character Emailbooksent;

    @Column(name = "c_transaction_smspaysent")
    private Character Smspaysent;

    @Column(name = "c_transaction_emailpaysent")
    private Character Emailpaysent;

    @Column(name = "c_transaction_reroutestat")
    private Character Reroutestat;

    @Column(name = "c_transaction_flexiredeemstat")
    private Character Flexiredeemstat;

    @Column(name = "c_transaction_ref1")
    private String Ref1;

    @Column(name = "c_transaction_ref2")
    private String Ref2;

    @Column(name = "c_transaction_ref3")
    private String Ref3;

    @Column(name = "c_voucher_id")
    private String VoucherId;

    @Column(name = "c_voucher_code")
    private String VoucherCode;

    @Column(name = "c_voucher_amount")
    private String VoucherAmount;

    @Column(name = "c_voucher_amounttype")
    private String VoucherAmounttype;

    @Column(name = "c_voucher_amountconvert")
    private String VoucherAmountconvert;

    @Column(name = "c_transaction_status")
    private String Status;

    @Column(name = "c_transaction_domain")
    private String Domain;

    @Column(name = "c_transaction_createdby")
    private String Createdby;

    @Column(name = "c_transaction_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    @Column(name = "c_transaction_modifiedby")
    private String Modifiedby;

    @Column(name = "c_transaction_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookcode() {
        return Bookcode;
    }

    public void setBookcode(String bookcode) {
        Bookcode = bookcode;
    }

    public String getPaycode() {
        return Paycode;
    }

    public void setPaycode(String paycode) {
        Paycode = paycode;
    }

    public LocalDateTime getTransdate() {
        return Transdate;
    }

    public void setTransdate(LocalDateTime transdate) {
        Transdate = transdate;
    }

    public LocalDate getDepartdate() {
        return Departdate;
    }

    public void setDepartdate(LocalDate departdate) {
        Departdate = departdate;
    }

    public BigDecimal getTotamount() {
        return Totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        Totamount = totamount;
    }

    public BigDecimal getExtrafee() {
        return Extrafee;
    }

    public void setExtrafee(BigDecimal extrafee) {
        Extrafee = extrafee;
    }

    public BigDecimal getNetamount() {
        return Netamount;
    }

    public void setNetamount(BigDecimal netamount) {
        Netamount = netamount;
    }

    public BigDecimal getPaidamount() {
        return Paidamount;
    }

    public void setPaidamount(BigDecimal paidamount) {
        Paidamount = paidamount;
    }

    public BigDecimal getCustname() {
        return Custname;
    }

    public void setCustname(BigDecimal custname) {
        Custname = custname;
    }

    public String getPhonenum() {
        return Phonenum;
    }

    public void setPhonenum(String phonenum) {
        Phonenum = phonenum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public double getTotpsgadult() {
        return Totpsgadult;
    }

    public void setTotpsgadult(double totpsgadult) {
        Totpsgadult = totpsgadult;
    }

    public Double getTotpsgchild() {
        return Totpsgchild;
    }

    public void setTotpsgchild(Double totpsgchild) {
        Totpsgchild = totpsgchild;
    }

    public Double getTotpsginfant() {
        return Totpsginfant;
    }

    public void setTotpsginfant(Double totpsginfant) {
        Totpsginfant = totpsginfant;
    }

    public String getStasiunIdorg() {
        return StasiunIdorg;
    }

    public void setStasiunIdorg(String stasiunIdorg) {
        StasiunIdorg = stasiunIdorg;
    }

    public String getStasiunCodeorg() {
        return StasiunCodeorg;
    }

    public void setStasiunCodeorg(String stasiunCodeorg) {
        StasiunCodeorg = stasiunCodeorg;
    }

    public String getStasiunIddes() {
        return StasiunIddes;
    }

    public void setStasiunIddes(String stasiunIddes) {
        StasiunIddes = stasiunIddes;
    }

    public String getStasiunCodedes() {
        return StasiunCodedes;
    }

    public void setStasiunCodedes(String stasiunCodedes) {
        StasiunCodedes = stasiunCodedes;
    }

    public String getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(String scheduleId) {
        ScheduleId = scheduleId;
    }

    public String getScheduleNoka() {
        return ScheduleNoka;
    }

    public void setScheduleNoka(String scheduleNoka) {
        ScheduleNoka = scheduleNoka;
    }

    public Character getScheduleLocalstat() {
        return ScheduleLocalstat;
    }

    public void setScheduleLocalstat(Character scheduleLocalstat) {
        ScheduleLocalstat = scheduleLocalstat;
    }

    public Character getScheduleTrainname() {
        return ScheduleTrainname;
    }

    public void setScheduleTrainname(Character scheduleTrainname) {
        ScheduleTrainname = scheduleTrainname;
    }

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String tripId) {
        TripId = tripId;
    }

    public LocalDate getTripDate() {
        return TripDate;
    }

    public void setTripDate(LocalDate tripDate) {
        TripDate = tripDate;
    }

    public String getSubclassId() {
        return SubclassId;
    }

    public void setSubclassId(String subclassId) {
        SubclassId = subclassId;
    }

    public String getSubclassCode() {
        return SubclassCode;
    }

    public void setSubclassCode(String subclassCode) {
        SubclassCode = subclassCode;
    }

    public String getPaytypeId() {
        return PaytypeId;
    }

    public void setPaytypeId(String paytypeId) {
        PaytypeId = paytypeId;
    }

    public String getPaytypeCode() {
        return PaytypeCode;
    }

    public void setPaytypeCode(String paytypeCode) {
        PaytypeCode = paytypeCode;
    }

    public String getUserIdbook() {
        return UserIdbook;
    }

    public void setUserIdbook(String userIdbook) {
        UserIdbook = userIdbook;
    }

    public String getUserFullnamebook() {
        return UserFullnamebook;
    }

    public void setUserFullnamebook(String userFullnamebook) {
        UserFullnamebook = userFullnamebook;
    }

    public String getUnitIdbook() {
        return UnitIdbook;
    }

    public void setUnitIdbook(String unitIdbook) {
        UnitIdbook = unitIdbook;
    }

    public String getUnitCodebook() {
        return UnitCodebook;
    }

    public void setUnitCodebook(String unitCodebook) {
        UnitCodebook = unitCodebook;
    }

    public String getcShiftIdbook() {
        return cShiftIdbook;
    }

    public void setcShiftIdbook(String cShiftIdbook) {
        this.cShiftIdbook = cShiftIdbook;
    }

    public String getChannelIdbook() {
        return ChannelIdbook;
    }

    public void setChannelIdbook(String channelIdbook) {
        ChannelIdbook = channelIdbook;
    }

    public String getChannelCodebook() {
        return ChannelCodebook;
    }

    public void setChannelCodebook(String channelCodebook) {
        ChannelCodebook = channelCodebook;
    }

    public String getUserIdpay() {
        return UserIdpay;
    }

    public void setUserIdpay(String userIdpay) {
        UserIdpay = userIdpay;
    }

    public String getUserFullnamepay() {
        return UserFullnamepay;
    }

    public void setUserFullnamepay(String userFullnamepay) {
        UserFullnamepay = userFullnamepay;
    }

    public String getUnitIdpay() {
        return UnitIdpay;
    }

    public void setUnitIdpay(String unitIdpay) {
        UnitIdpay = unitIdpay;
    }

    public String getUnitCodepay() {
        return UnitCodepay;
    }

    public void setUnitCodepay(String unitCodepay) {
        UnitCodepay = unitCodepay;
    }

    public String getShiftIdpay() {
        return ShiftIdpay;
    }

    public void setShiftIdpay(String shiftIdpay) {
        ShiftIdpay = shiftIdpay;
    }

    public String getChannelIdpay() {
        return ChannelIdpay;
    }

    public void setChannelIdpay(String channelIdpay) {
        ChannelIdpay = channelIdpay;
    }

    public String getChannelCodepay() {
        return ChannelCodepay;
    }

    public void setChannelCodepay(String channelCodepay) {
        ChannelCodepay = channelCodepay;
    }

    public LocalDateTime getBookedon() {
        return Bookedon;
    }

    public void setBookedon(LocalDateTime bookedon) {
        Bookedon = bookedon;
    }

    public LocalDateTime getBooktimeouton() {
        return Booktimeouton;
    }

    public void setBooktimeouton(LocalDateTime booktimeouton) {
        Booktimeouton = booktimeouton;
    }

    public LocalDateTime getPaytimeouton() {
        return Paytimeouton;
    }

    public void setPaytimeouton(LocalDateTime paytimeouton) {
        Paytimeouton = paytimeouton;
    }

    public LocalDateTime getPaidon() {
        return Paidon;
    }

    public void setPaidon(LocalDateTime paidon) {
        Paidon = paidon;
    }

    public Character getSmsbooksent() {
        return Smsbooksent;
    }

    public void setSmsbooksent(Character smsbooksent) {
        Smsbooksent = smsbooksent;
    }

    public Character getEmailbooksent() {
        return Emailbooksent;
    }

    public void setEmailbooksent(Character emailbooksent) {
        Emailbooksent = emailbooksent;
    }

    public Character getSmspaysent() {
        return Smspaysent;
    }

    public void setSmspaysent(Character smspaysent) {
        Smspaysent = smspaysent;
    }

    public Character getEmailpaysent() {
        return Emailpaysent;
    }

    public void setEmailpaysent(Character emailpaysent) {
        Emailpaysent = emailpaysent;
    }

    public Character getReroutestat() {
        return Reroutestat;
    }

    public void setReroutestat(Character reroutestat) {
        Reroutestat = reroutestat;
    }

    public Character getFlexiredeemstat() {
        return Flexiredeemstat;
    }

    public void setFlexiredeemstat(Character flexiredeemstat) {
        Flexiredeemstat = flexiredeemstat;
    }

    public String getRef1() {
        return Ref1;
    }

    public void setRef1(String ref1) {
        Ref1 = ref1;
    }

    public String getRef2() {
        return Ref2;
    }

    public void setRef2(String ref2) {
        Ref2 = ref2;
    }

    public String getRef3() {
        return Ref3;
    }

    public void setRef3(String ref3) {
        Ref3 = ref3;
    }

    public String getVoucherId() {
        return VoucherId;
    }

    public void setVoucherId(String voucherId) {
        VoucherId = voucherId;
    }

    public String getVoucherCode() {
        return VoucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        VoucherCode = voucherCode;
    }

    public String getVoucherAmount() {
        return VoucherAmount;
    }

    public void setVoucherAmount(String voucherAmount) {
        VoucherAmount = voucherAmount;
    }

    public String getVoucherAmounttype() {
        return VoucherAmounttype;
    }

    public void setVoucherAmounttype(String voucherAmounttype) {
        VoucherAmounttype = voucherAmounttype;
    }

    public String getVoucherAmountconvert() {
        return VoucherAmountconvert;
    }

    public void setVoucherAmountconvert(String voucherAmountconvert) {
        VoucherAmountconvert = voucherAmountconvert;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }


    public String getDomain() {
        return Domain;
    }

    public void setDomain(String domain) {
        Domain = domain;
    }

    public String getCreatedby() {
        return Createdby;
    }

    public void setCreatedby(String createdby) {
        Createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return Createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        Createdon = createdon;
    }

    public String getModifiedby() {
        return Modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        Modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        Modifiedon = modifiedon;
    }
}
