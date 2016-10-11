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

    @Column(name = "c_user_username", table = "arts_t_user", nullable = false, length = 50)
    private String Username;

    @Column(name = "c_user_password", table = "arts_t_user", nullable = false, length = 60)
    private String Password;

    @Column(name = "c_user_rqid", table = "arts_t_user", nullable = false, length = 100)
    private String Rqid;

    @Column(name = "c_user_firstname", table = "arts_t_user", nullable = false, length = 100)
    private String Firstname;

    @Column(name = "c_user_lastname", table = "arts_t_user", length = 100)
    private String Lastname;

    @Column(name = "c_user_callname", table = "arts_t_user", length = 50)
    private String Callname;

    @Column(name = "c_user_dateofbirth", table = "arts_t_user", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Dateofbirth;

    @Column(name = "c_user_phone", table = "arts_t_user", length = 50)
    private String Phone;

    @Column(name = "c_user_fax", table = "arts_t_user", length = 50)
    private String Fax;

    @Column(name = "c_user_mobile", table = "arts_t_user", nullable = false, length = 50)
    private String Mobile;

    @Column(name = "c_user_email", table = "arts_t_user", nullable = false, length = 100)
    private String Email;

    @Column(name = "c_user_altemail", table = "arts_t_user", length = 100)
    private String Altemail;

    @Column(name = "c_user_address1", table = "arts_t_user", nullable = false)
    private String Address1;

    @Column(name = "c_user_address2", table = "arts_t_user")
    private String Address2;

    @Column(name = "c_user_postalcode", table = "arts_t_user", length = 10)
    private String Postalcode;

    @Column(name = "c_user_loginattempt", table = "arts_t_user", nullable = false)
    private double Loginattempt;

    @Column(name = "c_user_startdate", table = "arts_t_user", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Startdate;

    @Column(name = "c_user_enddate", table = "arts_t_user", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Enddate;

    @Column(name = "c_usergroup_id", table = "arts_t_user", nullable = false, length = 36)
    private String UsergroupId;

    @Column(name = "c_user_status", table = "arts_t_user", nullable = false, length = 1)
    private String Status;

    @Column(name = "c_user_domain", table = "arts_t_user", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_user_modifiedby", table = "arts_t_user", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_user_modifiedon", table = "arts_t_user")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_stasiun_id", table = "arts_t_user", nullable = false, length = 36)
    private String StasiunId;

    @Column(name = "c_usertype_id", table = "arts_t_user", nullable = false, length = 36)
    private String UsertypeId;

    @Column(name = "c_user_bypassip", table = "arts_t_user", nullable = false)
    private Character UserBypassip;

    @Column(name = "c_user_createdby", table = "arts_t_user", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_user_createdon", table = "arts_t_user", nullable = false)
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

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getRqid() {
        return Rqid;
    }

    public void setRqid(String Rqid) {
        this.Rqid = Rqid;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public String getCallname() {
        return Callname;
    }

    public void setCallname(String Callname) {
        this.Callname = Callname;
    }

    public LocalDate getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(LocalDate Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String Fax) {
        this.Fax = Fax;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAltemail() {
        return Altemail;
    }

    public void setAltemail(String Altemail) {
        this.Altemail = Altemail;
    }

    public String getAddress1() {
        return Address1;
    }

    public void setAddress1(String Address1) {
        this.Address1 = Address1;
    }

    public String getAddress2() {
        return Address2;
    }

    public void setAddress2(String Address2) {
        this.Address2 = Address2;
    }

    public String getPostalcode() {
        return Postalcode;
    }

    public void setPostalcode(String Postalcode) {
        this.Postalcode = Postalcode;
    }

    public double getLoginattempt() {
        return Loginattempt;
    }

    public void setLoginattempt(double Loginattempt) {
        this.Loginattempt = Loginattempt;
    }

    public LocalDate getStartdate() {
        return Startdate;
    }

    public void setStartdate(LocalDate Startdate) {
        this.Startdate = Startdate;
    }

    public LocalDate getEnddate() {
        return Enddate;
    }

    public void setEnddate(LocalDate Enddate) {
        this.Enddate = Enddate;
    }

    public String getUsergroupId() {
        return UsergroupId;
    }

    public void setUsergroupId(String UsergroupId) {
        this.UsergroupId = UsergroupId;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
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

    public String getStasiunId() {
        return StasiunId;
    }

    public void setStasiunId(String StasiunId) {
        this.StasiunId = StasiunId;
    }

    public String getUsertypeId() {
        return UsertypeId;
    }

    public void setUsertypeId(String UsertypeId) {
        this.UsertypeId = UsertypeId;
    }

    public Character getUserBypassip() {
        return UserBypassip;
    }

    public void setUserBypassip(Character UserBypassip) {
        this.UserBypassip = UserBypassip;
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
