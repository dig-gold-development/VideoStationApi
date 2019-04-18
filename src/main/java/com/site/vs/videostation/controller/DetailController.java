package com.site.vs.videostation.controller;

import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.Detail;
import com.site.vs.videostation.service.DetailService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "detail")
public class DetailController {

    @Autowired
    private DetailService detailService;

    @GetMapping(value = "/getDetailById")
    public ApiResponse findDetailById(@RequestParam("id") int id ) {
        Detail detail = detailService.findDetialById(id);
        ApiResponse data = ApiResponseUtil.success(detail);
        return data;
    }



}
