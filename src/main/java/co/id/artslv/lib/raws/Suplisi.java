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
@Table(name = "arts_t_suplisi")
public class Suplisi implements Serializable {

    @Column(name = "c_suplisi_id", table = "arts_t_suplisi", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_suplisi_date", table = "arts_t_suplisi", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSuplisiDate;

    @Column(name = "c_suplisi_docdate", table = "arts_t_suplisi", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSuplisiDocdate;

    @Column(name = "c_suplisi_tripdate", table = "arts_t_suplisi", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSuplisiTripdate;

    @Column(name = "c_suplisi_docnum", table = "arts_t_suplisi", nullable = false, length = 20)
    @Basic
    private String cSuplisiDocnum;

    @Column(name = "c_suplisi_ordernum", table = "arts_t_suplisi", nullable = false, length = 20)
    @Basic
    private String cSuplisiOrdernum;

    @Column(name = "c_schedule_id", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cScheduleId;

    @Column(name = "c_wagonclass_id", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cWagonclassId;

    @Column(name = "c_stasiun_idorg", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cStasiunIdorg;

    @Column(name = "c_stasiun_iddest", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cStasiunIddest;

    @Column(name = "c_suplisi_totamount", table = "arts_t_suplisi", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cSuplisiTotamount;

    @Column(name = "c_suplisi_status", table = "arts_t_suplisi", nullable = false)
    @Basic
    private Character cSuplisiStatus;

    @Column(name = "c_suplisi_domain", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cSuplisiDomain;

    @Column(name = "c_suplisi_modifiedby", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cSuplisiModifiedby;

    @Column(name = "c_suplisi_modifiedon", table = "arts_t_suplisi", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSuplisiModifiedon;

    @Column(name = "c_unit_id", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cUnitId;

    @Column(name = "c_stasiun_idbook", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cStasiunIdbook;

    @Column(name = "c_suplisi_type", table = "arts_t_suplisi", nullable = false)
    @Basic
    private Character cSuplisiType;

    @Column(name = "c_suplisi_weight", table = "arts_t_suplisi", scale = 2, precision = 5)
    @Basic
    private BigDecimal cSuplisiWeight;

    @Column(name = "c_suplisi_psgnum", table = "arts_t_suplisi")
    @Basic
    private Integer cSuplisiPsgnum;

    @Column(name = "c_suplisi_createdby", table = "arts_t_suplisi", nullable = false, length = 36)
    @Basic
    private String cSuplisiCreatedby;

    @Column(name = "c_suplisi_createdon", table = "arts_t_suplisi", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSuplisiCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getcSuplisiDate() {
        return cSuplisiDate;
    }

    public void setcSuplisiDate(Date cSuplisiDate) {
        this.cSuplisiDate = cSuplisiDate;
    }

    public Date getcSuplisiDocdate() {
        return cSuplisiDocdate;
    }

    public void setcSuplisiDocdate(Date cSuplisiDocdate) {
        this.cSuplisiDocdate = cSuplisiDocdate;
    }

    public Date getcSuplisiTripdate() {
        return cSuplisiTripdate;
    }

    public void setcSuplisiTripdate(Date cSuplisiTripdate) {
        this.cSuplisiTripdate = cSuplisiTripdate;
    }

    public String getcSuplisiDocnum() {
        return cSuplisiDocnum;
    }

    public void setcSuplisiDocnum(String cSuplisiDocnum) {
        this.cSuplisiDocnum = cSuplisiDocnum;
    }

    public String getcSuplisiOrdernum() {
        return cSuplisiOrdernum;
    }

    public void setcSuplisiOrdernum(String cSuplisiOrdernum) {
        this.cSuplisiOrdernum = cSuplisiOrdernum;
    }

    public String getcScheduleId() {
        return cScheduleId;
    }

    public void setcScheduleId(String cScheduleId) {
        this.cScheduleId = cScheduleId;
    }

    public String getcWagonclassId() {
        return cWagonclassId;
    }

    public void setcWagonclassId(String cWagonclassId) {
        this.cWagonclassId = cWagonclassId;
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

    public BigDecimal getcSuplisiTotamount() {
        return cSuplisiTotamount;
    }

    public void setcSuplisiTotamount(BigDecimal cSuplisiTotamount) {
        this.cSuplisiTotamount = cSuplisiTotamount;
    }

    public Character getcSuplisiStatus() {
        return cSuplisiStatus;
    }

    public void setcSuplisiStatus(Character cSuplisiStatus) {
        this.cSuplisiStatus = cSuplisiStatus;
    }

    public String getcSuplisiDomain() {
        return cSuplisiDomain;
    }

    public void setcSuplisiDomain(String cSuplisiDomain) {
        this.cSuplisiDomain = cSuplisiDomain;
    }

    public String getcSuplisiModifiedby() {
        return cSuplisiModifiedby;
    }

    public void setcSuplisiModifiedby(String cSuplisiModifiedby) {
        this.cSuplisiModifiedby = cSuplisiModifiedby;
    }

    public Date getcSuplisiModifiedon() {
        return cSuplisiModifiedon;
    }

    public void setcSuplisiModifiedon(Date cSuplisiModifiedon) {
        this.cSuplisiModifiedon = cSuplisiModifiedon;
    }

    public String getcUnitId() {
        return cUnitId;
    }

    public void setcUnitId(String cUnitId) {
        this.cUnitId = cUnitId;
    }

    public String getcStasiunIdbook() {
        return cStasiunIdbook;
    }

    public void setcStasiunIdbook(String cStasiunIdbook) {
        this.cStasiunIdbook = cStasiunIdbook;
    }

    public Character getcSuplisiType() {
        return cSuplisiType;
    }

    public void setcSuplisiType(Character cSuplisiType) {
        this.cSuplisiType = cSuplisiType;
    }

    public BigDecimal getcSuplisiWeight() {
        return cSuplisiWeight;
    }

    public void setcSuplisiWeight(BigDecimal cSuplisiWeight) {
        this.cSuplisiWeight = cSuplisiWeight;
    }

    public Integer getcSuplisiPsgnum() {
        return cSuplisiPsgnum;
    }

    public void setcSuplisiPsgnum(Integer cSuplisiPsgnum) {
        this.cSuplisiPsgnum = cSuplisiPsgnum;
    }

    public String getcSuplisiCreatedby() {
        return cSuplisiCreatedby;
    }

    public void setcSuplisiCreatedby(String cSuplisiCreatedby) {
        this.cSuplisiCreatedby = cSuplisiCreatedby;
    }

    public Date getcSuplisiCreatedon() {
        return cSuplisiCreatedon;
    }

    public void setcSuplisiCreatedon(Date cSuplisiCreatedon) {
        this.cSuplisiCreatedon = cSuplisiCreatedon;
    }

   

}
