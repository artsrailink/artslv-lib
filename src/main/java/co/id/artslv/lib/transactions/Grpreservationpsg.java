package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
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
@Table(name = "KAIRTS_T_GRPRESERVATIONPSG")
public class Grpreservationpsg implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_GRPRESERVATIONPSG_ID")
    private String id;
    @Column(name = "C_GRPRESERVATIONPSG_STATUS")
    private String status;
    @Column(name = "C_GRPRESERVATIONPSG_DOMAIN")
    private String domain;
    @Column(name = "C_GRPRESERVATIONPSG_MODIFIEDBY")
    private String modifiedby;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_GRPRESERVATIONPSG_MODIFIEDON")
    private LocalDateTime modifiedon;
    @Column(name = "C_GRPRESERVATIONDET_ID")
    private String grpreservationdetid;
    @Column(name = "C_GRPRESERVATIONPSG_PSGID")
    private String psgid;
    @Column(name = "C_GRPRESERVATIONPSG_PSGNAME")
    private String psgname;
    @Column(name = "C_GRPRESERVATIONPSG_INFANTNAME")
    private String infantname;
    @Transient 
    private Grpreservationdet grpreservationdet;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getGrpreservationdetid() {
        return grpreservationdetid;
    }

    public void setGrpreservationdetid(String grpreservationdetid) {
        this.grpreservationdetid = grpreservationdetid;
    }

    public String getPsgid() {
        return psgid;
    }

    public void setPsgid(String psgid) {
        this.psgid = psgid;
    }

    public String getPsgname() {
        return psgname;
    }

    public void setPsgname(String psgname) {
        this.psgname = psgname;
    }

    public String getInfantname() {
        return infantname;
    }

    public void setInfantname(String infantname) {
        this.infantname = infantname;
    }

    public Grpreservationdet getGrpreservationdet() {
        return grpreservationdet;
    }

    public void setGrpreservationdet(Grpreservationdet grpreservationdet) {
        this.grpreservationdet = grpreservationdet;
    }


}