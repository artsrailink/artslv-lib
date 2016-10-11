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
@Table(name = "arts_t_refundupload")
public class Refundupload implements Serializable {

    @Column(name = "c_refundupload_id", table = "arts_t_refundupload", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_refundupload_bookcode", table = "arts_t_refundupload", nullable = false, length = 7)
    @Basic
    private String cRefunduploadBookcode;

    @Column(name = "c_refundupload_ticketnum", table = "arts_t_refundupload", nullable = false, length = 50)
    @Basic
    private String cRefunduploadTicketnum;

    @Column(name = "c_refundupload_stcodeorg", table = "arts_t_refundupload", nullable = false, length = 10)
    @Basic
    private String cRefunduploadStcodeorg;

    @Column(name = "c_refundupload_stcodedest", table = "arts_t_refundupload", nullable = false, length = 10)
    @Basic
    private String cRefunduploadStcodedest;

    @Column(name = "c_refundupload_psgname", table = "arts_t_refundupload", nullable = false, length = 100)
    @Basic
    private String cRefunduploadPsgname;

    @Column(name = "c_refundupload_amount", table = "arts_t_refundupload", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cRefunduploadAmount;

    @Column(name = "c_refundupload_canceldate", table = "arts_t_refundupload", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRefunduploadCanceldate;

    @Column(name = "c_refundupload_refunddatemin", table = "arts_t_refundupload", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRefunduploadRefunddatemin;

    @Column(name = "c_refundupload_refunddatemax", table = "arts_t_refundupload")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRefunduploadRefunddatemax;

    @Column(name = "c_refundupload_refundtype", table = "arts_t_refundupload", nullable = false)
    @Basic
    private Character cRefunduploadRefundtype;

    @Column(name = "c_refundupload_stcoderefund", table = "arts_t_refundupload", length = 10)
    @Basic
    private String cRefunduploadStcoderefund;

    @Column(name = "c_user_id", table = "arts_t_refundupload", length = 36)
    @Basic
    private String cUserId;

    @Column(name = "c_unit_id", table = "arts_t_refundupload", length = 36)
    @Basic
    private String cUnitId;

    @Column(name = "c_refundupload_refunddate", table = "arts_t_refundupload")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRefunduploadRefunddate;

    @Column(name = "c_stasiun_idrefund", table = "arts_t_refundupload", length = 36)
    @Basic
    private String cStasiunIdrefund;

    @Column(name = "c_refundupload_status", table = "arts_t_refundupload", nullable = false)
    @Basic
    private Character cRefunduploadStatus;

    @Column(name = "c_refundupload_domain", table = "arts_t_refundupload", nullable = false, length = 36)
    @Basic
    private String cRefunduploadDomain;

    @Column(name = "c_refundupload_modifiedby", table = "arts_t_refundupload", nullable = false, length = 36)
    @Basic
    private String cRefunduploadModifiedby;

    @Column(name = "c_refundupload_modifiedon", table = "arts_t_refundupload", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRefunduploadModifiedon;

    @Column(name = "c_refundupload_bankname", table = "arts_t_refundupload", length = 100)
    @Basic
    private String cRefunduploadBankname;

    @Column(name = "c_refundupload_bankaccname", table = "arts_t_refundupload", length = 100)
    @Basic
    private String cRefunduploadBankaccname;

    @Column(name = "c_refundupload_bankaccnum", table = "arts_t_refundupload", length = 100)
    @Basic
    private String cRefunduploadBankaccnum;

    @Column(name = "c_refundupload_maxprint", table = "arts_t_refundupload")
    @Basic
    private Short cRefunduploadMaxprint;

    @Column(name = "c_refundupload_refundnum", table = "arts_t_refundupload", length = 50)
    @Basic
    private String cRefunduploadRefundnum;

    @Column(name = "c_refundupload_printedon", table = "arts_t_refundupload")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRefunduploadPrintedon;

    @Column(name = "c_refundupload_createdby", table = "arts_t_refundupload", nullable = false, length = 36)
    @Basic
    private String cRefunduploadCreatedby;

    @Column(name = "c_refundupload_createdon", table = "arts_t_refundupload", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cRefunduploadCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcRefunduploadBookcode() {
        return cRefunduploadBookcode;
    }

    public void setcRefunduploadBookcode(String cRefunduploadBookcode) {
        this.cRefunduploadBookcode = cRefunduploadBookcode;
    }

    public String getcRefunduploadTicketnum() {
        return cRefunduploadTicketnum;
    }

    public void setcRefunduploadTicketnum(String cRefunduploadTicketnum) {
        this.cRefunduploadTicketnum = cRefunduploadTicketnum;
    }

    public String getcRefunduploadStcodeorg() {
        return cRefunduploadStcodeorg;
    }

    public void setcRefunduploadStcodeorg(String cRefunduploadStcodeorg) {
        this.cRefunduploadStcodeorg = cRefunduploadStcodeorg;
    }

    public String getcRefunduploadStcodedest() {
        return cRefunduploadStcodedest;
    }

    public void setcRefunduploadStcodedest(String cRefunduploadStcodedest) {
        this.cRefunduploadStcodedest = cRefunduploadStcodedest;
    }

    public String getcRefunduploadPsgname() {
        return cRefunduploadPsgname;
    }

    public void setcRefunduploadPsgname(String cRefunduploadPsgname) {
        this.cRefunduploadPsgname = cRefunduploadPsgname;
    }

    public BigDecimal getcRefunduploadAmount() {
        return cRefunduploadAmount;
    }

    public void setcRefunduploadAmount(BigDecimal cRefunduploadAmount) {
        this.cRefunduploadAmount = cRefunduploadAmount;
    }

    public Date getcRefunduploadCanceldate() {
        return cRefunduploadCanceldate;
    }

    public void setcRefunduploadCanceldate(Date cRefunduploadCanceldate) {
        this.cRefunduploadCanceldate = cRefunduploadCanceldate;
    }

    public Date getcRefunduploadRefunddatemin() {
        return cRefunduploadRefunddatemin;
    }

    public void setcRefunduploadRefunddatemin(Date cRefunduploadRefunddatemin) {
        this.cRefunduploadRefunddatemin = cRefunduploadRefunddatemin;
    }

    public Date getcRefunduploadRefunddatemax() {
        return cRefunduploadRefunddatemax;
    }

    public void setcRefunduploadRefunddatemax(Date cRefunduploadRefunddatemax) {
        this.cRefunduploadRefunddatemax = cRefunduploadRefunddatemax;
    }

    public Character getcRefunduploadRefundtype() {
        return cRefunduploadRefundtype;
    }

    public void setcRefunduploadRefundtype(Character cRefunduploadRefundtype) {
        this.cRefunduploadRefundtype = cRefunduploadRefundtype;
    }

    public String getcRefunduploadStcoderefund() {
        return cRefunduploadStcoderefund;
    }

    public void setcRefunduploadStcoderefund(String cRefunduploadStcoderefund) {
        this.cRefunduploadStcoderefund = cRefunduploadStcoderefund;
    }

    public String getcUserId() {
        return cUserId;
    }

    public void setcUserId(String cUserId) {
        this.cUserId = cUserId;
    }

    public String getcUnitId() {
        return cUnitId;
    }

    public void setcUnitId(String cUnitId) {
        this.cUnitId = cUnitId;
    }

    public Date getcRefunduploadRefunddate() {
        return cRefunduploadRefunddate;
    }

    public void setcRefunduploadRefunddate(Date cRefunduploadRefunddate) {
        this.cRefunduploadRefunddate = cRefunduploadRefunddate;
    }

    public String getcStasiunIdrefund() {
        return cStasiunIdrefund;
    }

    public void setcStasiunIdrefund(String cStasiunIdrefund) {
        this.cStasiunIdrefund = cStasiunIdrefund;
    }

    public Character getcRefunduploadStatus() {
        return cRefunduploadStatus;
    }

    public void setcRefunduploadStatus(Character cRefunduploadStatus) {
        this.cRefunduploadStatus = cRefunduploadStatus;
    }

    public String getcRefunduploadDomain() {
        return cRefunduploadDomain;
    }

    public void setcRefunduploadDomain(String cRefunduploadDomain) {
        this.cRefunduploadDomain = cRefunduploadDomain;
    }

    public String getcRefunduploadModifiedby() {
        return cRefunduploadModifiedby;
    }

    public void setcRefunduploadModifiedby(String cRefunduploadModifiedby) {
        this.cRefunduploadModifiedby = cRefunduploadModifiedby;
    }

    public Date getcRefunduploadModifiedon() {
        return cRefunduploadModifiedon;
    }

    public void setcRefunduploadModifiedon(Date cRefunduploadModifiedon) {
        this.cRefunduploadModifiedon = cRefunduploadModifiedon;
    }

    public String getcRefunduploadBankname() {
        return cRefunduploadBankname;
    }

    public void setcRefunduploadBankname(String cRefunduploadBankname) {
        this.cRefunduploadBankname = cRefunduploadBankname;
    }

    public String getcRefunduploadBankaccname() {
        return cRefunduploadBankaccname;
    }

    public void setcRefunduploadBankaccname(String cRefunduploadBankaccname) {
        this.cRefunduploadBankaccname = cRefunduploadBankaccname;
    }

    public String getcRefunduploadBankaccnum() {
        return cRefunduploadBankaccnum;
    }

    public void setcRefunduploadBankaccnum(String cRefunduploadBankaccnum) {
        this.cRefunduploadBankaccnum = cRefunduploadBankaccnum;
    }

    public Short getcRefunduploadMaxprint() {
        return cRefunduploadMaxprint;
    }

    public void setcRefunduploadMaxprint(Short cRefunduploadMaxprint) {
        this.cRefunduploadMaxprint = cRefunduploadMaxprint;
    }

    public String getcRefunduploadRefundnum() {
        return cRefunduploadRefundnum;
    }

    public void setcRefunduploadRefundnum(String cRefunduploadRefundnum) {
        this.cRefunduploadRefundnum = cRefunduploadRefundnum;
    }

    public Date getcRefunduploadPrintedon() {
        return cRefunduploadPrintedon;
    }

    public void setcRefunduploadPrintedon(Date cRefunduploadPrintedon) {
        this.cRefunduploadPrintedon = cRefunduploadPrintedon;
    }

    public String getcRefunduploadCreatedby() {
        return cRefunduploadCreatedby;
    }

    public void setcRefunduploadCreatedby(String cRefunduploadCreatedby) {
        this.cRefunduploadCreatedby = cRefunduploadCreatedby;
    }

    public Date getcRefunduploadCreatedon() {
        return cRefunduploadCreatedon;
    }

    public void setcRefunduploadCreatedon(Date cRefunduploadCreatedon) {
        this.cRefunduploadCreatedon = cRefunduploadCreatedon;
    }

    

}
