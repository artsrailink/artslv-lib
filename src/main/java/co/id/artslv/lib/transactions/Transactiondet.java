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

    @Column(name="c_transaction_id")
    private String transactionId;

    @Column(name="c_transaction_bookcode")
    private String TransactionBookcode;

    @Column(name="c_transaction_paycode")
    private String TransactionPaycode;

    @Column(name="c_transaction_transdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime TransactionTransdate;

    @Column(name="c_transaction_custname")
    private BigDecimal TransactionCustname;

    @Column(name="c_transaction_phonenum")
    private String TransactionPhonenum;

    @Column(name="c_transaction_email")
    private String TransactionEmail;

    @Column(name="c_stasiun_idorg")
    private String StasiunIdorg;

    @Column(name="c_stasiun_codeorg")
    private String StasiunCodeorg;

    @Column(name="c_stasiun_iddes")
    private String StasiunIddes;

    @Column(name="c_stasiun_codedes")
    private String StasiunCodedes;

    @Column(name="c_schedule_id")
    private String ScheduleId;

    @Column(name="c_schedule_noka")
    private String ScheduleNoka;

    @Column(name="c_schedule_localstat")
    private Character ScheduleLocalstat;

    @Column(name="c_schedule_trainname")
    private Character ScheduleTrainname;

    @Column(name="c_trip_id")
    private String TripId;

    @Column(name = "c_trip_date")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate TripDate;

    @Column(name="c_subclass_id")
    private String SubclassId;

    @Column(name="c_subclass_code")
    private String SubclassCode;

    @Column(name="c_user_idbook")
    private String UserIdbook;

    @Column(name="c_user_fullnamebook")
    private String UserFullnamebook;

    @Column(name="c_unit_idbook")
    private String UnitIdbook;

    @Column(name="c_unit_codebook")
    private String UnitCodebook;

    @Column(name="c_shift_idbook")
    private String ShiftIdbook;

    @Column(name="c_channel_idbook")
    private String ChannelIdbook;

    @Column(name="c_channel_codebook")
    private String ChannelCodebook;

    @Column(name="c_user_idpay")
    private String UserIdpay;

    @Column(name="c_user_fullnamepay")
    private String UserFullnamepay;

    @Column(name="c_unit_idpay")
    private String UnitIdpay;

    @Column(name="c_unit_codepay")
    private String UnitCodepay;

    @Column(name="c_shift_idpay")
    private String ShiftIdpay;

    @Column(name="c_channel_idpay")
    private String ChannelIdpay;

    @Column(name="c_channel_codepay")
    private String ChannelCodepay;

    @Column(name="c_transaction_bookedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime TransactionBookedon;

    @Column(name="c_transaction_booktimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime TransactionBooktimeouton;

    @Column(name="c_transaction_paytimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime TransactionPaytimeouton;

    @Column(name="c_transaction_paidon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime TransactionPaidon;

    @Column(name="c_transaction_reroutestat")
    private Character TransactionReroutestat;

    @Column(name="c_transaction_flexiredeemstat")
    private Character cransactionFlexiredeemstat;

    @Column(name="c_transactiondet_psgname")
    private String Psgname;

    @Column(name="c_transactiondet_psgid")
    private String Psgid;

    @Column(name="c_stamformdet_id")
    private String StamformdetId;

    @Column(name="c_stamformdet_code")
    private String StamformdetCode;

    @Column(name="c_wagondet_id")
    private String WagondetId;

    @Column(name="c_wagondet_row")
    private String WagondetRow;

    @Column(name="c_wagondet_col")
    private String WagondetCol;

    @Column(name="c_transactiondet_amount")
    private BigDecimal Amount;

    @Column(name="c_transactiondet_ticketnum")
    private String Ticketnum;

    @Column(name="c_member_id")
    private String MemberId;

    @Column(name="c_reduction_id")
    private String ReductionId;

    @Column(name="c_reduction_name")
    private String ReductionName;

    @Column(name="c_reduction_amount")
    private String ReductionAmount;

    @Column(name="c_reduction_amounttype")
    private String ReductionAmounttype;

    @Column(name="c_reduction_amountconvert")
    private String ReductionAmountconvert;

    @Column(name="c_discount_id")
    private String DiscountId;

    @Column(name="c_discount_name")
    private String DiscountName;

    @Column(name="c_discount_amount")
    private String DiscountAmount;

    @Column(name="c_discount_amounttype")
    private String DiscountAmounttype;

    @Column(name="c_discount_amountconvert")
    private String DiscountAmountconvert;

    @Column(name="c_fare_id")
    private String FareId;

    @Column(name="c_fare_basicfare")
    private String FareBasicfare;

    @Column(name="c_fare_tuslahfee")
    private String FareTuslahfee;

    @Column(name="c_fare_rsvfee")
    private String FareRsvfee;

    @Column(name="c_fare_stfee")
    private Integer FareStfee;

    @Column(name="c_fare_addfee")
    private String FareAddfee;

    @Column(name="c_fare_compinsurance")
    private String FareCompinsurance;

    @Column(name="c_fare_addinsurance")
    private String FareAddinsurance;

    @Column(name="c_fare_psofare")
    private String FarePsofare;

    @Column(name="c_fare_totamount")
    private String FareTotamount;

    @Column(name="c_flexi_id")
    private String FlexiId;

    @Column(name="c_flexi_code")
    private String FlexiCode;

    @Column(name="c_stasiun_idgatein")
    private String StasiunIdgatein;

    @Column(name="c_stasiun_codegateind")
    private String StasiunCodegateind;

    @Column(name="c_unit_idgatein")
    private String UnitIdgatein;

    @Column(name="c_unit_codegatein")
    private String UnitCodegatein;

    @Column(name="c_transactiondet_gateinon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Gateinon;

    @Column(name="c_stasiun_idgateout")
    private String StasiunIdgateout;

    @Column(name="c_stasiun_codegateout")
    private String StasiunCodegateout;

    @Column(name="c_unit_idgateout")
    private String UnitIdgateout;

    @Column(name="c_unit_codegateout")
    private String UnitCodegateout;

    @Column(name="c_transactiondet_gateouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Gateouton;

    @Column(name="c_transactiondet_max_print")
    private short MaxPrint;

    @Column(name="c_transactiondet_ref")
    private short Ref;

    @Column(name="c_transactiondet_status")
    private String Status;

    @Column(name="c_transactiondet_domain")
    private String Domain;

    @Column(name="c_transactiondet_modifiedby")
    private String Modifiedby;

    @Column(name="c_transactiondet_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name="c_transactiondet_createdby")
    private String Createdby;

    @Column(name="c_transactiondet_createdon")
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
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        transactionId = transactionId;
    }

    public String getTransactionBookcode() {
        return TransactionBookcode;
    }

    public void setTransactionBookcode(String transactionBookcode) {
        TransactionBookcode = transactionBookcode;
    }

    public String getTransactionPaycode() {
        return TransactionPaycode;
    }

    public void setTransactionPaycode(String transactionPaycode) {
        TransactionPaycode = transactionPaycode;
    }

    public LocalDateTime getTransactionTransdate() {
        return TransactionTransdate;
    }

    public void setTransactionTransdate(LocalDateTime transactionTransdate) {
        TransactionTransdate = transactionTransdate;
    }

    public BigDecimal getTransactionCustname() {
        return TransactionCustname;
    }

    public void setTransactionCustname(BigDecimal transactionCustname) {
        TransactionCustname = transactionCustname;
    }

    public String getTransactionPhonenum() {
        return TransactionPhonenum;
    }

    public void setTransactionPhonenum(String transactionPhonenum) {
        TransactionPhonenum = transactionPhonenum;
    }

    public String getTransactionEmail() {
        return TransactionEmail;
    }

    public void setTransactionEmail(String transactionEmail) {
        TransactionEmail = transactionEmail;
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

    public String getShiftIdbook() {
        return ShiftIdbook;
    }

    public void setShiftIdbook(String shiftIdbook) {
        ShiftIdbook = shiftIdbook;
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

    public LocalDateTime getTransactionBookedon() {
        return TransactionBookedon;
    }

    public void setTransactionBookedon(LocalDateTime transactionBookedon) {
        TransactionBookedon = transactionBookedon;
    }

    public LocalDateTime getTransactionBooktimeouton() {
        return TransactionBooktimeouton;
    }

    public void setTransactionBooktimeouton(LocalDateTime transactionBooktimeouton) {
        TransactionBooktimeouton = transactionBooktimeouton;
    }

    public LocalDateTime getTransactionPaytimeouton() {
        return TransactionPaytimeouton;
    }

    public void setTransactionPaytimeouton(LocalDateTime transactionPaytimeouton) {
        TransactionPaytimeouton = transactionPaytimeouton;
    }

    public LocalDateTime getTransactionPaidon() {
        return TransactionPaidon;
    }

    public void setTransactionPaidon(LocalDateTime transactionPaidon) {
        TransactionPaidon = transactionPaidon;
    }

    public Character getTransactionReroutestat() {
        return TransactionReroutestat;
    }

    public void setTransactionReroutestat(Character transactionReroutestat) {
        TransactionReroutestat = transactionReroutestat;
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

    public void setPsgname(String psgname) {
        Psgname = psgname;
    }

    public String getPsgid() {
        return Psgid;
    }

    public void setPsgid(String psgid) {
        Psgid = psgid;
    }

    public String getStamformdetId() {
        return StamformdetId;
    }

    public void setStamformdetId(String stamformdetId) {
        StamformdetId = stamformdetId;
    }

    public String getStamformdetCode() {
        return StamformdetCode;
    }

    public void setStamformdetCode(String stamformdetCode) {
        StamformdetCode = stamformdetCode;
    }

    public String getWagondetId() {
        return WagondetId;
    }

    public void setWagondetId(String wagondetId) {
        WagondetId = wagondetId;
    }

    public String getWagondetRow() {
        return WagondetRow;
    }

    public void setWagondetRow(String wagondetRow) {
        WagondetRow = wagondetRow;
    }

    public String getWagondetCol() {
        return WagondetCol;
    }

    public void setWagondetCol(String wagondetCol) {
        WagondetCol = wagondetCol;
    }

    public BigDecimal getAmount() {
        return Amount;
    }

    public void setAmount(BigDecimal amount) {
        Amount = amount;
    }

    public String getTicketnum() {
        return Ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        Ticketnum = ticketnum;
    }

    public String getMemberId() {
        return MemberId;
    }

    public void setMemberId(String memberId) {
        MemberId = memberId;
    }

    public String getReductionId() {
        return ReductionId;
    }

    public void setReductionId(String reductionId) {
        ReductionId = reductionId;
    }

    public String getReductionName() {
        return ReductionName;
    }

    public void setReductionName(String reductionName) {
        ReductionName = reductionName;
    }

    public String getReductionAmount() {
        return ReductionAmount;
    }

    public void setReductionAmount(String reductionAmount) {
        ReductionAmount = reductionAmount;
    }

    public String getReductionAmounttype() {
        return ReductionAmounttype;
    }

    public void setReductionAmounttype(String reductionAmounttype) {
        ReductionAmounttype = reductionAmounttype;
    }

    public String getReductionAmountconvert() {
        return ReductionAmountconvert;
    }

    public void setReductionAmountconvert(String reductionAmountconvert) {
        ReductionAmountconvert = reductionAmountconvert;
    }

    public String getDiscountId() {
        return DiscountId;
    }

    public void setDiscountId(String discountId) {
        DiscountId = discountId;
    }

    public String getDiscountName() {
        return DiscountName;
    }

    public void setDiscountName(String discountName) {
        DiscountName = discountName;
    }

    public String getDiscountAmount() {
        return DiscountAmount;
    }

    public void setDiscountAmount(String discountAmount) {
        DiscountAmount = discountAmount;
    }

    public String getDiscountAmounttype() {
        return DiscountAmounttype;
    }

    public void setDiscountAmounttype(String discountAmounttype) {
        DiscountAmounttype = discountAmounttype;
    }

    public String getDiscountAmountconvert() {
        return DiscountAmountconvert;
    }

    public void setDiscountAmountconvert(String discountAmountconvert) {
        DiscountAmountconvert = discountAmountconvert;
    }

    public String getFareId() {
        return FareId;
    }

    public void setFareId(String fareId) {
        FareId = fareId;
    }

    public String getFareBasicfare() {
        return FareBasicfare;
    }

    public void setFareBasicfare(String fareBasicfare) {
        FareBasicfare = fareBasicfare;
    }

    public String getFareTuslahfee() {
        return FareTuslahfee;
    }

    public void setFareTuslahfee(String fareTuslahfee) {
        FareTuslahfee = fareTuslahfee;
    }

    public String getFareRsvfee() {
        return FareRsvfee;
    }

    public void setFareRsvfee(String fareRsvfee) {
        FareRsvfee = fareRsvfee;
    }

    public Integer getFareStfee() {
        return FareStfee;
    }

    public void setFareStfee(Integer fareStfee) {
        FareStfee = fareStfee;
    }

    public String getFareAddfee() {
        return FareAddfee;
    }

    public void setFareAddfee(String fareAddfee) {
        FareAddfee = fareAddfee;
    }

    public String getFareCompinsurance() {
        return FareCompinsurance;
    }

    public void setFareCompinsurance(String fareCompinsurance) {
        FareCompinsurance = fareCompinsurance;
    }

    public String getFareAddinsurance() {
        return FareAddinsurance;
    }

    public void setFareAddinsurance(String fareAddinsurance) {
        FareAddinsurance = fareAddinsurance;
    }

    public String getFarePsofare() {
        return FarePsofare;
    }

    public void setFarePsofare(String farePsofare) {
        FarePsofare = farePsofare;
    }

    public String getFareTotamount() {
        return FareTotamount;
    }

    public void setFareTotamount(String fareTotamount) {
        FareTotamount = fareTotamount;
    }

    public String getFlexiId() {
        return FlexiId;
    }

    public void setFlexiId(String flexiId) {
        FlexiId = flexiId;
    }

    public String getFlexiCode() {
        return FlexiCode;
    }

    public void setFlexiCode(String flexiCode) {
        FlexiCode = flexiCode;
    }

    public String getStasiunIdgatein() {
        return StasiunIdgatein;
    }

    public void setStasiunIdgatein(String stasiunIdgatein) {
        StasiunIdgatein = stasiunIdgatein;
    }

    public String getStasiunCodegateind() {
        return StasiunCodegateind;
    }

    public void setStasiunCodegateind(String stasiunCodegateind) {
        StasiunCodegateind = stasiunCodegateind;
    }

    public String getUnitIdgatein() {
        return UnitIdgatein;
    }

    public void setUnitIdgatein(String unitIdgatein) {
        UnitIdgatein = unitIdgatein;
    }

    public String getUnitCodegatein() {
        return UnitCodegatein;
    }

    public void setUnitCodegatein(String unitCodegatein) {
        UnitCodegatein = unitCodegatein;
    }

    public LocalDateTime getGateinon() {
        return Gateinon;
    }

    public void setGateinon(LocalDateTime gateinon) {
        Gateinon = gateinon;
    }

    public String getStasiunIdgateout() {
        return StasiunIdgateout;
    }

    public void setStasiunIdgateout(String stasiunIdgateout) {
        StasiunIdgateout = stasiunIdgateout;
    }

    public String getStasiunCodegateout() {
        return StasiunCodegateout;
    }

    public void setStasiunCodegateout(String stasiunCodegateout) {
        StasiunCodegateout = stasiunCodegateout;
    }

    public String getUnitIdgateout() {
        return UnitIdgateout;
    }

    public void setUnitIdgateout(String unitIdgateout) {
        UnitIdgateout = unitIdgateout;
    }

    public String getUnitCodegateout() {
        return UnitCodegateout;
    }

    public void setUnitCodegateout(String unitCodegateout) {
        UnitCodegateout = unitCodegateout;
    }

    public LocalDateTime getGateouton() {
        return Gateouton;
    }

    public void setGateouton(LocalDateTime gateouton) {
        Gateouton = gateouton;
    }

    public short getMaxPrint() {
        return MaxPrint;
    }

    public void setMaxPrint(short maxPrint) {
        MaxPrint = maxPrint;
    }

    public short getRef() {
        return Ref;
    }

    public void setRef(short ref) {
        Ref = ref;
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
}
