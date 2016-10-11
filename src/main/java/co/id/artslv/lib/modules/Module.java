/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.modules;

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
@Table(name = "arts_t_module")
public class Module implements Serializable {

    @Column(name = "c_module_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_module_name", table = "arts_t_module", nullable = false, length = 100)
    @Basic
    private String cModuleName;

    @Column(name = "c_module_parent", table = "arts_t_module", length = 36)
    @Basic
    private String cModuleParent;

    @Column(name = "c_module_link", table = "arts_t_module")
    @Basic
    private String cModuleLink;

    @Column(name = "c_module_seq", table = "arts_t_module", nullable = false, length = 10)
    @Basic
    private String cModuleSeq;

    @Column(name = "c_module_status", table = "arts_t_module", nullable = false)
    @Basic
    private Character cModuleStatus;

    @Column(name = "c_module_domain", table = "arts_t_module", nullable = false, length = 36)
    @Basic
    private String cModuleDomain;

    @Column(name = "c_module_modifiedby", table = "arts_t_module", nullable = false, length = 36)
    @Basic
    private String cModuleModifiedby;

    @Column(name = "c_module_modifiedon", table = "arts_t_module", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cModuleModifiedon;

    @Column(name = "c_moduletype_id", table = "arts_t_module", nullable = false, length = 36)
    @Basic
    private String cModuletypeId;

    @Column(name = "c_module_apptype", table = "arts_t_module", nullable = false)
    @Basic
    private Character cModuleApptype;

    @Column(name = "c_module_createdby", table = "arts_t_module", nullable = false, length = 36)
    @Basic
    private String cModuleCreatedby;

    @Column(name = "c_module_createdon", table = "arts_t_module", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cModuleCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcModuleName() {
        return cModuleName;
    }

    public void setcModuleName(String cModuleName) {
        this.cModuleName = cModuleName;
    }

    public String getcModuleParent() {
        return cModuleParent;
    }

    public void setcModuleParent(String cModuleParent) {
        this.cModuleParent = cModuleParent;
    }

    public String getcModuleLink() {
        return cModuleLink;
    }

    public void setcModuleLink(String cModuleLink) {
        this.cModuleLink = cModuleLink;
    }

    public String getcModuleSeq() {
        return cModuleSeq;
    }

    public void setcModuleSeq(String cModuleSeq) {
        this.cModuleSeq = cModuleSeq;
    }

    public Character getcModuleStatus() {
        return cModuleStatus;
    }

    public void setcModuleStatus(Character cModuleStatus) {
        this.cModuleStatus = cModuleStatus;
    }

    public String getcModuleDomain() {
        return cModuleDomain;
    }

    public void setcModuleDomain(String cModuleDomain) {
        this.cModuleDomain = cModuleDomain;
    }

    public String getcModuleModifiedby() {
        return cModuleModifiedby;
    }

    public void setcModuleModifiedby(String cModuleModifiedby) {
        this.cModuleModifiedby = cModuleModifiedby;
    }

    public Date getcModuleModifiedon() {
        return cModuleModifiedon;
    }

    public void setcModuleModifiedon(Date cModuleModifiedon) {
        this.cModuleModifiedon = cModuleModifiedon;
    }

    public String getcModuletypeId() {
        return cModuletypeId;
    }

    public void setcModuletypeId(String cModuletypeId) {
        this.cModuletypeId = cModuletypeId;
    }

    public Character getcModuleApptype() {
        return cModuleApptype;
    }

    public void setcModuleApptype(Character cModuleApptype) {
        this.cModuleApptype = cModuleApptype;
    }

    public String getcModuleCreatedby() {
        return cModuleCreatedby;
    }

    public void setcModuleCreatedby(String cModuleCreatedby) {
        this.cModuleCreatedby = cModuleCreatedby;
    }

    public Date getcModuleCreatedon() {
        return cModuleCreatedon;
    }

    public void setcModuleCreatedon(Date cModuleCreatedon) {
        this.cModuleCreatedon = cModuleCreatedon;
    }
    
    

}
