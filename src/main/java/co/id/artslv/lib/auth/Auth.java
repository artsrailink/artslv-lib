/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.id.artslv.lib.auth;

/**
 *
 * @author rtsng
 */
//@Entity
//@Table(name="KAIRTS_T_USER")
public class Auth {
    private String username;
    private String password;
    private int userloginattempt;
    private String ip;
    private String app;
    private String bypass;
    public Auth(){}

    public String getApp() {
        return app;
    }

    public void setApp(String app) {
        this.app = app;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserloginattempt() {
        return userloginattempt;
    }

    public void setUserloginattempt(int userloginattempt) {
        this.userloginattempt = userloginattempt;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getBypass() {
        return bypass;
    }

    public void setBypass(String bypass) {
        this.bypass = bypass;
    }
    
}
