package co.id.artslv.lib.transactions;

import co.id.artslv.lib.members.Member;
import co.id.artslv.lib.members.Reduction;
import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.org.Title;
import co.id.artslv.lib.payments.Discount;
import co.id.artslv.lib.payments.Rate;
import co.id.artslv.lib.schedule.Stamformdet;
import co.id.artslv.lib.trains.Wagondet;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Yoga Sefianto
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "KAIRTS_T_TRANSACTIONDET")
public class Transactiondet implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRANSACTIONDET_ID")
    private String id;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTIONDET_CHECKINON")
    private LocalDateTime checkinon;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTIONDET_BOARDINGON")
    private LocalDateTime boardingon;
    @Column(name = "C_TRANSACTIONDET_PSGTYPE")
    private String psgtype;
    @Column(name = "C_TRANSACTIONDET_PSGNAME")
    private String psgname;
    @Column(name = "C_TRANSACTION_ID")
    private String transactionid;
    @Column(name = "C_TRANSACTIONDET_PSGID")
    private String psgid;
    @Column(name = "C_TRANSACTIONDET_AMOUNT")
    private long amount;
    @Column(name = "C_TRANSACTIONDET_STATUS")
    private String status;
    @Column(name = "C_TRANSACTIONDET_DOMAIN")
    private String domain;
    @Column(name = "C_TRANSACTIONDET_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTIONDET_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_RATE_ID")
    private String rateid;
    @Column(name = "C_REDUCTION_ID")
    private String reductionid;
    @Column(name = "C_MEMBER_ID")
    private String memberid;
    @Column(name = "C_STASIUN_IDCHECKIN")
    private String stasiunidcheckin;
    @Column(name = "C_STASIUN_IDBOARDING")
    private String stasiunidboarding;
    @Column(name = "C_DISCOUNT_ID")
    private String discountid;
    @Column(name = "C_TRANSACTIONDET_CHECKINNUM")
    private String checkinnum;
    @Column(name = "C_GRPRESERVATIONPSG_ID")
    private String grpreservationpsgid;
    @Column(name = "C_WAGONDET_ID")
    private String wagondetid;
    @Column(name = "C_STAMFORMDET_ID")
    private String stamformdetid;
    
    @Column(name = "C_TITLE_ID")
    private String titleid;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_TRANSACTIONDET_PSGBIRTHDATE")
    private LocalDate psgbirthdate;
    @Column(name = "C_TRANSACTIONDET_TICKETNUM")
    private String ticketnum;
    @Column(name = "C_STASIUN_IDBOOK")
    private String stasiunidbook;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTIONDET_BOOKEDON")
    private LocalDateTime bookedon;
    @Column(name = "C_TRANSACTIONDET_DISCAMOUNT")
    private long discamount;
    @Column(name = "C_TRANSACTIONDET_POINTSTAT")
    private String pointstat;
    @Column(name = "C_TRANSACTIONDET_REDEEMVALUE")
    private int redeemvalue;
    @Column(name = "C_TRANSACTIONDET_RATEAMOUNT")
    private long rateamount;
    @Column(name = "C_TRANSACTIONDET_REDAMOUNT")
    private long redamount;
    @Column(name = "C_TRANSACTIONDET_TMAXPRINT")
    private int tmaxprint;
    @Column(name = "C_TRANSACTIONDET_CMAXPRINT")
    private int cmaxprint;
    @Column(name = "C_TRANSACTIONDET_REF1")
    private String ref1;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSACTIONDET_RELEASEON")
    private LocalDateTime releaseon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getCheckinon() {
        return checkinon;
    }

    public void setCheckinon(LocalDateTime checkinon) {
        this.checkinon = checkinon;
    }

    public LocalDateTime getBoardingon() {
        return boardingon;
    }

    public void setBoardingon(LocalDateTime boardingon) {
        this.boardingon = boardingon;
    }

    public String getPsgtype() {
        return psgtype;
    }

    public void setPsgtype(String psgtype) {
        this.psgtype = psgtype;
    }

    public String getPsgname() {
        return psgname;
    }

    public void setPsgname(String psgname) {
        this.psgname = psgname;
    }

    public String getTransactionid() {
        return transactionid;
    }

    public void setTransactionid(String transactionid) {
        this.transactionid = transactionid;
    }

    public String getPsgid() {
        return psgid;
    }

    public void setPsgid(String psgid) {
        this.psgid = psgid;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
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

    public String getRateid() {
        return rateid;
    }

    public void setRateid(String rateid) {
        this.rateid = rateid;
    }

    public String getReductionid() {
        return reductionid;
    }

    public void setReductionid(String reductionid) {
        this.reductionid = reductionid;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getStasiunidcheckin() {
        return stasiunidcheckin;
    }

    public void setStasiunidcheckin(String stasiunidcheckin) {
        this.stasiunidcheckin = stasiunidcheckin;
    }

    public String getStasiunidboarding() {
        return stasiunidboarding;
    }

    public void setStasiunidboarding(String stasiunidboarding) {
        this.stasiunidboarding = stasiunidboarding;
    }

    public String getDiscountid() {
        return discountid;
    }

    public void setDiscountid(String discountid) {
        this.discountid = discountid;
    }

    public String getCheckinnum() {
        return checkinnum;
    }

    public void setCheckinnum(String checkinnum) {
        this.checkinnum = checkinnum;
    }

    public String getGrpreservationpsgid() {
        return grpreservationpsgid;
    }

    public void setGrpreservationpsgid(String grpreservationpsgid) {
        this.grpreservationpsgid = grpreservationpsgid;
    }

    public String getWagondetid() {
        return wagondetid;
    }

    public void setWagondetid(String wagondetid) {
        this.wagondetid = wagondetid;
    }

    public String getStamformdetid() {
        return stamformdetid;
    }

    public void setStamformdetid(String stamformdetid) {
        this.stamformdetid = stamformdetid;
    }

    public String getTitleid() {
        return titleid;
    }

    public void setTitleid(String titleid) {
        this.titleid = titleid;
    }

    public LocalDate getPsgbirthdate() {
        return psgbirthdate;
    }

    public void setPsgbirthdate(LocalDate psgbirthdate) {
        this.psgbirthdate = psgbirthdate;
    }

    public String getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        this.ticketnum = ticketnum;
    }

    public String getStasiunidbook() {
        return stasiunidbook;
    }

    public void setStasiunidbook(String stasiunidbook) {
        this.stasiunidbook = stasiunidbook;
    }

    public LocalDateTime getBookedon() {
        return bookedon;
    }

    public void setBookedon(LocalDateTime bookedon) {
        this.bookedon = bookedon;
    }

    public long getDiscamount() {
        return discamount;
    }

    public void setDiscamount(long discamount) {
        this.discamount = discamount;
    }

    public String getPointstat() {
        return pointstat;
    }

    public void setPointstat(String pointstat) {
        this.pointstat = pointstat;
    }

    public int getRedeemvalue() {
        return redeemvalue;
    }

    public void setRedeemvalue(int redeemvalue) {
        this.redeemvalue = redeemvalue;
    }

    public long getRateamount() {
        return rateamount;
    }

    public void setRateamount(long rateamount) {
        this.rateamount = rateamount;
    }

    public long getRedamount() {
        return redamount;
    }

    public void setRedamount(long redamount) {
        this.redamount = redamount;
    }

    public int getTmaxprint() {
        return tmaxprint;
    }

    public void setTmaxprint(int tmaxprint) {
        this.tmaxprint = tmaxprint;
    }

    public int getCmaxprint() {
        return cmaxprint;
    }

    public void setCmaxprint(int cmaxprint) {
        this.cmaxprint = cmaxprint;
    }

    public String getRef1() {
        return ref1;
    }

    public void setRef1(String ref1) {
        this.ref1 = ref1;
    }

    public LocalDateTime getReleaseon() {
        return releaseon;
    }

    public void setReleaseon(LocalDateTime releaseon) {
        this.releaseon = releaseon;
    }
}