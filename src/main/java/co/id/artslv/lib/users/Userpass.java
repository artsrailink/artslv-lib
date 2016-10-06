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
import org.hibernate.validator.constraints.NotBlank;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_USERPASS")
public class Userpass implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_USERPASS_ID")
    private String id;
    @NotBlank
    @Column(name = "C_USER_ID")
    private String userid;
    @Column(name = "C_USERPASS_PASSWORD")
    private String userpasspassword;
    
    @Column(name = "C_USERPASS_CREATEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime userpasscreatedon;
    
    @Column(name = "C_USERPASS_STATUS")
    private String userpassstatus;
    @Column(name = "C_USERPASS_DOMAIN")
    private String userpassdomain;
    @Column(name = "C_USERPASS_MODIFIEDBY")
    private String userpassmodifiedby;
    @Column(name = "C_USERPASS_MODIFIEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime userpassmodifiedon;
    
    @JsonInclude(Include.NON_NULL)
    @Transient 
    private String action;
    
    public Userpass(){
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUserpasspassword() {
        return userpasspassword;
    }

    public void setUserpasspassword(String userpasspassword) {
        this.userpasspassword = userpasspassword;
    }

    public LocalDateTime getUserpasscreatedon() {
        return userpasscreatedon;
    }

    public void setUserpasscreatedon(LocalDateTime userpasscreatedon) {
        this.userpasscreatedon = userpasscreatedon;
    }

    public String getUserpassstatus() {
        return userpassstatus;
    }

    public void setUserpassstatus(String userpassstatus) {
        this.userpassstatus = userpassstatus;
    }

    public String getUserpassdomain() {
        return userpassdomain;
    }

    public void setUserpassdomain(String userpassdomain) {
        this.userpassdomain = userpassdomain;
    }

    public String getUserpassmodifiedby() {
        return userpassmodifiedby;
    }

    public void setUserpassmodifiedby(String userpassmodifiedby) {
        this.userpassmodifiedby = userpassmodifiedby;
    }

    public LocalDateTime getUserpassmodifiedon() {
        return userpassmodifiedon;
    }

    public void setUserpassmodifiedon(LocalDateTime userpassmodifiedon) {
        this.userpassmodifiedon = userpassmodifiedon;
    }

   

}
