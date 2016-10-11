package co.id.artslv.lib.messages;

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
import javax.persistence.Lob;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_msgattc")
public class Msgattc {

    @Column(name = "c_msgattc_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_msgattc_filename", table = "arts_t_msgattc", nullable = false, length = 100)
    private String Filename;

    @Column(name = "c_msgattc_content", table = "arts_t_msgattc", nullable = false)
    @Lob
    private byte[] Content;

    @Column(name = "c_message_id", table = "arts_t_msgattc", nullable = false, length = 36)
    private String MessageId;

    @Column(name = "c_msgattc_status", table = "arts_t_msgattc", nullable = false)
    private Character Status;

    @Column(name = "c_msgattc_domain", table = "arts_t_msgattc", nullable = false, length = 36)
    private String Domain;

    @Column(name = "c_msgattc_modifiedby", table = "arts_t_msgattc", nullable = false, length = 36)
    private String Modifiedby;

    @Column(name = "c_msgattc_modifiedon", table = "arts_t_msgattc", nullable = false)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime Modifiedon;

    @Column(name = "c_msgattc_createdby", table = "arts_t_msgattc", nullable = false, length = 36)
    private String Createdby;

    @Column(name = "c_msgattc_createdon", table = "arts_t_msgattc", nullable = false)
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

    public String getFilename() {
        return Filename;
    }

    public void setFilename(String Filename) {
        this.Filename = Filename;
    }

    public byte[] getContent() {
        return Content;
    }

    public void setContent(byte[] Content) {
        this.Content = Content;
    }

    public String getMessageId() {
        return MessageId;
    }

    public void setMessageId(String MessageId) {
        this.MessageId = MessageId;
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
