package com.site.vs.videostation.controller;

import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.Display;
import com.site.vs.videostation.entity.PageBean;
import com.site.vs.videostation.service.RankService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "rank")
public class RankController  {

    @Autowired
    private RankService rankService;


    @PostMapping(value = "/getRankById")
    public   ApiResponse getRankById(@RequestParam("page") int page, @RequestParam("type") int type) {
        List<Display> displayList =  rankService.findRankByTopId(type, page);
        PageBean<Display> pageBean = new PageBean(displayList);
        ApiResponse data = ApiResponseUtil.success(pageBean);
        return data;


    }
}
