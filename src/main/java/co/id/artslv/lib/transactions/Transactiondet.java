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
 * @author  root
 */

@Entity
@Table(name="arts_t_transactiondet")
public class Transactiondet {

    @Column(name="c_transactiondet_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name="c_transaction_id",table="arts_t_transactiondet",nullable=false,length=36)
    private String TransactionId;

    @Column(name="c_transaction_bookcode",table="arts_t_transactiondet",nullable=false,length=20)
    private String TransactionBookcode;

    @Column(name="c_transaction_paycode",table="arts_t_transactiondet",nullable=false,length=20)
    private String TransactionPaycode;

    @Column(name="c_transaction_transdate",table="arts_t_transactiondet",nullable=false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate TransactionTransdate;

    @Column(name="c_transaction_custname",table="arts_t_transactiondet",nullable=false,scale=2,precision=11)
    private BigDecimal TransactionCustname;

    @Column(name="c_transaction_phonenum",table="arts_t_transactiondet",length=36)
    private String TransactionPhonenum;

    @Column(name="c_transaction_email",table="arts_t_transactiondet",length=100)
    private String TransactionEmail;

    @Column(name="c_stasiun_idorg",table="arts_t_transactiondet",nullable=false,length=36)
    private String StasiunIdorg;

    @Column(name="c_stasiun_codeorg",table="arts_t_transactiondet",nullable=false,length=36)
    private String StasiunCodeorg;

    @Column(name="c_stasiun_iddes",table="arts_t_transactiondet",nullable=false,length=36)
    private String StasiunIddes;

    @Column(name="c_stasiun_codedes",table="arts_t_transactiondet",nullable=false,length=36)
    private String StasiunCodedes;

    @Column(name="c_schedule_id",table="arts_t_transactiondet",nullable=false,length=36)
    private String ScheduleId;

    @Column(name="c_schedule_noka",table="arts_t_transactiondet",nullable=false,length=50)
    private String ScheduleNoka;

    @Column(name="c_schedule_localstat",table="arts_t_transactiondet",nullable=false)
    private Character ScheduleLocalstat;

    @Column(name="c_schedule_trainname",table="arts_t_transactiondet",nullable=false)
    private Character ScheduleTrainname;

    @Column(name="c_trip_id",table="arts_t_transactiondet",nullable=false,length=36)
    private String TripId;

    @Column(name="c_trip_date",table="arts_t_transactiondet",nullable=false,length=36)
    private String TripDate;

    @Column(name="c_subclass_id",table="arts_t_transactiondet",nullable=false,length=36)
    private String SubclassId;

    @Column(name="c_subclass_code",table="arts_t_transactiondet",nullable=false,length=36)
    private String SubclassCode;

    @Column(name="c_user_idbook",table="arts_t_transactiondet",nullable=false,length=36)
    private String UserIdbook;

    @Column(name="c_user_fullnamebook",table="arts_t_transactiondet",nullable=false,length=36)
    private String UserFullnamebook;

    @Column(name="c_unit_idbook",table="arts_t_transactiondet",length=36)
    private String UnitIdbook;

    @Column(name="c_unit_codebook",table="arts_t_transactiondet",length=36)
    private String UnitCodebook;

    @Column(name="c_shift_idbook",table="arts_t_transactiondet",length=36)
    private String ShiftIdbook;

    @Column(name="c_channel_idbook",table="arts_t_transactiondet",nullable=false,length=36)
    private String ChannelIdbook;

    @Column(name="c_channel_codebook",table="arts_t_transactiondet",nullable=false,length=36)
    private String ChannelCodebook;

    @Column(name="c_user_idpay",table="arts_t_transactiondet",length=36)
    private String UserIdpay;

    @Column(name="c_user_fullnamepay",table="arts_t_transactiondet",length=36)
    private String UserFullnamepay;

    @Column(name="c_unit_idpay",table="arts_t_transactiondet",length=36)
    private String UnitIdpay;

    @Column(name="c_unit_codepay",table="arts_t_transactiondet",length=36)
    private String UnitCodepay;

    @Column(name="c_shift_idpay",table="arts_t_transactiondet",length=36)
    private String ShiftIdpay;

    @Column(name="c_channel_idpay",table="arts_t_transactiondet",nullable=false,length=36)
    private String ChannelIdpay;

    @Column(name="c_channel_codepay",table="arts_t_transactiondet",nullable=false,length=36)
    private String ChannelCodepay;

    @Column(name="c_transaction_bookedon",table="arts_t_transactiondet")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate TransactionBookedon;

    @Column(name="c_transaction_booktimeouton",table="arts_t_transactiondet")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate TransactionBooktimeouton;

    @Column(name="c_transaction_paytimeouton",table="arts_t_transactiondet")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate TransactionPaytimeouton;

    @Column(name="c_transaction_paidon",table="arts_t_transactiondet")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate TransactionPaidon;

    @Column(name="c_transaction_reroutestat",table="arts_t_transactiondet")
    private Character TransactionReroutestat;

    @Column(name="c_transaction_flexiredeemstat",table="arts_t_transactiondet")
    private Character cransactionFlexiredeemstat;

    @Column(name="c_transactiondet_psgname",table="arts_t_transactiondet",nullable=false,length=100)
    private String Psgname;

    @Column(name="c_transactiondet_psgid",table="arts_t_transactiondet",nullable=false,length=50)
    private String Psgid;

    @Column(name="c_stamformdet_id",table="arts_t_transactiondet",length=36)
    private String StamformdetId;

    @Column(name="c_stamformdet_code",table="arts_t_transactiondet",length=36)
    private String StamformdetCode;

    @Column(name="c_wagondet_id",table="arts_t_transactiondet",length=36)
    private String WagondetId;

    @Column(name="c_wagondet_row",table="arts_t_transactiondet",length=36)
    private String WagondetRow;

    @Column(name="c_wagondet_col",table="arts_t_transactiondet",length=36)
    private String WagondetCol;

    @Column(name="c_transactiondet_amount",table="arts_t_transactiondet",nullable=false,scale=2,precision=11)
    private BigDecimal Amount;

    @Column(name="c_transactiondet_ticketnum",table="arts_t_transactiondet",length=50)
    private String Ticketnum;

    @Column(name="c_member_id",table="arts_t_transactiondet",length=36)
    private String MemberId;

    @Column(name="c_reduction_id",table="arts_t_transactiondet",length=36)
    private String ReductionId;

    @Column(name="c_reduction_name",table="arts_t_transactiondet",length=36)
    private String ReductionName;

    @Column(name="c_reduction_amount",table="arts_t_transactiondet",length=36)
    private String ReductionAmount;

    @Column(name="c_reduction_amounttype",table="arts_t_transactiondet",length=36)
    private String ReductionAmounttype;

    @Column(name="c_reduction_amountconvert",table="arts_t_transactiondet",length=36)
    private String ReductionAmountconvert;

    @Column(name="c_discount_id",table="arts_t_transactiondet",length=36)
    private String DiscountId;

    @Column(name="c_discount_name",table="arts_t_transactiondet",length=36)
    private String DiscountName;

    @Column(name="c_discount_amount",table="arts_t_transactiondet",length=36)
    private String DiscountAmount;

    @Column(name="c_discount_amounttype",table="arts_t_transactiondet",length=36)
    private String DiscountAmounttype;

    @Column(name="c_discount_amountconvert",table="arts_t_transactiondet",length=36)
    private String DiscountAmountconvert;

    @Column(name="c_fare_id",table="arts_t_transactiondet",length=36)
    private String FareId;

    @Column(name="c_fare_basicfare",table="arts_t_transactiondet",length=36)
    private String FareBasicfare;

    @Column(name="c_fare_tuslahfee",table="arts_t_transactiondet",length=36)
    private String FareTuslahfee;

    @Column(name="c_fare_rsvfee",table="arts_t_transactiondet",length=36)
    private String FareRsvfee;

    @Column(name="c_fare_stfee",table="arts_t_transactiondet")
    private Integer FareStfee;

    @Column(name="c_fare_addfee",table="arts_t_transactiondet",length=36)
    private String FareAddfee;

    @Column(name="c_fare_compinsurance",table="arts_t_transactiondet",length=36)
    private String FareCompinsurance;

    @Column(name="c_fare_addinsurance",table="arts_t_transactiondet",length=36)
    private String FareAddinsurance;

    @Column(name="c_fare_psofare",table="arts_t_transactiondet",length=36)
    private String FarePsofare;

    @Column(name="c_fare_totamount",table="arts_t_transactiondet",length=36)
    private String FareTotamount;

    @Column(name="c_flexi_id",table="arts_t_transactiondet",nullable=false,length=20)
    private String FlexiId;

    @Column(name="c_flexi_code",table="arts_t_transactiondet",nullable=false,length=20)
    private String FlexiCode;

    @Column(name="c_stasiun_idgatein",table="arts_t_transactiondet",length=36)
    private String StasiunIdgatein;

    @Column(name="c_stasiun_codegateind",table="arts_t_transactiondet",length=36)
    private String StasiunCodegateind;

    @Column(name="c_unit_idgatein",table="arts_t_transactiondet",length=36)
    private String UnitIdgatein;

    @Column(name="c_unit_codegatein",table="arts_t_transactiondet",length=36)
    private String UnitCodegatein;

    @Column(name="c_transactiondet_gateinon",table="arts_t_transactiondet")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Gateinon;

    @Column(name="c_stasiun_idgateout",table="arts_t_transactiondet",length=36)
    private String StasiunIdgateout;

    @Column(name="c_stasiun_codegateout",table="arts_t_transactiondet",length=36)
    private String StasiunCodegateout;

    @Column(name="c_unit_idgateout",table="arts_t_transactiondet",length=36)
    private String UnitIdgateout;

    @Column(name="c_unit_codegateout",table="arts_t_transactiondet",length=36)
    private String UnitCodegateout;

    @Column(name="c_transactiondet_gateouton",table="arts_t_transactiondet",nullable=false,length=20)
    private String Gateouton;

    @Column(name="c_transactiondet_max_print",table="arts_t_transactiondet",nullable=false)
    private short MaxPrint;

    @Column(name="c_transactiondet_ref",table="arts_t_transactiondet",nullable=false)
    private short Ref;

    @Column(name="c_transactiondet_status",table="arts_t_transactiondet",nullable=false)
    private short Status;

    @Column(name="c_transactiondet_domain",table="arts_t_transactiondet",nullable=false,length=36)
    private String Domain;

    @Column(name="c_transactiondet_modifiedby",table="arts_t_transactiondet",nullable=false,length=36)
    private String Modifiedby;

    @Column(name="c_transactiondet_modifiedon",table="arts_t_transactiondet",nullable=false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name="c_transactiondet_createdby",table="arts_t_transactiondet",nullable=false,length=36)
    private String Createdby;

    @Column(name="c_transactiondet_createdon",table="arts_t_transactiondet",nullable=false)
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

    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    public String getTransactionBookcode() {
        return TransactionBookcode;
    }

    public void setTransactionBookcode(String TransactionBookcode) {
        this.TransactionBookcode = TransactionBookcode;
    }

    public String getTransactionPaycode() {
        return TransactionPaycode;
    }

    public void setTransactionPaycode(String TransactionPaycode) {
        this.TransactionPaycode = TransactionPaycode;
    }

    public LocalDate getTransactionTransdate() {
        return TransactionTransdate;
    }

    public void setTransactionTransdate(LocalDate TransactionTransdate) {
        this.TransactionTransdate = TransactionTransdate;
    }

    public BigDecimal getTransactionCustname() {
        return TransactionCustname;
    }

    public void setTransactionCustname(BigDecimal TransactionCustname) {
        this.TransactionCustname = TransactionCustname;
    }

    public String getTransactionPhonenum() {
        return TransactionPhonenum;
    }

    public void setTransactionPhonenum(String TransactionPhonenum) {
        this.TransactionPhonenum = TransactionPhonenum;
    }

    public String getTransactionEmail() {
        return TransactionEmail;
    }

    public void setTransactionEmail(String TransactionEmail) {
        this.TransactionEmail = TransactionEmail;
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

    public String getShiftIdbook() {
        return ShiftIdbook;
    }

    public void setShiftIdbook(String ShiftIdbook) {
        this.ShiftIdbook = ShiftIdbook;
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

    public LocalDate getTransactionBookedon() {
        return TransactionBookedon;
    }

    public void setTransactionBookedon(LocalDate TransactionBookedon) {
        this.TransactionBookedon = TransactionBookedon;
    }

    public LocalDate getTransactionBooktimeouton() {
        return TransactionBooktimeouton;
    }

    public void setTransactionBooktimeouton(LocalDate TransactionBooktimeouton) {
        this.TransactionBooktimeouton = TransactionBooktimeouton;
    }

    public LocalDate getTransactionPaytimeouton() {
        return TransactionPaytimeouton;
    }

    public void setTransactionPaytimeouton(LocalDate TransactionPaytimeouton) {
        this.TransactionPaytimeouton = TransactionPaytimeouton;
    }

    public LocalDate getTransactionPaidon() {
        return TransactionPaidon;
    }

    public void setTransactionPaidon(LocalDate TransactionPaidon) {
        this.TransactionPaidon = TransactionPaidon;
    }

    public Character getTransactionReroutestat() {
        return TransactionReroutestat;
    }

    public void setTransactionReroutestat(Character TransactionReroutestat) {
        this.TransactionReroutestat = TransactionReroutestat;
    }

    public Character getCransactionFlexiredeemstat() {
        return cransactionFlexiredeemstat;
    }

    public void setCransactionFlexiredeemstat(Character cransactionFlexiredeemstat) {
        this.cransactionFlexiredeemstat = cransactionFlexiredeemstat;
    }

    public String getPsgname() {
        return Psgname;
    }

    public void setPsgname(String Psgname) {
        this.Psgname = Psgname;
    }

    public String getPsgid() {
        return Psgid;
    }

    public void setPsgid(String Psgid) {
        this.Psgid = Psgid;
    }

    public String getStamformdetId() {
        return StamformdetId;
    }

    public void setStamformdetId(String StamformdetId) {
        this.StamformdetId = StamformdetId;
    }

    public String getStamformdetCode() {
        return StamformdetCode;
    }

    public void setStamformdetCode(String StamformdetCode) {
        this.StamformdetCode = StamformdetCode;
    }

    public String getWagondetId() {
        return WagondetId;
    }

    public void setWagondetId(String WagondetId) {
        this.WagondetId = WagondetId;
    }

    public String getWagondetRow() {
        return WagondetRow;
    }

    public void setWagondetRow(String WagondetRow) {
        this.WagondetRow = WagondetRow;
    }

    public String getWagondetCol() {
        return WagondetCol;
    }

    public void setWagondetCol(String WagondetCol) {
        this.WagondetCol = WagondetCol;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal Amount) {
        this.Amount = Amount;
    }

    public String getTicketnum() {
        return Ticketnum;
    }

    public void setTicketnum(String Ticketnum) {
        this.Ticketnum = Ticketnum;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String MemberId) {
        this.MemberId = MemberId;
    }

    public String getReductionId() {
        return ReductionId;
    }

    public void setReductionId(String ReductionId) {
        this.ReductionId = ReductionId;
    }

    public String getReductionName() {
        return ReductionName;
    }

    public void setReductionName(String ReductionName) {
        this.ReductionName = ReductionName;
    }

    public String getReductionAmount() {
        return ReductionAmount;
    }

    public void setReductionAmount(String ReductionAmount) {
        this.ReductionAmount = ReductionAmount;
    }

    public String getReductionAmounttype() {
        return ReductionAmounttype;
    }

    public void setReductionAmounttype(String ReductionAmounttype) {
        this.ReductionAmounttype = ReductionAmounttype;
    }

    public String getReductionAmountconvert() {
        return ReductionAmountconvert;
    }

    public void setReductionAmountconvert(String ReductionAmountconvert) {
        this.ReductionAmountconvert = ReductionAmountconvert;
    }

    public String getDiscountId() {
        return DiscountId;
    }

    public void setDiscountId(String DiscountId) {
        this.DiscountId = DiscountId;
    }

    public String getDiscountName() {
        return DiscountName;
    }

    public void setDiscountName(String DiscountName) {
        this.DiscountName = DiscountName;
    }

    public String getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(String DiscountAmount) {
        this.DiscountAmount = DiscountAmount;
    }

    public String getDiscountAmounttype() {
        return DiscountAmounttype;
    }

    public void setDiscountAmounttype(String DiscountAmounttype) {
        this.DiscountAmounttype = DiscountAmounttype;
    }

    public String getDiscountAmountconvert() {
        return DiscountAmountconvert;
    }

    public void setDiscountAmountconvert(String DiscountAmountconvert) {
        this.DiscountAmountconvert = DiscountAmountconvert;
    }

    public String getFareId() {
        return FareId;
    }

    public void setFareId(String FareId) {
        this.FareId = FareId;
    }

    public String getFareBasicfare() {
        return FareBasicfare;
    }

    public void setFareBasicfare(String FareBasicfare) {
        this.FareBasicfare = FareBasicfare;
    }

    public String getFareTuslahfee() {
        return FareTuslahfee;
    }

    public void setFareTuslahfee(String FareTuslahfee) {
        this.FareTuslahfee = FareTuslahfee;
    }

    public String getFareRsvfee() {
        return FareRsvfee;
    }

    public void setFareRsvfee(String FareRsvfee) {
        this.FareRsvfee = FareRsvfee;
    }

    public Integer getFareStfee() {
        return FareStfee;
    }

    public void setFareStfee(Integer FareStfee) {
        this.FareStfee = FareStfee;
    }

    public String getFareAddfee() {
        return FareAddfee;
    }

    public void setFareAddfee(String FareAddfee) {
        this.FareAddfee = FareAddfee;
    }

    public String getFareCompinsurance() {
        return FareCompinsurance;
    }

    public void setFareCompinsurance(String FareCompinsurance) {
        this.FareCompinsurance = FareCompinsurance;
    }

    public String getFareAddinsurance() {
        return FareAddinsurance;
    }

    public void setFareAddinsurance(String FareAddinsurance) {
        this.FareAddinsurance = FareAddinsurance;
    }

    public String getFarePsofare() {
        return FarePsofare;
    }

    public void setFarePsofare(String FarePsofare) {
        this.FarePsofare = FarePsofare;
    }

    public String getFareTotamount() {
        return FareTotamount;
    }

    public void setFareTotamount(String FareTotamount) {
        this.FareTotamount = FareTotamount;
    }

    public String getFlexiId() {
        return FlexiId;
    }

    public void setFlexiId(String FlexiId) {
        this.FlexiId = FlexiId;
    }

    public String getFlexiCode() {
        return FlexiCode;
    }

    public void setFlexiCode(String FlexiCode) {
        this.FlexiCode = FlexiCode;
    }

    public String getStasiunIdgatein() {
        return StasiunIdgatein;
    }

    public void setStasiunIdgatein(String StasiunIdgatein) {
        this.StasiunIdgatein = StasiunIdgatein;
    }

    public String getStasiunCodegateind() {
        return StasiunCodegateind;
    }

    public void setStasiunCodegateind(String StasiunCodegateind) {
        this.StasiunCodegateind = StasiunCodegateind;
    }

    public String getUnitIdgatein() {
        return UnitIdgatein;
    }

    public void setUnitIdgatein(String UnitIdgatein) {
        this.UnitIdgatein = UnitIdgatein;
    }

    public String getUnitCodegatein() {
        return UnitCodegatein;
    }

    public void setUnitCodegatein(String UnitCodegatein) {
        this.UnitCodegatein = UnitCodegatein;
    }

    public LocalDate getGateinon() {
        return Gateinon;
    }

    public void setGateinon(LocalDate Gateinon) {
        this.Gateinon = Gateinon;
    }

    public String getStasiunIdgateout() {
        return StasiunIdgateout;
    }

    public void setStasiunIdgateout(String StasiunIdgateout) {
        this.StasiunIdgateout = StasiunIdgateout;
    }

    public String getStasiunCodegateout() {
        return StasiunCodegateout;
    }

    public void setStasiunCodegateout(String StasiunCodegateout) {
        this.StasiunCodegateout = StasiunCodegateout;
    }

    public String getUnitIdgateout() {
        return UnitIdgateout;
    }

    public void setUnitIdgateout(String UnitIdgateout) {
        this.UnitIdgateout = UnitIdgateout;
    }

    public String getUnitCodegateout() {
        return UnitCodegateout;
    }

    public void setUnitCodegateout(String UnitCodegateout) {
        this.UnitCodegateout = UnitCodegateout;
    }

    public String getGateouton() {
        return Gateouton;
    }

    public void setGateouton(String Gateouton) {
        this.Gateouton = Gateouton;
    }

    public short getMaxPrint() {
        return MaxPrint;
    }

    public void setMaxPrint(short MaxPrint) {
        this.MaxPrint = MaxPrint;
    }

    public short getRef() {
        return Ref;
    }

    public void setRef(short Ref) {
        this.Ref = Ref;
    }

    public short getStatus() {
        return Status;
    }

    public void setStatus(short Status) {
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
