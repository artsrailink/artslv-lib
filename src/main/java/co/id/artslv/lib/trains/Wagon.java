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
@Table(name = "arts_t_wagon")
public class Wagon {

    @Column(name = "c_wagon_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_wagon_name")
    private String Name;

    @Column(name = "c_wagon_cols")
    private double Cols;

    @Column(name = "c_wagon_col1seats")
    private double Col1seats;

    @Column(name = "c_wagon_col2seats")
    private Double Col2seats;

    @Column(name = "c_wagon_col3seats")
    private Double Col3seats;

    @Column(name = "c_wagon_rows")
    private double Rows;

    @Column(name = "c_wagon_status")
    private Character Status;

    @Column(name = "c_wagon_domain")
    private String Domain;

    @Column(name = "c_wagon_modifiedby")
    private String Modifiedby;

    @Column(name = "c_wagon_modifiedon")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_wagonclass_id")
    private String WagonclassId;

    @Column(name = "c_wagon_capacity")
    private short Capacity;

    @Column(name = "c_wagon_createdby")
    private String Createdby;

    @Column(name = "c_wagon_createdon")
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

    public double getCols() {
        return Cols;
    }

    public void setCols(double Cols) {
        this.Cols = Cols;
    }

    public double getCol1seats() {
        return Col1seats;
    }

    public void setCol1seats(double Col1seats) {
        this.Col1seats = Col1seats;
    }

    public Double getCol2seats() {
        return Col2seats;
    }

    public void setCol2seats(Double Col2seats) {
        this.Col2seats = Col2seats;
    }

    public Double getCol3seats() {
        return Col3seats;
    }

    public void setCol3seats(Double Col3seats) {
        this.Col3seats = Col3seats;
    }

    public double getRows() {
        return Rows;
    }

    public void setRows(double Rows) {
        this.Rows = Rows;
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

    public String getWagonclassId() {
        return WagonclassId;
    }

    public void setWagonclassId(String WagonclassId) {
        this.WagonclassId = WagonclassId;
    }

    public short getCapacity() {
        return Capacity;
    }

    public void setCapacity(short Capacity) {
        this.Capacity = Capacity;
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
