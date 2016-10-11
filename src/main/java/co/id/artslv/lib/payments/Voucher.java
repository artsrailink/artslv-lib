package co.id.artslv.lib.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
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
@Table(name = "arts_t_voucher")
public class Voucher {

    @Column(name = "c_voucher_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_vouchertype_id", table = "arts_t_voucher", nullable = false, length = 36)
    private String VouchertypeId;

    @Column(name = "c_voucheramount_id", table = "arts_t_voucher", nullable = false, length = 36)
    private String VoucheramountId;

    @Column(name = "c_voucher_validstartdate", table = "arts_t_voucher", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Validstartdate;

    @Column(name = "c_voucher_validenddate", table = "arts_t_voucher", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Validenddate;

    @Column(name = "c_voucher_psgname", table = "arts_t_voucher", length = 100)
    private String Psgname;

    @Column(name = "c_voucher_psgid", table = "arts_t_voucher", length = 50)
    private String Psgid;

    @Column(name = "c_voucher_psgbirthdate", table = "arts_t_voucher")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Psgbirthdate;

    @Column(name = "c_voucher_psggender", table = "arts_t_voucher")
    private Character Psggender;

    @Column(name = "c_voucher_psgemail", table = "arts_t_voucher", length = 100)
    private String Psgemail;

    @Column(name = "c_voucher_psgphonenum", table = "arts_t_voucher", length = 36)
    private String Psgphonenum;

    @Column(name = "c_voucher_psgaddress", table = "arts_t_voucher")
    private String Psgaddress;

    @Column(name = "c_voucher_vcnum", table = "arts_t_voucher", nullable = false, length = 100)
    private String Vcnum;

    @Column(name = "c_user_idapp1", table = "arts_t_voucher", length = 36)
    private String UserIdapp1;

    @Column(name = "c_user_idapp2", table = "arts_t_voucher", length = 36)
    private String UserIdapp2;

    @Column(name = "c_voucher_appdate1", table = "arts_t_voucher")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Appdate1;

    @Column(name = "c_voucher_appdate2", table = "arts_t_voucher")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Appdate2;

    @Column(name = "c_voucher_status", table = "arts_t_voucher", nullable = false)
    private Character Status;

    @Column(name = "c_voucher_domain", table = "arts_t_voucher", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_voucher_modifiedby", table = "arts_t_voucher", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_voucher_modifiedon", table = "arts_t_voucher", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_voucher_createdby", table = "arts_t_voucher", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_voucher_createdon", table = "arts_t_voucher", nullable = false)
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

    public String getVouchertypeId() {
        return VouchertypeId;
    }

    public void setVouchertypeId(String VouchertypeId) {
        this.VouchertypeId = VouchertypeId;
    }

    public String getVoucheramountId() {
        return VoucheramountId;
    }

    public void setVoucheramountId(String VoucheramountId) {
        this.VoucheramountId = VoucheramountId;
    }

    public LocalDate getValidstartdate() {
        return Validstartdate;
    }

    public void setValidstartdate(LocalDate Validstartdate) {
        this.Validstartdate = Validstartdate;
    }

    public LocalDate getValidenddate() {
        return Validenddate;
    }

    public void setValidenddate(LocalDate Validenddate) {
        this.Validenddate = Validenddate;
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

    public LocalDate getPsgbirthdate() {
        return Psgbirthdate;
    }

    public void setPsgbirthdate(LocalDate Psgbirthdate) {
        this.Psgbirthdate = Psgbirthdate;
    }

    public Character getPsggender() {
        return Psggender;
    }

    public void setPsggender(Character Psggender) {
        this.Psggender = Psggender;
    }

    public String getPsgemail() {
        return Psgemail;
    }

    public void setPsgemail(String Psgemail) {
        this.Psgemail = Psgemail;
    }

    public String getPsgphonenum() {
        return Psgphonenum;
    }

    public void setPsgphonenum(String Psgphonenum) {
        this.Psgphonenum = Psgphonenum;
    }

    public String getPsgaddress() {
        return Psgaddress;
    }

    public void setPsgaddress(String Psgaddress) {
        this.Psgaddress = Psgaddress;
    }

    public String getVcnum() {
        return Vcnum;
    }

    public void setVcnum(String Vcnum) {
        this.Vcnum = Vcnum;
    }

    public String getUserIdapp1() {
        return UserIdapp1;
    }

    public void setUserIdapp1(String UserIdapp1) {
        this.UserIdapp1 = UserIdapp1;
    }

    public String getUserIdapp2() {
        return UserIdapp2;
    }

    public void setUserIdapp2(String UserIdapp2) {
        this.UserIdapp2 = UserIdapp2;
    }

    public LocalDate getAppdate1() {
        return Appdate1;
    }

    public void setAppdate1(LocalDate Appdate1) {
        this.Appdate1 = Appdate1;
    }

    public LocalDate getAppdate2() {
        return Appdate2;
    }

    public void setAppdate2(LocalDate Appdate2) {
        this.Appdate2 = Appdate2;
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
