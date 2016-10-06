package co.id.artslv.lib.trainplan;

import com.fasterxml.jackson.annotation.JsonInclude;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

/**
 *
 * @author Irpan Budiana
 */
@Entity
public class Ka {

    @Column(name = "id_ka")
    @Id
    private String id;

    @Column(name = "ka_no")
    private String noka;

    @Column(name = "ka_nm")
    private String namaka;

    @Column(name = "st_asal")
    private String stasal;

    @Column(name = "st_tujuan")
    private String sttujuan;

    @Column(name = "jam_asal")
    private String jamasal;

    @Column(name = "jam_tujuan")
    private String jamtujuan;

    @Column
    private String km;

    @Column(name = "no_ka_induk")
    private String nokainduk;
    @Column(name = "no_ka_awal")
    private String nokaawal;
    @Column(name = "no_ka_terusan")
    private String nokaterusan;
    @Column(name = "id_daop")
    private String daop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Ka() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getNamaka() {
        return namaka;
    }

    public void setNamaka(String namaka) {
        this.namaka = namaka;
    }

    public String getStasal() {
        return stasal;
    }

    public void setStasal(String stasal) {
        this.stasal = stasal;
    }

    public String getSttujuan() {
        return sttujuan;
    }

    public void setSttujuan(String sttujuan) {
        this.sttujuan = sttujuan;
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

    public String getKm() {
        return km;
    }

    public void setKm(String km) {
        this.km = km;
    }

    public String getNokainduk() {
        return nokainduk;
    }

    public void setNokainduk(String nokainduk) {
        this.nokainduk = nokainduk;
    }

    public String getNokaawal() {
        return nokaawal;
    }

    public void setNokaawal(String nokaawal) {
        this.nokaawal = nokaawal;
    }

    public String getNokaterusan() {
        return nokaterusan;
    }

    public void setNokaterusan(String nokaterusan) {
        this.nokaterusan = nokaterusan;
    }

    public String getDaop() {
        return daop;
    }

    public void setDaop(String daop) {
        this.daop = daop;
    }

}
