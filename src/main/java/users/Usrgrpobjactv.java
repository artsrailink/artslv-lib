/**
 * This file was generated by the JPA Modeler
 */
package users;

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
@Table(name = "arts_t_usrgrpobjactv")
public class Usrgrpobjactv {

    @Column(name = "c_usrgrpobjactv_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_usergroup_id", table = "arts_t_usrgrpobjactv", nullable = false, length = 36)
    @Basic
    private String cUsergroupId;

    @Column(name = "c_objactivity_id", table = "arts_t_usrgrpobjactv", nullable = false, length = 36)
    @Basic
    private String cObjactivityId;

    @Column(name = "c_usrgrpobjactv_status", table = "arts_t_usrgrpobjactv", nullable = false)
    @Basic
    private Character cUsrgrpobjactvStatus;

    @Column(name = "c_usrgrpobjactv_domain", table = "arts_t_usrgrpobjactv", nullable = false, length = 36)
    @Basic
    private String cUsrgrpobjactvDomain;

    @Column(name = "c_usrgrpobjactv_modifiedby", table = "arts_t_usrgrpobjactv", nullable = false, length = 36)
    @Basic
    private String cUsrgrpobjactvModifiedby;

    @Column(name = "c_usrgrpobjactv_modifiedon", table = "arts_t_usrgrpobjactv", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cUsrgrpobjactvModifiedon;

    @Column(name = "c_usrgrpobjactv_createdby", table = "arts_t_usrgrpobjactv", nullable = false, length = 36)
    @Basic
    private String cUsrgrpobjactvCreatedby;

    @Column(name = "c_usrgrpobjactv_createdon", table = "arts_t_usrgrpobjactv", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cUsrgrpobjactvCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcUsergroupId() {
        return cUsergroupId;
    }

    public void setcUsergroupId(String cUsergroupId) {
        this.cUsergroupId = cUsergroupId;
    }

    public String getcObjactivityId() {
        return cObjactivityId;
    }

    public void setcObjactivityId(String cObjactivityId) {
        this.cObjactivityId = cObjactivityId;
    }

    public Character getcUsrgrpobjactvStatus() {
        return cUsrgrpobjactvStatus;
    }

    public void setcUsrgrpobjactvStatus(Character cUsrgrpobjactvStatus) {
        this.cUsrgrpobjactvStatus = cUsrgrpobjactvStatus;
    }

    public String getcUsrgrpobjactvDomain() {
        return cUsrgrpobjactvDomain;
    }

    public void setcUsrgrpobjactvDomain(String cUsrgrpobjactvDomain) {
        this.cUsrgrpobjactvDomain = cUsrgrpobjactvDomain;
    }

    public String getcUsrgrpobjactvModifiedby() {
        return cUsrgrpobjactvModifiedby;
    }

    public void setcUsrgrpobjactvModifiedby(String cUsrgrpobjactvModifiedby) {
        this.cUsrgrpobjactvModifiedby = cUsrgrpobjactvModifiedby;
    }

    public Date getcUsrgrpobjactvModifiedon() {
        return cUsrgrpobjactvModifiedon;
    }

    public void setcUsrgrpobjactvModifiedon(Date cUsrgrpobjactvModifiedon) {
        this.cUsrgrpobjactvModifiedon = cUsrgrpobjactvModifiedon;
    }

    public String getcUsrgrpobjactvCreatedby() {
        return cUsrgrpobjactvCreatedby;
    }

    public void setcUsrgrpobjactvCreatedby(String cUsrgrpobjactvCreatedby) {
        this.cUsrgrpobjactvCreatedby = cUsrgrpobjactvCreatedby;
    }

    public Date getcUsrgrpobjactvCreatedon() {
        return cUsrgrpobjactvCreatedon;
    }

    public void setcUsrgrpobjactvCreatedon(Date cUsrgrpobjactvCreatedon) {
        this.cUsrgrpobjactvCreatedon = cUsrgrpobjactvCreatedon;
    }
    
    

}
