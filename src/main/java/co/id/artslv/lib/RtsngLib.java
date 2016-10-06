package co.id.artslv.lib;

import co.id.artslv.lib.log.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

import javax.servlet.http.HttpServletRequest;

public class RtsngLib {
    public static final long ONE_MINUTE_IN_MILLIS=60000;//millisecs
    public static void main(String[] args) {

    }

    public static Date getCurdate() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.parse(dateFormat.format(date));
    }
    public static LocalDate toLocalDate(String date){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(date, formatter);
    }
    public static Wslog SetWslog(boolean iscreate, Wslog wslog, String data, String domain, String ip, String err_code, String Userid, WslogRepository repows) {
        try {

            if (iscreate) {
                wslog.setWslogreqtime(LocalDateTime.now());
                wslog.setWslogip(ip);
                wslog.setWslogreq(data);
                wslog.setWslogstatus("1");
                wslog.setWslogdomain(domain);
                wslog.setUserid(Userid);
            } else {
                wslog.setWslogrestime(LocalDateTime.now());
                wslog.setWslogres(data);
                wslog.setWslogerrcode(err_code);
            }
            return repows.save(wslog);
        } catch (Exception e) {
            System.err.println("wslogcatch:"+e.getMessage());
        }
        return wslog;
    }
    
    public static CompletableFuture<Activitylog> setActivityLog(String object, String objectid, String action, LocalDateTime date, String oldvalue, String newvalue, String domain, String userid, String wslogid, String unitid, ActivitylogRepository repo) {
        Activitylog activitylog = new Activitylog();

        activitylog.setObject(object);
        activitylog.setObjectid(objectid);
        activitylog.setAction(action);
        activitylog.setActdate(LocalDateTime.now());
        activitylog.setWslogid(wslogid);
        String value = object + '|' + oldvalue + '|' + newvalue;
        activitylog.setValue(value);
        activitylog.setDomain(domain);
        activitylog.setUserid(userid);
        activitylog.setUnitid(unitid);
        return CompletableFuture.supplyAsync(()->repo.save(activitylog));
    }
    public static CompletableFuture<List<Activitylog>> setActivityLogList(List<Activitylog> listact, ActivitylogRepository repo) {
        return CompletableFuture.supplyAsync(()->(List<Activitylog>) repo.save(listact));
    }
    public static void setSeatLog(String object, String objectid, String action, LocalDateTime date, String value, String domain, String userid,String wagondetid, int wagonorder, SeatlogRepository repo) {
        try {
            Seatlog datalog = new Seatlog();

            datalog.setObject(object);
            datalog.setObjectid(objectid);
            datalog.setAction(action);
            datalog.setDate(date);
            datalog.setValue(value);
            datalog.setDomain(domain);
            datalog.setUserid(userid);
            datalog.setWagondetid(wagondetid);
            datalog.setWagonorder(wagonorder);
            repo.save(datalog);
        } catch (Exception e) {

        }
    }
    public static String getIpClient(HttpServletRequest request) {
        String ipAddress = request.getHeader("X-FORWARDED-FOR");
        if (ipAddress == null) {
            ipAddress = request.getRemoteAddr();
        }
        return ipAddress;
    }
    
    public static String generateTrxId(String trxId) {
    	if (null == trxId || "".equals(trxId)) {
    		return UUID.randomUUID().toString();
    	}
    	
    	return trxId;
    }

}
