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
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
public class SearchController {

    @Autowired
    private SearchService searchService;

    @RequestMapping(value = "search")
    public ApiResponse getRankById(@RequestParam(value = "page",required = false,defaultValue = "1") int page, @RequestParam("type") int type, @RequestParam("keywords") String keywords) {
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
    @RequestMapping(value = "search/hot")
    public  ApiResponse getHotKeywords() {

        List hotList = new ArrayList();
        hotList.add("搞笑");
        hotList.add("恐怖");
        hotList.add("惊喜");
        hotList.add("神奇");
        hotList.add("青春");
        Map hotMap = new HashMap();
        hotMap.put("hot_list",hotList);
        ApiResponse data = ApiResponseUtil.success(hotMap);
        return data;
    }

}
