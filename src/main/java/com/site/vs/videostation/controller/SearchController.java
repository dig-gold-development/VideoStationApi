package com.site.vs.videostation.controller;


import com.site.vs.videostation.dto.DisplayDTO;
import com.site.vs.videostation.dto.PageBeanDTO;
import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.PageBean;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.service.SearchService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "search")
    public ApiResponse getRankById(@RequestParam("page") int page, @RequestParam("type") int type, @RequestParam("keywords") String keywords) {
        List<SeaData> searchList =  searchService.getByTidAndTName(type,keywords,page);
        PageBean<SeaData> pageBean = new PageBean(searchList);
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
