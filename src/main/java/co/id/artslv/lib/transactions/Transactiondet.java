package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
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
@Table(name = "arts_t_transactiondet")
public class Transactiondet {

    @Column(name = "c_transactiondet_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_transaction_id")
    private String transactionid;

    @Column(name = "c_transaction_bookcode")
    private String transactionbookcode;

    @Column(name = "c_transaction_paycode")
    private String transactionpaycode;

    @Column(name = "c_transaction_transdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime transactiontransdate;

    @Column(name = "c_transaction_custname")
    private String transactioncustname;

    @Column(name = "c_transaction_phonenum")
    private String transactionphonenum;

    @Column(name = "c_transaction_email")
    private String transactionemail;

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
    private String scheduletrainname;

    @Column(name = "c_trip_id")
    private String tripid;

    @Column(name = "c_trip_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name = "c_subclass_id")
    private String subclassid;

    @Column(name = "c_subclass_code")
    private String subclasscode;

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
    private LocalDateTime transactionbookedon;

    @Column(name = "c_transaction_booktimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime transactionbooktimeouton;

    @Column(name = "c_transaction_paytimeouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd  HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime transactionpaytimeouton;

    @Column(name = "c_transaction_paidon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime transactionpaidon;

    @Column(name = "c_transaction_reroutestat")
    private String transactionreroutestat;

    @Column(name = "c_transaction_flexiredeemstat")
    private String transactionflexiredeemstat;

    @Column(name = "c_transactiondet_psgname")
    private String psgname;

    @Column(name = "c_transactiondet_psgid")
    private String psgid;

    @Column(name = "c_stamformdet_id")
    private String stamformdetid;

    @Column(name = "c_stamformdet_code")
    private String stamformdetcode;

    @Column(name = "c_wagondet_id")
    private String wagondetid;

    @Column(name = "c_wagondet_row")
    private int wagondetrow;

    @Column(name = "c_wagondet_col")
    private String wagondetcol;

    @Column(name = "c_transactiondet_amount")
    private BigDecimal amount;

    @Column(name = "c_transactiondet_ticketnum")
    private String ticketnum;

    @Column(name = "c_member_id")
    private String memberid;

    @Column(name = "c_reduction_id")
    private String reductionid;

    @Column(name = "c_reduction_name")
    private String reductionname;

    @Column(name = "c_reduction_amount")
    private String reductionamount;

    @Column(name = "c_reduction_amounttype")
    private String reductionamounttype;

    @Column(name = "c_reduction_amountconvert")
    private String reductionamountconvert;

    @Column(name = "c_discount_id")
    private String discountid;

    @Column(name = "c_discount_name")
    private String discountname;

    @Column(name = "c_discount_amount")
    private String discountamount;

    @Column(name = "c_discount_amounttype")
    private String discountamounttype;

    @Column(name = "c_discount_amountconvert")
    private String discountamountconvert;

    @Column(name = "c_fare_id")
    private String fareid;

    @Column(name = "c_fare_basicfare")
    private BigDecimal farebasicfare;

    @Column(name = "c_fare_tuslahfee")
    private BigDecimal faretuslahfee;

    @Column(name = "c_fare_rsvfee")
    private BigDecimal farersvfee;

    @Column(name = "c_fare_stfee")
    private BigDecimal farestfee;

    @Column(name = "c_fare_addfee")
    private BigDecimal fareaddfee;

    @Column(name = "c_fare_compinsurance")
    private BigDecimal farecompinsurance;

    @Column(name = "c_fare_addinsurance")
    private BigDecimal fareaddinsurance;

    @Column(name = "c_fare_psofare")
    private BigDecimal farepsofare;

    @Column(name = "c_fare_totamount")
    private BigDecimal faretotamount;

    @Column(name = "c_flexi_id")
    private String flexiid;

    @Column(name = "c_flexi_code")
    private String flexicode;

    @Column(name = "c_stasiun_idgatein")
    private String stasiunidgatein;

    @Column(name = "c_stasiun_codegatein")
    private String stasiuncodegatein;

    @Column(name = "c_unit_idgatein")
    private String unitidgatein;

    @Column(name = "c_unit_codegatein")
    private String unitcodegatein;

    @Column(name = "c_transactiondet_gateinon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime gateinon;

    @Column(name = "c_stasiun_idgateout")
    private String stasiunidgateout;

    @Column(name = "c_stasiun_codegateout")
    private String stasiuncodegateout;

    @Column(name = "c_unit_idgateout")
    private String unitidgateout;

    @Column(name = "c_unit_codegateout")
    private String unitcodegateout;

    @Column(name = "c_transactiondet_gateouton")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime gateouton;

    @Column(name = "c_transactiondet_maxprint")
    private int maxprint;

    @Column(name = "c_transactiondet_ref")
    private Integer ref;

    @Column(name = "c_transactiondet_status")
    private String status;

    @Column(name = "c_transactiondet_domain")
    private String domain;

    @Column(name = "c_transactiondet_modifiedby")
    private String modifiedby;

    @Column(name = "c_transactiondet_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name = "c_transactiondet_createdby")
    private String createdby;

    @Column(name = "c_transactiondet_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;
    @Column(name = "c_transactiondet_order")
    private int order;
    @Column(name = "c_transactiondet_releasestat")
    private String releasestat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getTransactionbookcode() {
        return transactionbookcode;
    }

    public void setTransactionbookcode(String transactionbookcode) {
        this.transactionbookcode = transactionbookcode;
    }

    public String getTransactionpaycode() {
        return transactionpaycode;
    }

    public void setTransactionpaycode(String transactionpaycode) {
        this.transactionpaycode = transactionpaycode;
    }

    public LocalDateTime getTransactiontransdate() {
        return transactiontransdate;
    }

    public void setTransactiontransdate(LocalDateTime transactiontransdate) {
        this.transactiontransdate = transactiontransdate;
    }

    public String getTransactioncustname() {
        return transactioncustname;
    }

    public void setTransactioncustname(String transactioncustname) {
        this.transactioncustname = transactioncustname;
    }

    public String getTransactionphonenum() {
        return transactionphonenum;
    }

    public void setTransactionphonenum(String transactionphonenum) {
        this.transactionphonenum = transactionphonenum;
    }

    public String getTransactionemail() {
        return transactionemail;
    }

    public void setTransactionemail(String transactionemail) {
        this.transactionemail = transactionemail;
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

    public String getScheduletrainname() {
        return scheduletrainname;
    }

    public void setScheduletrainname(String scheduletrainname) {
        this.scheduletrainname = scheduletrainname;
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

    public LocalDateTime getTransactionbookedon() {
        return transactionbookedon;
    }

    public void setTransactionbookedon(LocalDateTime transactionbookedon) {
        this.transactionbookedon = transactionbookedon;
    }

    public LocalDateTime getTransactionbooktimeouton() {
        return transactionbooktimeouton;
    }

    public void setTransactionbooktimeouton(LocalDateTime transactionbooktimeouton) {
        this.transactionbooktimeouton = transactionbooktimeouton;
    }

    public LocalDateTime getTransactionpaytimeouton() {
        return transactionpaytimeouton;
    }

    public void setTransactionpaytimeouton(LocalDateTime transactionpaytimeouton) {
        this.transactionpaytimeouton = transactionpaytimeouton;
    }

    public LocalDateTime getTransactionpaidon() {
        return transactionpaidon;
    }

    public void setTransactionpaidon(LocalDateTime transactionpaidon) {
        this.transactionpaidon = transactionpaidon;
    }

    public String getTransactionreroutestat() {
        return transactionreroutestat;
    }

    public void setTransactionreroutestat(String transactionreroutestat) {
        this.transactionreroutestat = transactionreroutestat;
    }

    public String getTransactionflexiredeemstat() {
        return transactionflexiredeemstat;
    }

    public void setTransactionflexiredeemstat(String transactionflexiredeemstat) {
        this.transactionflexiredeemstat = transactionflexiredeemstat;
    }

    public String getPsgname() {
        return psgname;
    }

    public void setPsgname(String psgname) {
        this.psgname = psgname;
    }

    public String getPsgid() {
        return psgid;
    }

    public void setPsgid(String psgid) {
        this.psgid = psgid;
    }

    public String getStamformdetid() {
        return stamformdetid;
    }

    public void setStamformdetid(String stamformdetid) {
        this.stamformdetid = stamformdetid;
    }

    public String getStamformdetcode() {
        return stamformdetcode;
    }

    public void setStamformdetcode(String stamformdetcode) {
        this.stamformdetcode = stamformdetcode;
    }

    public String getWagondetid() {
        return wagondetid;
    }

    public void setWagondetid(String wagondetid) {
        this.wagondetid = wagondetid;
    }

    public int getWagondetrow() {
        return wagondetrow;
    }

    public void setWagondetrow(int wagondetrow) {
        this.wagondetrow = wagondetrow;
    }

    public String getWagondetcol() {
        return wagondetcol;
    }

    public void setWagondetcol(String wagondetcol) {
        this.wagondetcol = wagondetcol;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        this.ticketnum = ticketnum;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getReductionid() {
        return reductionid;
    }

    public void setReductionid(String reductionid) {
        this.reductionid = reductionid;
    }

    public String getReductionname() {
        return reductionname;
    }

    public void setReductionname(String reductionname) {
        this.reductionname = reductionname;
    }

    public String getReductionamount() {
        return reductionamount;
    }

    public void setReductionamount(String reductionamount) {
        this.reductionamount = reductionamount;
    }

    public String getReductionamounttype() {
        return reductionamounttype;
    }

    public void setReductionamounttype(String reductionamounttype) {
        this.reductionamounttype = reductionamounttype;
    }

    public String getReductionamountconvert() {
        return reductionamountconvert;
    }

    public void setReductionamountconvert(String reductionamountconvert) {
        this.reductionamountconvert = reductionamountconvert;
    }

    public String getDiscountid() {
        return discountid;
    }

    public void setDiscountid(String discountid) {
        this.discountid = discountid;
    }

    public String getDiscountname() {
        return discountname;
    }

    public void setDiscountname(String discountname) {
        this.discountname = discountname;
    }

    public String getDiscountamount() {
        return discountamount;
    }

    public void setDiscountamount(String discountamount) {
        this.discountamount = discountamount;
    }

    public String getDiscountamounttype() {
        return discountamounttype;
    }

    public void setDiscountamounttype(String discountamounttype) {
        this.discountamounttype = discountamounttype;
    }

    public String getDiscountamountconvert() {
        return discountamountconvert;
    }

    public void setDiscountamountconvert(String discountamountconvert) {
        this.discountamountconvert = discountamountconvert;
    }

    public String getFareid() {
        return fareid;
    }

    public void setFareid(String fareid) {
        this.fareid = fareid;
    }

    public BigDecimal getFarebasicfare() {
        return farebasicfare;
    }

    public void setFarebasicfare(BigDecimal farebasicfare) {
        this.farebasicfare = farebasicfare;
    }

    public BigDecimal getFaretuslahfee() {
        return faretuslahfee;
    }

    public void setFaretuslahfee(BigDecimal faretuslahfee) {
        this.faretuslahfee = faretuslahfee;
    }

    public BigDecimal getFarersvfee() {
        return farersvfee;
    }

    public void setFarersvfee(BigDecimal farersvfee) {
        this.farersvfee = farersvfee;
    }

    public BigDecimal getFarestfee() {
        return farestfee;
    }

    public void setFarestfee(BigDecimal farestfee) {
        this.farestfee = farestfee;
    }

    public BigDecimal getFareaddfee() {
        return fareaddfee;
    }

    public void setFareaddfee(BigDecimal fareaddfee) {
        this.fareaddfee = fareaddfee;
    }

    public BigDecimal getFarecompinsurance() {
        return farecompinsurance;
    }

    public void setFarecompinsurance(BigDecimal farecompinsurance) {
        this.farecompinsurance = farecompinsurance;
    }

    public BigDecimal getFareaddinsurance() {
        return fareaddinsurance;
    }

    public void setFareaddinsurance(BigDecimal fareaddinsurance) {
        this.fareaddinsurance = fareaddinsurance;
    }

    public BigDecimal getFarepsofare() {
        return farepsofare;
    }

    public void setFarepsofare(BigDecimal farepsofare) {
        this.farepsofare = farepsofare;
    }

    public BigDecimal getFaretotamount() {
        return faretotamount;
    }

    public void setFaretotamount(BigDecimal faretotamount) {
        this.faretotamount = faretotamount;
    }

    public String getFlexiid() {
        return flexiid;
    }

    public void setFlexiid(String flexiid) {
        this.flexiid = flexiid;
    }

    public String getFlexicode() {
        return flexicode;
    }

    public void setFlexicode(String flexicode) {
        this.flexicode = flexicode;
    }

    public String getStasiunidgatein() {
        return stasiunidgatein;
    }

    public void setStasiunidgatein(String stasiunidgatein) {
        this.stasiunidgatein = stasiunidgatein;
    }

    public String getStasiuncodegatein() {
        return stasiuncodegatein;
    }

    public void setStasiuncodegatein(String stasiuncodegatein) {
        this.stasiuncodegatein = stasiuncodegatein;
    }

    public String getUnitidgatein() {
        return unitidgatein;
    }

    public void setUnitidgatein(String unitidgatein) {
        this.unitidgatein = unitidgatein;
    }

    public String getUnitcodegatein() {
        return unitcodegatein;
    }

    public void setUnitcodegatein(String unitcodegatein) {
        this.unitcodegatein = unitcodegatein;
    }

    public LocalDateTime getGateinon() {
        return gateinon;
    }

    public void setGateinon(LocalDateTime gateinon) {
        this.gateinon = gateinon;
    }

    public String getStasiunidgateout() {
        return stasiunidgateout;
    }

    public void setStasiunidgateout(String stasiunidgateout) {
        this.stasiunidgateout = stasiunidgateout;
    }

    public String getStasiuncodegateout() {
        return stasiuncodegateout;
    }

    public void setStasiuncodegateout(String stasiuncodegateout) {
        this.stasiuncodegateout = stasiuncodegateout;
    }

    public String getUnitidgateout() {
        return unitidgateout;
    }

    public void setUnitidgateout(String unitidgateout) {
        this.unitidgateout = unitidgateout;
    }

    public String getUnitcodegateout() {
        return unitcodegateout;
    }

    public void setUnitcodegateout(String unitcodegateout) {
        this.unitcodegateout = unitcodegateout;
    }

    public LocalDateTime getGateouton() {
        return gateouton;
    }

    public void setGateouton(LocalDateTime gateouton) {
        this.gateouton = gateouton;
    }

    public int getMaxprint() {
        return maxprint;
    }

    public void setMaxprint(int maxprint) {
        this.maxprint = maxprint;
    }

    public Integer getRef() {
        return ref;
    }

    public void setRef(Integer ref) {
        this.ref = ref;
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

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getReleasestat() {
        return releasestat;
    }

    public void setReleasestat(String releasestat) {
        this.releasestat = releasestat;
    }

}
