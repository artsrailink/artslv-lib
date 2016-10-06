package co.id.artslv.lib.transactions;

import co.id.artslv.lib.comservice.Service;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Yoga Sefianto
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_TRANSDETSERVICE")
public class Transdetservice implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_TRANSDETSERVICE_ID")
    private String id;
    @Column(name = "C_TRANSACTIONDET_ID")
    private String transactiondetid;
    @Column(name = "C_TRANSDETSERVICE_STATUS")
    private String status;
    @Column(name = "C_TRANSDETSERVICE_DOMAIN")
    private String domain;
    @Column(name = "C_TRANSDETSERVICE_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_TRANSDETSERVICE_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_SERVICE_ID")
    private String serviceid;
    @Column(name = "C_TRANSDETSERVICE_AMOUNT")
    private BigDecimal amount;
    @Column(name = "C_GRPRESERVATIONSRV_ID")
    private String grpreservationsrvid;
    @Column(name = "C_TRANSDETSERVICE_NOTE")
    private String note;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    @Transient 
    private Transactiondet transactiondet;
    @Transient 
    private Service service;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTransactiondetid() {
        return transactiondetid;
    }

    public void setTransactiondetid(String transactiondetid) {
        this.transactiondetid = transactiondetid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getModifiedby() {
        return modifiedby;
    }

    public void setModifiedby(String modifiedby) {
        this.modifiedby = modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return modifiedon;
    }

    public void setModifiedon(LocalDateTime modifiedon) {
        this.modifiedon = modifiedon;
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getGrpreservationsrvid() {
        return grpreservationsrvid;
    }

    public void setGrpreservationsrvid(String grpreservationsrvid) {
        this.grpreservationsrvid = grpreservationsrvid;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Transactiondet getTransactiondet() {
        return transactiondet;
    }

    public void setTransactiondet(Transactiondet transactiondet) {
        this.transactiondet = transactiondet;
    }

    public Service getService() {
        return service;
    }

    public void setService(Service service) {
        this.service = service;
    }

    
}