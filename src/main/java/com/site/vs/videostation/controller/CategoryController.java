package com.site.vs.videostation.controller;

import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.CategoryDetail;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.service.CategoryService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;


    @RequestMapping(value = "list")
    public ApiResponse findChannelListById( @RequestParam(value = "tid",required = true)  Short id,@RequestParam(value = "year",required = false) String year,@RequestParam(value = "area",required = false) String area,@RequestParam(value = "page",required = false,defaultValue = "1") int page,@RequestParam(value = "pageSize",required = false,defaultValue = "20") int pageSize) {

        SeaData seaData = new SeaData();
        seaData.setTid(id);
        if (year != null && !year.equals("")) {
            Integer yearInteger = new Integer(year);
            seaData.setvPublishyear(yearInteger.intValue());
        }

        if (area != null && !area.equals("") ) {
            seaData.setvPublisharea(area);
        }
        CategoryDetail detail =  categoryService.findChannelDetailByData(seaData,page,pageSize);

        return ApiResponseUtil.success(detail);

    }


}
