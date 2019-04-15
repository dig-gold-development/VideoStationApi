package com.site.vs.videostation.controller;

import com.github.pagehelper.PageInfo;
import com.site.vs.videostation.base.BaseController;
import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.Display;
import com.site.vs.videostation.entity.PageBean;
import com.site.vs.videostation.service.RankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping(value = "rank")
public class RankController extends BaseController {

    @Autowired
    private RankService rankService;

    @ResponseBody
    @PostMapping(value = "/getRankByid")
    public   ApiResponse getRankByid(@RequestParam("page") int page, @RequestParam("type") int type) {
        List<Display> displayList =  rankService.findRankByTypeid(type, page);
        PageBean<Display> pageBean = new PageBean(displayList);
        ApiResponse data = show(200,"success",pageBean);
        return data;


    }
}
