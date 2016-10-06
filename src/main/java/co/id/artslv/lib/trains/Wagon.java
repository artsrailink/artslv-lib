/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.trains;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;
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
@Table(name = "KAIRTS_T_WAGON")
public class Wagon implements Serializable {
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "C_WAGON_ID")
    private String id;    
    
    @Column(name = "C_WAGON_NAME")
    private String wagonname;
    @Column(name = "C_WAGON_COLS")
    private int wagoncols;    
    @Column(name = "C_WAGON_COL1SEATS")
    private int wagoncol1seats;  
    @Column(name = "C_WAGON_COL2SEATS")
    private int wagoncol2seats;  
    @Column(name = "C_WAGON_COL3SEATS")
    private int wagoncol3seats;  
    @Column(name = "C_WAGON_ROWS")
    private int wagonrows;  
    @Column(name = "C_WAGON_STATUS")
    private String wagonstatus;    
    @Column(name = "C_WAGON_DOMAIN")
    private String wagondomain;  
    @Column(name = "C_WAGON_MODIFIEDBY")
    private String wagonmodifiedby;   
    
    @Column(name = "C_WAGONCLASS_ID")
    private String wagonclassid;       
    
    @Column(name = "C_WAGON_CAPACITY")
    private int wagoncapacity;  
    
//    @Temporal(TemporalType.TIMESTAMP)
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")    
    @Column(name = "C_WAGON_MODIFIEDON")
    private LocalDateTime wagonmodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    @Transient 
    private Wagonclass wagonclass;
   @Transient 
    private List<Wagondet> listwagondet;
    public Wagon() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getWagonname() {
        return wagonname;
    }

    public void setWagonname(String wagonname) {
        this.wagonname = wagonname;
    }

    public int getWagoncols() {
        return wagoncols;
    }

    public void setWagoncols(int wagoncols) {
        this.wagoncols = wagoncols;
    }

    public int getWagoncol1seats() {
        return wagoncol1seats;
    }

    public void setWagoncol1seats(int wagoncol1seats) {
        this.wagoncol1seats = wagoncol1seats;
    }

    public int getWagoncol2seats() {
        return wagoncol2seats;
    }

    public void setWagoncol2seats(int wagoncol2seats) {
        this.wagoncol2seats = wagoncol2seats;
    }

    public int getWagoncol3seats() {
        return wagoncol3seats;
    }

    public void setWagoncol3seats(int wagoncol3seats) {
        this.wagoncol3seats = wagoncol3seats;
    }

    public int getWagonrows() {
        return wagonrows;
    }

    public void setWagonrows(int wagonrows) {
        this.wagonrows = wagonrows;
    }

    public String getWagonstatus() {
        return wagonstatus;
    }

    public void setWagonstatus(String wagonstatus) {
        this.wagonstatus = wagonstatus;
    }

    public String getWagondomain() {
        return wagondomain;
    }

    public void setWagondomain(String wagondomain) {
        this.wagondomain = wagondomain;
    }

    public String getWagonmodifiedby() {
        return wagonmodifiedby;
    }

    public void setWagonmodifiedby(String wagonmodifiedby) {
        this.wagonmodifiedby = wagonmodifiedby;
    }

    public String getWagonclassid() {
        return wagonclassid;
    }

    public void setWagonclassid(String wagonclassid) {
        this.wagonclassid = wagonclassid;
    }

    public int getWagoncapacity() {
        return wagoncapacity;
    }

    public void setWagoncapacity(int wagoncapacity) {
        this.wagoncapacity = wagoncapacity;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Wagonclass getWagonclass() {
        return wagonclass;
    }

    public void setWagonclass(Wagonclass wagonclass) {
        this.wagonclass = wagonclass;
    } 

    public List<Wagondet> getListwagondet() {
        return listwagondet;
    }

    public void setListwagondet(List<Wagondet> listwagondet) {
        this.listwagondet = listwagondet;
    }

    public LocalDateTime getWagonmodifiedon() {
        return wagonmodifiedon;
    }

    public void setWagonmodifiedon(LocalDateTime wagonmodifiedon) {
        this.wagonmodifiedon = wagonmodifiedon;
    }
    
}
