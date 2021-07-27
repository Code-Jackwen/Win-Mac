package com.nyist.xu.javabasetest.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

/**
 * @author silence
 * @Description: 后端返回数据
 */
@Data
@ToString
@NoArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class Result<T> implements Serializable {
    private Integer code;
    private String message;
    private T data;
//    @JsonIgnore
    private String logs;

    public Result(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Result(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Result(List<Integer> ids, String message, String username, boolean b) {
        this.code = b ? CodeStatus.OK : CodeStatus.FAIL;
        this.message = message + (b ? "成功" : "失败");
        this.logs = "用户:" + username + "--" + message +
         "(ids:" + ids + ")--" + (b ? "成功" : "失败");
    }

    public Result(Integer id, String message, String username, boolean b) {
        this.code = b ? CodeStatus.OK : CodeStatus.FAIL;
        this.message = message + (b ? "成功" : "失败");
        this.logs = "用户:" + username + "--" + message +
         (id == null ? "" : "(id:" + id + ")") + "--" + (b ? "成功" : "失败");
    }

    public Result(Integer id, String message, String username) {
        this.code = CodeStatus.OK;
        this.message = message + "成功";
        this.logs = "用户:" + username + "--" + message +
         (id == null ? "" : "(id:" + id + ")") + "--成功";
    }


    public class CodeStatus {
        /**
         * 请求成功
         */
        public static final int OK = 20000;
        /**
         * 请求失败
         */
        public static final int FAIL = 50000;
        /**
         * 非法token
         */
        public static final int ILLEGAL_TOKEN = 50008;
        /**
         * 已在其他地方登录
         */
        public static final int OTHER_CLIENTS_LOGGED_IN = 50012;
        /**
         * token超时
         */
        public static final int TOKEN_EXPIRED = 50014;
    }
}
