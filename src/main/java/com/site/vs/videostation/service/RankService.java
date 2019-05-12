package com.site.vs.videostation.service;

import com.github.pagehelper.PageInfo;
import com.site.vs.videostation.dao.DisplayDao;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.entity.SeaType;
import com.site.vs.videostation.mapper.SeaTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankService {

    @Autowired
    DisplayDao displayDao;

    @Autowired
    SeaTypeMapper categoryMapper;

    public List<SeaData> findRankByTopId(int id, int page) {


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
                return  displayDao.findRankByTypeIds(ids,page,10);
            }else {
                return  displayDao.findRankByTypeId(id,page,10);
            }


    }
}
