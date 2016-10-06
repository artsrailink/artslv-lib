package co.id.artslv.lib.utility;

/**
 * Created by root on 29/09/16.
 */
public class CustomException extends Exception{
    private CustomErrorResponse customErrorResponse;
    public CustomException(String message){
        super(message);
    }
    public CustomException(CustomErrorResponse customErrorResponse){
        super(customErrorResponse);
    }

}
