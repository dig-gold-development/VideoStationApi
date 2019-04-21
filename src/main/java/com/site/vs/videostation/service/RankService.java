package com.site.vs.videostation.service;

import com.github.pagehelper.PageInfo;
import com.site.vs.videostation.dao.DisplayDao;
import com.site.vs.videostation.entity.Category;
import com.site.vs.videostation.entity.Display;
import com.site.vs.videostation.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RankService {

    @Autowired
    DisplayDao displayDao;

    @Autowired
    CategoryMapper categoryMapper;

    public List<Display> findRankByTopId(int id, int page) {


            List<Integer>  list = new ArrayList<>();
            //电影
            List<Category> categoryList = categoryMapper.getAll(id);

            for (Category c: categoryList) {
                List<Category> childs = c.getCategoryList();
                for (Category c1 : childs) {

                    list.add(c1.getTid());
                }

            }
            return  displayDao.findRankByTypeIds(list,page);

    }
}
