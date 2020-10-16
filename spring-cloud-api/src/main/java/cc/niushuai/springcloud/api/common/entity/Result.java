package cc.niushuai.springcloud.api.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.HashMap;

/**
 * @author ns
 * @date 2020/9/26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class Result extends HashMap {

    public static final String ERROR = "error";
    public static final String SUCCESS = "success";
    private static final String CODE = "code";
    private static final String MSG = "msg";
    private static final String DATA = "data";

    private int code;
    private String msg;
    private Object data;

    public static Result success() {
        return info(200, SUCCESS);
    }

    public static Result success(String msg) {
        return info(200, msg);
    }

    public static Result success(Object data) {
        return info(200, SUCCESS, data);
    }

    public static Result success(String msg, Object data) {
        return info(200, msg, data);
    }

    public static Result error() {
        return info(500, ERROR);
    }

    public static Result error(String msg) {
        return info(500, msg);
    }

    public static Result error(Object data) {
        return info(500, ERROR, data);
    }

    public static Result error(String msg, Object data) {
        return info(500, msg, data);
    }

    public static Result info(Integer code, String msg) {
        return info(code, msg, null);
    }

    public static Result info(Integer code, String msg, Object data) {
        return new Result(code, msg, data);
    }

    public Result put(String key, Object data) {
        super.put(key, data);
        return this;
    }
}
