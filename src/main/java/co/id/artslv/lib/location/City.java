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
@Table(name = "KAIRTS_T_CITY")
public class City implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_CITY_ID")
    private String id;
    @Column(name = "C_CITY_NAME")
    private String cityname;
    @Column(name = "C_CITY_GMT")
    private int citygmt;
    @Column(name = "C_PROVINCE_ID")
    private String provinceid;
    @Column(name = "C_CITY_STATUS")
    private String citystatus;
    @Column(name = "C_CITY_DOMAIN")
    private String citydomain;
    @Column(name = "C_CITY_MODIFIEDBY")
    private String citymodifiedby;
    @Transient
    private Province province;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_CITY_MODIFIEDON")
    private LocalDateTime citymodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    public City() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public int getCitygmt() {
        return citygmt;
    }

    public void setCitygmt(int citygmt) {
        this.citygmt = citygmt;
    }

 
    public String getCitystatus() {
        return citystatus;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid;
    }

    public void setCitystatus(String citystatus) {
        this.citystatus = citystatus;
    }

    public String getCitydomain() {
        return citydomain;
    }

    public void setCitydomain(String citydomain) {
        this.citydomain = citydomain;
    }

    public String getCitymodifiedby() {
        return citymodifiedby;
    }

    public void setCitymodifiedby(String citymodifiedby) {
        this.citymodifiedby = citymodifiedby;
    }

    public LocalDateTime getCitymodifiedon() {
        return citymodifiedon;
    }

    public void setCitymodifiedon(LocalDateTime citymodifiedon) {
        this.citymodifiedon = citymodifiedon;
    }

    public Province getProvince() {
        return province;
    }

    public void setProvince(Province province) {
        this.province = province;
    }
}
