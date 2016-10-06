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
@Table(name = "KAIRTS_T_MEMMEMTYPE")
public class MemMemtype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MEMMEMTYPE_ID")
    private String id;

    @Column(name = "C_MEMBERTYPE_ID")
    private String membertypeid;

    @Column(name = "C_MEMBER_ID")
    private String memberid;

    @Column(name = "C_MEMMEMTYPE_IDNUM")
    private String memmemtypeidnum;

    @Column(name = "C_MEMMEMTYPE_STATUS")
    private String memmemtypestatus;
    
    @Column(name = "C_MEMMEMTYPE_DOMAIN")
    private String memmemtypedomain;
    
    @Column(name = "C_MEMMEMTYPE_MODIFIEDBY")
    private String memmemtypemodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MEMMEMTYPE_MODIFIEDON")
    private LocalDateTime memmemtypemodifiedon;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMMEMTYPE_STARTDATE")
    private LocalDate memmemtypestartdate;
    
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMMEMTYPE_ENDDATE")
    private LocalDate memmemtypeenddate;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    @Transient
    private Member member;
    
    @Transient
    private Membertype membertype;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMembertypeid() {
        return membertypeid;
    }

    public void setMembertypeid(String membertypeid) {
        this.membertypeid = membertypeid;
    }

    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getMemmemtypeidnum() {
        return memmemtypeidnum;
    }

    public void setMemmemtypeidnum(String memmemtypeidnum) {
        this.memmemtypeidnum = memmemtypeidnum;
    }

    public String getMemmemtypestatus() {
        return memmemtypestatus;
    }

    public void setMemmemtypestatus(String memmemtypestatus) {
        this.memmemtypestatus = memmemtypestatus;
    }

    public String getMemmemtypedomain() {
        return memmemtypedomain;
    }

    public void setMemmemtypedomain(String memmemtypedomain) {
        this.memmemtypedomain = memmemtypedomain;
    }

    public String getMemmemtypemodifiedby() {
        return memmemtypemodifiedby;
    }

    public void setMemmemtypemodifiedby(String memmemtypemodifiedby) {
        this.memmemtypemodifiedby = memmemtypemodifiedby;
    }

    public LocalDateTime getMemmemtypemodifiedon() {
        return memmemtypemodifiedon;
    }

    public void setMemmemtypemodifiedon(LocalDateTime memmemtypemodifiedon) {
        this.memmemtypemodifiedon = memmemtypemodifiedon;
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

    public Membertype getMembertype() {
        return membertype;
    }

    public void setMembertype(Membertype membertype) {
        this.membertype = membertype;
    }

    public LocalDate getMemmemtypestartdate() {
        return memmemtypestartdate;
    }

    public void setMemmemtypestartdate(LocalDate memmemtypestartdate) {
        this.memmemtypestartdate = memmemtypestartdate;
    }

    public LocalDate getMemmemtypeenddate() {
        return memmemtypeenddate;
    }

    public void setMemmemtypeenddate(LocalDate memmemtypeenddate) {
        this.memmemtypeenddate = memmemtypeenddate;
    }
}
