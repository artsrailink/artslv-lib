package co.id.artslv.lib.utility;

/**
 * Created by root on 29/09/16.
 */
public class CustomErrorResponse extends Throwable{
    private String errorCode;
    private String message;

    public CustomErrorResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
