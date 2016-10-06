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
public class Transdetamount {
    private long rateamount;
    private long discamount;
    private long redamount;
    private long amount;

    public long getRateamount() {
        return rateamount;
    }

    public void setRateamount(long rateamount) {
        this.rateamount = rateamount;
    }

    public long getDiscamount() {
        return discamount;
    }

    public void setDiscamount(long discamount) {
        this.discamount = discamount;
    }

    public long getRedamount() {
        return redamount;
    }

    public void setRedamount(long redamount) {
        this.redamount = redamount;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }
   
    
    
}
