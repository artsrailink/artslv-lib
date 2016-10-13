package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.time.LocalDate;
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
@Table(name = "arts_t_seatbooktmp")
public class Seatbooktmp {

    @Column(name = "c_seatbooktmp_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_trip_id")
    private String TripId;

    @Column(name = "c_stamformdet_id")
    private String StamformdetId;

    @Column(name = "c_wagondet_id")
    private String WagondetId;

    @Column(name = "c_schedule_id")
    private String ScheduleId;

    @Column(name = "c_seatbooktmp_noka")
    private String Noka;

    @Column(name = "c_seatbooktmp_tripdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Tripdate;

    @Column(name = "c_seatbooktmp_sfdorder")
    private short Sfdorder;

    @Column(name = "c_seatbooktmp_wgdrow")
    private String Wgdrow;

    @Column(name = "c_seatbooktmp_wgdcol")
    private Character Wgdcol;

    @Column(name = "c_seatbooktmp_expdate")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Expdate;

    @Column(name = "c_seatbooktmp_domain")
    private String Domain;

    @Column(name = "c_seatbooktmp_sfdcode")
    private String Sfdcode;

    @Column(name = "c_seatbooktmp_legval")
    private String Legval;

    @Column(name = "c_seatbooktmp_createdby")
    private String Createdby;

    @Column(name = "c_seatbooktmp_createdon")
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

    public String getTripId() {
        return TripId;
    }

    public void setTripId(String TripId) {
        this.TripId = TripId;
    }

    public String getStamformdetId() {
        return StamformdetId;
    }

    public void setStamformdetId(String StamformdetId) {
        this.StamformdetId = StamformdetId;
    }

    public String getWagondetId() {
        return WagondetId;
    }

    public void setWagondetId(String WagondetId) {
        this.WagondetId = WagondetId;
    }

    public String getScheduleId() {
        return ScheduleId;
    }

    public void setScheduleId(String ScheduleId) {
        this.ScheduleId = ScheduleId;
    }

    public String getNoka() {
        return Noka;
    }

    public void setNoka(String Noka) {
        this.Noka = Noka;
    }

    public LocalDate getTripdate() {
        return Tripdate;
    }

    public void setTripdate(LocalDate Tripdate) {
        this.Tripdate = Tripdate;
    }

    public short getSfdorder() {
        return Sfdorder;
    }

    public void setSfdorder(short Sfdorder) {
        this.Sfdorder = Sfdorder;
    }

    public String getWgdrow() {
        return Wgdrow;
    }

    public void setWgdrow(String Wgdrow) {
        this.Wgdrow = Wgdrow;
    }

    public Character getWgdcol() {
        return Wgdcol;
    }

    public void setWgdcol(Character Wgdcol) {
        this.Wgdcol = Wgdcol;
    }

    public LocalDate getExpdate() {
        return Expdate;
    }

    public void setExpdate(LocalDate Expdate) {
        this.Expdate = Expdate;
    }

    public String getDomain() {
        return Domain;
    }

    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    public String getSfdcode() {
        return Sfdcode;
    }

    public void setSfdcode(String Sfdcode) {
        this.Sfdcode = Sfdcode;
    }

    public String getLegval() {
        return Legval;
    }

    public void setLegval(String Legval) {
        this.Legval = Legval;
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
