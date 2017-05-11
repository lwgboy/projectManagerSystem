package com.ectrip.common.base;

/**
 * 统一返回结果类
 * Created by haungxinguang on 2017/4/28.
 */
public class BaseResult {

    // 状态码：1成功，其他为失败
    public int code;

    // 成功为success，其他为失败原因
    public String message;

    // 数据结果集
    public Object data;

    public BaseResult(){}

    public BaseResult(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public BaseResult ok() {
        this.code = 1;
        this.message="success";
        return this;
    }

    public BaseResult notOk() {
        this.code = 0;
        this.message="failed";
        return this;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}