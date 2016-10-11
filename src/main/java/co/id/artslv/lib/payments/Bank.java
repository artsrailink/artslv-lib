/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.payments;

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
@Table(name = "arts_t_bank")
public class Bank {

    @Column(name = "c_bank_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_bank_code", table = "arts_t_bank", nullable = false, length = 50)
    @Basic
    private String cBankCode;

    @Column(name = "c_bank_name", table = "arts_t_bank", nullable = false, length = 100)
    @Basic
    private String cBankName;

    @Column(name = "c_bank_type", table = "arts_t_bank", nullable = false)
    @Basic
    private Character cBankType;

    @Column(name = "c_bank_status", table = "arts_t_bank", nullable = false)
    @Basic
    private Character cBankStatus;

    @Column(name = "c_bank_domain", table = "arts_t_bank", nullable = false, length = 36)
    @Basic
    private String cBankDomain;

    @Column(name = "c_bank_modifiedby", table = "arts_t_bank", nullable = false, length = 36)
    @Basic
    private String cBankModifiedby;

    @Column(name = "c_bank_modifiedon", table = "arts_t_bank", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cBankModifiedon;

    @Column(name = "c_bank_createdby", table = "arts_t_bank", nullable = false, length = 36)
    @Basic
    private String cBankCreatedby;

    @Column(name = "c_bank_createdon", table = "arts_t_bank", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cBankCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcBankCode() {
        return cBankCode;
    }

    public void setcBankCode(String cBankCode) {
        this.cBankCode = cBankCode;
    }

    public String getcBankName() {
        return cBankName;
    }

    public void setcBankName(String cBankName) {
        this.cBankName = cBankName;
    }

    public Character getcBankType() {
        return cBankType;
    }

    public void setcBankType(Character cBankType) {
        this.cBankType = cBankType;
    }

    public Character getcBankStatus() {
        return cBankStatus;
    }

    public void setcBankStatus(Character cBankStatus) {
        this.cBankStatus = cBankStatus;
    }

    public String getcBankDomain() {
        return cBankDomain;
    }

    public void setcBankDomain(String cBankDomain) {
        this.cBankDomain = cBankDomain;
    }

    public String getcBankModifiedby() {
        return cBankModifiedby;
    }

    public void setcBankModifiedby(String cBankModifiedby) {
        this.cBankModifiedby = cBankModifiedby;
    }

    public Date getcBankModifiedon() {
        return cBankModifiedon;
    }

    public void setcBankModifiedon(Date cBankModifiedon) {
        this.cBankModifiedon = cBankModifiedon;
    }

    public String getcBankCreatedby() {
        return cBankCreatedby;
    }

    public void setcBankCreatedby(String cBankCreatedby) {
        this.cBankCreatedby = cBankCreatedby;
    }

    public Date getcBankCreatedon() {
        return cBankCreatedon;
    }

    public void setcBankCreatedon(Date cBankCreatedon) {
        this.cBankCreatedon = cBankCreatedon;
    }

    
}
