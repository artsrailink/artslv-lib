/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.raws;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "arts_t_service", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"c_service_name"})})
public class Service implements Serializable {

    @Column(name = "c_service_id", table = "arts_t_service", nullable = false, length = 36)
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_service_name", table = "arts_t_service", nullable = false, length = 100)
    @Basic
    private String cServiceName;

    @Column(name = "c_service_price", table = "arts_t_service", nullable = false, scale = 2, precision = 11)
    @Basic
    private BigDecimal cServicePrice;

    @Column(name = "c_service_status", table = "arts_t_service", nullable = false)
    @Basic
    private Character cServiceStatus;

    @Column(name = "c_service_domain", table = "arts_t_service", nullable = false, length = 36)
    @Basic
    private String cServiceDomain;

    @Column(name = "c_service_modifiedby", table = "arts_t_service", nullable = false, length = 40)
    @Basic
    private String cServiceModifiedby;

    @Column(name = "c_service_modifiedon", table = "arts_t_service", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cServiceModifiedon;

    @Column(name = "c_service_subprice1", table = "arts_t_service", scale = 2, precision = 11)
    @Basic
    private BigDecimal cServiceSubprice1;

    @Column(name = "c_service_subprice2", table = "arts_t_service", scale = 2, precision = 11)
    @Basic
    private BigDecimal cServiceSubprice2;

    @Column(name = "c_service_startdate", table = "arts_t_service", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cServiceStartdate;

    @Column(name = "c_service_enddate", table = "arts_t_service", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cServiceEnddate;

    @Column(name = "c_serviceprv_id", table = "arts_t_service", nullable = false, length = 36)
    @Basic
    private String cServiceprvId;

    @Column(name = "c_service_createdby", table = "arts_t_service", nullable = false, length = 36)
    @Basic
    private String cServiceCreatedby;

    @Column(name = "c_service_createdon", table = "arts_t_service", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cServiceCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcServiceName() {
        return cServiceName;
    }

    public void setcServiceName(String cServiceName) {
        this.cServiceName = cServiceName;
    }

    public BigDecimal getcServicePrice() {
        return cServicePrice;
    }

    public void setcServicePrice(BigDecimal cServicePrice) {
        this.cServicePrice = cServicePrice;
    }

    public Character getcServiceStatus() {
        return cServiceStatus;
    }

    public void setcServiceStatus(Character cServiceStatus) {
        this.cServiceStatus = cServiceStatus;
    }

    public String getcServiceDomain() {
        return cServiceDomain;
    }

    public void setcServiceDomain(String cServiceDomain) {
        this.cServiceDomain = cServiceDomain;
    }

    public String getcServiceModifiedby() {
        return cServiceModifiedby;
    }

    public void setcServiceModifiedby(String cServiceModifiedby) {
        this.cServiceModifiedby = cServiceModifiedby;
    }

    public Date getcServiceModifiedon() {
        return cServiceModifiedon;
    }

    public void setcServiceModifiedon(Date cServiceModifiedon) {
        this.cServiceModifiedon = cServiceModifiedon;
    }

    public BigDecimal getcServiceSubprice1() {
        return cServiceSubprice1;
    }

    public void setcServiceSubprice1(BigDecimal cServiceSubprice1) {
        this.cServiceSubprice1 = cServiceSubprice1;
    }

    public BigDecimal getcServiceSubprice2() {
        return cServiceSubprice2;
    }

    public void setcServiceSubprice2(BigDecimal cServiceSubprice2) {
        this.cServiceSubprice2 = cServiceSubprice2;
    }

    public Date getcServiceStartdate() {
        return cServiceStartdate;
    }

    public void setcServiceStartdate(Date cServiceStartdate) {
        this.cServiceStartdate = cServiceStartdate;
    }

    public Date getcServiceEnddate() {
        return cServiceEnddate;
    }

    public void setcServiceEnddate(Date cServiceEnddate) {
        this.cServiceEnddate = cServiceEnddate;
    }

    public String getcServiceprvId() {
        return cServiceprvId;
    }

    public void setcServiceprvId(String cServiceprvId) {
        this.cServiceprvId = cServiceprvId;
    }

    public String getcServiceCreatedby() {
        return cServiceCreatedby;
    }

    public void setcServiceCreatedby(String cServiceCreatedby) {
        this.cServiceCreatedby = cServiceCreatedby;
    }

    public Date getcServiceCreatedon() {
        return cServiceCreatedon;
    }

    public void setcServiceCreatedon(Date cServiceCreatedon) {
        this.cServiceCreatedon = cServiceCreatedon;
    }
    
    
}
