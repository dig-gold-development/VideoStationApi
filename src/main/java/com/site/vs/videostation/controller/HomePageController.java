package com.site.vs.videostation.controller;


import com.github.pagehelper.PageHelper;
import com.site.vs.videostation.base.BaseController;
import com.site.vs.videostation.dao.DisplayDao;
import com.site.vs.videostation.mapper.DisplayMapper;
import com.site.vs.videostation.entity.Display;
import com.site.vs.videostation.service.HomePageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "home")
public class HomePageController extends BaseController {

    @Autowired
    private HomePageService homeService;


    @GetMapping
    public HashMap<String,Object> getHomePage() {

        HashMap<String,Object> homeData = homeService.findHomeVideoForRecent();
        return homeData;
    }
}
