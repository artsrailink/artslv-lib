package co.id.artslv.lib.utility;

/**
 * Created by root on 26/09/16.
 */
public enum MessageConstant {
    SUCCESS("0","SUCCESS"),
    PAYMENT_TIMEOUT("4","PAYMENT TIMOUT"),
    PAYMENT_NOTBOOKED("5","PAYMENT NOT BOOKED"),
    CUSTOM_EXCEPTION("10","CUSTOM EXCEPTION");

    private String message;
    private String code;

    MessageConstant(String code, String message){
        this.message = message;
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
