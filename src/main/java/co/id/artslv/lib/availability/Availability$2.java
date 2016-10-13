package co.id.artslv.lib.availability;

import co.id.artslv.lib.schedule.Schedule;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import javax.persistence.Column;
import java.time.LocalDate;
import java.util.List;

/**
 * Created by root on 12/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Availability$2 {
    private String orgstasiun;
    private String deststasiun;

    @Column(name= "c_schedule_startdate")
    @JsonSerialize(using = LocalDateSerializer.class)
    @JsonDeserialize(using = LocalDateDeserializer.class)
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate tripdate;

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<Schedule> schedules;

    public Availability$2() {
    }

    public Availability$2(String orgstasiun, String deststasiun, LocalDate tripdate, List<Schedule> schedules) {
        this.orgstasiun = orgstasiun;
        this.deststasiun = deststasiun;
        this.tripdate = tripdate;
        this.schedules = schedules;
    }

    public String getOrgstasiun() {
        return orgstasiun;
    }

    public void setOrgstasiun(String orgstasiun) {
        this.orgstasiun = orgstasiun;
    }

    public String getDeststasiun() {
        return deststasiun;
    }

    public void setDeststasiun(String deststasiun) {
        this.deststasiun = deststasiun;
    }

    public LocalDate getTripdate() {
        return tripdate;
    }

    public void setTripdate(LocalDate tripdate) {
        this.tripdate = tripdate;
    }

    public List<Schedule> getSchedules() {
        return schedules;
    }

    public void setSchedules(List<Schedule> schedules) {
        this.schedules = schedules;
    }
}
