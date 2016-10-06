package co.id.artslv.lib.messages;

import co.id.artslv.lib.users.User;
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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_ANNOUNCEMENT")
public class Announcement implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_ANNOUNCEMENT_ID")
    private String id;
    
    @Column(name = "C_ANNOUNCEMENT_TITLE")
    private String announcementtitle;
    @Column(name = "C_ANNOUNCEMENT_CONTENT")
    private String announcementcontent;
    @Column(name = "C_ANNOUNCEMENT_DOMAIN")
    private String announcementdomain;
    @Column(name = "C_ANNOUNCEMENT_STATUS")
    private String announcementstatus;
    @Column(name = "C_ANNOUNCEMENT_MODIFIEDBY")
    private String announcementmodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_ANNOUNCEMENT_DATE")
    private LocalDate announcementdate;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_ANNOUNCEMENT_MODIFIEDON")
    private LocalDateTime announcementmodifiedon;
    
    @Column(name = "C_USER_ID")
    private String userid;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    @Transient
    private User user;
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Announcement() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAnnouncementtitle() {
        return announcementtitle;
    }

    public void setAnnouncementtitle(String announcementtitle) {
        this.announcementtitle = announcementtitle;
    }

    public String getAnnouncementcontent() {
        return announcementcontent;
    }

    public void setAnnouncementcontent(String announcementcontent) {
        this.announcementcontent = announcementcontent;
    }

    public String getAnnouncementdomain() {
        return announcementdomain;
    }

    public void setAnnouncementdomain(String announcementdomain) {
        this.announcementdomain = announcementdomain;
    }

    public String getAnnouncementstatus() {
        return announcementstatus;
    }

    public void setAnnouncementstatus(String announcementstatus) {
        this.announcementstatus = announcementstatus;
    }

    public String getAnnouncementmodifiedby() {
        return announcementmodifiedby;
    }

    public void setAnnouncementmodifiedby(String announcementmodifiedby) {
        this.announcementmodifiedby = announcementmodifiedby;
    }

    public LocalDate getAnnouncementdate() {
        return announcementdate;
    }

    public void setAnnouncementdate(LocalDate announcementdate) {
        this.announcementdate = announcementdate;
    }

    public LocalDateTime getAnnouncementmodifiedon() {
        return announcementmodifiedon;
    }

    public void setAnnouncementmodifiedon(LocalDateTime announcementmodifiedon) {
        this.announcementmodifiedon = announcementmodifiedon;
    }
    
    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    
}