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
@Table(name = "arts_t_checkinnumbertmp")
public class Checkinnumbertmp {

    @Column(name = "c_checkinnumbertmp_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_transaction_id", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    @Basic
    private String cTransactionId;

    @Column(name = "c_checkinnumbertmp_date", table = "arts_t_checkinnumbertmp", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCheckinnumbertmpDate;

    @Column(name = "c_stasiun_idcheckin", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    @Basic
    private String cStasiunIdcheckin;

    @Column(name = "c_transactiondet_id", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    @Basic
    private String cTransactiondetId;

    @Column(name = "c_checkinnumbertmp_createdby", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    @Basic
    private String cCheckinnumbertmpCreatedby;

    @Column(name = "c_checkinnumbertmp_createdon", table = "arts_t_checkinnumbertmp", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cCheckinnumbertmpCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcTransactionId() {
        return cTransactionId;
    }

    public void setcTransactionId(String cTransactionId) {
        this.cTransactionId = cTransactionId;
    }

    public Date getcCheckinnumbertmpDate() {
        return cCheckinnumbertmpDate;
    }

    public void setcCheckinnumbertmpDate(Date cCheckinnumbertmpDate) {
        this.cCheckinnumbertmpDate = cCheckinnumbertmpDate;
    }

    public String getcStasiunIdcheckin() {
        return cStasiunIdcheckin;
    }

    public void setcStasiunIdcheckin(String cStasiunIdcheckin) {
        this.cStasiunIdcheckin = cStasiunIdcheckin;
    }

    public String getcTransactiondetId() {
        return cTransactiondetId;
    }

    public void setcTransactiondetId(String cTransactiondetId) {
        this.cTransactiondetId = cTransactiondetId;
    }

    public String getcCheckinnumbertmpCreatedby() {
        return cCheckinnumbertmpCreatedby;
    }

    public void setcCheckinnumbertmpCreatedby(String cCheckinnumbertmpCreatedby) {
        this.cCheckinnumbertmpCreatedby = cCheckinnumbertmpCreatedby;
    }

    public Date getcCheckinnumbertmpCreatedon() {
        return cCheckinnumbertmpCreatedon;
    }

    public void setcCheckinnumbertmpCreatedon(Date cCheckinnumbertmpCreatedon) {
        this.cCheckinnumbertmpCreatedon = cCheckinnumbertmpCreatedon;
    }

    

}
