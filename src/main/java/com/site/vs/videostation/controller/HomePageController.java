package com.site.vs.videostation.controller;


import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "home")
public class HomePageController  {

    @Autowired
    private HomePageService homeService;


    @GetMapping
    public ApiResponse getHomePage() {

        ApiResponse homeData = homeService.findHomeVideoForRecent();
        return homeData;
    }
}
