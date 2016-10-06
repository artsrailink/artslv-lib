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
@Table(name = "KAIRTS_T_USERTYPE")
public class Usertype implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_USERTYPE_ID")
    private String id;
    
    @Column(name = "C_USERTYPE_NAME")
    private String usertypename;
    @Column(name = "C_USERTYPE_STATUS")
    private String usertypestatus;
    @Column(name = "C_USERTYPE_DOMAIN")
    private String usertypedomain;
    @Column(name = "C_USERTYPE_MODIFIEDBY")
    private String usertypemodifiedby;
    @Column(name = "C_USERTYPE_MODIFIEDON")
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    private LocalDateTime usertypemodifiedon;
    
    @JsonInclude(Include.NON_NULL)
    @Transient 
    private String action;
    
    public Usertype(){
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

    public String getUsertypename() {
        return usertypename;
    }

    public void setUsertypename(String usertypename) {
        this.usertypename = usertypename;
    }

    public String getUsertypestatus() {
        return usertypestatus;
    }

    public void setUsertypestatus(String usertypestatus) {
        this.usertypestatus = usertypestatus;
    }

    public String getUsertypedomain() {
        return usertypedomain;
    }

    public void setUsertypedomain(String usertypedomain) {
        this.usertypedomain = usertypedomain;
    }

    public String getUsertypemodifiedby() {
        return usertypemodifiedby;
    }

    public void setUsertypemodifiedby(String usertypemodifiedby) {
        this.usertypemodifiedby = usertypemodifiedby;
    }

    public LocalDateTime getUsertypemodifiedon() {
        return usertypemodifiedon;
    }

    public void setUsertypemodifiedon(LocalDateTime usertypemodifiedon) {
        this.usertypemodifiedon = usertypemodifiedon;
    }
    
}
