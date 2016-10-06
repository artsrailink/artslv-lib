package co.id.artslv.lib.trainplan;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;
import org.hibernate.annotations.Type;

/**
 *
 * @author Irpan Budiana
 */
@Entity
public class Rtsngtglkajalanpnpall {

    @Column
    @Id
    private String idjalur;

    @Column(name = "idpresensi")
    private String idpresensi;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    @Column(name = "tglka")
    private LocalDate tglka;

    @Column(name = "idka")
    private String idka;

    @Column(name = "noka")
    private String noka;

    @Column(name = "nmka")
    private String nmka;

    @Column(name = "kelas")
    private String kelas;

    @Column(name = "idstasiun")
    private String idstasiun;
    
    @Column(name = "jamasal")
    private String jamasal;

    @Column(name = "jamtujuan")
    private String jamtujuan;
    
    @Column(name = "fjamasal")
    private String fjamasal;

    @Column(name = "fjamtujuan")
    private String fjamtujuan;
    
    @Column(name = "stn")
    private String stn;

    @Column(name = "ber")
    private String ber;

    @Column(name = "dat")
    private String dat;
    
    @Column(name = "fber")
    private String fber;

    @Column(name = "fdat")
    private String fdat;
    

    @Column(name = "isstop")
    private int isstop;

    @Column(name = "mntstop")
    private int mntstop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    @Transient
    private int order;
    
    @Transient
    private int arriveadddays;

    @Transient
    private int departadddays;

    public String getIdjalur() {
        return idjalur;
    }

    public void setIdjalur(String idjalur) {
        this.idjalur = idjalur;
    }

    public String getIdpresensi() {
        return idpresensi;
    }

    public void setIdpresensi(String idpresensi) {
        this.idpresensi = idpresensi;
    }

    public LocalDate getTglka() {
        return tglka;
    }

    public void setTglka(LocalDate tglka) {
        this.tglka = tglka;
    }

    public String getIdka() {
        return idka;
    }

    public void setIdka(String idka) {
        this.idka = idka;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getNmka() {
        return nmka;
    }

    public void setNmka(String nmka) {
        this.nmka = nmka;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getStn() {
        return stn;
    }

    public void setStn(String stn) {
        this.stn = stn;
    }

    public String getBer() {
        return ber;
    }

    public void setBer(String ber) {
        this.ber = ber;
    }

    public String getDat() {
        return dat;
    }

    public void setDat(String dat) {
        this.dat = dat;
    }

    public String getFber() {
        return fber;
    }

    public void setFber(String fber) {
        this.fber = fber;
    }

    public String getFdat() {
        return fdat;
    }

    public void setFdat(String fdat) {
        this.fdat = fdat;
    }

    public int getIsstop() {
        return isstop;
    }

    public void setIsstop(int isstop) {
        this.isstop = isstop;
    }

    public int getMntstop() {
        return mntstop;
    }

    public void setMntstop(int mntstop) {
        this.mntstop = mntstop;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIdstasiun() {
        return idstasiun;
    }

    public void setIdstasiun(String idstasiun) {
        this.idstasiun = idstasiun;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getArriveadddays() {
        return arriveadddays;
    }

    public void setArriveadddays(int arriveadddays) {
        this.arriveadddays = arriveadddays;
    }

    public int getDepartadddays() {
        return departadddays;
    }

    public void setDepartadddays(int departadddays) {
        this.departadddays = departadddays;
    }

    public String getJamasal() {
        return jamasal;
    }

    public void setJamasal(String jamasal) {
        this.jamasal = jamasal;
    }

    public String getJamtujuan() {
        return jamtujuan;
    }

    public void setJamtujuan(String jamtujuan) {
        this.jamtujuan = jamtujuan;
    }

    public String getFjamasal() {
        return fjamasal;
    }

    public void setFjamasal(String fjamasal) {
        this.fjamasal = fjamasal;
    }

    public String getFjamtujuan() {
        return fjamtujuan;
    }

    public void setFjamtujuan(String fjamtujuan) {
        this.fjamtujuan = fjamtujuan;
    }
}
