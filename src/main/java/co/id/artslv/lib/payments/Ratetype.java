/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.payments;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
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
@Table(name="KAIRTS_T_RATETYPE")
public class Ratetype implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name="uuid",strategy="uuid2")
    @Column(name="C_RATETYPE_ID")
    private String id;   
 
    @Column(name="C_RATETYPE_NAME")
    private String ratetypename;
    @Column(name="C_RATETYPE_STATUS")
    private String ratetypestatus;
    @Column(name="C_RATETYPE_DOMAIN")
    private String ratetypedomain;    
    @Column(name="C_RATETYPE_MODIFIEDBY")
    private String ratetypemodifiedby;
    @Column(name="C_RATETYPE_ORDER")
    private int ratetypeorder;    
    
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")    
    @Column(name="C_RATETYPE_MODIFIEDON")
    private LocalDateTime ratetypemodifiedon;
        
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;      

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

    public String getRatetypename() {
        return ratetypename;
    }

    public void setRatetypename(String ratetypename) {
        this.ratetypename = ratetypename;
    }

    public String getRatetypestatus() {
        return ratetypestatus;
    }

    public void setRatetypestatus(String ratetypestatus) {
        this.ratetypestatus = ratetypestatus;
    }

    public String getRatetypedomain() {
        return ratetypedomain;
    }

    public void setRatetypedomain(String ratetypedomain) {
        this.ratetypedomain = ratetypedomain;
    }

    public String getRatetypemodifiedby() {
        return ratetypemodifiedby;
    }

    public void setRatetypemodifiedby(String ratetypemodifiedby) {
        this.ratetypemodifiedby = ratetypemodifiedby;
    }

    public int getRatetypeorder() {
        return ratetypeorder;
    }

    public void setRatetypeorder(int ratetypeorder) {
        this.ratetypeorder = ratetypeorder;
    }

    public LocalDateTime getRatetypemodifiedon() {
        return ratetypemodifiedon;
    }

    public void setRatetypemodifiedon(LocalDateTime ratetypemodifiedon) {
        this.ratetypemodifiedon = ratetypemodifiedon;
    }

}
