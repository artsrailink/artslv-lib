/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.raws;

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
@Table(name = "arts_t_library")
public class Library {

    @Column(name = "c_library_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_library_parent", table = "arts_t_library", length = 36)
    @Basic
    private String cLibraryParent;

    @Column(name = "c_library_type", table = "arts_t_library", nullable = false)
    @Basic
    private Character cLibraryType;

    @Column(name = "c_library_value", table = "arts_t_library")
    @Basic
    private Character cLibraryValue;

    @Column(name = "c_library_description", table = "arts_t_library", nullable = false, length = 1000)
    @Basic
    private String cLibraryDescription;

    @Column(name = "c_library_status", table = "arts_t_library", nullable = false)
    @Basic
    private Character cLibraryStatus;

    @Column(name = "c_library_domain", table = "arts_t_library", nullable = false, length = 36)
    @Basic
    private String cLibraryDomain;

    @Column(name = "c_library_modifiedby", table = "arts_t_library", nullable = false, length = 36)
    @Basic
    private String cLibraryModifiedby;

    @Column(name = "c_library_modifiedon", table = "arts_t_library", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cLibraryModifiedon;

    @Column(name = "c_library_createdby", table = "arts_t_library", nullable = false, length = 36)
    @Basic
    private String cLibraryCreatedby;

    @Column(name = "c_library_createdon", table = "arts_t_library", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cLibraryCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcLibraryParent() {
        return cLibraryParent;
    }

    public void setcLibraryParent(String cLibraryParent) {
        this.cLibraryParent = cLibraryParent;
    }

    public Character getcLibraryType() {
        return cLibraryType;
    }

    public void setcLibraryType(Character cLibraryType) {
        this.cLibraryType = cLibraryType;
    }

    public Character getcLibraryValue() {
        return cLibraryValue;
    }

    public void setcLibraryValue(Character cLibraryValue) {
        this.cLibraryValue = cLibraryValue;
    }

    public String getcLibraryDescription() {
        return cLibraryDescription;
    }

    public void setcLibraryDescription(String cLibraryDescription) {
        this.cLibraryDescription = cLibraryDescription;
    }

    public Character getcLibraryStatus() {
        return cLibraryStatus;
    }

    public void setcLibraryStatus(Character cLibraryStatus) {
        this.cLibraryStatus = cLibraryStatus;
    }

    public String getcLibraryDomain() {
        return cLibraryDomain;
    }

    public void setcLibraryDomain(String cLibraryDomain) {
        this.cLibraryDomain = cLibraryDomain;
    }

    public String getcLibraryModifiedby() {
        return cLibraryModifiedby;
    }

    public void setcLibraryModifiedby(String cLibraryModifiedby) {
        this.cLibraryModifiedby = cLibraryModifiedby;
    }

    public Date getcLibraryModifiedon() {
        return cLibraryModifiedon;
    }

    public void setcLibraryModifiedon(Date cLibraryModifiedon) {
        this.cLibraryModifiedon = cLibraryModifiedon;
    }

    public String getcLibraryCreatedby() {
        return cLibraryCreatedby;
    }

    public void setcLibraryCreatedby(String cLibraryCreatedby) {
        this.cLibraryCreatedby = cLibraryCreatedby;
    }

    public Date getcLibraryCreatedon() {
        return cLibraryCreatedon;
    }

    public void setcLibraryCreatedon(Date cLibraryCreatedon) {
        this.cLibraryCreatedon = cLibraryCreatedon;
    }
    
    

}
