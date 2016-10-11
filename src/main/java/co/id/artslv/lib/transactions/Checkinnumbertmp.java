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
@Table(name = "arts_t_checkinnumbertmp")
public class Checkinnumbertmp {

    @Column(name = "c_checkinnumbertmp_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_transaction_id", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    private String TransactionId;

    @Column(name = "c_checkinnumbertmp_date", table = "arts_t_checkinnumbertmp", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate Date;

    @Column(name = "c_stasiun_idcheckin", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    private String StasiunIdcheckin;

    @Column(name = "c_transactiondet_id", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    private String TransactiondetId;

    @Column(name = "c_checkinnumbertmp_createdby", table = "arts_t_checkinnumbertmp", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_checkinnumbertmp_createdon", table = "arts_t_checkinnumbertmp", nullable = false)
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

    public String getTransactionId() {
        return TransactionId;
    }

    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate Date) {
        this.Date = Date;
    }

    public String getStasiunIdcheckin() {
        return StasiunIdcheckin;
    }

    public void setStasiunIdcheckin(String StasiunIdcheckin) {
        this.StasiunIdcheckin = StasiunIdcheckin;
    }

    public String getTransactiondetId() {
        return TransactiondetId;
    }

    public void setTransactiondetId(String TransactiondetId) {
        this.TransactiondetId = TransactiondetId;
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
