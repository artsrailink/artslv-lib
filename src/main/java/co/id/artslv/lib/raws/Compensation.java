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
@Table(name = "arts_t_compensation")
public class Compensation implements Serializable {

    @Column(name = "c_compensation_id", table = "arts_t_compensation", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_compensation_date", table = "arts_t_compensation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCompensationDate;

    @Column(name = "c_compensation_doctitle", table = "arts_t_compensation", nullable = false, length = 20)
    @Basic
    private String cCompensationDoctitle;

    @Column(name = "c_compensation_docnum", table = "arts_t_compensation", nullable = false)
    @Basic
    private double cCompensationDocnum;

    @Column(name = "c_schedule_id", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cScheduleId;

    @Column(name = "c_stasiun_idorg", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cStasiunIdorg;

    @Column(name = "c_stasiun_iddest", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cStasiunIddest;

    @Column(name = "c_wagonclass_id", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cWagonclassId;

    @Column(name = "c_compensation_type", table = "arts_t_compensation", nullable = false)
    @Basic
    private Character cCompensationType;

    @Column(name = "c_compensation_refundamount", table = "arts_t_compensation", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cCompensationRefundamount;

    @Column(name = "c_compensation_reason", table = "arts_t_compensation", nullable = false, length = 200)
    @Basic
    private String cCompensationReason;

    @Column(name = "c_compensation_status", table = "arts_t_compensation", nullable = false)
    @Basic
    private Character cCompensationStatus;

    @Column(name = "c_compensation_domain", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cCompensationDomain;

    @Column(name = "c_compensation_modifiedby", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cCompensationModifiedby;

    @Column(name = "c_compensation_modifiedon", table = "arts_t_compensation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCompensationModifiedon;

    @Column(name = "c_stasiun_idrefund", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cStasiunIdrefund;

    @Column(name = "c_shift_id", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cShiftId;

    @Column(name = "c_compensation_bookcode", table = "arts_t_compensation", length = 1000)
    @Basic
    private String cCompensationBookcode;

    @Column(name = "c_compensation_ticketnum", table = "arts_t_compensation", length = 1000)
    @Basic
    private String cCompensationTicketnum;

    @Column(name = "c_compensation_createdby", table = "arts_t_compensation", nullable = false, length = 36)
    @Basic
    private String cCompensationCreatedby;

    @Column(name = "c_compensation_createdon", table = "arts_t_compensation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCompensationCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getcCompensationDate() {
        return cCompensationDate;
    }

    public void setcCompensationDate(Date cCompensationDate) {
        this.cCompensationDate = cCompensationDate;
    }

    public String getcCompensationDoctitle() {
        return cCompensationDoctitle;
    }

    public void setcCompensationDoctitle(String cCompensationDoctitle) {
        this.cCompensationDoctitle = cCompensationDoctitle;
    }

    public double getcCompensationDocnum() {
        return cCompensationDocnum;
    }

    public void setcCompensationDocnum(double cCompensationDocnum) {
        this.cCompensationDocnum = cCompensationDocnum;
    }

    public String getcScheduleId() {
        return cScheduleId;
    }

    public void setcScheduleId(String cScheduleId) {
        this.cScheduleId = cScheduleId;
    }

    public String getcStasiunIdorg() {
        return cStasiunIdorg;
    }

    public void setcStasiunIdorg(String cStasiunIdorg) {
        this.cStasiunIdorg = cStasiunIdorg;
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

    public Character getcCompensationType() {
        return cCompensationType;
    }

    public void setcCompensationType(Character cCompensationType) {
        this.cCompensationType = cCompensationType;
    }

    public BigDecimal getcCompensationRefundamount() {
        return cCompensationRefundamount;
    }

    public void setcCompensationRefundamount(BigDecimal cCompensationRefundamount) {
        this.cCompensationRefundamount = cCompensationRefundamount;
    }

    public String getcCompensationReason() {
        return cCompensationReason;
    }

    public void setcCompensationReason(String cCompensationReason) {
        this.cCompensationReason = cCompensationReason;
    }

    public Character getcCompensationStatus() {
        return cCompensationStatus;
    }

    public void setcCompensationStatus(Character cCompensationStatus) {
        this.cCompensationStatus = cCompensationStatus;
    }

    public String getcCompensationDomain() {
        return cCompensationDomain;
    }

    public void setcCompensationDomain(String cCompensationDomain) {
        this.cCompensationDomain = cCompensationDomain;
    }

    public String getcCompensationModifiedby() {
        return cCompensationModifiedby;
    }

    public void setcCompensationModifiedby(String cCompensationModifiedby) {
        this.cCompensationModifiedby = cCompensationModifiedby;
    }

    public Date getcCompensationModifiedon() {
        return cCompensationModifiedon;
    }

    public void setcCompensationModifiedon(Date cCompensationModifiedon) {
        this.cCompensationModifiedon = cCompensationModifiedon;
    }

    public String getcStasiunIdrefund() {
        return cStasiunIdrefund;
    }

    public void setcStasiunIdrefund(String cStasiunIdrefund) {
        this.cStasiunIdrefund = cStasiunIdrefund;
    }

    public String getcShiftId() {
        return cShiftId;
    }

    public void setcShiftId(String cShiftId) {
        this.cShiftId = cShiftId;
    }

    public String getcCompensationBookcode() {
        return cCompensationBookcode;
    }

    public void setcCompensationBookcode(String cCompensationBookcode) {
        this.cCompensationBookcode = cCompensationBookcode;
    }

    public String getcCompensationTicketnum() {
        return cCompensationTicketnum;
    }

    public void setcCompensationTicketnum(String cCompensationTicketnum) {
        this.cCompensationTicketnum = cCompensationTicketnum;
    }

    public String getcCompensationCreatedby() {
        return cCompensationCreatedby;
    }

    public void setcCompensationCreatedby(String cCompensationCreatedby) {
        this.cCompensationCreatedby = cCompensationCreatedby;
    }

    public Date getcCompensationCreatedon() {
        return cCompensationCreatedon;
    }

    public void setcCompensationCreatedon(Date cCompensationCreatedon) {
        this.cCompensationCreatedon = cCompensationCreatedon;
    }
    
    

}
