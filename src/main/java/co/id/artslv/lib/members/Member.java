package co.id.artslv.lib.members;

import co.id.artslv.lib.location.City;
import co.id.artslv.lib.org.Title;
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
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_MEMBER")
public class Member implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MEMBER_ID")
    private String id;

    @Column(name = "C_MEMBER_FIRSTNAME")
    private String memberfirstname;

    @Column(name = "C_MEMBER_PHONENUM")
    private String memberphonenum;
    
    @Column(name = "C_MEMBER_PHONENUM2")
    private String memberphonenum2;

    @Column(name = "C_MEMBER_EMAIL")
    private String memberemail;

    @Column(name = "C_MEMBER_STATUS")
    private String memberstatus;

    @Column(name = "C_MEMBER_DOMAIN")
    private String memberdomain;

    @Column(name = "C_MEMBER_MODIFIEDBY")
    private String membermodifiedby;
 
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MEMBER_MODIFIEDON")
    private LocalDateTime membermodifiedon;
    
    @Column(name = "C_MEMBER_LASTNAME")
    private String memberlastname;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMBER_DATEOFBIRTH")
    private LocalDate memberdateofbirth;
    
    @Column(name = "C_MEMBER_ADDRESS1")
    private String memberadress1;
    
    @Column(name = "C_MEMBER_ADDRESS2")
    private String memberaddress2;
    
    @Column(name = "C_OCCUPATIONTYPE_ID")
    private String occupationtypeid;
    
//    @Column(name = "C_PROVINCE_ID1")
//    private String provinceid1;
//
//    @Column(name = "C_PROVINCE_ID2")
//    private String provinceid2;
    
    @Column(name = "C_CITY_ID1")
    private String cityid1;
    
    @Column(name = "C_CITY_ID2")
    private String cityid2;
    
    @Column(name = "C_MEMBER_POSTALCODE1")
    private String memberpostalcode1;
    
    @Column(name = "C_MEMBER_POSTALCODE2")
    private String memberpostalcode2;
    
    @Column(name = "C_UNIT_ID")
    private String unitid;
    
    @Column(name = "C_USER_ID")
    private String userid;
    
    @Column(name = "C_TITLE_ID")
    private String titleid;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
//    @Transient
//    private Province province;
    @Transient
    private City city;
    @Transient
    private Unit unit;
    @Transient
    private User user;
    @Transient
    private Occupationtype occupationtype;
    @Transient
    private Title title;
    
    public Member() {    
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemberfirstname() {
        return memberfirstname;
    }

    public void setMemberfirstname(String memberfirstname) {
        this.memberfirstname = memberfirstname;
    }

    public String getMemberphonenum() {
        return memberphonenum;
    }

    public void setMemberphonenum(String memberphonenum) {
        this.memberphonenum = memberphonenum;
    }

    public String getMemberphonenum2() {
        return memberphonenum2;
    }

    public void setMemberphonenum2(String memberphonenum2) {
        this.memberphonenum2 = memberphonenum2;
    }
    
    public String getMemberemail() {
        return memberemail;
    }

    public void setMemberemail(String memberemail) {
        this.memberemail = memberemail;
    }

    public String getMemberstatus() {
        return memberstatus;
    }

    public void setMemberstatus(String memberstatus) {
        this.memberstatus = memberstatus;
    }

    public String getMemberdomain() {
        return memberdomain;
    }

    public void setMemberdomain(String memberdomain) {
        this.memberdomain = memberdomain;
    }

    public String getMembermodifiedby() {
        return membermodifiedby;
    }

    public void setMembermodifiedby(String membermodifiedby) {
        this.membermodifiedby = membermodifiedby;
    }

    public LocalDateTime getMembermodifiedon() {
        return membermodifiedon;
    }

    public void setMembermodifiedon(LocalDateTime membermodifiedon) {
        this.membermodifiedon = membermodifiedon;
    }
    
    public String getMemberlastname() {
        return memberlastname;
    }

    public void setMemberlastname(String memberlastname) {
        this.memberlastname = memberlastname;
    }

    public LocalDate getMemberdateofbirth() {
        return memberdateofbirth;
    }

    public void setMemberdateofbirth(LocalDate memberdateofbirth) {
        this.memberdateofbirth = memberdateofbirth;
    }

    public String getMemberadress1() {
        return memberadress1;
    }

    public void setMemberadress1(String memberadress1) {
        this.memberadress1 = memberadress1;
    }

    public String getMemberaddress2() {
        return memberaddress2;
    }

    public void setMemberaddress2(String memberaddress2) {
        this.memberaddress2 = memberaddress2;
    }

    public String getOccuupationtypeid() {
        return occupationtypeid;
    }

    public void setOccuupationtypeid(String occuupationtypeid) {
        this.occupationtypeid = occuupationtypeid;
    }

//    public String getProvinceid1() {
//        return provinceid1;
//    }
//
//    public void setProvinceid1(String provinceid1) {
//        this.provinceid1 = provinceid1;
//    }
//
//    public String getProvinceid2() {
//        return provinceid2;
//    }
//
//    public void setProvinceid2(String provinceid2) {
//        this.provinceid2 = provinceid2;
//    }

    public String getCityid1() {
        return cityid1;
    }

    public void setCityid1(String cityid1) {
        this.cityid1 = cityid1;
    }

    public String getCityid2() {
        return cityid2;
    }

    public void setCityid2(String cityid2) {
        this.cityid2 = cityid2;
    }

    public String getMemberpostalcode1() {
        return memberpostalcode1;
    }

    public void setMemberpostalcode1(String memberpostalcode1) {
        this.memberpostalcode1 = memberpostalcode1;
    }

    public String getMemberpostalcode2() {
        return memberpostalcode2;
    }

    public void setMemberpostalcode2(String memberpostalcode2) {
        this.memberpostalcode2 = memberpostalcode2;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

//    public Province getProvince() {
//        return province;
//    }
//
//    public void setProvince(Province province) {
//        this.province = province;
//    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Occupationtype getOccupationtype() {
        return occupationtype;
    }

    public void setOccupationtype(Occupationtype occupationtype) {
        this.occupationtype = occupationtype;
    }

    public String getOccupationtypeid() {
        return occupationtypeid;
    }

    public void setOccupationtypeid(String occupationtypeid) {
        this.occupationtypeid = occupationtypeid;
    }

    public String getTitleid() {
        return titleid;
    }

    public void setTitleid(String titleid) {
        this.titleid = titleid;
    }

    public Title getTitle() {
        return title;
    }

    public void setTitle(Title title) {
        this.title = title;
    }
}
