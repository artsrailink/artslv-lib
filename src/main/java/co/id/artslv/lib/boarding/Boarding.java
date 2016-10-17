package co.id.artslv.lib.boarding;

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
@Table(name = "arts_t_boarding")
public class Boarding {
    @Column(name = "c_boarding_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_transaction_bookcode")
    private String bookcode;

    @Column(name = "c_transactiondet_ticketnum")
    private String ticketnum;

    @Column(name = "c_trip_date")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    @Column(name = "c_stasiun_id")
    private String stasiunid;

    @Column(name = "c_stasiun_code")
    private String stasiuncode;

    @Column(name = "c_unit_id")
    private String unitid;

    @Column(name = "c_unit_code")
    private String unitcode;

    @Column(name = "c_boarding_status")
    private String status;

    @Column(name = "c_boarding_domain")
    private String domain;

    @Column(name = "c_boarding_createdby")
    private String createdby;

    @Column(name = "c_boarding_createdon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime createdon;

    @Column(name = "c_boarding_modifiedby")
    private String modifiedby;

    @Column(name = "c_boarding_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime modifiedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBookcode() {
        return bookcode;
    }

    public void setBookcode(String bookcode) {
        this.bookcode = bookcode;
    }

    public String getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        this.ticketnum = ticketnum;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getStasiuncode() {
        return stasiuncode;
    }

    public void setStasiuncode(String stasiuncode) {
        this.stasiuncode = stasiuncode;
    }

    public String getUnitid() {
        return unitid;
    }

    public void setUnitid(String unitid) {
        this.unitid = unitid;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
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
}
