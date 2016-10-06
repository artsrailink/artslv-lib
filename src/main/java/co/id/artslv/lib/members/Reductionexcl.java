package co.id.artslv.lib.members;

import co.id.artslv.lib.schedule.Schedule;
import co.id.artslv.lib.trains.Subclass;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
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
@Table(name = "KAIRTS_T_REDUCTIONEXCL")
public class Reductionexcl implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_REDUCTIONEXCL_ID")
    private String id;

    @Column(name = "C_REDUCTION_ID")
    private String reductionid;

//    @Column(name = "C_SCHEDULE_ID")
//    private String scheduleid;

    @Column(name = "C_REDUCTIONEXCL_STATUS")
    private String reductionexclstatus;

    @Column(name = "C_REDUCTIONEXCL_DOMAIN")
    private String reductionexcldomain;

    @Column(name = "C_REDUCTIONEXCL_MODIFIEDBY")
    private String reductionexclmodifiedby;

    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_REDUCTIONEXCL_MODIFIEDON")
    private LocalDateTime reductionexclmodifiedon;

    @Column(name = "C_REDUCTIONEXCL_SETSUBCLASS")
    private String reductionexclsetsubclass;

    @Column(name = "C_REDUCTIONEXCL_SCHEDULENOKA")
    private String reductionexclschedulenoka;


//    @Column(name = "C_SUBCLASS_ID")
//    private String subclassid;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    @Transient
    private Reduction reduction;

    @Transient
    private Schedule schedule;

    @Transient
    private Subclass subclass;
    
//    @Transient
//    private String schedulenoka;
    @Transient
    private String traintypeid;
    @Transient
    private String trainname;
    

    public Reductionexcl() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReductionid() {
        return reductionid;
    }

    public void setReductionid(String reductionid) {
        this.reductionid = reductionid;
    }

//    public String getScheduleid() {
//        return scheduleid;
//    }
//
//    public void setScheduleid(String scheduleid) {
//        this.scheduleid = scheduleid;
//    }

    public String getReductionexclstatus() {
        return reductionexclstatus;
    }

    public void setReductionexclstatus(String reductionexclstatus) {
        this.reductionexclstatus = reductionexclstatus;
    }

    public String getReductionexcldomain() {
        return reductionexcldomain;
    }

    public void setReductionexcldomain(String reductionexcldomain) {
        this.reductionexcldomain = reductionexcldomain;
    }

    public String getReductionexclmodifiedby() {
        return reductionexclmodifiedby;
    }

    public void setReductionexclmodifiedby(String reductionexclmodifiedby) {
        this.reductionexclmodifiedby = reductionexclmodifiedby;
    }

    public LocalDateTime getReductionexclmodifiedon() {
        return reductionexclmodifiedon;
    }

    public void setReductionexclmodifiedon(LocalDateTime reductionexclmodifiedon) {
        this.reductionexclmodifiedon = reductionexclmodifiedon;
    }
//
//    public String getSubclassid() {
//        return subclassid;
//    }
//
//    public void setSubclassid(String subclassid) {
//        this.subclassid = subclassid;
//    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Reduction getReduction() {
        return reduction;
    }

    public void setReduction(Reduction reduction) {
        this.reduction = reduction;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }

    public Subclass getSubclass() {
        return subclass;
    }

    public void setSubclass(Subclass subclass) {
        this.subclass = subclass;
    }

    public String getReductionexclsetsubclass() {
        return reductionexclsetsubclass;
    }

    public void setReductionexclsetsubclass(String reductionexclsetsubclass) {
        this.reductionexclsetsubclass = reductionexclsetsubclass;
    }

    public String getReductionexclschedulenoka() {
        return reductionexclschedulenoka;
    }

    public void setReductionexclschedulenoka(String reductionexclschedulenoka) {
        this.reductionexclschedulenoka = reductionexclschedulenoka;
    }

//    public String getSchedulenoka() {
//        return schedulenoka;
//    }
//
//    public void setSchedulenoka(String schedulenoka) {
//        this.schedulenoka = schedulenoka;
//    }

    public String getTraintypeid() {
        return traintypeid;
    }

    public void setTraintypeid(String traintypeid) {
        this.traintypeid = traintypeid;
    }

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }
}
