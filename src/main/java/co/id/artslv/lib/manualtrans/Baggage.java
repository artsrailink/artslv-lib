/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.manualtrans;

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
@Table(name = "arts_t_baggage")
public class Baggage {

    @Column(name = "c_baggage_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wagonclass_id", table = "arts_t_baggage", nullable = false, length = 36)
    @Basic
    private String cWagonclassId;

    @Column(name = "c_baggage_startdate", table = "arts_t_baggage", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cBaggageStartdate;

    @Column(name = "c_baggage_enddate", table = "arts_t_baggage", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cBaggageEnddate;

    @Column(name = "c_baggage_amount", table = "arts_t_baggage", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cBaggageAmount;

    @Column(name = "c_baggage_status", table = "arts_t_baggage", nullable = false)
    @Basic
    private Character cBaggageStatus;

    @Column(name = "c_baggage_domain", table = "arts_t_baggage", nullable = false, length = 36)
    @Basic
    private String cBaggageDomain;

    @Column(name = "c_baggage_modifiedby", table = "arts_t_baggage", nullable = false, length = 36)
    @Basic
    private String cBaggageModifiedby;

    @Column(name = "c_baggage_modifiedon", table = "arts_t_baggage", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cBaggageModifiedon;

    @Column(name = "c_baggage_name", table = "arts_t_baggage", nullable = false, length = 50)
    @Basic
    private String cBaggageName;

    @Column(name = "c_baggage_code", table = "arts_t_baggage", nullable = false, length = 10)
    @Basic
    private String cBaggageCode;

    @Column(name = "c_baggage_createdby", table = "arts_t_baggage", nullable = false, length = 36)
    @Basic
    private String cBaggageCreatedby;

    @Column(name = "c_baggage_createdon", table = "arts_t_baggage", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cBaggageCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcWagonclassId() {
        return cWagonclassId;
    }

    public void setcWagonclassId(String cWagonclassId) {
        this.cWagonclassId = cWagonclassId;
    }

    public Date getcBaggageStartdate() {
        return cBaggageStartdate;
    }

    public void setcBaggageStartdate(Date cBaggageStartdate) {
        this.cBaggageStartdate = cBaggageStartdate;
    }

    public Date getcBaggageEnddate() {
        return cBaggageEnddate;
    }

    public void setcBaggageEnddate(Date cBaggageEnddate) {
        this.cBaggageEnddate = cBaggageEnddate;
    }

    public BigDecimal getcBaggageAmount() {
        return cBaggageAmount;
    }

    public void setcBaggageAmount(BigDecimal cBaggageAmount) {
        this.cBaggageAmount = cBaggageAmount;
    }

    public Character getcBaggageStatus() {
        return cBaggageStatus;
    }

    public void setcBaggageStatus(Character cBaggageStatus) {
        this.cBaggageStatus = cBaggageStatus;
    }

    public String getcBaggageDomain() {
        return cBaggageDomain;
    }

    public void setcBaggageDomain(String cBaggageDomain) {
        this.cBaggageDomain = cBaggageDomain;
    }

    public String getcBaggageModifiedby() {
        return cBaggageModifiedby;
    }

    public void setcBaggageModifiedby(String cBaggageModifiedby) {
        this.cBaggageModifiedby = cBaggageModifiedby;
    }

    public Date getcBaggageModifiedon() {
        return cBaggageModifiedon;
    }

    public void setcBaggageModifiedon(Date cBaggageModifiedon) {
        this.cBaggageModifiedon = cBaggageModifiedon;
    }

    public String getcBaggageName() {
        return cBaggageName;
    }

    public void setcBaggageName(String cBaggageName) {
        this.cBaggageName = cBaggageName;
    }

    public String getcBaggageCode() {
        return cBaggageCode;
    }

    public void setcBaggageCode(String cBaggageCode) {
        this.cBaggageCode = cBaggageCode;
    }

    public String getcBaggageCreatedby() {
        return cBaggageCreatedby;
    }

    public void setcBaggageCreatedby(String cBaggageCreatedby) {
        this.cBaggageCreatedby = cBaggageCreatedby;
    }

    public Date getcBaggageCreatedon() {
        return cBaggageCreatedon;
    }

    public void setcBaggageCreatedon(Date cBaggageCreatedon) {
        this.cBaggageCreatedon = cBaggageCreatedon;
    }

    

}
