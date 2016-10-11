/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.raws;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_dailyticket")
public class Dailyticket implements Serializable {

    @Column(name = "c_dailyticket_id", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_dailyticket_date", table = "arts_t_dailyticket", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cDailyticketDate;

    @Column(name = "c_stasiun_iddest", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cStasiunIddest;

    @Column(name = "c_wagonclass_id", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cWagonclassId;

    @Column(name = "c_schedule_id", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cScheduleId;

    @Column(name = "c_dailyticket_ticketidstart", table = "arts_t_dailyticket", nullable = false, length = 20)
    @Basic
    private String cDailyticketTicketidstart;

    @Column(name = "c_dailyticket_ticketidnext", table = "arts_t_dailyticket", nullable = false, length = 20)
    @Basic
    private String cDailyticketTicketidnext;

    @Column(name = "c_dailyticket_amount", table = "arts_t_dailyticket", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cDailyticketAmount;

    @Column(name = "c_dailyticket_ticketcancel", table = "arts_t_dailyticket", nullable = false)
    @Basic
    private int cDailyticketTicketcancel;

    @Column(name = "c_dailyticket_status", table = "arts_t_dailyticket", nullable = false)
    @Basic
    private Character cDailyticketStatus;

    @Column(name = "c_dailyticket_domain", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cDailyticketDomain;

    @Column(name = "c_dailyticket_modifiedby", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cDailyticketModifiedby;

    @Column(name = "c_dailyticket_modifiedon", table = "arts_t_dailyticket", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cDailyticketModifiedon;

    @Column(name = "c_unit_id", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cUnitId;

    @Column(name = "c_stasiun_idorg", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cStasiunIdorg;

    @Column(name = "c_stasiun_idbook", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cStasiunIdbook;

    @Column(name = "c_dailyticket_psgnum", table = "arts_t_dailyticket", nullable = false)
    @Basic
    private int cDailyticketPsgnum;

    @Column(name = "c_dailyticket_createdby", table = "arts_t_dailyticket", nullable = false, length = 36)
    @Basic
    private String cDailyticketCreatedby;

    @Column(name = "c_dailyticket_createdon", table = "arts_t_dailyticket", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cDailyticketCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getcDailyticketDate() {
        return cDailyticketDate;
    }

    public void setcDailyticketDate(Date cDailyticketDate) {
        this.cDailyticketDate = cDailyticketDate;
    }

    public String getcStasiunIddest() {
        return cStasiunIddest;
    }

    public void setcStasiunIddest(String cStasiunIddest) {
        this.cStasiunIddest = cStasiunIddest;
    }

    public String getcWagonclassId() {
        return cWagonclassId;
    }

    public void setcWagonclassId(String cWagonclassId) {
        this.cWagonclassId = cWagonclassId;
    }

    public String getcScheduleId() {
        return cScheduleId;
    }

    public void setcScheduleId(String cScheduleId) {
        this.cScheduleId = cScheduleId;
    }

    public String getcDailyticketTicketidstart() {
        return cDailyticketTicketidstart;
    }

    public void setcDailyticketTicketidstart(String cDailyticketTicketidstart) {
        this.cDailyticketTicketidstart = cDailyticketTicketidstart;
    }

    public String getcDailyticketTicketidnext() {
        return cDailyticketTicketidnext;
    }

    public void setcDailyticketTicketidnext(String cDailyticketTicketidnext) {
        this.cDailyticketTicketidnext = cDailyticketTicketidnext;
    }

    public BigDecimal getcDailyticketAmount() {
        return cDailyticketAmount;
    }

    public void setcDailyticketAmount(BigDecimal cDailyticketAmount) {
        this.cDailyticketAmount = cDailyticketAmount;
    }

    public int getcDailyticketTicketcancel() {
        return cDailyticketTicketcancel;
    }

    public void setcDailyticketTicketcancel(int cDailyticketTicketcancel) {
        this.cDailyticketTicketcancel = cDailyticketTicketcancel;
    }

    public Character getcDailyticketStatus() {
        return cDailyticketStatus;
    }

    public void setcDailyticketStatus(Character cDailyticketStatus) {
        this.cDailyticketStatus = cDailyticketStatus;
    }

    public String getcDailyticketDomain() {
        return cDailyticketDomain;
    }

    public void setcDailyticketDomain(String cDailyticketDomain) {
        this.cDailyticketDomain = cDailyticketDomain;
    }

    public String getcDailyticketModifiedby() {
        return cDailyticketModifiedby;
    }

    public void setcDailyticketModifiedby(String cDailyticketModifiedby) {
        this.cDailyticketModifiedby = cDailyticketModifiedby;
    }

    public Date getcDailyticketModifiedon() {
        return cDailyticketModifiedon;
    }

    public void setcDailyticketModifiedon(Date cDailyticketModifiedon) {
        this.cDailyticketModifiedon = cDailyticketModifiedon;
    }

    public String getcUnitId() {
        return cUnitId;
    }

    public void setcUnitId(String cUnitId) {
        this.cUnitId = cUnitId;
    }

    public String getcStasiunIdorg() {
        return cStasiunIdorg;
    }

    public void setcStasiunIdorg(String cStasiunIdorg) {
        this.cStasiunIdorg = cStasiunIdorg;
    }

    public String getcStasiunIdbook() {
        return cStasiunIdbook;
    }

    public void setcStasiunIdbook(String cStasiunIdbook) {
        this.cStasiunIdbook = cStasiunIdbook;
    }

    public int getcDailyticketPsgnum() {
        return cDailyticketPsgnum;
    }

    public void setcDailyticketPsgnum(int cDailyticketPsgnum) {
        this.cDailyticketPsgnum = cDailyticketPsgnum;
    }

    public String getcDailyticketCreatedby() {
        return cDailyticketCreatedby;
    }

    public void setcDailyticketCreatedby(String cDailyticketCreatedby) {
        this.cDailyticketCreatedby = cDailyticketCreatedby;
    }

    public Date getcDailyticketCreatedon() {
        return cDailyticketCreatedon;
    }

    public void setcDailyticketCreatedon(Date cDailyticketCreatedon) {
        this.cDailyticketCreatedon = cDailyticketCreatedon;
    }
    
    
}
