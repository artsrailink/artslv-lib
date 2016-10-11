/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.transactions;

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
@Table(name = "arts_t_cancellation")
public class Cancellation {

    @Column(name = "c_cancellation_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_cancellation_date", table = "arts_t_cancellation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCancellationDate;

    @Column(name = "c_cancellation_totamount", table = "arts_t_cancellation", nullable = false)
    @Basic
    private long cCancellationTotamount;

    @Column(name = "c_cancellation_status", table = "arts_t_cancellation", nullable = false)
    @Basic
    private Character cCancellationStatus;

    @Column(name = "c_transactionid_cancelled", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cTransactionidCancelled;

    @Column(name = "c_transactionid_new", table = "arts_t_cancellation", length = 36)
    @Basic
    private String cTransactionidNew;

    @Column(name = "c_cancellation_domain", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cCancellationDomain;

    @Column(name = "c_cancellation_modifiedby", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cCancellationModifiedby;

    @Column(name = "c_cancellation_modifiedon", table = "arts_t_cancellation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCancellationModifiedon;

    @Column(name = "c_stasiun_id", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cStasiunId;

    @Column(name = "c_cancellationtype_id", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cCancellationtypeId;

    @Column(name = "c_cancelreason_id", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cCancelreasonId;

    @Column(name = "c_shift_id", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cShiftId;

    @Column(name = "c_cancellation_noka", table = "arts_t_cancellation", length = 50)
    @Basic
    private String cCancellationNoka;

    @Column(name = "c_cancellation_trainname", table = "arts_t_cancellation", length = 100)
    @Basic
    private String cCancellationTrainname;

    @Column(name = "c_cancellation_maxprint", table = "arts_t_cancellation")
    @Basic
    private Short cCancellationMaxprint;

    @Column(name = "c_cancellation_cancelnum", table = "arts_t_cancellation", length = 50)
    @Basic
    private String cCancellationCancelnum;

    @Column(name = "c_cancellation_printedon", table = "arts_t_cancellation")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCancellationPrintedon;

    @Column(name = "c_cancellation_createdby", table = "arts_t_cancellation", nullable = false, length = 36)
    @Basic
    private String cCancellationCreatedby;

    @Column(name = "c_cancellation_createdon", table = "arts_t_cancellation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCancellationCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getcCancellationDate() {
        return cCancellationDate;
    }

    public void setcCancellationDate(Date cCancellationDate) {
        this.cCancellationDate = cCancellationDate;
    }

    public long getcCancellationTotamount() {
        return cCancellationTotamount;
    }

    public void setcCancellationTotamount(long cCancellationTotamount) {
        this.cCancellationTotamount = cCancellationTotamount;
    }

    public Character getcCancellationStatus() {
        return cCancellationStatus;
    }

    public void setcCancellationStatus(Character cCancellationStatus) {
        this.cCancellationStatus = cCancellationStatus;
    }

    public String getcTransactionidCancelled() {
        return cTransactionidCancelled;
    }

    public void setcTransactionidCancelled(String cTransactionidCancelled) {
        this.cTransactionidCancelled = cTransactionidCancelled;
    }

    public String getcTransactionidNew() {
        return cTransactionidNew;
    }

    public void setcTransactionidNew(String cTransactionidNew) {
        this.cTransactionidNew = cTransactionidNew;
    }

    public String getcCancellationDomain() {
        return cCancellationDomain;
    }

    public void setcCancellationDomain(String cCancellationDomain) {
        this.cCancellationDomain = cCancellationDomain;
    }

    public String getcCancellationModifiedby() {
        return cCancellationModifiedby;
    }

    public void setcCancellationModifiedby(String cCancellationModifiedby) {
        this.cCancellationModifiedby = cCancellationModifiedby;
    }

    public Date getcCancellationModifiedon() {
        return cCancellationModifiedon;
    }

    public void setcCancellationModifiedon(Date cCancellationModifiedon) {
        this.cCancellationModifiedon = cCancellationModifiedon;
    }

    public String getcStasiunId() {
        return cStasiunId;
    }

    public void setcStasiunId(String cStasiunId) {
        this.cStasiunId = cStasiunId;
    }

    public String getcCancellationtypeId() {
        return cCancellationtypeId;
    }

    public void setcCancellationtypeId(String cCancellationtypeId) {
        this.cCancellationtypeId = cCancellationtypeId;
    }

    public String getcCancelreasonId() {
        return cCancelreasonId;
    }

    public void setcCancelreasonId(String cCancelreasonId) {
        this.cCancelreasonId = cCancelreasonId;
    }

    public String getcShiftId() {
        return cShiftId;
    }

    public void setcShiftId(String cShiftId) {
        this.cShiftId = cShiftId;
    }

    public String getcCancellationNoka() {
        return cCancellationNoka;
    }

    public void setcCancellationNoka(String cCancellationNoka) {
        this.cCancellationNoka = cCancellationNoka;
    }

    public String getcCancellationTrainname() {
        return cCancellationTrainname;
    }

    public void setcCancellationTrainname(String cCancellationTrainname) {
        this.cCancellationTrainname = cCancellationTrainname;
    }

    public Short getcCancellationMaxprint() {
        return cCancellationMaxprint;
    }

    public void setcCancellationMaxprint(Short cCancellationMaxprint) {
        this.cCancellationMaxprint = cCancellationMaxprint;
    }

    public String getcCancellationCancelnum() {
        return cCancellationCancelnum;
    }

    public void setcCancellationCancelnum(String cCancellationCancelnum) {
        this.cCancellationCancelnum = cCancellationCancelnum;
    }

    public Date getcCancellationPrintedon() {
        return cCancellationPrintedon;
    }

    public void setcCancellationPrintedon(Date cCancellationPrintedon) {
        this.cCancellationPrintedon = cCancellationPrintedon;
    }

    public String getcCancellationCreatedby() {
        return cCancellationCreatedby;
    }

    public void setcCancellationCreatedby(String cCancellationCreatedby) {
        this.cCancellationCreatedby = cCancellationCreatedby;
    }

    public Date getcCancellationCreatedon() {
        return cCancellationCreatedon;
    }

    public void setcCancellationCreatedon(Date cCancellationCreatedon) {
        this.cCancellationCreatedon = cCancellationCreatedon;
    }

    

}
