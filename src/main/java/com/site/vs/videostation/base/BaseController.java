package com.site.vs.videostation.base;

import com.site.vs.videostation.entity.ApiResponse;

public class BaseController {

    public <T>  ApiResponse show(int code ,String message,T data) {
       return new ApiResponse(code,message,data);
    }
}
