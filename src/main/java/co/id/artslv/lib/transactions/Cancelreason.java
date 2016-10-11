/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.transactions;

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
@Table(name = "arts_t_cancelreason")
public class Cancelreason {

    @Column(name = "c_cancelreason_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_cancelreason_description", table = "arts_t_cancelreason", nullable = false, length = 100)
    @Basic
    private String cCancelreasonDecCancellationtypeIdscription;

    @Column(name = "c_cancelreason_status", table = "arts_t_cancelreason", nullable = false)
    @Basic
    private Character cCancelreasonStatus;

    @Column(name = "c_cancelreason_domain", table = "arts_t_cancelreason", nullable = false, length = 36)
    @Basic
    private String cCancelreasonDomain;

    @Column(name = "c_cancelreason_modifiedby", table = "arts_t_cancelreason", nullable = false, length = 36)
    @Basic
    private String cCancelreasonModifiedby;

    @Column(name = "c_cancelreason_modifiedon", table = "arts_t_cancelreason", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCancelreasonModifiedon;

    @Column(name = "c_cancelreason_createdby", table = "arts_t_cancelreason", length = 36)
    @Basic
    private String cCancelreasonCreatedby;

    @Column(name = "c_cancelreason_createdon", table = "arts_t_cancelreason")
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCancelreasonCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcCancelreasonDecCancellationtypeIdscription() {
        return cCancelreasonDecCancellationtypeIdscription;
    }

    public void setcCancelreasonDecCancellationtypeIdscription(String cCancelreasonDecCancellationtypeIdscription) {
        this.cCancelreasonDecCancellationtypeIdscription = cCancelreasonDecCancellationtypeIdscription;
    }

    public Character getcCancelreasonStatus() {
        return cCancelreasonStatus;
    }

    public void setcCancelreasonStatus(Character cCancelreasonStatus) {
        this.cCancelreasonStatus = cCancelreasonStatus;
    }

    public String getcCancelreasonDomain() {
        return cCancelreasonDomain;
    }

    public void setcCancelreasonDomain(String cCancelreasonDomain) {
        this.cCancelreasonDomain = cCancelreasonDomain;
    }

    public String getcCancelreasonModifiedby() {
        return cCancelreasonModifiedby;
    }

    public void setcCancelreasonModifiedby(String cCancelreasonModifiedby) {
        this.cCancelreasonModifiedby = cCancelreasonModifiedby;
    }

    public Date getcCancelreasonModifiedon() {
        return cCancelreasonModifiedon;
    }

    public void setcCancelreasonModifiedon(Date cCancelreasonModifiedon) {
        this.cCancelreasonModifiedon = cCancelreasonModifiedon;
    }

    public String getcCancelreasonCreatedby() {
        return cCancelreasonCreatedby;
    }

    public void setcCancelreasonCreatedby(String cCancelreasonCreatedby) {
        this.cCancelreasonCreatedby = cCancelreasonCreatedby;
    }

    public Date getcCancelreasonCreatedon() {
        return cCancelreasonCreatedon;
    }

    public void setcCancelreasonCreatedon(Date cCancelreasonCreatedon) {
        this.cCancelreasonCreatedon = cCancelreasonCreatedon;
    }

    
}
