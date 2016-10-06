/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.report;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_REP_PENJUNIT")
public class Penjunit implements Serializable {
    @Id
    @Column(name = "UNIT")
    private String unit;
    @Column(name = "BATAL")
    private int batal;
    @Column(name = "JUMLAH")
    private int jumlah;
    @Column(name = "TUNAI")
    private long tunai;
    @Column(name = "NONTUNAI")
    private long nontunai;
    @Column(name = "RUPIAHREFUND")
    private long rupiahrefund;


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getBatal() {
        return batal;
    }

    public void setBatal(int batal) {
        this.batal = batal;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public long getTunai() {
        return tunai;
    }

    public void setTunai(long tunai) {
        this.tunai = tunai;
    }

    public long getNontunai() {
        return nontunai;
    }

    public void setNontunai(long nontunai) {
        this.nontunai = nontunai;
    }

    public long getRupiahrefund() {
        return rupiahrefund;
    }

    public void setRupiahrefund(long rupiahrefund) {
        this.rupiahrefund = rupiahrefund;
    }
}
