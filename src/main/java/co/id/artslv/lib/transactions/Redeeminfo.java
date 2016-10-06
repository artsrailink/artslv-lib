/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.transactions;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Mo
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Redeeminfo {
    private String memberid;
    private String membershipid;
    private long endingbal;
    private long ticketamount;
    private long redeemdiv;
    private int amountconvert;


    public String getMemberid() {
        return memberid;
    }

    public void setMemberid(String memberid) {
        this.memberid = memberid;
    }

    public String getMembershipid() {
        return membershipid;
    }

    public void setMembershipid(String membershipid) {
        this.membershipid = membershipid;
    }

    public long getEndingbal() {
        return endingbal;
    }

    public void setEndingbal(long endingbal) {
        this.endingbal = endingbal;
    }

    public long getTicketamount() {
        return ticketamount;
    }

    public void setTicketamount(long ticketamount) {
        this.ticketamount = ticketamount;
    }

    public long getRedeemdiv() {
        return redeemdiv;
    }

    public void setRedeemdiv(long redeemdiv) {
        this.redeemdiv = redeemdiv;
    }

    public int getAmountconvert() {
        return amountconvert;
    }

    public void setAmountconvert(int amountconvert) {
        this.amountconvert = amountconvert;
    }
}
