package co.id.artslv.lib.members;

import co.id.artslv.lib.trains.Wagonclass;
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
@Table(name = "KAIRTS_T_REDUCTION")
public class Reduction implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_REDUCTION_ID")
    private String id;

    @Column(name = "C_REDUCTION_NAME")
    private String reductionname;

    @Column(name = "C_REDUCTION_AMOUNT")
    private BigDecimal reductionamount;

    @Column(name = "C_REDUCTION_AMOUNTTYPE")
    private String reductionamounttype;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REDUCTION_STARTDATE")
    private LocalDate reductionstartdate;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REDUCTION_ENDDATE")
    private LocalDate reductionenddate;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REDUCTION_SELLSTARTDATE")
    private LocalDate reductionsellstartdate;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_REDUCTION_SELLENDDATE")
    private LocalDate reductionsellenddate;

    @Column(name = "C_REDUCTION_NOTE")
    private String reductionnote;

    @Column(name = "C_REDUCTION_STATUS")
    private String reductionstatus;

    @Column(name = "C_REDUCTION_MODIFIEDBY")
    private String reductionmodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_REDUCTION_MODIFIEDON")
    private LocalDateTime reductionmodifiedon;

    @Column(name = "C_MEMBERTYPE_ID")
    private String membertypeid;

    @Column(name = "C_REDUCTION_MAXBOOK")
    private int reductionmaxbook;

    @Column(name = "C_REDUCTION_DOMAIN")
    private String reductiondomain;

    @Column(name = "C_REDUCTION_VALIDDAYS")
    private String reductionvaliddays;

    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;

    @Column(name = "C_REDUCTION_HOLIDAYSTAT")
    private String reductionholidaystat;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private Membertype membertype;

    @Transient
    private Wagonclass wagonclass;

    @Transient
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate departdate;

    @Transient
    private String noka;

    @Transient
    private String subclass;

    public Reduction() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReductionname() {
        return reductionname;
    }

    public void setReductionname(String reductionname) {
        this.reductionname = reductionname;
    }

    public BigDecimal getReductionamount() {
        return reductionamount;
    }

    public void setReductionamount(BigDecimal reductionamount) {
        this.reductionamount = reductionamount;
    }

    public String getReductionamounttype() {
        return reductionamounttype;
    }

    public void setReductionamounttype(String reductionamounttype) {
        this.reductionamounttype = reductionamounttype;
    }

    public LocalDate getReductionstartdate() {
        return reductionstartdate;
    }

    public void setReductionstartdate(LocalDate reductionstartdate) {
        this.reductionstartdate = reductionstartdate;
    }

    public LocalDate getReductionenddate() {
        return reductionenddate;
    }

    public void setReductionenddate(LocalDate reductionenddate) {
        this.reductionenddate = reductionenddate;
    }

    public LocalDate getReductionsellstartdate() {
        return reductionsellstartdate;
    }

    public void setReductionsellstartdate(LocalDate reductionsellstartdate) {
        this.reductionsellstartdate = reductionsellstartdate;
    }

    public LocalDate getReductionsellenddate() {
        return reductionsellenddate;
    }

    public void setReductionsellenddate(LocalDate reductionsellenddate) {
        this.reductionsellenddate = reductionsellenddate;
    }

    public String getReductionnote() {
        return reductionnote;
    }

    public void setReductionnote(String reductionnote) {
        this.reductionnote = reductionnote;
    }

    public String getReductionstatus() {
        return reductionstatus;
    }

    public void setReductionstatus(String reductionstatus) {
        this.reductionstatus = reductionstatus;
    }

    public String getReductionmodifiedby() {
        return reductionmodifiedby;
    }

    public void setReductionmodifiedby(String reductionmodifiedby) {
        this.reductionmodifiedby = reductionmodifiedby;
    }

    public LocalDateTime getReductionmodifiedon() {
        return reductionmodifiedon;
    }

    public void setReductionmodifiedon(LocalDateTime reductionmodifiedon) {
        this.reductionmodifiedon = reductionmodifiedon;
    }

    public String getMembertypeid() {
        return membertypeid;
    }

    public void setMembertypeid(String membertypeid) {
        this.membertypeid = membertypeid;
    }

   
    public String getReductiondomain() {
        return reductiondomain;
    }

    public void setReductiondomain(String reductiondomain) {
        this.reductiondomain = reductiondomain;
    }

    public String getReductionvaliddays() {
        return reductionvaliddays;
    }

    public void setReductionvaliddays(String reductionvaliddays) {
        this.reductionvaliddays = reductionvaliddays;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public int getReductionmaxbook() {
        return reductionmaxbook;
    }

    public void setReductionmaxbook(int reductionmaxbook) {
        this.reductionmaxbook = reductionmaxbook;
    }

    public String getReductionholidaystat() {
        return reductionholidaystat;
    }

    public void setReductionholidaystat(String reductionholidaystat) {
        this.reductionholidaystat = reductionholidaystat;
    }

   
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Membertype getMembertype() {
        return membertype;
    }

    public void setMembertype(Membertype membertype) {
        this.membertype = membertype;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    }

    public LocalDate getDepartdate() {
        return departdate;
    }

    public void setDepartdate(LocalDate departDate) {
        this.departdate = departDate;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    @Override
    public String toString() {
        return this.reductionname;
    }  
}
