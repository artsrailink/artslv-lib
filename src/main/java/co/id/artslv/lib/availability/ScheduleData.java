package co.id.artslv.lib.availability;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by root on 13/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleData {

    private String id;
    private String noka;
    private String trainname;
    private String stopdeparture;
    private String stoparrival;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<AllocationData> allocationDatas;

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

    public String getTrainname() {
        return trainname;
    }

    public void setTrainname(String trainname) {
        this.trainname = trainname;
    }

    public String getStopdeparture() {
        return stopdeparture;
    }

    public void setStopdeparture(String stopdeparture) {
        this.stopdeparture = stopdeparture;
    }

    public String getStoparrival() {
        return stoparrival;
    }

    public void setStoparrival(String stoparrival) {
        this.stoparrival = stoparrival;
    }

    public List<AllocationData> getAllocationDatas() {
        return allocationDatas;
    }

    public void setAllocationDatas(List<AllocationData> allocationDatas) {
        this.allocationDatas = allocationDatas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScheduleData that = (ScheduleData) o;

        return noka.equals(that.noka);

    }

    @Override
    public int hashCode() {
        return noka.hashCode();
    }
}
