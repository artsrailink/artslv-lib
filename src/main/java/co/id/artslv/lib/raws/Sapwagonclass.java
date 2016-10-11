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
@Table(name = "arts_t_sapwagonclass")
public class Sapwagonclass implements Serializable {

    @Column(name = "c_sapwagonclass_id", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wagonclass_id", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    @Basic
    private String cWagonclassId;

    @Column(name = "c_trainmiles_id", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    @Basic
    private String cTrainmilesId;

    @Column(name = "c_sapcoa_id", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    @Basic
    private String cSapcoaId;

    @Column(name = "c_sapwagonclass_status", table = "arts_t_sapwagonclass", nullable = false)
    @Basic
    private Character cSapwagonclassStatus;

    @Column(name = "c_sapwagonclass_domain", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    @Basic
    private String cSapwagonclassDomain;

    @Column(name = "c_sapwagonclass_modifiedby", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    @Basic
    private String cSapwagonclassModifiedby;

    @Column(name = "c_sapwagonclass_modifiedon", table = "arts_t_sapwagonclass", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSapwagonclassModifiedon;

    @Column(name = "c_sapwagonclass_createdby", table = "arts_t_sapwagonclass", nullable = false, length = 36)
    @Basic
    private String cSapwagonclassCreatedby;

    @Column(name = "c_sapwagonclass_createdon", table = "arts_t_sapwagonclass", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cSapwagonclassCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcWagonclassId() {
        return cWagonclassId;
    }

    public void setcWagonclassId(String cWagonclassId) {
        this.cWagonclassId = cWagonclassId;
    }

    public String getcTrainmilesId() {
        return cTrainmilesId;
    }

    public void setcTrainmilesId(String cTrainmilesId) {
        this.cTrainmilesId = cTrainmilesId;
    }

    public String getcSapcoaId() {
        return cSapcoaId;
    }

    public void setcSapcoaId(String cSapcoaId) {
        this.cSapcoaId = cSapcoaId;
    }

    public Character getcSapwagonclassStatus() {
        return cSapwagonclassStatus;
    }

    public void setcSapwagonclassStatus(Character cSapwagonclassStatus) {
        this.cSapwagonclassStatus = cSapwagonclassStatus;
    }

    public String getcSapwagonclassDomain() {
        return cSapwagonclassDomain;
    }

    public void setcSapwagonclassDomain(String cSapwagonclassDomain) {
        this.cSapwagonclassDomain = cSapwagonclassDomain;
    }

    public String getcSapwagonclassModifiedby() {
        return cSapwagonclassModifiedby;
    }

    public void setcSapwagonclassModifiedby(String cSapwagonclassModifiedby) {
        this.cSapwagonclassModifiedby = cSapwagonclassModifiedby;
    }

    public Date getcSapwagonclassModifiedon() {
        return cSapwagonclassModifiedon;
    }

    public void setcSapwagonclassModifiedon(Date cSapwagonclassModifiedon) {
        this.cSapwagonclassModifiedon = cSapwagonclassModifiedon;
    }

    public String getcSapwagonclassCreatedby() {
        return cSapwagonclassCreatedby;
    }

    public void setcSapwagonclassCreatedby(String cSapwagonclassCreatedby) {
        this.cSapwagonclassCreatedby = cSapwagonclassCreatedby;
    }

    public Date getcSapwagonclassCreatedon() {
        return cSapwagonclassCreatedon;
    }

    public void setcSapwagonclassCreatedon(Date cSapwagonclassCreatedon) {
        this.cSapwagonclassCreatedon = cSapwagonclassCreatedon;
    }

    
}
