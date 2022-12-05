package lk.icanleave.icanlkleavesystem.Response;
//resolving roleback issue
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler{
    public static ResponseEntity<Object> generateResponse(String message,int code, HttpStatus status, Object responseObj) {
        Map<String, Object> map = new HashMap<>();
        map.put("message", message);
        map.put("code", code);
        map.put("http_status", status.value());
        map.put("data", responseObj);
        return new ResponseEntity<>(map,status);
    }
}
