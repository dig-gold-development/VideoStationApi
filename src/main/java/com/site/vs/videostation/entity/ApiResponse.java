package com.site.vs.videostation.entity;

import lombok.Data;

import java.io.Serializable;


public class ApiResponse <T> implements Serializable {

    private  int code;
    private  String message;
    private  T data;

    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ApiResponse(CodeMsg codeMsg) {
        if(codeMsg != null) {
            this.code = codeMsg.getCode();
            this.message = codeMsg.getMsg();
        }
    }


    public ApiResponse(){

    }

    /**
     *  失败时候的调用
     * */
    public static  <T> ApiResponse<T> error(CodeMsg codeMsg){
        return new ApiResponse<T>(codeMsg);
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

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
