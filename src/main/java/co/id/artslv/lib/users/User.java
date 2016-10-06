/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.users;


import co.id.artslv.lib.org.Stasiun;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_USER")
public class User implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_USER_ID")
    private String id;
    @Column(name = "C_USER_USERNAME")
    private String userusername;
    @Column(name = "C_USER_PASSWORD")
    private String userpassword;
    
    @Column(name = "C_USER_FIRSTNAME")
    private String userfirstname;
    @Column(name = "C_USER_LASTNAME")
    private String userlastname;
    @Column(name = "C_USER_CALLNAME")
    private String usercallname;
    @Column(name = "C_USER_PHONE")
    private String userphone;
    @Column(name = "C_USER_FAX")
    private String userfax;
    @Column(name = "C_USER_MOBILE")
    private String usermobile;
    @Column(name = "C_USER_EMAIL")
    private String useremail;
    @Column(name = "C_USER_ALTEMAIL")
    private String useraltemail;
    @Column(name = "C_USER_ADDRESS1")
    private String useraddress1;
    @Column(name = "C_USER_ADDRESS2")
    private String useraddress2;
    @Column(name = "C_USER_POSTALCODE")
    private String userpostalcode;
    @Column(name = "C_USER_RQID")
    private String rqid;
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;
    
    @NotNull
    @Column(name = "C_USER_STATUS")
    private String userstatus;
    @Column(name = "C_USER_DOMAIN")
    private String userdomain;
    @Column(name = "C_USER_MODIFIEDBY")
    private String usermodifiedby;
    
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_USER_DATEOFBIRTH")
    private LocalDate userdateofbirth;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_USER_MODIFIEDON")
    private LocalDateTime usermodifiedon;
    
    @Column(name = "C_USER_LOGINATTEMPT")
    private int userloginattempt;
    
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_USER_STARTDATE")
    private LocalDate userstartdate;
    
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_USER_ENDDATE")
    private LocalDate userenddate;
    
    @JsonInclude(Include.NON_NULL)
    @Transient 
    private String action;
    
    @Column(name = "C_USERGROUP_ID")
    private String usergroupid;
    
    @Column(name = "C_USERTYPE_ID")
    private String usertypeid;
    
    @Column(name = "C_USER_BYPASSIP")
    private String userbypassip;
    
    @Transient 
    private Usertype usertype;
    
    @Transient 
    private Usergroup usergroup;
    
    @Transient 
    private Stasiun stasiun;
    
    @Transient 
    private List<Userpass> listuserpass;
    
    public Usertype getUsertype() {
        return usertype;
    }

    public void setUsertype(Usertype usertype) {
        this.usertype = usertype;
    }
    
    public User(){
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserusername() {
        return userusername;
    }

    public void setUserusername(String userusername) {
        this.userusername = userusername;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public void setUserpassword(String userpassword) {
        this.userpassword = userpassword;
    }

    public String getUserfirstname() {
        return userfirstname;
    }

    public void setUserfirstname(String userfirstname) {
        this.userfirstname = userfirstname;
    }


    public String getUserlastname() {
        return userlastname;
    }

    public void setUserlastname(String userlastname) {
        this.userlastname = userlastname;
    }

    public String getUsercallname() {
        return usercallname;
    }

    public void setUsercallname(String usercallname) {
        this.usercallname = usercallname;
    }

    public String getUserphone() {
        return userphone;
    }

    public void setUserphone(String userphone) {
        this.userphone = userphone;
    }

    public String getUserfax() {
        return userfax;
    }

    public void setUserfax(String userfax) {
        this.userfax = userfax;
    }

    public String getUsermobile() {
        return usermobile;
    }

    public void setUsermobile(String usermobile) {
        this.usermobile = usermobile;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUseraltemail() {
        return useraltemail;
    }

    public void setUseraltemail(String useraltemail) {
        this.useraltemail = useraltemail;
    }

    public String getUseraddress1() {
        return useraddress1;
    }

    public void setUseraddress1(String useraddress1) {
        this.useraddress1 = useraddress1;
    }

    public String getUseraddress2() {
        return useraddress2;
    }

    public void setUseraddress2(String useraddress2) {
        this.useraddress2 = useraddress2;
    }

    public String getUserpostalcode() {
        return userpostalcode;
    }

    public void setUserpostalcode(String userpostalcode) {
        this.userpostalcode = userpostalcode;
    }

    public String getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(String usergroupid) {
        this.usergroupid = usergroupid;
    }

    public String getUsertypeid() {
        return usertypeid;
    }

    public void setUsertypeid(String usertypeid) {
        this.usertypeid = usertypeid;
    }
    
    public String getUserdomain() {
        return userdomain;
    }

    public void setUserdomain(String userdomain) {
        this.userdomain = userdomain;
    }

    public String getUsermodifiedby() {
        return usermodifiedby;
    }

    public void setUsermodifiedby(String usermodifiedby) {
        this.usermodifiedby = usermodifiedby;
    }

    public LocalDate getUserdateofbirth() {
        return userdateofbirth;
    }

    public void setUserdateofbirth(LocalDate userdateofbirth) {
        this.userdateofbirth = userdateofbirth;
    }


    public LocalDateTime getUsermodifiedon() {
        return usermodifiedon;
    }

    public void setUsermodifiedon(LocalDateTime usermodifiedon) {
        this.usermodifiedon = usermodifiedon;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getUserstatus() {
        return userstatus;
    }

    public void setUserstatus(String userstatus) {
        this.userstatus = userstatus;
    }

    public int getUserloginattempt() {
        return userloginattempt;
    }

    public void setUserloginattempt(int userloginattempt) {
        this.userloginattempt = userloginattempt;
    }

    public LocalDate getUserstartdate() {
        return userstartdate;
    }

    public void setUserstartdate(LocalDate userstartdate) {
        this.userstartdate = userstartdate;
    }

    public LocalDate getUserenddate() {
        return userenddate;
    }

    public void setUserenddate(LocalDate userenddate) {
        this.userenddate = userenddate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Usergroup getUsergroup() {
        return usergroup;
    }

    public void setUsergroup(Usergroup usergroup) {
        this.usergroup = usergroup;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

    public String getRqid() {
        return rqid;
    }

    public void setRqid(String rqid) {
        this.rqid = rqid;
    }

    public List<Userpass> getListuserpass() {
        return listuserpass;
    }

    public void setListuserpass(List<Userpass> listuserpass) {
        this.listuserpass = listuserpass;
    }

    public String getUserbypassip() {
        return userbypassip;
    }

    public void setUserbypassip(String userbypassip) {
        this.userbypassip = userbypassip;
    }
}
