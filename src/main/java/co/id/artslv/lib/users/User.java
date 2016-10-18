package co.id.artslv.lib.users;

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
@Table(name = "arts_t_user")
public class User {

    @Column(name = "c_user_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_user_username")
    private String username;

    @Column(name = "c_user_password")
    private String password;

    @Column(name = "c_user_rqid")
    private String rqid;

    @Column(name = "c_user_firstname")
    private String firstname;

    @Column(name = "c_user_lastname")
    private String lastname;

    @Column(name = "c_user_callname")
    private String callname;

    @Column(name = "c_user_dateofbirth")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate dateofbirth;

    @Column(name = "c_user_phone")
    private String phone;

    @Column(name = "c_user_fax")
    private String fax;

    @Column(name = "c_user_mobile")
    private String mobile;

    @Column(name = "c_user_email")
    private String email;

    @Column(name = "c_user_altemail")
    private String altemail;

    @Column(name = "c_user_address1")
    private String address1;

    @Column(name = "c_user_address2")
    private String address2;

    @Column(name = "c_user_postalcode")
    private String postalcode;

    @Column(name = "c_user_loginattempt")
    private double loginattempt;

    @Column(name = "c_user_startdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate startdate;

    @Column(name = "c_user_enddate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate enddate;

    @Column(name = "c_usergroup_id")
    private String usergroupId;

    @Column(name = "c_user_status")
    private String status;

    @Column(name = "c_user_domain")
    private String domain;

    @Column(name = "c_user_modifiedby")
    private String modifiedby;

    @Column(name = "c_user_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name = "c_stasiun_id")
    private String stasiunId;

    @Column(name = "c_usertype_id")
    private String usertypeId;

    @Column(name = "c_user_bypassip")
    private Character userBypassip;

    @Column(name = "c_user_createdby")
    private String createdby;

    @Column(name = "c_user_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRqid() {
        return rqid;
    }

    public void setRqid(String rqid) {
        this.rqid = rqid;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getCallname() {
        return callname;
    }

    public void setCallname(String callname) {
        this.callname = callname;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAltemail() {
        return altemail;
    }

    public void setAltemail(String altemail) {
        this.altemail = altemail;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getPostalcode() {
        return postalcode;
    }

    public void setPostalcode(String postalcode) {
        this.postalcode = postalcode;
    }

    public double getLoginattempt() {
        return loginattempt;
    }

    public void setLoginattempt(double loginattempt) {
        this.loginattempt = loginattempt;
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

    public String getUsergroupId() {
        return usergroupId;
    }

    public void setUsergroupId(String usergroupId) {
        this.usergroupId = usergroupId;
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

    public String getStasiunId() {
        return stasiunId;
    }

    public void setStasiunId(String stasiunId) {
        this.stasiunId = stasiunId;
    }

    public String getUsertypeId() {
        return usertypeId;
    }

    public void setUsertypeId(String usertypeId) {
        this.usertypeId = usertypeId;
    }

    public Character getUserBypassip() {
        return userBypassip;
    }

    public void setUserBypassip(Character userBypassip) {
        this.userBypassip = userBypassip;
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
}
