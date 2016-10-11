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
@Table(name = "arts_t_hidenoka")
public class Hidenoka  {

    @Column(name = "c_hidenoka_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_stasiun_id", table = "arts_t_hidenoka", nullable = false, length = 36)
    @Basic
    private String cStasiunId;

    @Column(name = "c_hidenoka_status", table = "arts_t_hidenoka", nullable = false)
    @Basic
    private Character cHidenokaStatus;

    @Column(name = "c_hidenoka_domain", table = "arts_t_hidenoka", nullable = false, length = 36)
    @Basic
    private String cHidenokaDomain;

    @Column(name = "c_hidenoka_modifiedby", table = "arts_t_hidenoka", nullable = false, length = 36)
    @Basic
    private String cHidenokaModifiedby;

    @Column(name = "c_hidenoka_modifiedon", table = "arts_t_hidenoka", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cHidenokaModifiedon;

    @Column(name = "c_hidenoka_schedulenoka", table = "arts_t_hidenoka", nullable = false, length = 50)
    @Basic
    private String cHidenokaSchedulenoka;

    @Column(name = "c_hidenoka_createdby", table = "arts_t_hidenoka", nullable = false, length = 36)
    @Basic
    private String cHidenokaCreatedby;

    @Column(name = "c_hidenoka_createdon", table = "arts_t_hidenoka", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cHidenokaCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcStasiunId() {
        return cStasiunId;
    }

    public void setcStasiunId(String cStasiunId) {
        this.cStasiunId = cStasiunId;
    }

    public Character getcHidenokaStatus() {
        return cHidenokaStatus;
    }

    public void setcHidenokaStatus(Character cHidenokaStatus) {
        this.cHidenokaStatus = cHidenokaStatus;
    }

    public String getcHidenokaDomain() {
        return cHidenokaDomain;
    }

    public void setcHidenokaDomain(String cHidenokaDomain) {
        this.cHidenokaDomain = cHidenokaDomain;
    }

    public String getcHidenokaModifiedby() {
        return cHidenokaModifiedby;
    }

    public void setcHidenokaModifiedby(String cHidenokaModifiedby) {
        this.cHidenokaModifiedby = cHidenokaModifiedby;
    }

    public Date getcHidenokaModifiedon() {
        return cHidenokaModifiedon;
    }

    public void setcHidenokaModifiedon(Date cHidenokaModifiedon) {
        this.cHidenokaModifiedon = cHidenokaModifiedon;
    }

    public String getcHidenokaSchedulenoka() {
        return cHidenokaSchedulenoka;
    }

    public void setcHidenokaSchedulenoka(String cHidenokaSchedulenoka) {
        this.cHidenokaSchedulenoka = cHidenokaSchedulenoka;
    }

    public String getcHidenokaCreatedby() {
        return cHidenokaCreatedby;
    }

    public void setcHidenokaCreatedby(String cHidenokaCreatedby) {
        this.cHidenokaCreatedby = cHidenokaCreatedby;
    }

    public Date getcHidenokaCreatedon() {
        return cHidenokaCreatedon;
    }

    public void setcHidenokaCreatedon(Date cHidenokaCreatedon) {
        this.cHidenokaCreatedon = cHidenokaCreatedon;
    }
    
    

}
