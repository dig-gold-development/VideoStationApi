package com.site.vs.videostation.controller;

import com.site.vs.videostation.dto.DisplayDTO;
import com.site.vs.videostation.dto.PageBeanDTO;
import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.PageBean;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.service.RankService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "rank")
public class RankController  {

    @Autowired
    private RankService rankService;


    @PostMapping(value = "/getRankById")
    public   ApiResponse getRankById(@RequestParam("page") int page, @RequestParam("type") int type) {
        List<SeaData> displayList =  rankService.findRankByTopId(type, page);
        PageBean<SeaData> pageBean = new PageBean(displayList);
        List<DisplayDTO> displayListDTO = new ArrayList();
        for (SeaData source:pageBean.getList()) {
            DisplayDTO target = new DisplayDTO();
            BeanUtils.copyProperties(source,target);
            displayListDTO.add(target);
        }

        PageBeanDTO<DisplayDTO> pagePageDTO = new PageBeanDTO<>();
        pagePageDTO.setList(displayListDTO);
        pagePageDTO.setPageNum(pageBean.getPageNum());
        pagePageDTO.setPages(pageBean.getPages());
        pagePageDTO.setPageSize(pageBean.getPageSize());
        pagePageDTO.setSize(pageBean.getSize());
        pagePageDTO.setTotal(pageBean.getTotal());
        ApiResponse data = ApiResponseUtil.success(pagePageDTO);
        return data;


    }
}
