/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.closing;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.users.Shift;
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
 * @author Arif
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_CLOSING")
public class Closing implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_CLOSING_ID")
    private String id;
    @Column(name = "C_CLOSING_DOCNUM")
    private String docnum;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_CLOSING_DATE")
    private LocalDate date;
    @Column(name = "C_CLOSING_TOTAMOUNT")
    private BigDecimal totamount;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_CLOSING_A8DATE")
    private LocalDate a8date;
    @Column(name = "C_CLOSING_A8NUM")
    private String a8num;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_CLOSING_MODIFIEDON")
    private LocalDateTime closingmodifiedon;
    @Column(name = "C_CLOSING_MODIFIEDBY")
    private String closingmodifiedby;
    @Column(name = "C_CLOSING_STATUS")
    private String status;
    @Column(name = "C_CLOSING_DOMAIN")
    private String domain;
    @Column(name = "C_SHIFT_ID")
    private String shiftid;
    @Column(name = "C_CLOSING_STASIUNCODE")
    private String stasiuncode;
    @Column(name = "C_CLOSING_PIC")
    private String pic;
    @Column(name = "C_CLOSING_AREACODE")
    private String areacode;
    @Column(name = "C_CLOSING_STASIUNPC")
    private String stasiunpc;
    @Column(name = "C_CLOSING_DOCNUMSAP")
    private String docnumsap;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_CLOSING_POSTINGDATE")
    private LocalDate postingdate;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private Shift shift;

    @Transient
    private Stasiun stasiun;

    public Closing() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getTotamount() {
        return totamount;
    }

    public void setTotamount(BigDecimal totamount) {
        this.totamount = totamount;
    }

    public LocalDate getA8date() {
        return a8date;
    }

    public void setA8date(LocalDate a8date) {
        this.a8date = a8date;
    }

    public String getA8num() {
        return a8num;
    }

    public void setA8num(String a8num) {
        this.a8num = a8num;
    }

    public LocalDateTime getClosingmodifiedon() {
        return closingmodifiedon;
    }

    public void setClosingmodifiedon(LocalDateTime closingmodifiedon) {
        this.closingmodifiedon = closingmodifiedon;
    }

    public String getClosingmodifiedby() {
        return closingmodifiedby;
    }

    public void setClosingmodifiedby(String closingmodifiedby) {
        this.closingmodifiedby = closingmodifiedby;
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

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public String getStasiuncode() {
        return stasiuncode;
    }

    public void setStasiuncode(String stasiuncode) {
        this.stasiuncode = stasiuncode;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getStasiunpc() {
        return stasiunpc;
    }

    public void setStasiunpc(String stasiunpc) {
        this.stasiunpc = stasiunpc;
    }

    public String getDocnumsap() {
        return docnumsap;
    }

    public void setDocnumsap(String docnumsap) {
        this.docnumsap = docnumsap;
    }

    public LocalDate getPostingdate() {
        return postingdate;
    }

    public void setPostingdate(LocalDate postingdate) {
        this.postingdate = postingdate;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }


}
