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
import javax.persistence.UniqueConstraint;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_seatbooktmp", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"c_trip_id", "c_wagondet_id", "c_stamformdet_id", "c_schedule_id"})})
public class Seatbooktmp implements Serializable {

    @Column(name = "c_seatbooktmp_id", table = "arts_t_seatbooktmp", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_trip_id", table = "arts_t_seatbooktmp", nullable = false, length = 36)
    @Basic
    private String cTripId;

    @Column(name = "c_stamformdet_id", table = "arts_t_seatbooktmp", nullable = false, length = 36)
    @Basic
    private String cStamformdetId;

    @Column(name = "c_wagondet_id", table = "arts_t_seatbooktmp", nullable = false, length = 36)
    @Basic
    private String cWagondetId;

    @Column(name = "c_schedule_id", table = "arts_t_seatbooktmp", nullable = false, length = 36)
    @Basic
    private String cScheduleId;

    @Column(name = "c_seatbooktmp_noka", table = "arts_t_seatbooktmp", nullable = false, length = 50)
    @Basic
    private String cSeatbooktmpNoka;

    @Column(name = "c_seatbooktmp_tripdate", table = "arts_t_seatbooktmp", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSeatbooktmpTripdate;

    @Column(name = "c_seatbooktmp_sfdorder", table = "arts_t_seatbooktmp", nullable = false)
    @Basic
    private short cSeatbooktmpSfdorder;

    @Column(name = "c_seatbooktmp_wgdrow", table = "arts_t_seatbooktmp", nullable = false, length = 2)
    @Basic
    private String cSeatbooktmpWgdrow;

    @Column(name = "c_seatbooktmp_wgdcol", table = "arts_t_seatbooktmp", nullable = false)
    @Basic
    private Character cSeatbooktmpWgdcol;

    @Column(name = "c_seatbooktmp_expdate", table = "arts_t_seatbooktmp", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSeatbooktmpExpdate;

    @Column(name = "c_seatbooktmp_domain", table = "arts_t_seatbooktmp", nullable = false, length = 36)
    @Basic
    private String cSeatbooktmpDomain;

    @Column(name = "c_seatbooktmp_sfdcode", table = "arts_t_seatbooktmp", nullable = false, length = 10)
    @Basic
    private String cSeatbooktmpSfdcode;

    @Column(name = "c_seatbooktmp_legval", table = "arts_t_seatbooktmp", length = 50)
    @Basic
    private String cSeatbooktmpLegval;

    @Column(name = "c_seatbooktmp_createdby", table = "arts_t_seatbooktmp", nullable = false, length = 36)
    @Basic
    private String cSeatbooktmpCreatedby;

    @Column(name = "c_seatbooktmp_createdon", table = "arts_t_seatbooktmp", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSeatbooktmpCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcTripId() {
        return cTripId;
    }

    public void setcTripId(String cTripId) {
        this.cTripId = cTripId;
    }

    public String getcStamformdetId() {
        return cStamformdetId;
    }

    public void setcStamformdetId(String cStamformdetId) {
        this.cStamformdetId = cStamformdetId;
    }

    public String getcWagondetId() {
        return cWagondetId;
    }

    public void setcWagondetId(String cWagondetId) {
        this.cWagondetId = cWagondetId;
    }

    public String getcScheduleId() {
        return cScheduleId;
    }

    public void setcScheduleId(String cScheduleId) {
        this.cScheduleId = cScheduleId;
    }

    public String getcSeatbooktmpNoka() {
        return cSeatbooktmpNoka;
    }

    public void setcSeatbooktmpNoka(String cSeatbooktmpNoka) {
        this.cSeatbooktmpNoka = cSeatbooktmpNoka;
    }

    public Date getcSeatbooktmpTripdate() {
        return cSeatbooktmpTripdate;
    }

    public void setcSeatbooktmpTripdate(Date cSeatbooktmpTripdate) {
        this.cSeatbooktmpTripdate = cSeatbooktmpTripdate;
    }

    public short getcSeatbooktmpSfdorder() {
        return cSeatbooktmpSfdorder;
    }

    public void setcSeatbooktmpSfdorder(short cSeatbooktmpSfdorder) {
        this.cSeatbooktmpSfdorder = cSeatbooktmpSfdorder;
    }

    public String getcSeatbooktmpWgdrow() {
        return cSeatbooktmpWgdrow;
    }

    public void setcSeatbooktmpWgdrow(String cSeatbooktmpWgdrow) {
        this.cSeatbooktmpWgdrow = cSeatbooktmpWgdrow;
    }

    public Character getcSeatbooktmpWgdcol() {
        return cSeatbooktmpWgdcol;
    }

    public void setcSeatbooktmpWgdcol(Character cSeatbooktmpWgdcol) {
        this.cSeatbooktmpWgdcol = cSeatbooktmpWgdcol;
    }

    public Date getcSeatbooktmpExpdate() {
        return cSeatbooktmpExpdate;
    }

    public void setcSeatbooktmpExpdate(Date cSeatbooktmpExpdate) {
        this.cSeatbooktmpExpdate = cSeatbooktmpExpdate;
    }

    public String getcSeatbooktmpDomain() {
        return cSeatbooktmpDomain;
    }

    public void setcSeatbooktmpDomain(String cSeatbooktmpDomain) {
        this.cSeatbooktmpDomain = cSeatbooktmpDomain;
    }

    public String getcSeatbooktmpSfdcode() {
        return cSeatbooktmpSfdcode;
    }

    public void setcSeatbooktmpSfdcode(String cSeatbooktmpSfdcode) {
        this.cSeatbooktmpSfdcode = cSeatbooktmpSfdcode;
    }

    public String getcSeatbooktmpLegval() {
        return cSeatbooktmpLegval;
    }

    public void setcSeatbooktmpLegval(String cSeatbooktmpLegval) {
        this.cSeatbooktmpLegval = cSeatbooktmpLegval;
    }

    public String getcSeatbooktmpCreatedby() {
        return cSeatbooktmpCreatedby;
    }

    public void setcSeatbooktmpCreatedby(String cSeatbooktmpCreatedby) {
        this.cSeatbooktmpCreatedby = cSeatbooktmpCreatedby;
    }

    public Date getcSeatbooktmpCreatedon() {
        return cSeatbooktmpCreatedon;
    }

    public void setcSeatbooktmpCreatedon(Date cSeatbooktmpCreatedon) {
        this.cSeatbooktmpCreatedon = cSeatbooktmpCreatedon;
    }

    

}
