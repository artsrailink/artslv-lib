/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.trains;

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
@Table(name = "arts_t_hidesubclass")
public class Hidesubclass {

    @Column(name = "c_hidesubclass_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_unit_id", table = "arts_t_hidesubclass", nullable = false, length = 36)
    @Basic
    private String cUnitId;

    @Column(name = "c_subclass_id", table = "arts_t_hidesubclass", nullable = false, length = 36)
    @Basic
    private String cSubclassId;

    @Column(name = "c_hidesubclass_status", table = "arts_t_hidesubclass", nullable = false)
    @Basic
    private Character cHidesubclassStatus;

    @Column(name = "c_hidesubclass_domain", table = "arts_t_hidesubclass", nullable = false, length = 36)
    @Basic
    private String cHidesubclassDomain;

    @Column(name = "c_hidesubclass_createdby", table = "arts_t_hidesubclass", nullable = false, length = 36)
    @Basic
    private String cHidesubclassCreatedby;

    @Column(name = "c_hidesubclass_createdon", table = "arts_t_hidesubclass", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cHidesubclassCreatedon;

    @Column(name = "c_hidesubclass_modifiedby", table = "arts_t_hidesubclass", nullable = false, length = 36)
    @Basic
    private String cHidesubclassModifiedby;

    @Column(name = "c_hidesubclass_modifiedon", table = "arts_t_hidesubclass", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cHidesubclassModifiedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcUnitId() {
        return cUnitId;
    }

    public void setcUnitId(String cUnitId) {
        this.cUnitId = cUnitId;
    }

    public String getcSubclassId() {
        return cSubclassId;
    }

    public void setcSubclassId(String cSubclassId) {
        this.cSubclassId = cSubclassId;
    }

    public Character getcHidesubclassStatus() {
        return cHidesubclassStatus;
    }

    public void setcHidesubclassStatus(Character cHidesubclassStatus) {
        this.cHidesubclassStatus = cHidesubclassStatus;
    }

    public String getcHidesubclassDomain() {
        return cHidesubclassDomain;
    }

    public void setcHidesubclassDomain(String cHidesubclassDomain) {
        this.cHidesubclassDomain = cHidesubclassDomain;
    }

    public String getcHidesubclassCreatedby() {
        return cHidesubclassCreatedby;
    }

    public void setcHidesubclassCreatedby(String cHidesubclassCreatedby) {
        this.cHidesubclassCreatedby = cHidesubclassCreatedby;
    }

    public Date getcHidesubclassCreatedon() {
        return cHidesubclassCreatedon;
    }

    public void setcHidesubclassCreatedon(Date cHidesubclassCreatedon) {
        this.cHidesubclassCreatedon = cHidesubclassCreatedon;
    }

    public String getcHidesubclassModifiedby() {
        return cHidesubclassModifiedby;
    }

    public void setcHidesubclassModifiedby(String cHidesubclassModifiedby) {
        this.cHidesubclassModifiedby = cHidesubclassModifiedby;
    }

    public Date getcHidesubclassModifiedon() {
        return cHidesubclassModifiedon;
    }

    public void setcHidesubclassModifiedon(Date cHidesubclassModifiedon) {
        this.cHidesubclassModifiedon = cHidesubclassModifiedon;
    }
    
    
}
