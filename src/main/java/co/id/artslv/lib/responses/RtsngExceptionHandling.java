package co.id.artslv.lib.responses;

import co.id.artslv.lib.log.Wslog;
import co.id.artslv.lib.log.WslogRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.sql.SQLRecoverableException;
import java.sql.SQLSyntaxErrorException;
import java.time.LocalDateTime;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.persistence.PersistenceException;
import org.hibernate.exception.GenericJDBCException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.expression.ParseException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RtsngExceptionHandling extends ResponseEntityExceptionHandler {

 protected Logger logger;
 
 public RtsngExceptionHandling() {
  logger = LoggerFactory.getLogger(getClass());
 }
 
 @ResponseBody
    public ResponseEntity<?> handleUnauthenticationException(Exception e) {
        return errorResponse("9", HttpStatus.BAD_REQUEST,"Unauthenticated");
    }
 
// @ExceptionHandler({DataIntegrityViolationException.class, SQLIntegrityConstraintViolationException.class,ConstraintViolationException.class})
// @ResponseBody
//    public ResponseEntity<?> handleConflictException(Exception e) {
//        return errorResponse("3", HttpStatus.CONFLICT,"Integrity Conflict");
//    }
//
// @ExceptionHandler({DataAccessException.class})
// @ResponseBody
//    public ResponseEntity<?> handleSQLException(Exception e) {
//        return errorResponse("4", HttpStatus.ACCEPTED,"Data Error");
//    }
// 
// @ExceptionHandler({ IOException.class, ParseException.class,MethodArgumentNotValidException.class,HttpMediaTypeException.class,HttpMediaTypeNotSupportedException.class, JsonParseException.class, JsonMappingException.class,HttpClientErrorException.class })
// @ResponseBody
//    public ResponseEntity<?> handleParseException(Exception e) {
//        return errorResponse("5", HttpStatus.ACCEPTED,"IO /  Parse Error");
//    }
// 
// @ExceptionHandler({ InvalidKeyException.class, NoSuchAlgorithmException.class })
// @ResponseBody
//    public ResponseEntity<?> handleHashException(Exception e) {
//        return errorResponse("6", HttpStatus.LOCKED,"Hash Error");
//    }
 
    @ExceptionHandler({Exception.class, RuntimeException.class})
    @ResponseBody
    public ResponseEntity<?> handleAnyException(Exception e, Wslog wslog, WslogRepository repoWs) throws java.text.ParseException {
    	Throwable root = (Throwable) getCause(e);

        System.err.println("rootclass:" + root.getClass() + "" + root.getClass().equals(SQLSyntaxErrorException.class));

        if (wslog != null) {
            wslog.setWslogrestime(LocalDateTime.now());
        }

        if (root.getClass().equals(PersistenceException.class) || root.getClass().equals(SQLRecoverableException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("3");
                wslog.setWslogres("Database Connection Problem" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("3", HttpStatus.ACCEPTED, "Database Connection Problem");
        } else if (root.getClass().equals(SQLIntegrityConstraintViolationException.class) || root.getClass().equals(DataIntegrityViolationException.class) || root.getClass().equals(SQLSyntaxErrorException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("3");
                wslog.setWslogres("Create/Update Failed; Constraint Violation" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("3", HttpStatus.ACCEPTED, "Create/Update Failed; Constraint Violation");
        } else if (root.getClass().equals(IllegalArgumentException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("4");
                wslog.setWslogres("Parameter is Required; It must not be null" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("4", HttpStatus.ACCEPTED, "Parameter is Required; It must not be null");
        } else if (root.getClass().equals(IOException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("4");
                wslog.setWslogres("IO Error" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("4", HttpStatus.ACCEPTED, "IO Error");
        } else if (root.getClass().equals(ParseException.class) || root.getClass().equals(JsonProcessingException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("4");
                wslog.setWslogres("Parse Error; Please Check the Data" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("4", HttpStatus.ACCEPTED, "Parse Error; Please Check the Data");
        } else if (root.getClass().equals(HttpMediaTypeException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("4");
                wslog.setWslogres("Method Not Allowed" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("4", HttpStatus.ACCEPTED, "Method Not Allowed");
        } else if (root.getClass().equals(HttpMediaTypeNotSupportedException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("4");
                wslog.setWslogres("Media Type Not Supported" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("4", HttpStatus.ACCEPTED, "Media Type Not Supported");
        } else if (root.getClass().equals(HttpRequestMethodNotSupportedException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("4");
                wslog.setWslogres("Http Request Method Not Supported" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("4", HttpStatus.ACCEPTED, "Http Request Method Not Supported");
        } else if (root.getClass().equals(MethodArgumentNotValidException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("4");
                wslog.setWslogres("Parameter is Required; It must not be null" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("4", HttpStatus.ACCEPTED, "Parameter is Required; It must not be null");
        } else if (root.getClass().equals(GenericJDBCException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("3");
                wslog.setWslogres("JDBC Error" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("3", HttpStatus.ACCEPTED, "JDBC Error");
        } else if (root.getClass().equals(NoSuchAlgorithmException.class)
                || root.getClass().equals(InvalidKeySpecException.class)
                || root.getClass().equals(NoSuchPaddingException.class)
                || root.getClass().equals(InvalidKeyException.class)
                || root.getClass().equals(InvalidAlgorithmParameterException.class)
                || root.getClass().equals(UnsupportedEncodingException.class)
                || root.getClass().equals(IllegalBlockSizeException.class)
                || root.getClass().equals(BadPaddingException.class)) {
            if (wslog != null) {
                wslog.setWslogerrcode("5");
                wslog.setWslogres("Encrypt/Decrypt Error" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("5", HttpStatus.ACCEPTED, "Encrypt/Decrypt Error");
        }
        else {
            if (wslog != null) {
                wslog.setWslogerrcode("99");
                wslog.setWslogres("internal server error" + " | " + root.getMessage());
                repoWs.save(wslog);
            }
            return errorResponse("99", HttpStatus.ACCEPTED, "internal server error");
        }
    }
    
    protected ResponseEntity<ResponseResource> errorResponse(String err_code,
            HttpStatus status,String msg) {
            return response(new ResponseResource(err_code, msg), status);
        
    }

    public <T> ResponseEntity<T> response(T body, HttpStatus status) {
        return new ResponseEntity<T>(body, new HttpHeaders(), status);
    }
    private Throwable getCause(Throwable e) {
    Throwable cause = null; 
    Throwable result = e;

    while(null != (cause = result.getCause())  && (result != cause) ) {
        result = cause;
    }
    return result;
    }
}
	
