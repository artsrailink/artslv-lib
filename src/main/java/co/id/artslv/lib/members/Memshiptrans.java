/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.members;

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
@Table(name = "arts_t_memshiptrans")
public class Memshiptrans {

    @Column(name = "c_memshiptrans_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_memshiptrans_validdate", table = "arts_t_memshiptrans")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMemshiptransValiddate;

    @Column(name = "c_memshiptrans_expdate", table = "arts_t_memshiptrans", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMemshiptransExpdate;

    @Column(name = "c_memshiptrans_type", table = "arts_t_memshiptrans", nullable = false)
    @Basic
    private Character cMemshiptransType;

    @Column(name = "c_memshiptrans_status", table = "arts_t_memshiptrans", nullable = false)
    @Basic
    private Character cMemshiptransStatus;

    @Column(name = "c_memshiptrans_domain", table = "arts_t_memshiptrans", nullable = false, length = 36)
    @Basic
    private String cMemshiptransDomain;

    @Column(name = "c_memshiptrans_modifiedby", table = "arts_t_memshiptrans", nullable = false, length = 36)
    @Basic
    private String cMemshiptransModifiedby;

    @Column(name = "c_memshiptrans_modifiedon", table = "arts_t_memshiptrans", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMemshiptransModifiedon;

    @Column(name = "c_membership_id", table = "arts_t_memshiptrans", nullable = false, length = 36)
    @Basic
    private String cMembershipId;

    @Column(name = "c_memshiptrans_date", table = "arts_t_memshiptrans", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMemshiptransDate;

    @Column(name = "c_memshiptrans_ref", table = "arts_t_memshiptrans", length = 100)
    @Basic
    private String cMemshiptransRef;

    @Column(name = "c_memshiptrans_beginningbal", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cMemshiptransBeginningbal;

    @Column(name = "c_memshiptrans_earnpoint", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cMemshiptransEarnpoint;

    @Column(name = "c_memshiptrans_redeempoint", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cMemshiptransRedeempoint;

    @Column(name = "c_memshiptrans_endingbal", table = "arts_t_memshiptrans", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cMemshiptransEndingbal;

    @Column(name = "c_memshiptrans_createdby", table = "arts_t_memshiptrans", nullable = false, length = 36)
    @Basic
    private String cMemshiptransCreatedby;

    @Column(name = "c_memshiptrans_createdon", table = "arts_t_memshiptrans", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMemshiptransCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getcMemshiptransValiddate() {
        return cMemshiptransValiddate;
    }

    public void setcMemshiptransValiddate(Date cMemshiptransValiddate) {
        this.cMemshiptransValiddate = cMemshiptransValiddate;
    }

    public Date getcMemshiptransExpdate() {
        return cMemshiptransExpdate;
    }

    public void setcMemshiptransExpdate(Date cMemshiptransExpdate) {
        this.cMemshiptransExpdate = cMemshiptransExpdate;
    }

    public Character getcMemshiptransType() {
        return cMemshiptransType;
    }

    public void setcMemshiptransType(Character cMemshiptransType) {
        this.cMemshiptransType = cMemshiptransType;
    }

    public Character getcMemshiptransStatus() {
        return cMemshiptransStatus;
    }

    public void setcMemshiptransStatus(Character cMemshiptransStatus) {
        this.cMemshiptransStatus = cMemshiptransStatus;
    }

    public String getcMemshiptransDomain() {
        return cMemshiptransDomain;
    }

    public void setcMemshiptransDomain(String cMemshiptransDomain) {
        this.cMemshiptransDomain = cMemshiptransDomain;
    }

    public String getcMemshiptransModifiedby() {
        return cMemshiptransModifiedby;
    }

    public void setcMemshiptransModifiedby(String cMemshiptransModifiedby) {
        this.cMemshiptransModifiedby = cMemshiptransModifiedby;
    }

    public Date getcMemshiptransModifiedon() {
        return cMemshiptransModifiedon;
    }

    public void setcMemshiptransModifiedon(Date cMemshiptransModifiedon) {
        this.cMemshiptransModifiedon = cMemshiptransModifiedon;
    }

    public String getcMembershipId() {
        return cMembershipId;
    }

    public void setcMembershipId(String cMembershipId) {
        this.cMembershipId = cMembershipId;
    }

    public Date getcMemshiptransDate() {
        return cMemshiptransDate;
    }

    public void setcMemshiptransDate(Date cMemshiptransDate) {
        this.cMemshiptransDate = cMemshiptransDate;
    }

    public String getcMemshiptransRef() {
        return cMemshiptransRef;
    }

    public void setcMemshiptransRef(String cMemshiptransRef) {
        this.cMemshiptransRef = cMemshiptransRef;
    }

    public BigDecimal getcMemshiptransBeginningbal() {
        return cMemshiptransBeginningbal;
    }

    public void setcMemshiptransBeginningbal(BigDecimal cMemshiptransBeginningbal) {
        this.cMemshiptransBeginningbal = cMemshiptransBeginningbal;
    }

    public BigDecimal getcMemshiptransEarnpoint() {
        return cMemshiptransEarnpoint;
    }

    public void setcMemshiptransEarnpoint(BigDecimal cMemshiptransEarnpoint) {
        this.cMemshiptransEarnpoint = cMemshiptransEarnpoint;
    }

    public BigDecimal getcMemshiptransRedeempoint() {
        return cMemshiptransRedeempoint;
    }

    public void setcMemshiptransRedeempoint(BigDecimal cMemshiptransRedeempoint) {
        this.cMemshiptransRedeempoint = cMemshiptransRedeempoint;
    }

    public BigDecimal getcMemshiptransEndingbal() {
        return cMemshiptransEndingbal;
    }

    public void setcMemshiptransEndingbal(BigDecimal cMemshiptransEndingbal) {
        this.cMemshiptransEndingbal = cMemshiptransEndingbal;
    }

    public String getcMemshiptransCreatedby() {
        return cMemshiptransCreatedby;
    }

    public void setcMemshiptransCreatedby(String cMemshiptransCreatedby) {
        this.cMemshiptransCreatedby = cMemshiptransCreatedby;
    }

    public Date getcMemshiptransCreatedon() {
        return cMemshiptransCreatedon;
    }

    public void setcMemshiptransCreatedon(Date cMemshiptransCreatedon) {
        this.cMemshiptransCreatedon = cMemshiptransCreatedon;
    }
    
    

}
