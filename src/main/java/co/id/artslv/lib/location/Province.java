package co.id.artslv.lib.location;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
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
 * @author Irpan Budiana
 */

@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_PROVINCE")
public class Province implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_PROVINCE_ID")
    private String id;
    @Column(name = "C_PROVINCE_NAME")
    private String provincename;
    
    @Column(name = "C_PROVINCE_STATUS")
    private String provincestatus;
    
    @Column(name = "C_PROVINCE_DOMAIN")
    private String provincedomain;

    @Column(name = "C_PROVINCE_MODIFIEDBY")
    private String provincemodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_PROVINCE_MODIFIEDON")
    private LocalDateTime provincemodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Province() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvincename() {
        return provincename;
    }

    public void setProvincename(String provincename) {
        this.provincename = provincename;
    }

    public String getProvincestatus() {
        return provincestatus;
    }

    public void setProvincestatus(String provincestatus) {
        this.provincestatus = provincestatus;
    }

    public String getProvincedomain() {
        return provincedomain;
    }

    public void setProvincedomain(String provincedomain) {
        this.provincedomain = provincedomain;
    }
    
    public String getProvincemodifiedby() {
        return provincemodifiedby;
    }

    public void setProvincemodifiedby(String provincemodifiedby) {
        this.provincemodifiedby = provincemodifiedby;
    }

    public LocalDateTime getProvincemodifiedon() {
        return provincemodifiedon;
    }

    public void setProvincemodifiedon(LocalDateTime provincemodifiedon) {
        this.provincemodifiedon = provincemodifiedon;
    }
}