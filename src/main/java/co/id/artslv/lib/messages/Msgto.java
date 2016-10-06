package co.id.artslv.lib.messages;

import co.id.artslv.lib.users.User;
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
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_MSGTO")
public class Msgto implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MSGTO_ID")
    private String id;
    
    
    @Column(name = "C_MESSAGE_ID")
    private String messageid;
    @Column(name = "C_MSGTO_DOMAIN")
    private String msgtodomain;
    @Column(name = "C_MSGTO_STATUS")
    private String msgtostatus;
    @Column(name = "C_MSGTO_MODIFIEDBY")
    private String msgtomodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MSGTO_MODIFIEDON")
    private LocalDateTime msgtomodifiedon;
    
    @Column(name = "C_USER_ID")
    private String userid;
    
    @Transient 
    private User user;
    
    @Transient 
    private Message message;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Msgto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public String getMsgtodomain() {
        return msgtodomain;
    }

    public void setMsgtodomain(String msgtodomain) {
        this.msgtodomain = msgtodomain;
    }

    public String getMsgtostatus() {
        return msgtostatus;
    }

    public void setMsgtostatus(String msgtostatus) {
        this.msgtostatus = msgtostatus;
    }

    public String getMsgtomodifiedby() {
        return msgtomodifiedby;
    }

    public void setMsgtomodifiedby(String msgtomodifiedby) {
        this.msgtomodifiedby = msgtomodifiedby;
    }

    public LocalDateTime getMsgtomodifiedon() {
        return msgtomodifiedon;
    }

    public void setMsgtomodifiedon(LocalDateTime msgtomodifiedon) {
        this.msgtomodifiedon = msgtomodifiedon;
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

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
    
    
}