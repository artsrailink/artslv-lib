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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_reduction", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"c_reduction_name", "c_reduction_startdate", "c_reduction_enddate", "c_wagonclass_id", "c_membertype_id"})})
public class Reduction implements Serializable {

    @Column(name = "c_reduction_id", table = "arts_t_reduction", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_reduction_name", table = "arts_t_reduction", nullable = false, length = 100)
    @Basic
    private String cReductionName;

    @Column(name = "c_reduction_amount", table = "arts_t_reduction", scale = 2, precision = 11)
    @Basic
    private BigDecimal cReductionAmount;

    @Column(name = "c_reduction_amounttype", table = "arts_t_reduction", nullable = false, length = 20)
    @Basic
    private String cReductionAmounttype;

    @Column(name = "c_reduction_startdate", table = "arts_t_reduction", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cReductionStartdate;

    @Column(name = "c_reduction_enddate", table = "arts_t_reduction", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cReductionEnddate;

    @Column(name = "c_reduction_sellstartdate", table = "arts_t_reduction", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cReductionSellstartdate;

    @Column(name = "c_reduction_sellenddate", table = "arts_t_reduction", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cReductionSellenddate;

    @Column(name = "c_reduction_note", table = "arts_t_reduction", length = 2147483647)
    @Lob
    @Basic
    private String cReductionNote;

    @Column(name = "c_reduction_status", table = "arts_t_reduction", nullable = false)
    @Basic
    private Character cReductionStatus;

    @Column(name = "c_reduction_modifiedby", table = "arts_t_reduction", nullable = false, length = 36)
    @Basic
    private String cReductionModifiedby;

    @Column(name = "c_reduction_modifiedon", table = "arts_t_reduction", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cReductionModifiedon;

    @Column(name = "c_membertype_id", table = "arts_t_reduction", nullable = false, length = 36)
    @Basic
    private String cMembertypeId;

    @Column(name = "c_reduction_maxbook", table = "arts_t_reduction", nullable = false)
    @Basic
    private short cReductionMaxbook;

    @Column(name = "c_reduction_domain", table = "arts_t_reduction", nullable = false, length = 36)
    @Basic
    private String cReductionDomain;

    @Column(name = "c_reduction_validdays", table = "arts_t_reduction", nullable = false, length = 7)
    @Basic
    private String cReductionValiddays;

    @Column(name = "c_wagonclass_id", table = "arts_t_reduction", length = 36)
    @Basic
    private String cWagonclassId;

    @Column(name = "c_reduction_holidaystat", table = "arts_t_reduction", nullable = false)
    @Basic
    private Character cReductionHolidaystat;

    @Column(name = "c_reduction_createdby", table = "arts_t_reduction", nullable = false, length = 36)
    @Basic
    private String cReductionCreatedby;

    @Column(name = "c_reduction_createdon", table = "arts_t_reduction", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cReductionCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcReductionName() {
        return cReductionName;
    }

    public void setcReductionName(String cReductionName) {
        this.cReductionName = cReductionName;
    }

    public BigDecimal getcReductionAmount() {
        return cReductionAmount;
    }

    public void setcReductionAmount(BigDecimal cReductionAmount) {
        this.cReductionAmount = cReductionAmount;
    }

    public String getcReductionAmounttype() {
        return cReductionAmounttype;
    }

    public void setcReductionAmounttype(String cReductionAmounttype) {
        this.cReductionAmounttype = cReductionAmounttype;
    }

    public Date getcReductionStartdate() {
        return cReductionStartdate;
    }

    public void setcReductionStartdate(Date cReductionStartdate) {
        this.cReductionStartdate = cReductionStartdate;
    }

    public Date getcReductionEnddate() {
        return cReductionEnddate;
    }

    public void setcReductionEnddate(Date cReductionEnddate) {
        this.cReductionEnddate = cReductionEnddate;
    }

    public Date getcReductionSellstartdate() {
        return cReductionSellstartdate;
    }

    public void setcReductionSellstartdate(Date cReductionSellstartdate) {
        this.cReductionSellstartdate = cReductionSellstartdate;
    }

    public Date getcReductionSellenddate() {
        return cReductionSellenddate;
    }

    public void setcReductionSellenddate(Date cReductionSellenddate) {
        this.cReductionSellenddate = cReductionSellenddate;
    }

    public String getcReductionNote() {
        return cReductionNote;
    }

    public void setcReductionNote(String cReductionNote) {
        this.cReductionNote = cReductionNote;
    }

    public Character getcReductionStatus() {
        return cReductionStatus;
    }

    public void setcReductionStatus(Character cReductionStatus) {
        this.cReductionStatus = cReductionStatus;
    }

    public String getcReductionModifiedby() {
        return cReductionModifiedby;
    }

    public void setcReductionModifiedby(String cReductionModifiedby) {
        this.cReductionModifiedby = cReductionModifiedby;
    }

    public Date getcReductionModifiedon() {
        return cReductionModifiedon;
    }

    public void setcReductionModifiedon(Date cReductionModifiedon) {
        this.cReductionModifiedon = cReductionModifiedon;
    }

    public String getcMembertypeId() {
        return cMembertypeId;
    }

    public void setcMembertypeId(String cMembertypeId) {
        this.cMembertypeId = cMembertypeId;
    }

    public short getcReductionMaxbook() {
        return cReductionMaxbook;
    }

    public void setcReductionMaxbook(short cReductionMaxbook) {
        this.cReductionMaxbook = cReductionMaxbook;
    }

    public String getcReductionDomain() {
        return cReductionDomain;
    }

    public void setcReductionDomain(String cReductionDomain) {
        this.cReductionDomain = cReductionDomain;
    }

    public String getcReductionValiddays() {
        return cReductionValiddays;
    }

    public void setcReductionValiddays(String cReductionValiddays) {
        this.cReductionValiddays = cReductionValiddays;
    }

    public String getcWagonclassId() {
        return cWagonclassId;
    }

    public void setcWagonclassId(String cWagonclassId) {
        this.cWagonclassId = cWagonclassId;
    }

    public Character getcReductionHolidaystat() {
        return cReductionHolidaystat;
    }

    public void setcReductionHolidaystat(Character cReductionHolidaystat) {
        this.cReductionHolidaystat = cReductionHolidaystat;
    }

    public String getcReductionCreatedby() {
        return cReductionCreatedby;
    }

    public void setcReductionCreatedby(String cReductionCreatedby) {
        this.cReductionCreatedby = cReductionCreatedby;
    }

    public Date getcReductionCreatedon() {
        return cReductionCreatedon;
    }

    public void setcReductionCreatedon(Date cReductionCreatedon) {
        this.cReductionCreatedon = cReductionCreatedon;
    }
    
    

}
