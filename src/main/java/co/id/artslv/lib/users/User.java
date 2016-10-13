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
    private String Username;

    @Column(name = "c_user_password")
    private String Password;

    @Column(name = "c_user_rqid")
    private String Rqid;

    @Column(name = "c_user_firstname")
    private String Firstname;

    @Column(name = "c_user_lastname")
    private String Lastname;

    @Column(name = "c_user_callname")
    private String Callname;

    @Column(name = "c_user_dateofbirth")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Dateofbirth;

    @Column(name = "c_user_phone")
    private String Phone;

    @Column(name = "c_user_fax")
    private String Fax;

    @Column(name = "c_user_mobile")
    private String Mobile;

    @Column(name = "c_user_email")
    private String Email;

    @Column(name = "c_user_altemail")
    private String Altemail;

    @Column(name = "c_user_address1")
    private String Address1;

    @Column(name = "c_user_address2")
    private String Address2;

    @Column(name = "c_user_postalcode")
    private String Postalcode;

    @Column(name = "c_user_loginattempt")
    private double Loginattempt;

    @Column(name = "c_user_startdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Startdate;

    @Column(name = "c_user_enddate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Enddate;

    @Column(name = "c_usergroup_id")
    private String UsergroupId;

    @Column(name = "c_user_status")
    private String Status;

    @Column(name = "c_user_domain")
    private String Domain;

    @Column(name = "c_user_modifiedby")
    private String Modifiedby;

    @Column(name = "c_user_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_stasiun_id")
    private String StasiunId;

    @Column(name = "c_usertype_id")
    private String UsertypeId;

    @Column(name = "c_user_bypassip")
    private Character UserBypassip;

    @Column(name = "c_user_createdby")
    private String Createdby;

    @Column(name = "c_user_createdon")
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
