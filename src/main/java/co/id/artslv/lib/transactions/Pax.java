package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

/**
 * @author root
 */
public class Pax {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String idnum;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String address;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String phone;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String inventoryid;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String seat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private BigDecimal amount;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ticketnum;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String stamformdetcode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String wagondetrow;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String wagondetcol;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getInventoryid() {
        return inventoryid;
    }

    public void setInventoryid(String inventoryid) {
        this.inventoryid = inventoryid;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getIdnum() {
        return idnum;
    }

    public void setIdnum(String idnum) {
        this.idnum = idnum;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getTicketnum() {
        return ticketnum;
    }

    public void setTicketnum(String ticketnum) {
        this.ticketnum = ticketnum;
    }

    public String getStamformdetcode() {
        return stamformdetcode;
    }

    public void setStamformdetcode(String stamformdetcode) {
        this.stamformdetcode = stamformdetcode;
    }

    public String getWagondetrow() {
        return wagondetrow;
    }

    public void setWagondetrow(String wagondetrow) {
        this.wagondetrow = wagondetrow;
    }

    public String getWagondetcol() {
        return wagondetcol;
    }

    public void setWagondetcol(String wagondetcol) {
        this.wagondetcol = wagondetcol;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
