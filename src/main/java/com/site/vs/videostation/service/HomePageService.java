package com.site.vs.videostation.service;


import com.site.vs.videostation.dao.DisplayDao;
import com.site.vs.videostation.entity.*;
import com.site.vs.videostation.mapper.CategoryMapper;
import com.site.vs.videostation.mapper.DetailMapper;
import com.site.vs.videostation.mapper.SeaTypeMapper;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class HomePageService {
    @Autowired
    DisplayDao displayDao;

    @Autowired
    SeaTypeMapper categoryMapper;


    public ApiResponse findHomeVideoForRecent() {

        HomePage homePage = new HomePage();

        //最近更新
        List<SeaData> recentList = displayDao.findDisplayDataRecent();
        homePage.setSlide_list(recentList);


        List<SeaData> moiveList = findTopCategorayByTypeId(28);
        DataList movieData = new DataList();
        movieData.setData(moiveList);
        movieData.setTitle("电影");
        homePage.setMove_list(movieData);

        //电视剧
       List<SeaData> teleplayList = findTopCategorayByTypeId(29);
       DataList tvData = new DataList();
       tvData.setData(teleplayList);
       tvData.setTitle("电视剧");
       homePage.setTv_list(tvData);

        //综艺
        List<SeaData> artsList = findTopCategorayByTypeId(30);
        DataList artsData = new DataList();
        artsData.setData(artsList);
        artsData.setTitle("综艺");
        homePage.setArts_list(artsData);

        //动漫
        List<SeaData> comicList = findTopCategorayByTypeId(31);
        DataList comicData = new DataList();
        comicData.setData(comicList);
        comicData.setTitle("动漫");
        homePage.setComic_list(comicData);

        //韩剧
        List<SeaData>  koreanList = findTopCategorayByTypeId(27);
        DataList koreanData = new DataList();
        koreanData.setData(koreanList);
        koreanData.setTitle("韩剧");
        homePage.setKorean_list(koreanData);


        ApiResponse data = ApiResponseUtil.success(homePage);
        return data;


    }

    public  List<SeaData> findTopCategorayByTypeId(int id) {
        List<Short> ids = new ArrayList<>();
        //电影
        List<SeaType> categoryList = categoryMapper.getAll(id);

        for (SeaType c: categoryList) {
            List<SeaType> childs = c.getCategoryList();
            for (SeaType c1 : childs) {
                ids.add(c1.getTid());

            }
        }
        if (ids.size() > 0) {
            return  displayDao.findDisplayDataRecentByTypeIds(ids);
        }else {
            return  displayDao.findDisplayDataRecentByTypeId(id);
        }

    }
}
