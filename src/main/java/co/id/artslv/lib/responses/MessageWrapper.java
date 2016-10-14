package co.id.artslv.lib.responses;

import co.id.artslv.lib.utility.CustomErrorResponse;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by root on 26/09/16.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(value = { "customErrorResponse"})
public class MessageWrapper<T>{
    private T wrapped;
    private Map<String,T> response = new HashMap<>();
    private String status;
    private String message;
    private CustomErrorResponse customErrorResponse;

    public MessageWrapper(T wrapped, String status, String message){
        this.wrapped = wrapped;
        this.status = status;
        this.message = message;
    }
    public MessageWrapper(CustomErrorResponse customErrorResponse){
        this.setStatus(customErrorResponse.getErrorCode());
        this.setMessage(customErrorResponse.getMessage());
    }

    public MessageWrapper(String status, String message, T ... values) {
        this.status = status;
        this.message = message;
        for(T t:values){
            if (t.getClass()==List.class || t.getClass()==ArrayList.class ){
                String key = ((List)t).get(0).getClass().getSimpleName().toLowerCase()+"list";
                response.put(key,t);
            }else{
                String key = t.getClass().getSimpleName().toLowerCase();
                response.put(key,t);
            }
        }
    }

    public MessageWrapper() {
    }

    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, T> getResponse() {
        return response;
    }


    public T getWrapped() {
        return wrapped;
    }

    public void setWrapped(T wrapped) {
        this.wrapped = wrapped;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public CustomErrorResponse getCustomErrorResponse() {
        return customErrorResponse;
    }

    public void setCustomErrorResponse(CustomErrorResponse customErrorResponse) {
        this.customErrorResponse = customErrorResponse;
    }
    @JsonIgnore
    public <V> V getValue(String json,String name,Class<V> v) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(json);
        JsonNode jsonNode1 = jsonNode.path("response");

        return objectMapper.treeToValue(jsonNode1.path(name),v);
    }
}