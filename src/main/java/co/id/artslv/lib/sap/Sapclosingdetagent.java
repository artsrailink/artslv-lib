/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.sap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Yoga Sefianto
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_T_SAPCLOSINGDETAGENT")
public class Sapclosingdetagent implements Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    @Column(name = "ID")
    private String id;
    @Column(name = "NO_DOK")
    private String nodok;
    @Column(name = "AGEN")
    private String agen;
    @Column(name = "ST_ASAL")
    private String stasal;
    @Column(name = "ST_TUJU")
    private String sttuju;
    @Column(name = "NO_KA")
    private String noka;
    @Column(name = "KELAS")
    private String kelas;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TGL_TRANSAKSI")
    private Date tgltransaksi;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "TGL_KA")
    private Date tglka;
    @Column(name = "JML_PNP")
    private int jmlpnp;
    @Column(name = "AMOUNT")
    private BigDecimal amount;
    @Column(name = "JMLINDEKS")
    private int jmlindeks;
    @Column(name = "JNS_AGEN")
    private int jnsagen;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "C_TRAIN_MODIFIEDON")
    private Date trainmodifiedon;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient 
    private String action;
    
    
    public Sapclosingdetagent() {
    }
    
    
}