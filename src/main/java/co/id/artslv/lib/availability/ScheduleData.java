package co.id.artslv.lib.availability;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by root on 13/10/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ScheduleData {
    private String noka;
    private String jambrangkat;
    private String jamsampai;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<AllocationData> allocationDatas;

    public String getNoka() {
        return noka;
    }

    public void setNoka(String noka) {
        this.noka = noka;
    }


    public List<AllocationData> getAllocationDatas() {
        return allocationDatas;
    }

    public void setAllocationDatas(List<AllocationData> allocationDatas) {
        this.allocationDatas = allocationDatas;
    }

    public String getJambrangkat() {
        return jambrangkat;
    }

    public void setJambrangkat(String jambrangkat) {
        this.jambrangkat = jambrangkat;
    }

    public String getJamsampai() {
        return jamsampai;
    }

    public void setJamsampai(String jamsampai) {
        this.jamsampai = jamsampai;
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
