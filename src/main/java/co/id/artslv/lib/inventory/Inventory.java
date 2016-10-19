package co.id.artslv.lib.inventory;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Created by root on 07/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "arts_t_inventory")
public class Inventory {

    @Column(name = "c_inventory_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_schedule_id")
    private String scheduleid;

    @Column(name = "c_schedule_noka")
    private String schedulenoka;

    @Column(name = "c_trip_id")
    private String tripid;

    @Column(name = "c_trip_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name = "c_stop_id")
    private String stopid;

    @Column(name = "c_stasiun_code")
    private String stasiuncode;

    @Column(name = "c_stop_order")
    private int stoporder;

    @Column(name = "c_stamformdet_id")
    private String stamformdetid;

    @Column(name = "c_stamformdet_code")
    private String stamformdetcode;

    @Column(name = "c_stamformdet_order")
    private int stamformdetorder;

    @Column(name = "c_wagondet_id")
    private String wagondetid;

    @Column(name = "c_wagondet_row")
    private int wagondetrow;

    @Column(name = "c_wagondet_col")
    private String wagondetcol;

    @Column(name = "c_subclass_id")
    private String subclassid;

    @Column(name = "c_subclass_code")
    private String subclasscode;

    @Column(name = "c_inventory_bookstat")
    private String bookstat;

    @Column(name = "c_inventory_status")
    private String status;

    @Column(name = "c_inventory_domain")
    private String domain;

    @Column(name = "c_inventory_modifiedby")
    private String modifiedby;

    @Column(name = "c_inventory_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    @Column(name = "c_wagondet_colnum")
    private int wagondetcolnum;

    @Column(name = "c_inventory_createdby")
    private String createdby;

    @Column(name = "c_inventory_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    @Column(name = "c_transaction_bookcode")
    private String bookcode;
    @Column(name = "c_transactiondet_order")
    private Integer transactiondetorder;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(String scheduleid) {
        this.scheduleid = scheduleid;
    }

    public String getSchedulenoka() {
        return schedulenoka;
    }

    public void setSchedulenoka(String schedulenoka) {
        this.schedulenoka = schedulenoka;
    }

    public String getTripid() {
        return tripid;
    }

    public void setTripid(String tripid) {
        this.tripid = tripid;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getStopid() {
        return stopid;
    }

    public void setStopid(String stopid) {
        this.stopid = stopid;
    }

    public String getStasiuncode() {
        return stasiuncode;
    }

    public void setStasiuncode(String stasiuncode) {
        this.stasiuncode = stasiuncode;
    }

    public int getStoporder() {
        return stoporder;
    }

    public void setStoporder(int stoporder) {
        this.stoporder = stoporder;
    }

    public String getStamformdetid() {
        return stamformdetid;
    }

    public void setStamformdetid(String stamformdetid) {
        this.stamformdetid = stamformdetid;
    }

    public String getStamformdetcode() {
        return stamformdetcode;
    }

    public void setStamformdetcode(String stamformdetcode) {
        this.stamformdetcode = stamformdetcode;
    }

    public int getStamformdetorder() {
        return stamformdetorder;
    }

    public void setStamformdetorder(int stamformdetorder) {
        this.stamformdetorder = stamformdetorder;
    }

    public String getWagondetid() {
        return wagondetid;
    }

    public void setWagondetid(String wagondetid) {
        this.wagondetid = wagondetid;
    }

    public int getWagondetrow() {
        return wagondetrow;
    }

    public void setWagondetrow(int wagondetrow) {
        this.wagondetrow = wagondetrow;
    }

    public String getWagondetcol() {
        return wagondetcol;
    }

    public void setWagondetcol(String wagondetcol) {
        this.wagondetcol = wagondetcol;
    }

    public String getSubclassid() {
        return subclassid;
    }

    public void setSubclassid(String subclassid) {
        this.subclassid = subclassid;
    }

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public String getBookstat() {
        return bookstat;
    }

    public void setBookstat(String bookstat) {
        this.bookstat = bookstat;
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

    public int getWagondetcolnum() {
        return wagondetcolnum;
    }

    public void setWagondetcolnum(int wagondetcolnum) {
        this.wagondetcolnum = wagondetcolnum;
    }

    public String getCreatedby() {
        return createdby;
    }

    public void setCreatedby(String createdby) {
        this.createdby = createdby;
    }

    public LocalDateTime getCreatedon() {
        return createdon;
    }

    public void setCreatedon(LocalDateTime createdon) {
        this.createdon = createdon;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public Integer getTransactiondetorder() {
        return transactiondetorder;
    }

    public void setTransactiondetorder(Integer transactiondetorder) {
        this.transactiondetorder = transactiondetorder;
    }

}
