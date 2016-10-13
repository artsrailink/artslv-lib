package co.id.artslv.lib.availability;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by root on 13/10/16.
 */
public class AvailabilityData {
    private LocalDate departdate;
    private String stationOrg;
    private String stationDest;
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
