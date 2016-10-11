/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.payments;

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
@Table(name = "arts_t_rate")
public class Rate {

    @Column(name = "c_rate_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_rate_totamount", table = "arts_t_rate", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cRateTotamount;

    @Column(name = "c_rate_startdate", table = "arts_t_rate", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRateStartdate;

    @Column(name = "c_rate_enddate", table = "arts_t_rate", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRateEnddate;

    @Column(name = "c_stasiun_idorg", table = "arts_t_rate", nullable = false, length = 36)
    @Basic
    private String cStasiunIdorg;

    @Column(name = "c_rate_sellstartdate", table = "arts_t_rate", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRateSellstartdate;

    @Column(name = "c_rate_sellenddate", table = "arts_t_rate", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRateSellenddate;

    @Column(name = "c_rate_status", table = "arts_t_rate", nullable = false)
    @Basic
    private Character cRateStatus;

    @Column(name = "c_rate_domain", table = "arts_t_rate", nullable = false, length = 36)
    @Basic
    private String cRateDomain;

    @Column(name = "c_rate_modifiedby", table = "arts_t_rate", nullable = false, length = 36)
    @Basic
    private String cRateModifiedby;

    @Column(name = "c_rate_modifiedon", table = "arts_t_rate", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRateModifiedon;

    @Column(name = "c_rate_psgtype", table = "arts_t_rate")
    @Basic
    private Character cRatePsgtype;

    @Column(name = "c_stasiun_iddest", table = "arts_t_rate", nullable = false, length = 36)
    @Basic
    private String cStasiunIddest;

    @Column(name = "c_rate_refunddays", table = "arts_t_rate")
    @Basic
    private Integer cRateRefunddays;

    @Column(name = "c_rate_refundable", table = "arts_t_rate", nullable = false)
    @Basic
    private Character cRateRefundable;

    @Column(name = "c_rate_cancelable", table = "arts_t_rate", nullable = false)
    @Basic
    private Character cRateCancelable;

    @Column(name = "c_rate_reductible", table = "arts_t_rate", nullable = false)
    @Basic
    private Character cRateReductible;

    @Column(name = "c_rate_reschedulable", table = "arts_t_rate", nullable = false)
    @Basic
    private Character cRateReschedulable;

    @Column(name = "c_rate_reseatable", table = "arts_t_rate", nullable = false)
    @Basic
    private Character cRateReseatable;

    @Column(name = "c_rate_renamable", table = "arts_t_rate", nullable = false)
    @Basic
    private Character cRateRenamable;

    @Column(name = "c_subclass_id", table = "arts_t_rate", nullable = false, length = 36)
    @Basic
    private String cSubclassId;

    @Column(name = "c_rate_schedulenoka", table = "arts_t_rate", length = 50)
    @Basic
    private String cRateSchedulenoka;

    @Column(name = "c_rate_createdby", table = "arts_t_rate", nullable = false, length = 36)
    @Basic
    private String cRateCreatedby;

    @Column(name = "c_rate_createdon", table = "arts_t_rate", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRateCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getcRateTotamount() {
        return cRateTotamount;
    }

    public void setcRateTotamount(BigDecimal cRateTotamount) {
        this.cRateTotamount = cRateTotamount;
    }

    public Date getcRateStartdate() {
        return cRateStartdate;
    }

    public void setcRateStartdate(Date cRateStartdate) {
        this.cRateStartdate = cRateStartdate;
    }

    public Date getcRateEnddate() {
        return cRateEnddate;
    }

    public void setcRateEnddate(Date cRateEnddate) {
        this.cRateEnddate = cRateEnddate;
    }

    public String getcStasiunIdorg() {
        return cStasiunIdorg;
    }

    public void setcStasiunIdorg(String cStasiunIdorg) {
        this.cStasiunIdorg = cStasiunIdorg;
    }

    public Date getcRateSellstartdate() {
        return cRateSellstartdate;
    }

    public void setcRateSellstartdate(Date cRateSellstartdate) {
        this.cRateSellstartdate = cRateSellstartdate;
    }

    public Date getcRateSellenddate() {
        return cRateSellenddate;
    }

    public void setcRateSellenddate(Date cRateSellenddate) {
        this.cRateSellenddate = cRateSellenddate;
    }

    public Character getcRateStatus() {
        return cRateStatus;
    }

    public void setcRateStatus(Character cRateStatus) {
        this.cRateStatus = cRateStatus;
    }

    public String getcRateDomain() {
        return cRateDomain;
    }

    public void setcRateDomain(String cRateDomain) {
        this.cRateDomain = cRateDomain;
    }

    public String getcRateModifiedby() {
        return cRateModifiedby;
    }

    public void setcRateModifiedby(String cRateModifiedby) {
        this.cRateModifiedby = cRateModifiedby;
    }

    public Date getcRateModifiedon() {
        return cRateModifiedon;
    }

    public void setcRateModifiedon(Date cRateModifiedon) {
        this.cRateModifiedon = cRateModifiedon;
    }

    public Character getcRatePsgtype() {
        return cRatePsgtype;
    }

    public void setcRatePsgtype(Character cRatePsgtype) {
        this.cRatePsgtype = cRatePsgtype;
    }

    public String getcStasiunIddest() {
        return cStasiunIddest;
    }

    public void setcStasiunIddest(String cStasiunIddest) {
        this.cStasiunIddest = cStasiunIddest;
    }

    public Integer getcRateRefunddays() {
        return cRateRefunddays;
    }

    public void setcRateRefunddays(Integer cRateRefunddays) {
        this.cRateRefunddays = cRateRefunddays;
    }

    public Character getcRateRefundable() {
        return cRateRefundable;
    }

    public void setcRateRefundable(Character cRateRefundable) {
        this.cRateRefundable = cRateRefundable;
    }

    public Character getcRateCancelable() {
        return cRateCancelable;
    }

    public void setcRateCancelable(Character cRateCancelable) {
        this.cRateCancelable = cRateCancelable;
    }

    public Character getcRateReductible() {
        return cRateReductible;
    }

    public void setcRateReductible(Character cRateReductible) {
        this.cRateReductible = cRateReductible;
    }

    public Character getcRateReschedulable() {
        return cRateReschedulable;
    }

    public void setcRateReschedulable(Character cRateReschedulable) {
        this.cRateReschedulable = cRateReschedulable;
    }

    public Character getcRateReseatable() {
        return cRateReseatable;
    }

    public void setcRateReseatable(Character cRateReseatable) {
        this.cRateReseatable = cRateReseatable;
    }

    public Character getcRateRenamable() {
        return cRateRenamable;
    }

    public void setcRateRenamable(Character cRateRenamable) {
        this.cRateRenamable = cRateRenamable;
    }

    public String getcSubclassId() {
        return cSubclassId;
    }

    public void setcSubclassId(String cSubclassId) {
        this.cSubclassId = cSubclassId;
    }

    public String getcRateSchedulenoka() {
        return cRateSchedulenoka;
    }

    public void setcRateSchedulenoka(String cRateSchedulenoka) {
        this.cRateSchedulenoka = cRateSchedulenoka;
    }

    public String getcRateCreatedby() {
        return cRateCreatedby;
    }

    public void setcRateCreatedby(String cRateCreatedby) {
        this.cRateCreatedby = cRateCreatedby;
    }

    public Date getcRateCreatedon() {
        return cRateCreatedon;
    }

    public void setcRateCreatedon(Date cRateCreatedon) {
        this.cRateCreatedon = cRateCreatedon;
    }
    
    
}
