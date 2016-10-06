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
@Table(name = "KAIRTS_T_MEMSHIPTRANS")
public class MemShiptrans implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MEMSHIPTRANS_ID")
    private String id;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMSHIPTRANS_VALIDDATE")
    private LocalDate memshiptransvaliddate;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMSHIPTRANS_EXPDATE")
    private LocalDate memshiptransexpdate;
    
    @Column(name = "C_MEMSHIPTRANS_TYPE")
    private String memshiptranstype;

//    @Column(name = "C_MEMSHIPTRANS_VALUEPOINT")
//    private int memshiptransvaluepoint;
//
//    @Column(name = "C_MEMSHIPTRANS_BALANCE")
//    private int memshiptransbalance;
    
    @Column(name = "C_MEMSHIPTRANS_STATUS")
    private String memshiptransstatus;
     
    @Column(name = "C_MEMSHIPTRANS_DOMAIN")
    private String memshiptransdomain;
    
    @Column(name = "C_MEMSHIPTRANS_MODIFIEDBY")
    private String memshiptransmodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MEMSHIPTRANS_MODIFIEDON")
    private LocalDateTime memshiptransmodifiedon;
    
    @Column(name = "C_MEMBERSHIP_ID")
    private String membershipid;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MEMSHIPTRANS_DATE")
    private LocalDateTime memshiptransdate;
    
    @Column(name = "C_MEMSHIPTRANS_REF")
    private String memshiptransref;
    
    @Column(name = "C_MEMBERSHIP_BEGINNINGBAL")
    private int memshiptransbeginningbal;

    @Column(name = "C_MEMBERSHIP_EARNPOINT")
    private int memshiptransearnpoint;

    @Column(name = "C_MEMBERSHIP_REDEEMPOINT")
    private int memshiptransredeempoint;

    @Column(name = "C_MEMBERSHIP_ENDINGBAL")
    private int memshiptransendingbal;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    @Transient
    private Membership membership;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getMemshiptransvaliddate() {
        return memshiptransvaliddate;
    }

    public void setMemshiptransvaliddate(LocalDate memshiptransvaliddate) {
        this.memshiptransvaliddate = memshiptransvaliddate;
    }

    public LocalDate getMemshiptransexpdate() {
        return memshiptransexpdate;
    }

    public void setMemshiptransexpdate(LocalDate memshiptransexpdate) {
        this.memshiptransexpdate = memshiptransexpdate;
    }

    public String getMemshiptranstype() {
        return memshiptranstype;
    }

    public void setMemshiptranstype(String memshiptranstype) {
        this.memshiptranstype = memshiptranstype;
    }

//    public int getMemshiptransvaluepoint() {
//        return memshiptransvaluepoint;
//    }
//
//    public void setMemshiptransvaluepoint(int memshiptransvaluepoint) {
//        this.memshiptransvaluepoint = memshiptransvaluepoint;
//    }
//
//    public int getMemshiptransbalance() {
//        return memshiptransbalance;
//    }
//
//    public void setMemshiptransbalance(int memshiptransbalance) {
//        this.memshiptransbalance = memshiptransbalance;
//    }

    public String getMemshiptransstatus() {
        return memshiptransstatus;
    }

    public void setMemshiptransstatus(String memshiptransstatus) {
        this.memshiptransstatus = memshiptransstatus;
    }

    public String getMemshiptransdomain() {
        return memshiptransdomain;
    }

    public void setMemshiptransdomain(String memshiptransdomain) {
        this.memshiptransdomain = memshiptransdomain;
    }

    public String getMemshiptransmodifiedby() {
        return memshiptransmodifiedby;
    }

    public void setMemshiptransmodifiedby(String memshiptransmodifiedby) {
        this.memshiptransmodifiedby = memshiptransmodifiedby;
    }

    public LocalDateTime getMemshiptransmodifiedon() {
        return memshiptransmodifiedon;
    }

    public void setMemshiptransmodifiedon(LocalDateTime memshiptransmodifiedon) {
        this.memshiptransmodifiedon = memshiptransmodifiedon;
    }
    
    public String getMembershipid() {
        return membershipid;
    }

    public void setMembershipid(String membershipid) {
        this.membershipid = membershipid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Membership getMembership() {
        return membership;
    }

    public void setMembership(Membership membership) {
        this.membership = membership;
    }

    public LocalDateTime getMemshiptransdate() {
        return memshiptransdate;
    }

    public void setMemshiptransdate(LocalDateTime memshiptransdate) {
        this.memshiptransdate = memshiptransdate;
    }

    public String getMemshiptransref() {
        return memshiptransref;
    }

    public void setMemshiptransref(String memshiptransref) {
        this.memshiptransref = memshiptransref;
    }

    public int getMemshiptransbeginningbal() {
        return memshiptransbeginningbal;
    }

    public void setMemshiptransbeginningbal(int memshiptransbeginningbal) {
        this.memshiptransbeginningbal = memshiptransbeginningbal;
    }

    public int getMemshiptransearnpoint() {
        return memshiptransearnpoint;
    }

    public void setMemshiptransearnpoint(int memshiptransearnpoint) {
        this.memshiptransearnpoint = memshiptransearnpoint;
    }

    public int getMemshiptransredeempoint() {
        return memshiptransredeempoint;
    }

    public void setMemshiptransredeempoint(int memshiptransredeempoint) {
        this.memshiptransredeempoint = memshiptransredeempoint;
    }

    public int getMemshiptransendingbal() {
        return memshiptransendingbal;
    }

    public void setMemshiptransendingbal(int memshiptransendingbal) {
        this.memshiptransendingbal = memshiptransendingbal;
    }
}
