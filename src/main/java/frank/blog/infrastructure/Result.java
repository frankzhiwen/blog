package frank.blog.infrastructure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Result {
    private boolean success;
    private Integer code;
    private String message;
    private Object data;

    public static Result buildOK(){
        Result result = new Result();
        result.success = true;
        result.code = 200;
        result.message = "OK";
        return result;
    }

    public static Result buildOK(Object data){
        Result result = buildOK();
        result.data = data;
        return result;
    }
}
