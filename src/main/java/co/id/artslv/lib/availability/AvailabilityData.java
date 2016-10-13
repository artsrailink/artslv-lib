package co.id.artslv.lib.availability;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.hibernate.annotations.Type;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by root on 13/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AvailabilityData {

    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Type(type = "org.hibernate.type.LocalDateType")
    private LocalDate departdate;
    private String stationOrg;
    private String stationDest;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<ScheduleData> scheduleDatas;

    public LocalDate getDepartdate() {
        return departdate;
    }

    public void setDepartdate(LocalDate departdate) {
        this.departdate = departdate;
    }

    public String getStationOrg() {
        return stationOrg;
    }

    public void setStationOrg(String stationOrg) {
        this.stationOrg = stationOrg;
    }

    public String getStationDest() {
        return stationDest;
    }

    public void setStationDest(String stationDest) {
        this.stationDest = stationDest;
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

        if (!stationOrg.equals(that.stationOrg)) return false;
        return stationDest.equals(that.stationDest);

    }

    @Override
    public int hashCode() {
        int result = stationOrg.hashCode();
        result = 31 * result + stationDest.hashCode();
        return result;
    }
}
