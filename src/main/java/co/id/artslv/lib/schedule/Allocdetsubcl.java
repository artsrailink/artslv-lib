package co.id.artslv.lib.schedule;

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
@Table(name = "arts_t_allocdetsubcl")
public class Allocdetsubcl {

    @Column(name = "c_adsc_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_subclass_id")
    private String SubclassId;

    @Column(name = "c_adsc_maxsell")
    private int Maxsell;

    @Column(name = "c_adsc_status")
    private Character Status;

    @Column(name = "c_adsc_domain")
    private String Domain;

    @Column(name = "c_adsc_modifiedby")
    private String Modifiedby;

    @Column(name = "c_adsc_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_allocdet_id")
    private String AllocdetId;

    @Column(name = "c_stop_id")
    private String StopId;

    @Column(name = "c_adsc_noseatable")
    private Character Noseatable;

    @Column(name = "c_adsc_order")
    private Integer Order;

    @Column(name = "c_adsc_createdby")
    private String Createdby;

    @Column(name = "c_adsc_createdon")
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

    public String getSubclassId() {
        return SubclassId;
    }

    public void setSubclassId(String SubclassId) {
        this.SubclassId = SubclassId;
    }

    public int getMaxsell() {
        return Maxsell;
    }

    public void setMaxsell(int Maxsell) {
        this.Maxsell = Maxsell;
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

    public String getAllocdetId() {
        return AllocdetId;
    }

    public void setAllocdetId(String AllocdetId) {
        this.AllocdetId = AllocdetId;
    }

    public String getStopId() {
        return StopId;
    }

    public void setStopId(String StopId) {
        this.StopId = StopId;
    }

    public Character getNoseatable() {
        return Noseatable;
    }

    public void setNoseatable(Character Noseatable) {
        this.Noseatable = Noseatable;
    }

    public Integer getOrder() {
        return Order;
    }

    public void setOrder(Integer Order) {
        this.Order = Order;
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
