package co.id.artslv.lib.trainplan;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
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
public class Gapeka {

    @Column
    @Id
    private String jalur;

    @Column(name = "ka_no")
    private String noka;

    @Column(name = "st_cd")
    private String stcd;

    @Column
    private String waktuberhenti;

    @Column(name = "jam_dat")
    private String jamdat;

    @Column(name = "jam_ber")
    private String jamber;

    @Column
    private String daop;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @Transient
    private String action;
    
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Gapeka() {
    }

    public String getJalur() {
        return jalur;
    }

    public void setJalur(String jalur) {
        this.jalur = jalur;
    }

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    public String getWaktuberhenti() {
        return waktuberhenti;
    }

    public void setWaktuberhenti(String waktuberhenti) {
        this.waktuberhenti = waktuberhenti;
    }

    public String getJamdat() {
        return jamdat;
    }

    public void setJamdat(String jamdat) {
        this.jamdat = jamdat;
    }

    public String getJamber() {
        return jamber;
    }

    public void setJamber(String jamber) {
        this.jamber = jamber;
    }

    public String getDaop() {
        return daop;
    }

    public void setDaop(String daop) {
        this.daop = daop;
    }
}
