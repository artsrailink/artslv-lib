package co.id.artslv.lib.members;

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
@Table(name = "KAIRTS_T_MEMBERSHIP")
public class Membership implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MEMBERSHIP_ID")
    private String id;

    @Column(name = "C_MEMBERSHIP_IDNUM")
    private String membershipidnum;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMBERSHIP_STARTDATE")
    private LocalDate membershipstartdate;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMBERSHIP_ENDDATE")
    private LocalDate membershipenddate;

//    @Column(name = "C_MEMBERSHIP_AMOUNTPOINT")
//    private int membershipamountpoint;

    @Column(name = "C_MEMBERSHIP_STATUS")
    private String membershipstatus;

    @Column(name = "C_MEMBERSHIP_DOMAIN")
    private String membershipdomain;

    @Column(name = "C_MEMBERSHIP_MODIFIEDBY")
    private String membershipmodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MEMBERSHIP_MODIFIEDON")
    private LocalDateTime membershipmodifiedon;
    
    @Column(name = "C_MEMBER_ID")
    private String memberid;
    
    @Column(name = "C_MEMBERSHIP_BEGINNINGBAL")
    private int membershipbeginningbal;

    @Column(name = "C_MEMBERSHIP_EARNPOINT")
    private int membershipearnpoint;

    @Column(name = "C_MEMBERSHIP_REDEEMPOINT")
    private int membershipredeempoint;

    @Column(name = "C_MEMBERSHIP_ENDINGBAL")
    private int membershipendingbal;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    @Transient
    private Member member;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMembershipidnum() {
        return membershipidnum;
    }

    public void setMembershipidnum(String membershipidnum) {
        this.membershipidnum = membershipidnum;
    }

    public LocalDate getMembershipstartdate() {
        return membershipstartdate;
    }

    public void setMembershipstartdate(LocalDate membershipstartdate) {
        this.membershipstartdate = membershipstartdate;
    }

    public LocalDate getMembershipenddate() {
        return membershipenddate;
    }

    public void setMembershipenddate(LocalDate membershipenddate) {
        this.membershipenddate = membershipenddate;
    }

//    public int getMembershipamountpoint() {
//        return membershipamountpoint;
//    }
//
//    public void setMembershipamountpoint(int membershipamountpoint) {
//        this.membershipamountpoint = membershipamountpoint;
//    }

    public String getMembershipstatus() {
        return membershipstatus;
    }

    public void setMembershipstatus(String membershipstatus) {
        this.membershipstatus = membershipstatus;
    }

    public String getMembershipdomain() {
        return membershipdomain;
    }

    public void setMembershipdomain(String membershipdomain) {
        this.membershipdomain = membershipdomain;
    }

    public String getMembershipmodifiedby() {
        return membershipmodifiedby;
    }

    public void setMembershipmodifiedby(String membershipmodifiedby) {
        this.membershipmodifiedby = membershipmodifiedby;
    }

    public LocalDateTime getMembershipmodifiedon() {
        return membershipmodifiedon;
    }

    public void setMembershipmodifiedon(LocalDateTime membershipmodifiedon) {
        this.membershipmodifiedon = membershipmodifiedon;
    }
    
    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }

    public int getMembershipbeginningbal() {
        return membershipbeginningbal;
    }

    public void setMembershipbeginningbal(int membershipbeginningbal) {
        this.membershipbeginningbal = membershipbeginningbal;
    }

    public int getMembershipearnpoint() {
        return membershipearnpoint;
    }

    public void setMembershipearnpoint(int membershipearnpoint) {
        this.membershipearnpoint = membershipearnpoint;
    }

    public int getMembershipredeempoint() {
        return membershipredeempoint;
    }

    public void setMembershipredeempoint(int membershipredeempoint) {
        this.membershipredeempoint = membershipredeempoint;
    }

    public int getMembershipendingbal() {
        return membershipendingbal;
    }

    public void setMembershipendingbal(int membershipendingbal) {
        this.membershipendingbal = membershipendingbal;
    }
}
