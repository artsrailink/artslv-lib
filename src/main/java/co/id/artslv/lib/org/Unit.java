/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.org;

import co.id.artslv.lib.payments.Paytype;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "KAIRTS_T_UNIT")
public class Unit implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_UNIT_ID")
    private String id;

    @Column(name = "C_UNIT_NAME")
    private String unitname;
    @Column(name = "C_UNIT_HIDESUBCLASS")
    private String unithidesubclass;
    @Column(name = "C_UNIT_CODE")
    private String unitcode;
    @Column(name = "C_STASIUN_ID")
    private String stasiunid;
    @Column(name = "C_CHANNEL_ID")
    private String channelid;
    @Column(name = "C_UNIT_STATUS")
    private String unitstatus;
    @Column(name = "C_UNIT_DOMAIN")
    private String unitdomain;
    @Column(name = "C_UNIT_MODIFIEDBY")
    private String unitmodifiedby;

    @Column(name = "C_UNIT_BALANCELIMIT")
    private BigDecimal unitbalancelimit;

    @Column(name = "C_PAYTYPE_ID")
    private String paytypeid;

    @Column(name = "C_UNIT_SELLNOSEAT")
    private String unitsellnoseat;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_UNIT_MODIFIEDON")
    private LocalDateTime unitmodifiedon;

    @Column(name = "C_UNIT_LOCALPAY")
    private String unitlocalpay;
    
    @Column(name = "C_UNIT_REVERSALTIME")
    private int unitreversaltime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    @Transient
    private Stasiun stasiun;
    @Transient
    private Channel channel;
    @Transient
    private Agentdet agentdet;
    @Transient
    private Paytype paytype;

    public Unit() {
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUnitname() {
        return unitname;
    }

    public void setUnitname(String unitname) {
        this.unitname = unitname;
    }

    public String getUnithidesubclass() {
        return unithidesubclass;
    }

    public void setUnithidesubclass(String unithidesubclass) {
        this.unithidesubclass = unithidesubclass;
    }

    public String getStasiunid() {
        return stasiunid;
    }

    public void setStasiunid(String stasiunid) {
        this.stasiunid = stasiunid;
    }

    public String getUnitstatus() {
        return unitstatus;
    }

    public void setUnitstatus(String unitstatus) {
        this.unitstatus = unitstatus;
    }

    public String getUnitdomain() {
        return unitdomain;
    }

    public void setUnitdomain(String unitdomain) {
        this.unitdomain = unitdomain;
    }

    public String getUnitmodifiedby() {
        return unitmodifiedby;
    }

    public void setUnitmodifiedby(String unitmodifiedby) {
        this.unitmodifiedby = unitmodifiedby;
    }

    public LocalDateTime getUnitmodifiedon() {
        return unitmodifiedon;
    }

    public void setUnitmodifiedon(LocalDateTime unitmodifiedon) {
        this.unitmodifiedon = unitmodifiedon;
    }

    public String getUnitcode() {
        return unitcode;
    }

    public void setUnitcode(String unitcode) {
        this.unitcode = unitcode;
    }

    public String getChannelid() {
        return channelid;
    }

    public void setChannelid(String channelid) {
        this.channelid = channelid;
    }

    public Stasiun getStasiun() {
        return stasiun;
    }

    public void setStasiun(Stasiun stasiun) {
        this.stasiun = stasiun;
    }

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public BigDecimal getUnitbalancelimit() {
        return unitbalancelimit;
    }

    public void setUnitbalancelimit(BigDecimal unitbalancelimit) {
        this.unitbalancelimit = unitbalancelimit;
    }

    public Agentdet getAgentdet() {
        return agentdet;
    }

    public void setAgentdet(Agentdet agentdet) {
        this.agentdet = agentdet;
    }

    @Override
    public String toString() {
        return unitcode;
    }

    public String getPaytypeid() {
        return paytypeid;
    }

    public void setPaytypeid(String paytypeid) {
        this.paytypeid = paytypeid;
    }

    public String getUnitsellnoseat() {
        return unitsellnoseat;
    }

    public void setUnitsellnoseat(String unitsellnoseat) {
        this.unitsellnoseat = unitsellnoseat;
    }

    public Paytype getPaytype() {
        return paytype;
    }

    public void setPaytype(Paytype paytype) {
        this.paytype = paytype;
    }

    public String getUnitlocalpay() {
        return unitlocalpay;
    }

    public void setUnitlocalpay(String unitlocalpay) {
        this.unitlocalpay = unitlocalpay;
    }

    public int getUnitreversaltime() {
        return unitreversaltime;
    }

    public void setUnitreversaltime(int unitreversaltime) {
        this.unitreversaltime = unitreversaltime;
    }
}
