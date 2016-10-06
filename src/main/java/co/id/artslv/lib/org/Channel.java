/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;


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
 * @author drikSulhan
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="KAIRTS_T_CHANNEL")
public class Channel implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    @Column(name="C_CHANNEL_ID")
    private String id;   
    
    @Column(name="C_CHANNEL_CODE")
    private String channelcode;
    
    @Column(name="C_CHANNEL_EXTRAFEE")
    private String channelextrafee;
    
    @Column(name="C_CHANNEL_PAYMETHOD")
    private String channelpaymethod;
    
    @Column(name="C_CHANNEL_NAME")
    private String channelname;
    @Column(name="C_CHANNEL_STATUS")
    private String channelstatus;
    @Column(name="C_CHANNEL_DOMAIN")
    private String channeldomain;
    @Column(name="C_CHANNEL_MODIFIEDBY")
    private String channelmodifiedby;
    @Column(name="C_CHANNEL_TYPE")
    private String channeltype;    
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name="C_CHANNEL_MODIFIEDON")
    private LocalDateTime channelmodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChannelcode() {
        return channelcode;
    }

    public void setChannelcode(String channelcode) {
        this.channelcode = channelcode;
    }

    public String getChannelname() {
        return channelname;
    }

    public void setChannelname(String channelname) {
        this.channelname = channelname;
    }

    public String getChannelstatus() {
        return channelstatus;
    }

    public void setChannelstatus(String channelstatus) {
        this.channelstatus = channelstatus;
    }

    public String getChanneldomain() {
        return channeldomain;
    }

    public void setChanneldomain(String channeldomain) {
        this.channeldomain = channeldomain;
    }

    public String getChannelmodifiedby() {
        return channelmodifiedby;
    }

    public void setChannelmodifiedby(String channelmodifiedby) {
        this.channelmodifiedby = channelmodifiedby;
    }

    public LocalDateTime getChannelmodifiedon() {
        return channelmodifiedon;
    }

    public void setChannelmodifiedon(LocalDateTime channelmodifiedon) {
        this.channelmodifiedon = channelmodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getChannelextrafee() {
        return channelextrafee;
    }

    public void setChannelextrafee(String channelextrafee) {
        this.channelextrafee = channelextrafee;
    }

    public String getChannelpaymethod() {
        return channelpaymethod;
    }

    public void setChannelpaymethod(String channelpaymethod) {
        this.channelpaymethod = channelpaymethod;
    }

    public String getChanneltype() {
        return channeltype;
    }

    public void setChanneltype(String channeltype) {
        this.channeltype = channeltype;
    }
    
    @Override
    public String toString() {
        return this.channelname;
    }  
}
