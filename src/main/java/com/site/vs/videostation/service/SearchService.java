package com.site.vs.videostation.service;


import com.github.pagehelper.PageHelper;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.entity.SeaType;
import com.site.vs.videostation.mapper.SeaTypeMapper;
import com.site.vs.videostation.mapper.SearchMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {

    @Autowired
    SearchMapper searchMapper;

    @Autowired
    SeaTypeMapper categoryMapper;

    public List<SeaData> getByTidAndTName(int id,String name, int page) {


        List<Short>  ids = new ArrayList<>();
        //电影
        List<SeaType> categoryList = categoryMapper.getAll(id);

        for (SeaType c: categoryList) {
            List<SeaType> childs = c.getCategoryList();
            for (SeaType c1 : childs) {

                ids.add(c1.getTid());
            }

        }
        if (ids.size() > 0) {
            PageHelper.startPage(page,20);
            List<SeaData>  searchList = searchMapper.getByTidsAndTName(ids,name);
            return searchList;
        }else {
            List<SeaData>  searchList = searchMapper.getByTidAndTName(id,name);
            return searchList;
        }


    }
}
