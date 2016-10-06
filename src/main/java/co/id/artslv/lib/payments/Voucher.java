/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

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
@Table(name = "KAIRTS_T_VOUCHER")
public class Voucher implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_VOUCHER_ID")
    private String id;

    @Column(name = "C_VOUCHERTYPE_ID")
    private String vouchertypeid;
    @Column(name = "C_VOUCHERAMOUNT_ID")
    private String voucheramountid;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_VOUCHER_VALIDSTARTDATE")
    private LocalDate validstartdate;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_VOUCHER_VALIDENDDATE")
    private LocalDate validenddate;
    @Column(name = "C_VOUCHER_PSGNAME")
    private String psgname;
    @Column(name = "C_VOUCHER_PSGID")
    private String psgid;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_VOUCHER_PSGBIRTHDATE")
    private LocalDate psgbirthdate;
    @Column(name = "C_VOUCHER_PSGGENDER")
    private String psggender;
    @Column(name = "C_VOUCHER_PSGEMAIL")
    private String psgemail;
    @Column(name = "C_VOUCHER_PSGPHONENUM")
    private String psgphonenum;
    @Column(name = "C_VOUCHER_PSGADDRESS")
    private String psgaddress;
    @Column(name = "C_VOUCHER_VCNUM")
    private String vcnum;
    @Column(name = "C_USER_IDAPP1")
    private String useridapp1;
    @Column(name = "C_USER_IDAPP2")
    private String useridapp2;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_VOUCHER_APPDATE1")
    private LocalDate appdate1;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_VOUCHER_APPDATE2")
    private LocalDate appdate2;
    @Column(name = "C_VOUCHER_STATUS")
    private String status;
    @Column(name = "C_VOUCHER_DOMAIN")
    private String domain;
    @Column(name = "C_VOUCHER_MODIFIEDBY")
    private String modifiedby;
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_VOUCHER_MODIFIEDON")
    private LocalDateTime modifiedon;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    Vouchertype vouchertype;
    @Transient
    Voucheramount voucheramount;
    @Transient
    User userapp1;
    @Transient
    User userapp2;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVouchertypeid() {
        return vouchertypeid;
    }

    public void setVouchertypeid(String vouchertypeid) {
        this.vouchertypeid = vouchertypeid;
    }

    public String getVoucheramountid() {
        return voucheramountid;
    }

    public void setVoucheramountid(String voucheramountid) {
        this.voucheramountid = voucheramountid;
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

    public String getPsggender() {
        return psggender;
    }

    public void setPsggender(String psggender) {
        this.psggender = psggender;
    }

    public String getPsgemail() {
        return psgemail;
    }

    public void setPsgemail(String psgemail) {
        this.psgemail = psgemail;
    }

    public String getPsgphonenum() {
        return psgphonenum;
    }

    public void setPsgphonenum(String psgphonenum) {
        this.psgphonenum = psgphonenum;
    }

    public String getPsgaddress() {
        return psgaddress;
    }

    public void setPsgaddress(String psgaddress) {
        this.psgaddress = psgaddress;
    }

    public String getVcnum() {
        return vcnum;
    }

    public void setVcnum(String vcnum) {
        this.vcnum = vcnum;
    }

    public String getUseridapp1() {
        return useridapp1;
    }

    public void setUseridapp1(String useridapp1) {
        this.useridapp1 = useridapp1;
    }

    public String getUseridapp2() {
        return useridapp2;
    }

    public void setUseridapp2(String useridapp2) {
        this.useridapp2 = useridapp2;
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

    public Vouchertype getVouchertype() {
        return vouchertype;
    }

    public void setVouchertype(Vouchertype vouchertype) {
        this.vouchertype = vouchertype;
    }

    public Voucheramount getVoucheramount() {
        return voucheramount;
    }

    public void setVoucheramount(Voucheramount voucheramount) {
        this.voucheramount = voucheramount;
    }

    public User getUserapp1() {
        return userapp1;
    }

    public void setUserapp1(User userapp1) {
        this.userapp1 = userapp1;
    }

    public User getUserapp2() {
        return userapp2;
    }

    public void setUserapp2(User userapp2) {
        this.userapp2 = userapp2;
    }

    public LocalDate getValidstartdate() {
        return validstartdate;
    }

    public void setValidstartdate(LocalDate validstartdate) {
        this.validstartdate = validstartdate;
    }

    public LocalDate getValidenddate() {
        return validenddate;
    }

    public void setValidenddate(LocalDate validenddate) {
        this.validenddate = validenddate;
    }

    public LocalDate getPsgbirthdate() {
        return psgbirthdate;
    }

    public void setPsgbirthdate(LocalDate psgbirthdate) {
        this.psgbirthdate = psgbirthdate;
    }

    public LocalDate getAppdate1() {
        return appdate1;
    }

    public void setAppdate1(LocalDate appdate1) {
        this.appdate1 = appdate1;
    }

    public LocalDate getAppdate2() {
        return appdate2;
    }

    public void setAppdate2(LocalDate appdate2) {
        this.appdate2 = appdate2;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

}
