/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.manualtrans;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.org.Unit;
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
import java.math.BigDecimal;
import java.time.LocalDate;
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
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_REFUNDUPLOAD")
public class Refundupload implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_REFUNDUPLOAD_ID")
    private String id;
    @Column(name = "C_REFUNDUPLOAD_BOOKCODE")
    private String bookcode;
    @Column(name = "C_REFUNDUPLOAD_TICKETNUM")
    private String ticketnum;
    @Column(name = "C_REFUNDUPLOAD_STCODEORG")
    private String stcodeorg;
    @Column(name = "C_REFUNDUPLOAD_STCODEDEST")
    private String stcodedest;
    @Column(name = "C_REFUNDUPLOAD_PSGNAME")
    private String psgname;
    @Column(name = "C_REFUNDUPLOAD_AMOUNT")
    private BigDecimal amount;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REFUNDUPLOAD_CANCELDATE")
    private LocalDate canceldate;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REFUNDUPLOAD_REFUNDDATEMIN")
    private LocalDate refunddatemin;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REFUNDUPLOAD_REFUNDDATEMAX")
    private LocalDate refunddatemax;
    @Column(name = "C_REFUNDUPLOAD_REFUNDTYPE")
    private String refundtype;
    @Column(name = "C_REFUNDUPLOAD_STCODEREFUND")
    private String stcoderefund;
    @Column(name = "C_USER_ID")
    private String userid;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REFUNDUPLOAD_REFUNDDATE")
    private LocalDate refunddate;
    @Column(name = "C_STASIUN_IDREFUND")
    private String stasiunidrefund;
    @Column(name = "C_REFUNDUPLOAD_STATUS")
    private String status;
    @Column(name = "C_REFUNDUPLOAD_DOMAIN")
    private String domain;
    @Column(name = "C_REFUNDUPLOAD_MODIFIEDBY")
    private String modifiedby;
    @Column(name = "C_REFUNDUPLOAD_BANKNAME")
    private String bankname;
    @Column(name = "C_REFUNDUPLOAD_BANKACCNAME")
    private String bankccname;
    @Column(name = "C_REFUNDUPLOAD_BANKACCNUM")
    private String bankccnum;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_REFUNDUPLOAD_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_REFUNDUPLOAD_MAXPRINT")
    private int maxprint;
    @Column(name = "C_REFUNDUPLOAD_REFUNDNUM")
    private String refundnum;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_REFUNDUPLOAD_PRINTEDON")
    private LocalDateTime printedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Stasiun stasiunrefund;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private User user;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Unit unit;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private int no_urut;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate startdate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate enddate;

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

    public String getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        this.ticketnum = ticketnum;
    }

    public String getStcodeorg() {
        return stcodeorg;
    }

    public void setStcodeorg(String stcodeorg) {
        this.stcodeorg = stcodeorg;
    }

    public String getStcodedest() {
        return stcodedest;
    }

    public void setStcodedest(String stcodedest) {
        this.stcodedest = stcodedest;
    }

    public String getPsgname() {
        return psgname;
    }

    public void setPsgname(String psgname) {
        this.psgname = psgname;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getRefundtype() {
        return refundtype;
    }

    public void setRefundtype(String refundtype) {
        this.refundtype = refundtype;
    }

    public String getStcoderefund() {
        return stcoderefund;
    }

    public void setStcoderefund(String stcoderefund) {
        this.stcoderefund = stcoderefund;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getStasiunidrefund() {
        return stasiunidrefund;
    }

    public void setStasiunidrefund(String stasiunidrefund) {
        this.stasiunidrefund = stasiunidrefund;
    }

    public Stasiun getStasiunrefund() {
        return stasiunrefund;
    }

    public void setStasiunrefund(Stasiun stasiunrefund) {
        this.stasiunrefund = stasiunrefund;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public int getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(int no_urut) {
        this.no_urut = no_urut;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
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

    public String getBankname() {
        return bankname;
    }

    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    public String getBankccname() {
        return bankccname;
    }

    public void setBankccname(String bankccname) {
        this.bankccname = bankccname;
    }

    public String getBankccnum() {
        return bankccnum;
    }

    public void setBankccnum(String bankccnum) {
        this.bankccnum = bankccnum;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public LocalDate getCanceldate() {
        return canceldate;
    }

    public void setCanceldate(LocalDate canceldate) {
        this.canceldate = canceldate;
    }

    public LocalDate getRefunddatemin() {
        return refunddatemin;
    }

    public void setRefunddatemin(LocalDate refunddatemin) {
        this.refunddatemin = refunddatemin;
    }

    public LocalDate getRefunddatemax() {
        return refunddatemax;
    }

    public void setRefunddatemax(LocalDate refunddatemax) {
        this.refunddatemax = refunddatemax;
    }

    public LocalDate getRefunddate() {
        return refunddate;
    }

    public void setRefunddate(LocalDate refunddate) {
        this.refunddate = refunddate;
    }

    public int getMaxprint() {
        return maxprint;
    }

    public void setMaxprint(int maxprint) {
        this.maxprint = maxprint;
    }

    public String getRefundnum() {
        return refundnum;
    }

    public void setRefundnum(String refundnum) {
        this.refundnum = refundnum;
    }

    public LocalDateTime getPrintedon() {
        return printedon;
    }

    public void setPrintedon(LocalDateTime printedon) {
        this.printedon = printedon;
    }

}
