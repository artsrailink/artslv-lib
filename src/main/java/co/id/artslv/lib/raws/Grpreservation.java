/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.raws;

import java.io.Serializable;
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
@Table(name = "arts_t_grpreservation")
public class Grpreservation implements Serializable {

    @Column(name = "c_grpreservation_id", table = "arts_t_grpreservation", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_grpreservation_docnum", table = "arts_t_grpreservation", nullable = false, length = 36)
    @Basic
    private String cGrpreservationDocnum;

    @Column(name = "c_grpreservation_custname", table = "arts_t_grpreservation", nullable = false, length = 100)
    @Basic
    private String cGrpreservationCustname;

    @Column(name = "c_grpreservation_address", table = "arts_t_grpreservation", nullable = false)
    @Basic
    private String cGrpreservationAddress;

    @Column(name = "c_grpreservation_phonenum1", table = "arts_t_grpreservation", nullable = false, length = 50)
    @Basic
    private String cGrpreservationPhonenum1;

    @Column(name = "c_grpreservation_email", table = "arts_t_grpreservation", length = 100)
    @Basic
    private String cGrpreservationEmail;

    @Column(name = "c_unit_id", table = "arts_t_grpreservation", nullable = false, length = 36)
    @Basic
    private String cUnitId;

    @Column(name = "c_grpreservation_date", table = "arts_t_grpreservation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cGrpreservationDate;

    @Column(name = "c_grpreservation_totpsg", table = "arts_t_grpreservation", nullable = false)
    @Basic
    private short cGrpreservationTotpsg;

    @Column(name = "c_grpreservation_totamount", table = "arts_t_grpreservation", nullable = false)
    @Basic
    private long cGrpreservationTotamount;

    @Column(name = "c_grpreservation_dpamount", table = "arts_t_grpreservation", nullable = false)
    @Basic
    private long cGrpreservationDpamount;

    @Column(name = "c_grpreservation_duedatedp", table = "arts_t_grpreservation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cGrpreservationDuedatedp;

    @Column(name = "c_grpreservation_duedatepay", table = "arts_t_grpreservation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cGrpreservationDuedatepay;

    @Column(name = "c_grpreservation_status", table = "arts_t_grpreservation", nullable = false)
    @Basic
    private Character cGrpreservationStatus;

    @Column(name = "c_grpreservation_domain", table = "arts_t_grpreservation", nullable = false, length = 36)
    @Basic
    private String cGrpreservationDomain;

    @Column(name = "c_grpreservation_modifiedby", table = "arts_t_grpreservation", nullable = false, length = 36)
    @Basic
    private String cGrpreservationModifiedby;

    @Column(name = "c_grpreservation_modifiedon", table = "arts_t_grpreservation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cGrpreservationModifiedon;

    @Column(name = "c_grpreservation_groupname", table = "arts_t_grpreservation", length = 100)
    @Basic
    private String cGrpreservationGroupname;

    @Column(name = "c_grpreservation_phonenum2", table = "arts_t_grpreservation", length = 50)
    @Basic
    private String cGrpreservationPhonenum2;

    @Column(name = "c_grpreservation_createdby", table = "arts_t_grpreservation", nullable = false, length = 36)
    @Basic
    private String cGrpreservationCreatedby;

    @Column(name = "c_grpreservation_createdon", table = "arts_t_grpreservation", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cGrpreservationCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcGrpreservationDocnum() {
        return cGrpreservationDocnum;
    }

    public void setcGrpreservationDocnum(String cGrpreservationDocnum) {
        this.cGrpreservationDocnum = cGrpreservationDocnum;
    }

    public String getcGrpreservationCustname() {
        return cGrpreservationCustname;
    }

    public void setcGrpreservationCustname(String cGrpreservationCustname) {
        this.cGrpreservationCustname = cGrpreservationCustname;
    }

    public String getcGrpreservationAddress() {
        return cGrpreservationAddress;
    }

    public void setcGrpreservationAddress(String cGrpreservationAddress) {
        this.cGrpreservationAddress = cGrpreservationAddress;
    }

    public String getcGrpreservationPhonenum1() {
        return cGrpreservationPhonenum1;
    }

    public void setcGrpreservationPhonenum1(String cGrpreservationPhonenum1) {
        this.cGrpreservationPhonenum1 = cGrpreservationPhonenum1;
    }

    public String getcGrpreservationEmail() {
        return cGrpreservationEmail;
    }

    public void setcGrpreservationEmail(String cGrpreservationEmail) {
        this.cGrpreservationEmail = cGrpreservationEmail;
    }

    public String getcUnitId() {
        return cUnitId;
    }

    public void setcUnitId(String cUnitId) {
        this.cUnitId = cUnitId;
    }

    public Date getcGrpreservationDate() {
        return cGrpreservationDate;
    }

    public void setcGrpreservationDate(Date cGrpreservationDate) {
        this.cGrpreservationDate = cGrpreservationDate;
    }

    public short getcGrpreservationTotpsg() {
        return cGrpreservationTotpsg;
    }

    public void setcGrpreservationTotpsg(short cGrpreservationTotpsg) {
        this.cGrpreservationTotpsg = cGrpreservationTotpsg;
    }

    public long getcGrpreservationTotamount() {
        return cGrpreservationTotamount;
    }

    public void setcGrpreservationTotamount(long cGrpreservationTotamount) {
        this.cGrpreservationTotamount = cGrpreservationTotamount;
    }

    public long getcGrpreservationDpamount() {
        return cGrpreservationDpamount;
    }

    public void setcGrpreservationDpamount(long cGrpreservationDpamount) {
        this.cGrpreservationDpamount = cGrpreservationDpamount;
    }

    public Date getcGrpreservationDuedatedp() {
        return cGrpreservationDuedatedp;
    }

    public void setcGrpreservationDuedatedp(Date cGrpreservationDuedatedp) {
        this.cGrpreservationDuedatedp = cGrpreservationDuedatedp;
    }

    public Date getcGrpreservationDuedatepay() {
        return cGrpreservationDuedatepay;
    }

    public void setcGrpreservationDuedatepay(Date cGrpreservationDuedatepay) {
        this.cGrpreservationDuedatepay = cGrpreservationDuedatepay;
    }

    public Character getcGrpreservationStatus() {
        return cGrpreservationStatus;
    }

    public void setcGrpreservationStatus(Character cGrpreservationStatus) {
        this.cGrpreservationStatus = cGrpreservationStatus;
    }

    public String getcGrpreservationDomain() {
        return cGrpreservationDomain;
    }

    public void setcGrpreservationDomain(String cGrpreservationDomain) {
        this.cGrpreservationDomain = cGrpreservationDomain;
    }

    public String getcGrpreservationModifiedby() {
        return cGrpreservationModifiedby;
    }

    public void setcGrpreservationModifiedby(String cGrpreservationModifiedby) {
        this.cGrpreservationModifiedby = cGrpreservationModifiedby;
    }

    public Date getcGrpreservationModifiedon() {
        return cGrpreservationModifiedon;
    }

    public void setcGrpreservationModifiedon(Date cGrpreservationModifiedon) {
        this.cGrpreservationModifiedon = cGrpreservationModifiedon;
    }

    public String getcGrpreservationGroupname() {
        return cGrpreservationGroupname;
    }

    public void setcGrpreservationGroupname(String cGrpreservationGroupname) {
        this.cGrpreservationGroupname = cGrpreservationGroupname;
    }

    public String getcGrpreservationPhonenum2() {
        return cGrpreservationPhonenum2;
    }

    public void setcGrpreservationPhonenum2(String cGrpreservationPhonenum2) {
        this.cGrpreservationPhonenum2 = cGrpreservationPhonenum2;
    }

    public String getcGrpreservationCreatedby() {
        return cGrpreservationCreatedby;
    }

    public void setcGrpreservationCreatedby(String cGrpreservationCreatedby) {
        this.cGrpreservationCreatedby = cGrpreservationCreatedby;
    }

    public Date getcGrpreservationCreatedon() {
        return cGrpreservationCreatedon;
    }

    public void setcGrpreservationCreatedon(Date cGrpreservationCreatedon) {
        this.cGrpreservationCreatedon = cGrpreservationCreatedon;
    }
    
    
}
