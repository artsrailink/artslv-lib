package co.id.artslv.lib.messages;


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
import javax.persistence.Lob;
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
@Table(name = "KAIRTS_T_MSGATTC")
public class Msgattc implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_MSGATTC_ID")
    private String id;
    
    
    @Column(name = "C_MSGATTC_FILENAME")
    private String msgattcfilename;
    @Lob
    @Column(name = "C_MSGATTC_CONTENT")
    private String msgattccontent;
    @Column(name = "C_MESSAGE_ID")
    private String messageid;
    @Column(name = "C_MSGATTC_DOMAIN")
    private String msgattcdomain;
    @Column(name = "C_MSGATTC_STATUS")
    private String msgattcstatus;
    @Column(name = "C_MSGATTC_MODIFIEDBY")
    private String msgattcmodifiedby;
    
    //@Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_MSGATTC_MODIFIEDON")
    private LocalDateTime msgattcmodifiedon;
    
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    @Transient
    private Message message;
    
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    
    public Msgattc() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMsgattcfilename() {
        return msgattcfilename;
    }

    public void setMsgattcfilename(String msgattcfilename) {
        this.msgattcfilename = msgattcfilename;
    }

    public String getMsgattccontent() {
        return msgattccontent;
    }

    public void setMsgattccontent(String msgattccontent) {
        this.msgattccontent = msgattccontent;
    }
    
    public String getMessageid() {
        return messageid;
    }

    public void setMessageid(String messageid) {
        this.messageid = messageid;
    }

    public String getMsgattcdomain() {
        return msgattcdomain;
    }

    public void setMsgattcdomain(String msgattcdomain) {
        this.msgattcdomain = msgattcdomain;
    }

    public String getMsgattcstatus() {
        return msgattcstatus;
    }

    public void setMsgattcstatus(String msgattcstatus) {
        this.msgattcstatus = msgattcstatus;
    }

    public String getMsgattcmodifiedby() {
        return msgattcmodifiedby;
    }

    public void setMsgattcmodifiedby(String msgattcmodifiedby) {
        this.msgattcmodifiedby = msgattcmodifiedby;
    }

    public LocalDateTime getMsgattcmodifiedon() {
        return msgattcmodifiedon;
    }

    public void setMsgattcmodifiedon(LocalDateTime msgattcmodifiedon) {
        this.msgattcmodifiedon = msgattcmodifiedon;
    }

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }
}