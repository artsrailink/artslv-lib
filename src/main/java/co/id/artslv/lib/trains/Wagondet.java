package co.id.artslv.lib.trains;

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
@Table(name = "arts_t_wagondet")
public class Wagondet {

    @Column(name = "c_wagondet_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wagondet_col", table = "arts_t_wagondet", nullable = false)
    private Character Col;

    @Column(name = "c_wagon_id", table = "arts_t_wagondet", nullable = false, length = 36)
    private String WagonId;

    @Column(name = "c_wagondet_status", table = "arts_t_wagondet", nullable = false)
    private Character Status;

    @Column(name = "c_wagondet_domain", table = "arts_t_wagondet", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_wagondet_modifiedby", table = "arts_t_wagondet", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_wagondet_modifiedon", table = "arts_t_wagondet", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_wagondet_row", table = "arts_t_wagondet", nullable = false)
    private short Row;

    @Column(name = "c_wagondet_createdby", table = "arts_t_wagondet", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_wagondet_createdon", table = "arts_t_wagondet", nullable = false)
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

    public Character getCol() {
        return Col;
    }

    public void setCol(Character Col) {
        this.Col = Col;
    }

    public String getWagonId() {
        return WagonId;
    }

    public void setWagonId(String WagonId) {
        this.WagonId = WagonId;
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

    public short getRow() {
        return Row;
    }

    public void setRow(short Row) {
        this.Row = Row;
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
