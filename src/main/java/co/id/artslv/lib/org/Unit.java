package co.id.artslv.lib.org;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.math.BigDecimal;
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
@Table(name = "arts_t_unit")
public class Unit {

    @Column(name = "c_unit_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_unit_name")
    private String Name;
    
    @Column(name = "c_unit_status")
    private Character Status;

    @Column(name = "c_unit_domain")
    private String Domain;

    @Column(name = "c_unit_modifiedby")
    private String Modifiedby;

    @Column(name = "c_unit_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_stasiun_id")
    private String StasiunId;

    @Column(name = "c_unit_code")
    private String Code;

    @Column(name = "c_channel_id")
    private String ChannelId;

    @Column(name = "c_unit_balancelimit")
    private BigDecimal Balancelimit;

    @Column(name = "c_paytype_id")
    private String PaytypeId;
    @Column(name = "c_unit_sellnoseat")
    private Character Sellnoseat;
    @Column(name = "c_unit_localpay")
    private Character Localpay;
    @Column(name = "c_unit_reversaltime")
    private short Reversaltime;
    @Column(name = "c_unit_createdby")
    private String Createdby;
    @Column(name = "c_unit_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Createdon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
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

    public String getStasiunId() {
        return StasiunId;
    }

    public void setStasiunId(String StasiunId) {
        this.StasiunId = StasiunId;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getChannelId() {
        return ChannelId;
    }

    public void setChannelId(String ChannelId) {
        this.ChannelId = ChannelId;
    }

    public BigDecimal getBalancelimit() {
        return Balancelimit;
    }

    public void setBalancelimit(BigDecimal Balancelimit) {
        this.Balancelimit = Balancelimit;
    }

    public String getPaytypeId() {
        return PaytypeId;
    }

    public void setPaytypeId(String PaytypeId) {
        this.PaytypeId = PaytypeId;
    }

    public Character getSellnoseat() {
        return Sellnoseat;
    }

    public void setSellnoseat(Character Sellnoseat) {
        this.Sellnoseat = Sellnoseat;
    }

    public Character getLocalpay() {
        return Localpay;
    }

    public void setLocalpay(Character Localpay) {
        this.Localpay = Localpay;
    }

    public short getReversaltime() {
        return Reversaltime;
    }

    public void setReversaltime(short Reversaltime) {
        this.Reversaltime = Reversaltime;
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
    
}
