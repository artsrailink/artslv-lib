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
public class Tabstn {
    
    @Column
    @Id
    private String singk;
    
    @Column
    private String daop;
    
    @Column(name="nama_stn")
    private String namastn;
    
    @Column
    private String aktif;
    
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    @Transient
    private String domain;

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Tabstn() {
    }

    public String getSingk() {
        return singk;
    }

    public void setSingk(String singk) {
        this.singk = singk;
    }

    public String getDaop() {
        return daop;
    }

    public void setDaop(String daop) {
        this.daop = daop;
    }

    public String getNamastn() {
        return namastn;
    }

    public void setNamastn(String namastn) {
        this.namastn = namastn;
    }

    public String getAktif() {
        return aktif;
    }

    public void setAktif(String aktif) {
        this.aktif = aktif;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
}
