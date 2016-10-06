/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.report;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name = "KAIRTS_REP_OKUPANSI")
public class Okupansi implements Serializable {
    @Id
    @Column(name = "NOMORKA")
    private String nomorka;
    @Column(name = "NAMAKA")
    private String namaka;
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "TGLKA")
    private LocalDate tglka;
    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @Type(type = "org.hibernate.type.LocalDateTimeType")
    @Column(name = "WAKTUBERANGKAT")
    private LocalDateTime waktuberangkat;
    @Column(name = "KELAS")
    private String kelas;
    @Column(name = "KAPASITAS")
    private int kapasitas;
    @Column(name = "JMLKERETA")
    private int jmlkereta;
    @Column(name = "PNPDEWASA")
    private int pnpdewasa;
    @Column(name = "PNPINFANT")
    private int pnpinfant;
    @Column(name = "TOTALPNP")
    private int totalpnp;
    @Column(name = "KMPNPDEWASA")
    private int kmpnpdewasa;
    @Column(name = "KMPNPINFANT")
    private int kmpnpinfant;
    @Column(name = "AMOUNTDEWASA")
    private long amountdewasa;
    @Column(name = "AMOUNTINFANT")
    private long amountinfant;
    @Column(name = "TOTALAMOUNT")
    private long totalamount;
    @Column(name = "OKUPANSISTATIS")
    private int okupansistatis;
    @Column(name = "OKUPANSIDINAMIS")
    private int okupansidinamis;



    public LocalDate getTglka() {
        return tglka;
    }

    public void setTglka(LocalDate tglka) {
        this.tglka = tglka;
    }

    public LocalDateTime getWaktuberangkat() {
        return waktuberangkat;
    }

    public void setWaktuberangkat(LocalDateTime waktuberangkat) {
        this.waktuberangkat = waktuberangkat;
    }

    public int getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }

    public int getJmlkereta() {
        return jmlkereta;
    }

    public void setJmlkereta(int jmlkereta) {
        this.jmlkereta = jmlkereta;
    }

    public int getPnpdewasa() {
        return pnpdewasa;
    }

    public void setPnpdewasa(int pnpdewasa) {
        this.pnpdewasa = pnpdewasa;
    }

    public int getPnpinfant() {
        return pnpinfant;
    }

    public void setPnpinfant(int pnpinfant) {
        this.pnpinfant = pnpinfant;
    }

    public int getTotalpnp() {
        return totalpnp;
    }

    public void setTotalpnp(int totalpnp) {
        this.totalpnp = totalpnp;
    }

    public int getKmpnpdewasa() {
        return kmpnpdewasa;
    }

    public void setKmpnpdewasa(int kmpnpdewasa) {
        this.kmpnpdewasa = kmpnpdewasa;
    }

    public int getKmpnpinfant() {
        return kmpnpinfant;
    }

    public void setKmpnpinfant(int kmpnpinfant) {
        this.kmpnpinfant = kmpnpinfant;
    }

    public long getAmountdewasa() {
        return amountdewasa;
    }

    public void setAmountdewasa(long amountdewasa) {
        this.amountdewasa = amountdewasa;
    }

    public long getAmountinfant() {
        return amountinfant;
    }

    public void setAmountinfant(long amountinfant) {
        this.amountinfant = amountinfant;
    }

    public long getTotalamount() {
        return totalamount;
    }

    public void setTotalamount(long totalamount) {
        this.totalamount = totalamount;
    }

    public int getOkupansistatis() {
        return okupansistatis;
    }

    public void setOkupansistatis(int okupansistatis) {
        this.okupansistatis = okupansistatis;
    }

    public int getOkupansidinamis() {
        return okupansidinamis;
    }

    public void setOkupansidinamis(int okupansidinamis) {
        this.okupansidinamis = okupansidinamis;
    }

    public String getNomorka() {
        return nomorka;
    }

    public void setNomorka(String nomorka) {
        this.nomorka = nomorka;
    }

    public String getNamaka() {
        return namaka;
    }

    public void setNamaka(String namaka) {
        this.namaka = namaka;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}
