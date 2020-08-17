package com.knight.dto;

/**
 * 设计成泛型
 * 封装json对象，所有返回结果都使用它
 * @param <T>  泛型
 */

public class Result<T> {

    //是否成功标志
    private boolean success;
    //成功时候返回的数据
    private T data;
    //错误信息
    private String error;

    public Result() {

    }

    //成功时的构造器
    public Result(boolean success, T data) {
        this.success = success;
        this.data = data;
    }

    //错误时的构造器
    public Result(T data, String error) {
        this.data = data;
        this.error = error;
    }

    public boolean isSuccess() {
        return success;
    }

    public T getData() {
        return data;
    }

    public String getError() {
        return error;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public void setData(T data) {
        this.data = data;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "JsonResult [success=" + success + ", data=" + data + ", error=" + error + "]";
    }
}
