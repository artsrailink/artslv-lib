/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.org;

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
@Table(name = "arts_t_stasiun")
public class Stasiun {

    @Column(name = "c_stasiun_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_stasiun_profitcenter", table = "arts_t_stasiun", length = 15)
    @Basic
    private String cStasiunProfitcenter;

    @Column(name = "c_stasiun_name", table = "arts_t_stasiun", nullable = false, length = 100)
    @Basic
    private String cStasiunName;

    @Column(name = "c_stasiun_code", table = "arts_t_stasiun", nullable = false, length = 10)
    @Basic
    private String cStasiunCode;

    @Column(name = "c_stasiun_pembatalan", table = "arts_t_stasiun", nullable = false)
    @Basic
    private Character cStasiunPembatalan;

    @Column(name = "c_stasiun_pengembalianbea", table = "arts_t_stasiun", nullable = false)
    @Basic
    private Character cStasiunPengembalianbea;

    @Column(name = "c_stasiun_status", table = "arts_t_stasiun", nullable = false)
    @Basic
    private Character cStasiunStatus;

    @Column(name = "c_stasiun_domain", table = "arts_t_stasiun", nullable = false, length = 36)
    @Basic
    private String cStasiunDomain;

    @Column(name = "c_stasiun_modifiedby", table = "arts_t_stasiun", nullable = false, length = 36)
    @Basic
    private String cStasiunModifiedby;

    @Column(name = "c_stasiun_modifiedon", table = "arts_t_stasiun", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cStasiunModifiedon;

    @Column(name = "c_area_id", table = "arts_t_stasiun", nullable = false, length = 36)
    @Basic
    private String cAreaId;

    @Column(name = "c_city_id", table = "arts_t_stasiun", nullable = false, length = 36)
    @Basic
    private String cCityId;

    @Column(name = "c_stasiun_createdby", table = "arts_t_stasiun", nullable = false, length = 36)
    @Basic
    private String cStasiunCreatedby;

    @Column(name = "c_stasiun_createdon", table = "arts_t_stasiun", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cStasiunCreatedon;

    @Column(name = "c_stasiun_showpos", table = "arts_t_stasiun", nullable = false)
    @Basic
    private Character cStasiunShowpos;

    @Column(name = "c_stasiun_showibook", table = "arts_t_stasiun", nullable = false)
    @Basic
    private Character cStasiunShowibook;

    @Column(name = "c_stasiun_showmobile", table = "arts_t_stasiun", nullable = false)
    @Basic
    private Character cStasiunShowmobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcStasiunProfitcenter() {
        return cStasiunProfitcenter;
    }

    public void setcStasiunProfitcenter(String cStasiunProfitcenter) {
        this.cStasiunProfitcenter = cStasiunProfitcenter;
    }

    public String getcStasiunName() {
        return cStasiunName;
    }

    public void setcStasiunName(String cStasiunName) {
        this.cStasiunName = cStasiunName;
    }

    public String getcStasiunCode() {
        return cStasiunCode;
    }

    public void setcStasiunCode(String cStasiunCode) {
        this.cStasiunCode = cStasiunCode;
    }

    public Character getcStasiunPembatalan() {
        return cStasiunPembatalan;
    }

    public void setcStasiunPembatalan(Character cStasiunPembatalan) {
        this.cStasiunPembatalan = cStasiunPembatalan;
    }

    public Character getcStasiunPengembalianbea() {
        return cStasiunPengembalianbea;
    }

    public void setcStasiunPengembalianbea(Character cStasiunPengembalianbea) {
        this.cStasiunPengembalianbea = cStasiunPengembalianbea;
    }

    public Character getcStasiunStatus() {
        return cStasiunStatus;
    }

    public void setcStasiunStatus(Character cStasiunStatus) {
        this.cStasiunStatus = cStasiunStatus;
    }

    public String getcStasiunDomain() {
        return cStasiunDomain;
    }

    public void setcStasiunDomain(String cStasiunDomain) {
        this.cStasiunDomain = cStasiunDomain;
    }

    public String getcStasiunModifiedby() {
        return cStasiunModifiedby;
    }

    public void setcStasiunModifiedby(String cStasiunModifiedby) {
        this.cStasiunModifiedby = cStasiunModifiedby;
    }

    public Date getcStasiunModifiedon() {
        return cStasiunModifiedon;
    }

    public void setcStasiunModifiedon(Date cStasiunModifiedon) {
        this.cStasiunModifiedon = cStasiunModifiedon;
    }

    public String getcAreaId() {
        return cAreaId;
    }

    public void setcAreaId(String cAreaId) {
        this.cAreaId = cAreaId;
    }

    public String getcCityId() {
        return cCityId;
    }

    public void setcCityId(String cCityId) {
        this.cCityId = cCityId;
    }

    public String getcStasiunCreatedby() {
        return cStasiunCreatedby;
    }

    public void setcStasiunCreatedby(String cStasiunCreatedby) {
        this.cStasiunCreatedby = cStasiunCreatedby;
    }

    public Date getcStasiunCreatedon() {
        return cStasiunCreatedon;
    }

    public void setcStasiunCreatedon(Date cStasiunCreatedon) {
        this.cStasiunCreatedon = cStasiunCreatedon;
    }

    public Character getcStasiunShowpos() {
        return cStasiunShowpos;
    }

    public void setcStasiunShowpos(Character cStasiunShowpos) {
        this.cStasiunShowpos = cStasiunShowpos;
    }

    public Character getcStasiunShowibook() {
        return cStasiunShowibook;
    }

    public void setcStasiunShowibook(Character cStasiunShowibook) {
        this.cStasiunShowibook = cStasiunShowibook;
    }

    public Character getcStasiunShowmobile() {
        return cStasiunShowmobile;
    }

    public void setcStasiunShowmobile(Character cStasiunShowmobile) {
        this.cStasiunShowmobile = cStasiunShowmobile;
    }
    
    
}
