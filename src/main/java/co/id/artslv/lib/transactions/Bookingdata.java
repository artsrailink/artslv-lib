package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
public class Bookingdata {
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String rqid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String org;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String dest;    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")    
    private LocalDate departdate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String paycode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String noka;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int totpsgadult;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int totpsgchild;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private int totpsginfant;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String subclass;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String custname;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String email;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long totamount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long extrafee;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long netamount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private long paidamoount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType") 
    private LocalDateTime transdatetime;  
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String propscheduleid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String bookcode;    
    
    List<Pax> paxlist;

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public LocalDate getDepartdate() {
        return departdate;
    }

    public void setDepartdate(LocalDate departdate) {
        this.departdate = departdate;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public int getTotpsgadult() {
        return totpsgadult;
    }

    public void setTotpsgadult(int totpsgadult) {
        this.totpsgadult = totpsgadult;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getCustname() {
        return custname;
    }

    public void setCustname(String custname) {
        this.custname = custname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<Pax> getPaxlist() {
        return paxlist;
    }

    public void setPaxlist(List<Pax> paxlist) {
        this.paxlist = paxlist;
    }

    public String getPaycode() {
        return paycode;
    }

    public void setPaycode(String paycode) {
        this.paycode = paycode;
    }

    public int getTotpsgchild() {
        return totpsgchild;
    }

    public void setTotpsgchild(int totpsgchild) {
        this.totpsgchild = totpsgchild;
    }

    public int getTotpsginfant() {
        return totpsginfant;
    }

    public void setTotpsginfant(int totpsginfant) {
        this.totpsginfant = totpsginfant;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTotamount() {
        return totamount;
    }

    public void setTotamount(long totamount) {
        this.totamount = totamount;
    }

    public long getExtrafee() {
        return extrafee;
    }

    public void setExtrafee(long extrafee) {
        this.extrafee = extrafee;
    }

    public long getNetamount() {
        return netamount;
    }

    public void setNetamount(long netamount) {
        this.netamount = netamount;
    }

    public long getPaidamoount() {
        return paidamoount;
    }

    public void setPaidamoount(long paidamoount) {
        this.paidamoount = paidamoount;
    }

    public LocalDateTime getTransdatetime() {
        return transdatetime;
    }

    public void setTransdatetime(LocalDateTime transdatetime) {
        this.transdatetime = transdatetime;
    }   

    public String getPropscheduleid() {
        return propscheduleid;
    }

    public void setPropscheduleid(String propscheduleid) {
        this.propscheduleid = propscheduleid;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getRqid() {
        return rqid;
    }

    public void setRqid(String rqid) {
        this.rqid = rqid;
    }
    
}
