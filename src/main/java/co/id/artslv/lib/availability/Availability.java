package co.id.artslv.lib.availability;

import co.id.artslv.lib.inventory.Inventory;
import co.id.artslv.lib.trains.Subclass;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.util.List;

/**
 * Created by root on 11/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Availability {
    private String noka;
    private String stasiunorg;
    private String stasiundest;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;


    private Subclass subclass;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Inventory> available;

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }

    public String getStasiunorg() {
        return stasiunorg;
    }

    public void setStasiunorg(String stasiunorg) {
        this.stasiunorg = stasiunorg;
    }

    public String getStasiundest() {
        return stasiundest;
    }

    public void setStasiundest(String stasiundest) {
        this.stasiundest = stasiundest;
    }


    public Subclass getSubclass() {
        return subclass;
    }

    public void setSubclass(Subclass subclass) {
        this.subclass = subclass;
    }

    public List<Inventory> getAvailable() {
        return available;
    }

    public void setAvailable(List<Inventory> available) {
        this.available = available;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }
}
