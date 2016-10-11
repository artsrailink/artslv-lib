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
@Table(name = "arts_t_stamformdet")
public class Stamformdet {

    @Column(name = "c_stamformdet_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_stamformdet_order", table = "arts_t_stamformdet", nullable = false)
    private long Order;

    @Column(name = "c_stamformdet_status", table = "arts_t_stamformdet", nullable = false)
    private Character Status;

    @Column(name = "c_stamformdet_domain", table = "arts_t_stamformdet", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_stamformdet_modifiedby", table = "arts_t_stamformdet", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_stamformdet_modifiedon", table = "arts_t_stamformdet", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_wagon_id", table = "arts_t_stamformdet", nullable = false, length = 36)
    private String WagonId;

    @Column(name = "c_trip_id", table = "arts_t_stamformdet", length = 36)
    private String TripId;

    @Column(name = "c_stamformdet_createdby", table = "arts_t_stamformdet", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_stamformdet_createdon", table = "arts_t_stamformdet", nullable = false)
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

    public long getOrder() {
        return Order;
    }

    public void setOrder(long Order) {
        this.Order = Order;
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

    public String getWagonId() {
        return WagonId;
    }

    public void setWagonId(String WagonId) {
        this.WagonId = WagonId;
    }

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String TripId) {
        this.TripId = TripId;
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
