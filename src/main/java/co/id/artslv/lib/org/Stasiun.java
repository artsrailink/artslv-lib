package co.id.artslv.lib.org;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_stasiun")
public class Stasiun {

    @Column(name = "c_stasiun_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_stasiun_profitcenter", table = "arts_t_stasiun", length = 15)
    private String Profitcenter;

    @Column(name = "c_stasiun_name", table = "arts_t_stasiun", nullable = false, length = 100)
    private String Name;

    @Column(name = "c_stasiun_code", table = "arts_t_stasiun", nullable = false, length = 10)
    private String Code;

    @Column(name = "c_stasiun_pembatalan", table = "arts_t_stasiun", nullable = false)
    private Character Pembatalan;

    @Column(name = "c_stasiun_pengembalianbea", table = "arts_t_stasiun", nullable = false)
    private Character Pengembalianbea;

    @Column(name = "c_stasiun_status", table = "arts_t_stasiun", nullable = false)
    private Character Status;

    @Column(name = "c_stasiun_domain", table = "arts_t_stasiun", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_stasiun_modifiedby", table = "arts_t_stasiun", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_stasiun_modifiedon", table = "arts_t_stasiun", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_area_id", table = "arts_t_stasiun", nullable = false, length = 36)
    private String AreaId;

    @Column(name = "c_city_id", table = "arts_t_stasiun", nullable = false, length = 36)
    private String CityId;

    @Column(name = "c_stasiun_createdby", table = "arts_t_stasiun", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_stasiun_createdon", table = "arts_t_stasiun", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    @Column(name = "c_stasiun_showpos", table = "arts_t_stasiun", nullable = false)
    private Character Showpos;

    @Column(name = "c_stasiun_showibook", table = "arts_t_stasiun", nullable = false)
    private Character Showibook;

    @Column(name = "c_stasiun_showmobile", table = "arts_t_stasiun", nullable = false)
    private Character Showmobile;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProfitcenter() {
        return Profitcenter;
    }

    public void setProfitcenter(String Profitcenter) {
        this.Profitcenter = Profitcenter;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public Character getPembatalan() {
        return Pembatalan;
    }

    public void setPembatalan(Character Pembatalan) {
        this.Pembatalan = Pembatalan;
    }

    public Character getPengembalianbea() {
        return Pengembalianbea;
    }

    public void setPengembalianbea(Character Pengembalianbea) {
        this.Pengembalianbea = Pengembalianbea;
    }

    public Character getStatus() {
        return Status;
    }

    public void setStatus(Character Status) {
        this.Status = Status;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public String getModifiedby() {
        return Modifiedby;
    }

    public void setModifiedby(String Modifiedby) {
        this.Modifiedby = Modifiedby;
    }

    public LocalDateTime getModifiedon() {
        return Modifiedon;
    }

    public void setModifiedon(LocalDateTime Modifiedon) {
        this.Modifiedon = Modifiedon;
    }

    public String getAreaId() {
        return AreaId;
    }

    public void setAreaId(String AreaId) {
        this.AreaId = AreaId;
    }

    public String getCityId() {
        return CityId;
    }

    public void setCityId(String CityId) {
        this.CityId = CityId;
    }

    public String getCreatedby() {
        return Createdby;
    }

    public void setCreatedby(String Createdby) {
        this.Createdby = Createdby;
    }

    public LocalDateTime getCreatedon() {
        return Createdon;
    }

    public void setCreatedon(LocalDateTime Createdon) {
        this.Createdon = Createdon;
    }

    public Character getShowpos() {
        return Showpos;
    }

    public void setShowpos(Character Showpos) {
        this.Showpos = Showpos;
    }

    public Character getShowibook() {
        return Showibook;
    }

    public void setShowibook(Character Showibook) {
        this.Showibook = Showibook;
    }

    public Character getShowmobile() {
        return Showmobile;
    }

    public void setShowmobile(Character Showmobile) {
        this.Showmobile = Showmobile;
    }

    
    
}
