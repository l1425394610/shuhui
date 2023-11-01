package cn.shuhui.entity;

import lombok.Data;

/**
 * @author luyingjian
 * @date 2023/11/1
 */
@Data
public class ResponseData<T> {

    private Integer code;
    private T data;
    private String message;

    public ResponseData() {
    }

    public ResponseData(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }


    public static <T> ResponseData<T> success(T data) {
        return new ResponseData(200,"success",data);
    }

    public static <T> ResponseData<T> success() {
        return new ResponseData(200,"success",null);
    }

    public static <T> ResponseData<T> getFailResponse(T data) {
        return new ResponseData(500,"fail",data);
    }

    public static <T> ResponseData<T> getFailResponse() {
        return new ResponseData(500,"fail",null);
    }


}
