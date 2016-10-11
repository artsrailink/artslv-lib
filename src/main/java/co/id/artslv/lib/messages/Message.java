/**
 * This file was generated by the JPA Modeler
 */
package co.id.artslv.lib.messages;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 * @author root
 */
@Entity
@Table(name = "arts_t_message")
public class Message {

    @Column(name = "c_message_id")
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    @Column(name = "c_message_title", table = "arts_t_message", nullable = false, length = 500)
    @Basic
    private String cMessageTitle;

    @Column(name = "c_message_content", table = "arts_t_message", length = 2147483647)
    @Lob
    @Basic
    private String cMessageContent;

    @Column(name = "c_message_date", table = "arts_t_message", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMessageDate;

    @Column(name = "c_user_id", table = "arts_t_message", nullable = false, length = 36)
    @Basic
    private String cUserId;

    @Column(name = "c_message_status", table = "arts_t_message", nullable = false)
    @Basic
    private Character cMessageStatus;

    @Column(name = "c_message_domain", table = "arts_t_message", nullable = false, length = 36)
    @Basic
    private String cMessageDomain;

    @Column(name = "c_message_modifiedby", table = "arts_t_message", nullable = false, length = 36)
    @Basic
    private String cMessageModifiedby;

    @Column(name = "c_message_modifiedon", table = "arts_t_message", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMessageModifiedon;

    @Column(name = "c_message_createdby", table = "arts_t_message", nullable = false, length = 36)
    @Basic
    private String cMessageCreatedby;

    @Column(name = "c_message_createdon", table = "arts_t_message", nullable = false)
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private Date cMessageCreatedon;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getcMessageTitle() {
        return cMessageTitle;
    }

    public void setcMessageTitle(String cMessageTitle) {
        this.cMessageTitle = cMessageTitle;
    }

    public String getcMessageContent() {
        return cMessageContent;
    }

    public void setcMessageContent(String cMessageContent) {
        this.cMessageContent = cMessageContent;
    }

    public Date getcMessageDate() {
        return cMessageDate;
    }

    public void setcMessageDate(Date cMessageDate) {
        this.cMessageDate = cMessageDate;
    }

    public String getcUserId() {
        return cUserId;
    }

    public void setcUserId(String cUserId) {
        this.cUserId = cUserId;
    }

    public Character getcMessageStatus() {
        return cMessageStatus;
    }

    public void setcMessageStatus(Character cMessageStatus) {
        this.cMessageStatus = cMessageStatus;
    }

    public String getcMessageDomain() {
        return cMessageDomain;
    }

    public void setcMessageDomain(String cMessageDomain) {
        this.cMessageDomain = cMessageDomain;
    }

    public String getcMessageModifiedby() {
        return cMessageModifiedby;
    }

    public void setcMessageModifiedby(String cMessageModifiedby) {
        this.cMessageModifiedby = cMessageModifiedby;
    }

    public Date getcMessageModifiedon() {
        return cMessageModifiedon;
    }

    public void setcMessageModifiedon(Date cMessageModifiedon) {
        this.cMessageModifiedon = cMessageModifiedon;
    }

    public String getcMessageCreatedby() {
        return cMessageCreatedby;
    }

    public void setcMessageCreatedby(String cMessageCreatedby) {
        this.cMessageCreatedby = cMessageCreatedby;
    }

    public Date getcMessageCreatedon() {
        return cMessageCreatedon;
    }

    public void setcMessageCreatedon(Date cMessageCreatedon) {
        this.cMessageCreatedon = cMessageCreatedon;
    }
    
    

}
