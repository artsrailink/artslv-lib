package co.id.artslv.lib.availability;

/**
 * Created by root on 13/10/16.
 */
public class AllocationData {
    private String subclasscode;
    private int seatavailable;
    private int faretotamount;

    public String getSubclasscode() {
        return subclasscode;
    }

    public void setSubclasscode(String subclasscode) {
        this.subclasscode = subclasscode;
    }

    public int getSeatavailable() {
        return seatavailable;
    }

    public void setSeatavailable(int seatavailable) {
        this.seatavailable = seatavailable;
    }

    public int getFaretotamount() {
        return faretotamount;
    }

    public void setFaretotamount(int faretotamount) {
        this.faretotamount = faretotamount;
    }
}
