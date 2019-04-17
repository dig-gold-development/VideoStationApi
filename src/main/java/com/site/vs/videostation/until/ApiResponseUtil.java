package com.site.vs.videostation.until;

import com.site.vs.videostation.entity.ApiResponse;

public class ApiResponseUtil {
    public static ApiResponse success(Object object) {
        ApiResponse response = new ApiResponse();
        response.setData(object);
        response.setCode(0);
        response.setMessage("success");
        return response;
    }
}
