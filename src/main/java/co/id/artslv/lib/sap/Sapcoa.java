/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.sap;

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
@Table(name = "arts_t_sapcoa")
public class Sapcoa {

    @Column(name = "c_sapcoa_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_sapcoa_account", table = "arts_t_sapcoa", nullable = false, length = 36)
    @Basic
    private String cSapcoaAccount;

    @Column(name = "c_sapcoa_description", table = "arts_t_sapcoa", nullable = false, length = 200)
    @Basic
    private String cSapcoaDescription;

    @Column(name = "c_sapcoa_status", table = "arts_t_sapcoa", nullable = false)
    @Basic
    private Character cSapcoaStatus;

    @Column(name = "c_sapcoa_domain", table = "arts_t_sapcoa", nullable = false, length = 36)
    @Basic
    private String cSapcoaDomain;

    @Column(name = "c_sapcoa_modifiedby", table = "arts_t_sapcoa", nullable = false, length = 36)
    @Basic
    private String cSapcoaModifiedby;

    @Column(name = "c_sapcoa_modifiedon", table = "arts_t_sapcoa", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSapcoaModifiedon;

    @Column(name = "c_sapcoa_startdate", table = "arts_t_sapcoa", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSapcoaStartdate;

    @Column(name = "c_sapcoa_enddate", table = "arts_t_sapcoa", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSapcoaEnddate;

    @Column(name = "c_sapcoa_createdby", table = "arts_t_sapcoa", nullable = false, length = 36)
    @Basic
    private String cSapcoaCreatedby;

    @Column(name = "c_sapcoa_createdon", table = "arts_t_sapcoa", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSapcoaCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcSapcoaAccount() {
        return cSapcoaAccount;
    }

    public void setcSapcoaAccount(String cSapcoaAccount) {
        this.cSapcoaAccount = cSapcoaAccount;
    }

    public String getcSapcoaDescription() {
        return cSapcoaDescription;
    }

    public void setcSapcoaDescription(String cSapcoaDescription) {
        this.cSapcoaDescription = cSapcoaDescription;
    }

    public Character getcSapcoaStatus() {
        return cSapcoaStatus;
    }

    public void setcSapcoaStatus(Character cSapcoaStatus) {
        this.cSapcoaStatus = cSapcoaStatus;
    }

    public String getcSapcoaDomain() {
        return cSapcoaDomain;
    }

    public void setcSapcoaDomain(String cSapcoaDomain) {
        this.cSapcoaDomain = cSapcoaDomain;
    }

    public String getcSapcoaModifiedby() {
        return cSapcoaModifiedby;
    }

    public void setcSapcoaModifiedby(String cSapcoaModifiedby) {
        this.cSapcoaModifiedby = cSapcoaModifiedby;
    }

    public Date getcSapcoaModifiedon() {
        return cSapcoaModifiedon;
    }

    public void setcSapcoaModifiedon(Date cSapcoaModifiedon) {
        this.cSapcoaModifiedon = cSapcoaModifiedon;
    }

    public Date getcSapcoaStartdate() {
        return cSapcoaStartdate;
    }

    public void setcSapcoaStartdate(Date cSapcoaStartdate) {
        this.cSapcoaStartdate = cSapcoaStartdate;
    }

    public Date getcSapcoaEnddate() {
        return cSapcoaEnddate;
    }

    public void setcSapcoaEnddate(Date cSapcoaEnddate) {
        this.cSapcoaEnddate = cSapcoaEnddate;
    }

    public String getcSapcoaCreatedby() {
        return cSapcoaCreatedby;
    }

    public void setcSapcoaCreatedby(String cSapcoaCreatedby) {
        this.cSapcoaCreatedby = cSapcoaCreatedby;
    }

    public Date getcSapcoaCreatedon() {
        return cSapcoaCreatedon;
    }

    public void setcSapcoaCreatedon(Date cSapcoaCreatedon) {
        this.cSapcoaCreatedon = cSapcoaCreatedon;
    }

    

}
