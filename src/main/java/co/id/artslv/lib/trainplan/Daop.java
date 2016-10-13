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
public class Daop {
    @Id
    @Column(name = "id")
    private int id;
    
    @Column
    private String nama;
    @Column
    private String singkatan;
    @Column
    private String nomenklatur;
    @Column
    private String daop;
    
    @Column(name="id_region")
    private int idregion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Daop() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getSingkatan() {
        return singkatan;
    }

    public void setSingkatan(String singkatan) {
        this.singkatan = singkatan;
    }

    public String getNomenklatur() {
        return nomenklatur;
    }

    public void setNomenklatur(String nomenklatur) {
        this.nomenklatur = nomenklatur;
    }

    public String getDaop() {
        return daop;
    }

    public void setDaop(String daop) {
        this.daop = daop;
    }

    public int getIdregion() {
        return idregion;
    }

    public void setIdregion(int idregion) {
        this.idregion = idregion;
    }
}
