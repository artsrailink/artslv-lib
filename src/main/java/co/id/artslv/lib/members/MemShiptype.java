package co.id.artslv.lib.members;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 *
 * @author Irpan Budiana
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_MEMSHIPTYPE")
public class MemShiptype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MEMSHIPTYPE_ID")
    private String id;

    @Column(name = "C_MEMSHIPTYPE_NAME")
    private String memshiptypename;

    @Column(name = "C_MEMSHIPTYPE_MINVALUE")
    private int memshiptypeminvalue;

    @Column(name = "C_MEMSHIPTYPE_MAXVALUE")
    private int memshiptypemaxvalue;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMSHIPTYPE_STARTDATE")
    private LocalDate memshiptypestartdate;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MEMSHIPTYPE_ENDDATE")
    private LocalDate memshiptypeenddate;
    
    @Column(name = "C_MEMSHIPTYPE_STATUS")
    private String memshiptypestatus;
     
    @Column(name = "C_MEMSHIPTYPE_DOMAIN")
    private String memshiptypedomain;
    
    @Column(name = "C_MEMSHIPTYPE_MODIFIEDBY")
    private String memshiptypemodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MEMSHIPTYPE_MODIFIEDON")
    private LocalDateTime memshiptypemodifiedon;
    
    @Column(name = "C_MEMSHIPTYPE_MULTIPLIER")
    private BigDecimal memshiptypemultiplier;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMemshiptypename() {
        return memshiptypename;
    }

    public void setMemshiptypename(String memshiptyname) {
        this.memshiptypename = memshiptyname;
    }

    public int getMemshiptypeminvalue() {
        return memshiptypeminvalue;
    }

    public void setMemshiptypeminvalue(int memshiptypeminvalue) {
        this.memshiptypeminvalue = memshiptypeminvalue;
    }

    public int getMemshiptypemaxvalue() {
        return memshiptypemaxvalue;
    }

    public void setMemshiptypemaxvalue(int memshiptypemaxvalue) {
        this.memshiptypemaxvalue = memshiptypemaxvalue;
    }

    public LocalDate getMemshiptypestartdate() {
        return memshiptypestartdate;
    }

    public void setMemshiptypestartdate(LocalDate memshiptypestartdate) {
        this.memshiptypestartdate = memshiptypestartdate;
    }

    public LocalDate getMemshiptypeenddate() {
        return memshiptypeenddate;
    }

    public void setMemshiptypeenddate(LocalDate memshiptypeenddate) {
        this.memshiptypeenddate = memshiptypeenddate;
    }

    public String getMemshiptypestatus() {
        return memshiptypestatus;
    }

    public void setMemshiptypestatus(String memshiptypestatus) {
        this.memshiptypestatus = memshiptypestatus;
    }

    public String getMemshiptypedomain() {
        return memshiptypedomain;
    }

    public void setMemshiptypedomain(String memshiptypedomain) {
        this.memshiptypedomain = memshiptypedomain;
    }

    public String getMemshiptypemodifiedby() {
        return memshiptypemodifiedby;
    }

    public void setMemshiptypemodifiedby(String memshiptypemodifiedby) {
        this.memshiptypemodifiedby = memshiptypemodifiedby;
    }

    public LocalDateTime getMemshiptypemodifiedon() {
        return memshiptypemodifiedon;
    }

    public void setMemshiptypemodifiedon(LocalDateTime memshiptypemodifiedon) {
        this.memshiptypemodifiedon = memshiptypemodifiedon;
    }

    public BigDecimal getMemshiptypemultiplier() {
        return memshiptypemultiplier;
    }

    public void setMemshiptypemultiplier(BigDecimal memshiptypemultiplier) {
        this.memshiptypemultiplier = memshiptypemultiplier;
    }
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    
}
