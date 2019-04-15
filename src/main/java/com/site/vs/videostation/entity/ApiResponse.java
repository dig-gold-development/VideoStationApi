package com.site.vs.videostation.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class ApiResponse <T> implements Serializable {

    private  int code;
    private  String message;
    private  T data;

    public ApiResponse(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
