package co.id.artslv.lib.availability;

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
 * Created by root on 13/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvailabilityData {

    private String id;

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate tripdate;

    private String stasiunnameorg;

    private String stasiunnamedes;

    private String stasiuncodeorg;

    private String stasiuncodedes;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ScheduleData> scheduleDatas;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public String getStasiunnameorg() {
        return stasiunnameorg;
    }

    public void setStasiunnameorg(String stasiunnameorg) {
        this.stasiunnameorg = stasiunnameorg;
    }

    public String getStasiunnamedes() {
        return stasiunnamedes;
    }

    public void setStasiunnamedes(String stasiunnamedes) {
        this.stasiunnamedes = stasiunnamedes;
    }

    public String getStasiuncodeorg() {
        return stasiuncodeorg;
    }

    public void setStasiuncodeorg(String stasiuncodeorg) {
        this.stasiuncodeorg = stasiuncodeorg;
    }

    public String getStasiuncodedes() {
        return stasiuncodedes;
    }

    public void setStasiuncodedes(String stasiuncodedes) {
        this.stasiuncodedes = stasiuncodedes;
    }

    public List<ScheduleData> getScheduleDatas() {
        return scheduleDatas;
    }

    public void setScheduleDatas(List<ScheduleData> scheduleDatas) {
        this.scheduleDatas = scheduleDatas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AvailabilityData that = (AvailabilityData) o;

        if (!stasiuncodeorg.equals(that.stasiuncodeorg)) return false;
        return stasiuncodedes.equals(that.stasiuncodedes);

    }

    @Override
    public int hashCode() {
        int result = stasiuncodeorg.hashCode();
        result = 31 * result + stasiuncodedes.hashCode();
        return result;
    }
}
