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
@Table(name = "KAIRTS_T_MESSAGE")
public class Message implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MESSAGE_ID")
    private String id;
    
    
    @Column(name = "C_MESSAGE_TITLE")
    private String messagetitle;
    @Column(name = "C_MESSAGE_CONTENT")
    private String messagecontent;
    @Column(name = "C_MESSAGE_DOMAIN")
    private String messagedomain;
    @Column(name = "C_MESSAGE_STATUS")
    private String messagestatus;
    @Column(name = "C_MESSAGE_MODIFIEDBY")
    private String messagemodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "C_MESSAGE_DATE")
    private LocalDate messagedate;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MESSAGE_MODIFIEDON")
    private LocalDateTime messagemodifiedon;
    
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
    
    public Message() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessagetitle() {
        return messagetitle;
    }

    public void setMessagetitle(String messagetitle) {
        this.messagetitle = messagetitle;
    }

    public String getMessagecontent() {
        return messagecontent;
    }

    public void setMessagecontent(String messagecontent) {
        this.messagecontent = messagecontent;
    }

    public String getMessagedomain() {
        return messagedomain;
    }

    public void setMessagedomain(String messagedomain) {
        this.messagedomain = messagedomain;
    }

    public String getMessagestatus() {
        return messagestatus;
    }

    public void setMessagestatus(String messagestatus) {
        this.messagestatus = messagestatus;
    }

    public String getMessagemodifiedby() {
        return messagemodifiedby;
    }

    public void setMessagemodifiedby(String messagemodifiedby) {
        this.messagemodifiedby = messagemodifiedby;
    }

    public LocalDate getMessagedate() {
        return messagedate;
    }

    public void setMessagedate(LocalDate messagedate) {
        this.messagedate = messagedate;
    }

    public LocalDateTime getMessagemodifiedon() {
        return messagemodifiedon;
    }

    public void setMessagemodifiedon(LocalDateTime messagemodifiedon) {
        this.messagemodifiedon = messagemodifiedon;
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