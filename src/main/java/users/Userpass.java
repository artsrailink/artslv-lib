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
@Table(name = "arts_t_userpass")
public class Userpass {

    @Column(name = "c_userpass_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_userpass_createdon", table = "arts_t_userpass", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cUserpassCreatedon;

    @Column(name = "c_userpass_password", table = "arts_t_userpass", nullable = false, length = 60)
    @Basic
    private String cUserpassPassword;

    @Column(name = "c_user_id", table = "arts_t_userpass", nullable = false, length = 36)
    @Basic
    private String cUserId;

    @Column(name = "c_userpass_status", table = "arts_t_userpass", nullable = false)
    @Basic
    private Character cUserpassStatus;

    @Column(name = "c_userpass_domain", table = "arts_t_userpass", nullable = false, length = 36)
    @Basic
    private String cUserpassDomain;

    @Column(name = "c_userpass_modifiedby", table = "arts_t_userpass", nullable = false, length = 36)
    @Basic
    private String cUserpassModifiedby;

    @Column(name = "c_userpass_modifiedon", table = "arts_t_userpass", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cUserpassModifiedon;

    @Column(name = "c_userpass_createdby", table = "arts_t_userpass", length = 36)
    @Basic
    private String cUserpassCreatedby;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getcUserpassCreatedon() {
        return cUserpassCreatedon;
    }

    public void setcUserpassCreatedon(Date cUserpassCreatedon) {
        this.cUserpassCreatedon = cUserpassCreatedon;
    }

    public String getcUserpassPassword() {
        return cUserpassPassword;
    }

    public void setcUserpassPassword(String cUserpassPassword) {
        this.cUserpassPassword = cUserpassPassword;
    }

    public String getcUserId() {
        return cUserId;
    }

    public void setcUserId(String cUserId) {
        this.cUserId = cUserId;
    }

    public Character getcUserpassStatus() {
        return cUserpassStatus;
    }

    public void setcUserpassStatus(Character cUserpassStatus) {
        this.cUserpassStatus = cUserpassStatus;
    }

    public String getcUserpassDomain() {
        return cUserpassDomain;
    }

    public void setcUserpassDomain(String cUserpassDomain) {
        this.cUserpassDomain = cUserpassDomain;
    }

    public String getcUserpassModifiedby() {
        return cUserpassModifiedby;
    }

    public void setcUserpassModifiedby(String cUserpassModifiedby) {
        this.cUserpassModifiedby = cUserpassModifiedby;
    }

    public Date getcUserpassModifiedon() {
        return cUserpassModifiedon;
    }

    public void setcUserpassModifiedon(Date cUserpassModifiedon) {
        this.cUserpassModifiedon = cUserpassModifiedon;
    }

    public String getcUserpassCreatedby() {
        return cUserpassCreatedby;
    }

    public void setcUserpassCreatedby(String cUserpassCreatedby) {
        this.cUserpassCreatedby = cUserpassCreatedby;
    }
    
    
}
