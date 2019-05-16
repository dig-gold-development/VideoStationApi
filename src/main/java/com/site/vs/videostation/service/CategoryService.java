package com.site.vs.videostation.service;


import com.site.vs.videostation.entity.CategoryDetail;
import com.site.vs.videostation.entity.PageBean;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.entity.SeaType;
import com.site.vs.videostation.mapper.SeaTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class CategoryService {
    @Autowired
    SeaTypeMapper categoryMapper;

    @Autowired
    DisplayService displayService;

    public CategoryDetail findChannelDetailByData(SeaData seaData,int page,int pageSize ) {

        List<Short>  ids = new ArrayList<>();
        List<SeaType> types = new ArrayList<>();
        List<String> areas= new ArrayList<>();
        areas.add("香港");
        areas.add("大陆");
        areas.add("日本");
        areas.add("台湾");
        areas.add("韩国");
        List<Integer> years = new ArrayList<>();
        years.add(2019);
        years.add(2018);
        years.add(2017);
        years.add(2016);
        years.add(2015);
        int id = seaData.getTid();
        //电影
        List<SeaType> categoryList = categoryMapper.getAll(id);

        for (SeaType c: categoryList) {
            List<SeaType> childs = c.getCategoryList();
            for (SeaType c1 : childs) {

                ids.add(c1.getTid());
                types.add(c1);
            }

        }
        Integer year = seaData.getvPublishyear();
        String area = seaData.getvPublisharea();
        List<SeaData> seaDatas;
        if (ids.size() > 0) {
            seaDatas = displayService.findListByTypeIds(ids,year,area,page,pageSize);
        }else {
            seaDatas =  displayService.findListByTypeId(id,year,area,page,pageSize);
        }
        PageBean<SeaData> pageBean = new PageBean(seaDatas);
        CategoryDetail detail = new CategoryDetail();
        if (seaDatas != null) {
            detail.setSeaList(pageBean.getList());
            detail.setCount(pageBean.getTotal());
        }

        if (types != null) {
            detail.setSeaTypeList(types);
        }

        if (areas != null) {
            detail.setAreaList(areas);
        }

        if (years != null) {
            detail.setYearList(years);
        }


        return  detail;
    }


}
