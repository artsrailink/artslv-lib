/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.manualtrans;

import co.id.artslv.lib.org.Stasiun;
import co.id.artslv.lib.schedule.Schedule;
import co.id.artslv.lib.trains.Wagonclass;
import co.id.artslv.lib.users.Shift;
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
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_COMPENSATION")
public class Compensation implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_COMPENSATION_ID")
    private String id;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_COMPENSATION_DATE")
    private LocalDate date;
    @Column(name = "C_COMPENSATION_DOCTITLE")
    private String doctitle;
    @Column(name = "C_COMPENSATION_DOCNUM")
    private int docnum;
    @Column(name = "C_SCHEDULE_ID")
    private String scheduleid;
    @Column(name = "C_STASIUN_IDORG")
    private String stasiunidorg;
    @Column(name = "C_STASIUN_IDDEST")
    private String stasiuniddest;
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;
    @Column(name = "C_COMPENSATION_TYPE")
    private String type;
//    @Column(name = "C_COMPENSATION_TOTTICKET")
//    private int totticket;
    @Column(name = "C_COMPENSATION_REFUNDAMOUNT")
    private BigDecimal refundamount;
    @Column(name = "C_COMPENSATION_REASON")
    private String reason;
    @Column(name = "C_COMPENSATION_STATUS")
    private String status;
    @Column(name = "C_COMPENSATION_DOMAIN")
    private String domain;
    @Column(name = "C_COMPENSATION_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_COMPENSATION_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_STASIUN_IDREFUND")
    private String stasiunidrefund;
    @Column(name = "C_SHIFT_ID")
    private String shiftid;  
    @Column(name = "C_COMPENSATION_BOOKCODE")
    private String bookcode;    
    @Column(name = "C_COMPENSATION_TICKETNUM")
    private String ticketnum;       
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Schedule schedule;
    @Transient
    private Stasiun stasiunorg;
    @Transient
    private Stasiun stasiundest;
    @Transient
    private Stasiun stasiunrefund;
    @Transient
    private Wagonclass wagonclass;
//    @Transient
//    private Cancellationtype cancellationtype;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private int no_urut;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Shift shift;    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private User usermodified;       

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate startdate;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate enddate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDoctitle() {
        return doctitle;
    }

    public void setDoctitle(String doctitle) {
        this.doctitle = doctitle;
    }

    public int getDocnum() {
        return docnum;
    }

    public void setDocnum(int docnum) {
        this.docnum = docnum;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getStasiunidorg() {
        return stasiunidorg;
    }

    public void setStasiunidorg(String stasiunidorg) {
        this.stasiunidorg = stasiunidorg;
    }

    public String getStasiuniddest() {
        return stasiuniddest;
    }

    public void setStasiuniddest(String stasiuniddest) {
        this.stasiuniddest = stasiuniddest;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

//    public int getTotticket() {
//        return totticket;
//    }
//
//    public void setTotticket(int totticket) {
//        this.totticket = totticket;
//    }

    public BigDecimal getRefundamount() {
        return refundamount;
    }

    public void setRefundamount(BigDecimal refundamount) {
        this.refundamount = refundamount;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
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

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Stasiun getStasiunorg() {
        return stasiunorg;
    }

    public void setStasiunorg(Stasiun stasiunorg) {
        this.stasiunorg = stasiunorg;
    }

    public Stasiun getStasiundest() {
        return stasiundest;
    }

    public void setStasiundest(Stasiun stasiundest) {
        this.stasiundest = stasiundest;
    }

//    public Cancellationtype getCancellationtype() {
//        return cancellationtype;
//    }
//
//    public void setCancellationtype(Cancellationtype cancellationtype) {
//        this.cancellationtype = cancellationtype;
//    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }

    public int getNo_urut() {
        return no_urut;
    }

    public void setNo_urut(int no_urut) {
        this.no_urut = no_urut;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public String getStasiunidrefund() {
        return stasiunidrefund;
    }

    public void setStasiunidrefund(String stasiunidrefund) {
        this.stasiunidrefund = stasiunidrefund;
    }

    public Stasiun getStasiunrefund() {
        return stasiunrefund;
    }

    public void setStasiunrefund(Stasiun stasiunrefund) {
        this.stasiunrefund = stasiunrefund;
    }

    public String getShiftid() {
        return shiftid;
    }

    public void setShiftid(String shiftid) {
        this.shiftid = shiftid;
    }

    public Shift getShift() {
        return shift;
    }

    public void setShift(Shift shift) {
        this.shift = shift;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        this.ticketnum = ticketnum;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public User getUsermodified() {
        return usermodified;
    }

    public void setUsermodified(User usermodified) {
        this.usermodified = usermodified;
    }

}
