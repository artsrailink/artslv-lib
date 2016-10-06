package co.id.artslv.lib.transactions;

import co.id.artslv.lib.org.Unit;
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
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
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
 * @author Yoga Sefianto
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_GRPRESERVATION")
public class Grpreservation implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_GRPRESERVATION_ID")
    private String id;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_GRPRESERVATION_DATE")
    private LocalDateTime date;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_GRPRESERVATION_DUEDATEDP")
    private LocalDate duedatedp;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_GRPRESERVATION_DUEDATEPAY")
    private LocalDate duedatepay;
    @Column(name = "C_GRPRESERVATION_DOCNUM")
    private String docnum;
    @Column(name = "C_GRPRESERVATION_TOTAMOUNT")
    private BigDecimal totamount;
    @Column(name = "C_GRPRESERVATION_DPAMOUNT")
    private BigDecimal dpamount;
    @Column(name = "C_GRPRESERVATION_TOTPSG")
    private int totpsg;
    @Column(name = "C_GRPRESERVATION_STATUS")
    private String status;
    @Column(name = "C_GRPRESERVATION_DOMAIN")
    private String domain;
    @Column(name = "C_GRPRESERVATION_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_GRPRESERVATION_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_GRPRESERVATION_CUSTNAME")
    private String custname;
    @Column(name = "C_GRPRESERVATION_ADDRESS")
    private String address;
    @Column(name = "C_GRPRESERVATION_PHONENUM1")
    private String phonenum1;
    @Column(name = "C_GRPRESERVATION_PHONENUM2")
    private String phonenum2;
    @Column(name = "C_GRPRESERVATION_EMAIL")
    private String email;
    @Column(name = "C_UNIT_ID")
    private String unitid;
    @Column(name = "C_GRPRESERVATION_GROUPNAME")
    private String groupname;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient 
    private Unit unit;
    @Transient 
    private List<Grpreservationdet> listgrpreservationdet;
    @Transient 
    private List<Cancellation> listgrpreservationpay;
   
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public LocalDate getDuedatedp() {
        return duedatedp;
    }

    public void setDuedatedp(LocalDate duedatedp) {
        this.duedatedp = duedatedp;
    }

    public LocalDate getDuedatepay() {
        return duedatepay;
    }

    public void setDuedatepay(LocalDate duedatepay) {
        this.duedatepay = duedatepay;
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public BigDecimal getDpamount() {
        return dpamount;
    }

    public void setDpamount(BigDecimal dpamount) {
        this.dpamount = dpamount;
    }

    public int getTotpsg() {
        return totpsg;
    }

    public void setTotpsg(int totpsg) {
        this.totpsg = totpsg;
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

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenum1() {
        return phonenum1;
    }

    public void setPhonenum1(String phonenum1) {
        this.phonenum1 = phonenum1;
    }

    public String getPhonenum2() {
        return phonenum2;
    }

    public void setPhonenum2(String phonenum2) {
        this.phonenum2 = phonenum2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public List<Grpreservationdet> getListgrpreservationdet() {
        return listgrpreservationdet;
    }

    public void setListgrpreservationdet(List<Grpreservationdet> listgrpreservationdet) {
        this.listgrpreservationdet = listgrpreservationdet;
    }

    public List<Cancellation> getListgrpreservationpay() {
        return listgrpreservationpay;
    }

    public void setListgrpreservationpay(List<Cancellation> listgrpreservationpay) {
        this.listgrpreservationpay = listgrpreservationpay;
    }

}