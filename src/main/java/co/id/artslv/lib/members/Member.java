package co.id.artslv.lib.members;

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
@Table(name = "arts_t_member")
public class Member {

    @Column(name = "c_member_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_member_firstname")
    private String Firstname;

    @Column(name = "c_member_phonenum")
    private String Phonenum;

    @Column(name = "c_member_email")
    private String Email;

    @Column(name = "c_member_status")
    private Character Status;

    @Column(name = "c_member_domain")
    private String Domain;

    @Column(name = "c_member_modifiedby")
    private String Modifiedby;

    @Column(name = "c_member_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_member_lastname")
    private String Lastname;

    @Column(name = "c_member_dateofbirth")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Dateofbirth;

    @Column(name = "c_member_address1")
    private String Address1;
    @Column(name = "c_member_address2", table = "arts_t_member")
    private String Address2;
    @Column(name = "c_occupationtype_id")
    private String OccupationtypeId;
    @Column(name = "c_city_id1")
    private String CityId1;
    @Column(name = "c_city_id2", table = "arts_t_member")
    private String CityId2;
    @Column(name = "c_member_postalcode1")
    private String Postalcode1;
    @Column(name = "c_member_postalcode2")
    private String Postalcode2;

    @Column(name = "c_unit_id")
    private String UnitId;

    @Column(name = "c_user_id")
    private String UserId;

    @Column(name = "c_member_phonenum2")
    private String Phonenum2;

    @Column(name = "c_title_id")
    private String TitleId;

    @Column(name = "c_member_createdby")
    private String Createdby;

    @Column(name = "c_member_createdon")
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

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    public String getPhonenum() {
        return Phonenum;
    }

    public void setPhonenum(String Phonenum) {
        this.Phonenum = Phonenum;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
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

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String Lastname) {
        this.Lastname = Lastname;
    }

    public LocalDate getDateofbirth() {
        return Dateofbirth;
    }

    public void setDateofbirth(LocalDate Dateofbirth) {
        this.Dateofbirth = Dateofbirth;
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

    public String getOccupationtypeId() {
        return OccupationtypeId;
    }

    public void setOccupationtypeId(String OccupationtypeId) {
        this.OccupationtypeId = OccupationtypeId;
    }

    public String getCityId1() {
        return CityId1;
    }

    public void setCityId1(String CityId1) {
        this.CityId1 = CityId1;
    }

    public String getCityId2() {
        return CityId2;
    }

    public void setCityId2(String CityId2) {
        this.CityId2 = CityId2;
    }

    public String getPostalcode1() {
        return Postalcode1;
    }

    public void setPostalcode1(String Postalcode1) {
        this.Postalcode1 = Postalcode1;
    }

    public String getPostalcode2() {
        return Postalcode2;
    }

    public void setPostalcode2(String Postalcode2) {
        this.Postalcode2 = Postalcode2;
    }

    public String getUnitId() {
        return UnitId;
    }

    public void setUnitId(String UnitId) {
        this.UnitId = UnitId;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    public String getPhonenum2() {
        return Phonenum2;
    }

    public void setPhonenum2(String Phonenum2) {
        this.Phonenum2 = Phonenum2;
    }

    public String getTitleId() {
        return TitleId;
    }

    public void setTitleId(String TitleId) {
        this.TitleId = TitleId;
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
