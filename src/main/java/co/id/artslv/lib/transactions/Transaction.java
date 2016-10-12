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
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Transdate;

    @Column(name = "c_transaction_departdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
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
    private String TripDate;

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
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Bookedon;

    @Column(name = "c_transaction_booktimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Booktimeouton;

    @Column(name = "c_transaction_paytimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Paytimeouton;

    @Column(name = "c_transaction_paidon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Paidon;

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
    private Character Status;

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

    public void setBookcode(String Bookcode) {
        this.Bookcode = Bookcode;
    }

    public String getPaycode() {
        return Paycode;
    }

    public void setPaycode(String Paycode) {
        this.Paycode = Paycode;
    }

    public LocalDate getTransdate() {
        return Transdate;
    }

    public void setTransdate(LocalDate Transdate) {
        this.Transdate = Transdate;
    }

    public LocalDate getDepartdate() {
        return Departdate;
    }

    public void setDepartdate(LocalDate Departdate) {
        this.Departdate = Departdate;
    }

    public BigDecimal getTotamount() {
        return Totamount;
    }

    public void setTotamount(BigDecimal Totamount) {
        this.Totamount = Totamount;
    }

    public BigDecimal getExtrafee() {
        return Extrafee;
    }

    public void setExtrafee(BigDecimal Extrafee) {
        this.Extrafee = Extrafee;
    }

    public BigDecimal getNetamount() {
        return Netamount;
    }

    public void setNetamount(BigDecimal Netamount) {
        this.Netamount = Netamount;
    }

    public BigDecimal getPaidamount() {
        return Paidamount;
    }

    public void setPaidamount(BigDecimal Paidamount) {
        this.Paidamount = Paidamount;
    }

    public BigDecimal getCustname() {
        return Custname;
    }

    public void setCustname(BigDecimal Custname) {
        this.Custname = Custname;
    }

    public String getPhonenum() {
        return Phonenum;
    }

    public void setPhonenum(String Phonenum) {
        this.Phonenum = Phonenum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public double getTotpsgadult() {
        return Totpsgadult;
    }

    public void setTotpsgadult(double Totpsgadult) {
        this.Totpsgadult = Totpsgadult;
    }

    public Double getTotpsgchild() {
        return Totpsgchild;
    }

    public void setTotpsgchild(Double Totpsgchild) {
        this.Totpsgchild = Totpsgchild;
    }

    public Double getTotpsginfant() {
        return Totpsginfant;
    }

    public void setTotpsginfant(Double Totpsginfant) {
        this.Totpsginfant = Totpsginfant;
    }

    public String getStasiunIdorg() {
        return StasiunIdorg;
    }

    public void setStasiunIdorg(String StasiunIdorg) {
        this.StasiunIdorg = StasiunIdorg;
    }

    public String getStasiunCodeorg() {
        return StasiunCodeorg;
    }

    public void setStasiunCodeorg(String StasiunCodeorg) {
        this.StasiunCodeorg = StasiunCodeorg;
    }

    public String getStasiunIddes() {
        return StasiunIddes;
    }

    public void setStasiunIddes(String StasiunIddes) {
        this.StasiunIddes = StasiunIddes;
    }

    public String getStasiunCodedes() {
        return StasiunCodedes;
    }

    public void setStasiunCodedes(String StasiunCodedes) {
        this.StasiunCodedes = StasiunCodedes;
    }

    public String getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getScheduleNoka() {
        return ScheduleNoka;
    }

    public void setScheduleNoka(String ScheduleNoka) {
        this.ScheduleNoka = ScheduleNoka;
    }

    public Character getScheduleLocalstat() {
        return ScheduleLocalstat;
    }

    public void setScheduleLocalstat(Character ScheduleLocalstat) {
        this.ScheduleLocalstat = ScheduleLocalstat;
    }

    public Character getScheduleTrainname() {
        return ScheduleTrainname;
    }

    public void setScheduleTrainname(Character ScheduleTrainname) {
        this.ScheduleTrainname = ScheduleTrainname;
    }

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String TripId) {
        this.TripId = TripId;
    }

    public String getTripDate() {
        return TripDate;
    }

    public void setTripDate(String TripDate) {
        this.TripDate = TripDate;
    }

    public String getSubclassId() {
        return SubclassId;
    }

    public void setSubclassId(String SubclassId) {
        this.SubclassId = SubclassId;
    }

    public String getSubclassCode() {
        return SubclassCode;
    }

    public void setSubclassCode(String SubclassCode) {
        this.SubclassCode = SubclassCode;
    }

    public String getPaytypeId() {
        return PaytypeId;
    }

    public void setPaytypeId(String PaytypeId) {
        this.PaytypeId = PaytypeId;
    }

    public String getPaytypeCode() {
        return PaytypeCode;
    }

    public void setPaytypeCode(String PaytypeCode) {
        this.PaytypeCode = PaytypeCode;
    }

    public String getUserIdbook() {
        return UserIdbook;
    }

    public void setUserIdbook(String UserIdbook) {
        this.UserIdbook = UserIdbook;
    }

    public String getUserFullnamebook() {
        return UserFullnamebook;
    }

    public void setUserFullnamebook(String UserFullnamebook) {
        this.UserFullnamebook = UserFullnamebook;
    }

    public String getUnitIdbook() {
        return UnitIdbook;
    }

    public void setUnitIdbook(String UnitIdbook) {
        this.UnitIdbook = UnitIdbook;
    }

    public String getUnitCodebook() {
        return UnitCodebook;
    }

    public void setUnitCodebook(String UnitCodebook) {
        this.UnitCodebook = UnitCodebook;
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

    public void setChannelIdbook(String ChannelIdbook) {
        this.ChannelIdbook = ChannelIdbook;
    }

    public String getChannelCodebook() {
        return ChannelCodebook;
    }

    public void setChannelCodebook(String ChannelCodebook) {
        this.ChannelCodebook = ChannelCodebook;
    }

    public String getUserIdpay() {
        return UserIdpay;
    }

    public void setUserIdpay(String UserIdpay) {
        this.UserIdpay = UserIdpay;
    }

    public String getUserFullnamepay() {
        return UserFullnamepay;
    }

    public void setUserFullnamepay(String UserFullnamepay) {
        this.UserFullnamepay = UserFullnamepay;
    }

    public String getUnitIdpay() {
        return UnitIdpay;
    }

    public void setUnitIdpay(String UnitIdpay) {
        this.UnitIdpay = UnitIdpay;
    }

    public String getUnitCodepay() {
        return UnitCodepay;
    }

    public void setUnitCodepay(String UnitCodepay) {
        this.UnitCodepay = UnitCodepay;
    }

    public String getShiftIdpay() {
        return ShiftIdpay;
    }

    public void setShiftIdpay(String ShiftIdpay) {
        this.ShiftIdpay = ShiftIdpay;
    }

    public String getChannelIdpay() {
        return ChannelIdpay;
    }

    public void setChannelIdpay(String ChannelIdpay) {
        this.ChannelIdpay = ChannelIdpay;
    }

    public String getChannelCodepay() {
        return ChannelCodepay;
    }

    public void setChannelCodepay(String ChannelCodepay) {
        this.ChannelCodepay = ChannelCodepay;
    }

    public LocalDate getBookedon() {
        return Bookedon;
    }

    public void setBookedon(LocalDate Bookedon) {
        this.Bookedon = Bookedon;
    }

    public LocalDate getBooktimeouton() {
        return Booktimeouton;
    }

    public void setBooktimeouton(LocalDate Booktimeouton) {
        this.Booktimeouton = Booktimeouton;
    }

    public LocalDate getPaytimeouton() {
        return Paytimeouton;
    }

    public void setPaytimeouton(LocalDate Paytimeouton) {
        this.Paytimeouton = Paytimeouton;
    }

    public LocalDate getPaidon() {
        return Paidon;
    }

    public void setPaidon(LocalDate Paidon) {
        this.Paidon = Paidon;
    }

    public Character getSmsbooksent() {
        return Smsbooksent;
    }

    public void setSmsbooksent(Character Smsbooksent) {
        this.Smsbooksent = Smsbooksent;
    }

    public Character getEmailbooksent() {
        return Emailbooksent;
    }

    public void setEmailbooksent(Character Emailbooksent) {
        this.Emailbooksent = Emailbooksent;
    }

    public Character getSmspaysent() {
        return Smspaysent;
    }

    public void setSmspaysent(Character Smspaysent) {
        this.Smspaysent = Smspaysent;
    }

    public Character getEmailpaysent() {
        return Emailpaysent;
    }

    public void setEmailpaysent(Character Emailpaysent) {
        this.Emailpaysent = Emailpaysent;
    }

    public Character getReroutestat() {
        return Reroutestat;
    }

    public void setReroutestat(Character Reroutestat) {
        this.Reroutestat = Reroutestat;
    }

    public Character getFlexiredeemstat() {
        return Flexiredeemstat;
    }

    public void setFlexiredeemstat(Character Flexiredeemstat) {
        this.Flexiredeemstat = Flexiredeemstat;
    }

    public String getRef1() {
        return Ref1;
    }

    public void setRef1(String Ref1) {
        this.Ref1 = Ref1;
    }

    public String getRef2() {
        return Ref2;
    }

    public void setRef2(String Ref2) {
        this.Ref2 = Ref2;
    }

    public String getRef3() {
        return Ref3;
    }

    public void setRef3(String Ref3) {
        this.Ref3 = Ref3;
    }

    public String getVoucherId() {
        return VoucherId;
    }

    public void setVoucherId(String VoucherId) {
        this.VoucherId = VoucherId;
    }

    public String getVoucherCode() {
        return VoucherCode;
    }

    public void setVoucherCode(String VoucherCode) {
        this.VoucherCode = VoucherCode;
    }

    public String getVoucherAmount() {
        return VoucherAmount;
    }

    public void setVoucherAmount(String VoucherAmount) {
        this.VoucherAmount = VoucherAmount;
    }

    public String getVoucherAmounttype() {
        return VoucherAmounttype;
    }

    public void setVoucherAmounttype(String VoucherAmounttype) {
        this.VoucherAmounttype = VoucherAmounttype;
    }

    public String getVoucherAmountconvert() {
        return VoucherAmountconvert;
    }

    public void setVoucherAmountconvert(String VoucherAmountconvert) {
        this.VoucherAmountconvert = VoucherAmountconvert;
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

        
}
