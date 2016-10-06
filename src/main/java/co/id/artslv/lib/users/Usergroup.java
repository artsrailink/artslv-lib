/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.users;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
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
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_USERGROUP")
public class Usergroup implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_USERGROUP_ID")
    private String id;
    @Column(name = "C_USERGROUP_NAME")
    private String usergroupname;
    @Column(name = "C_USERGROUP_NOTE")
    private String usergroupnote;
    @Column(name = "C_USERGROUP_STATUS")
    private String usergroupstatus;
    @Column(name = "C_USERGROUP_DOMAIN")
    private String usergroupdomain;
    @Column(name = "C_USERGROUP_MODIFIEDBY")
    private String usergroupmodifiedby;
    
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "C_USERGROUP_MODIFIEDON")
    private LocalDateTime usergroupmodifiedon;
    
    @JsonInclude(Include.NON_NULL)
    @Transient 
    private String action;
    
    
    public Usergroup(){
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsergroupname() {
        return usergroupname;
    }

    public void setUsergroupname(String usergroupname) {
        this.usergroupname = usergroupname;
    }

    public String getUsergroupnote() {
        return usergroupnote;
    }

    public void setUsergroupnote(String usergroupnote) {
        this.usergroupnote = usergroupnote;
    }

    public String getUsergroupstatus() {
        return usergroupstatus;
    }

    public void setUsergroupstatus(String usergroupstatus) {
        this.usergroupstatus = usergroupstatus;
    }

    public String getUsergroupdomain() {
        return usergroupdomain;
    }

    public void setUsergroupdomain(String usergroupdomain) {
        this.usergroupdomain = usergroupdomain;
    }

    public String getUsergroupmodifiedby() {
        return usergroupmodifiedby;
    }

    public void setUsergroupmodifiedby(String usergroupmodifiedby) {
        this.usergroupmodifiedby = usergroupmodifiedby;
    }

    public LocalDateTime getUsergroupmodifiedon() {
        return usergroupmodifiedon;
    }

    public void setUsergroupmodifiedon(LocalDateTime usergroupmodifiedon) {
        this.usergroupmodifiedon = usergroupmodifiedon;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    
}
