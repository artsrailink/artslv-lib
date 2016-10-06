/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

import co.id.artslv.lib.org.Channel;
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
@Table(name = "KAIRTS_T_CHANNELPAYTYPE")
public class ChannelPaytype implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_CHANNELPAYTYPE_ID")
    private String id;

    @Column(name = "C_CHANNEL_ID")
    private String channelid;
    @Column(name = "C_PAYTYPE_ID")
    private String paytypeid;
    @Column(name = "C_CHANNELPAYTYPE_STATUS")
    private String channelpaytypestatus;
    @Column(name = "C_CHANNELPAYTYPE_DOMAIN")
    private String channelpaytypedomain;
    @Column(name = "C_CHANNELPAYTYPE_MODIFIEDBY")
    private String channelpaytypemodifiedby;

//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_CHANNELPAYTYPE_MODIFIEDON")
    private LocalDateTime channelpaytypemodifiedon;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private Channel channel;

    @Transient
    private Paytype paytype;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public String getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(String paytypeid) {
        this.paytypeid = paytypeid;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public Paytype getPaytype() {
        return paytype;
    }

    public void setPaytype(Paytype paytype) {
        this.paytype = paytype;
    }

    public String getChannelpaytypestatus() {
        return channelpaytypestatus;
    }

    public void setChannelpaytypestatus(String channelpaytypestatus) {
        this.channelpaytypestatus = channelpaytypestatus;
    }

    public String getChannelpaytypedomain() {
        return channelpaytypedomain;
    }

    public void setChannelpaytypedomain(String channelpaytypedomain) {
        this.channelpaytypedomain = channelpaytypedomain;
    }

    public String getChannelpaytypemodifiedby() {
        return channelpaytypemodifiedby;
    }

    public void setChannelpaytypemodifiedby(String channelpaytypemodifiedby) {
        this.channelpaytypemodifiedby = channelpaytypemodifiedby;
    }

    public LocalDateTime getChannelpaytypemodifiedon() {
        return channelpaytypemodifiedon;
    }

    public void setChannelpaytypemodifiedon(LocalDateTime channelpaytypemodifiedon) {
        this.channelpaytypemodifiedon = channelpaytypemodifiedon;
    }

}
