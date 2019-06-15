package com.site.vs.videostation.service;


import com.site.vs.videostation.dto.DisplayDTO;
import com.site.vs.videostation.entity.*;
import com.site.vs.videostation.mapper.SeaTypeMapper;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HomePageService {
    @Autowired
    DisplayService displayService;

    @Autowired
    SeaTypeMapper categoryMapper;


    public ApiResponse findHomeVideoForRecent() {

        HomePage homePage = new HomePage();

        //最近更新
        List<SeaData> recentList = displayService.findDisplayDataRecent();
        List<DisplayDTO> recentListDTO = new ArrayList<>();
        for (SeaData source : recentList) {
            DisplayDTO target = new DisplayDTO();
            BeanUtils.copyProperties(source, target);
            recentListDTO.add(target);
        }
        homePage.setSlide_list(recentListDTO);


        List<SeaData> moiveList = findTopCategorayByTypeId(28);
        List<DisplayDTO> moiveListDTO = new ArrayList<>();
        for (SeaData source : moiveList) {
            DisplayDTO target = new DisplayDTO();
            BeanUtils.copyProperties(source,target);
            moiveListDTO.add(target);
        }
        DataList movieData = new DataList();
        movieData.setData(moiveListDTO);
        movieData.setTitle("电影");
        homePage.setMove_list(movieData);

        //电视剧
       List<SeaData> teleplayList = findTopCategorayByTypeId(29);
        List<DisplayDTO> teleplayListDTO = new ArrayList<>();
        for (SeaData source : teleplayList) {
            DisplayDTO target = new DisplayDTO();
            BeanUtils.copyProperties(source,target);
            teleplayListDTO.add(target);
        }
       DataList tvData = new DataList();
       tvData.setData(teleplayListDTO);
       tvData.setTitle("电视剧");
       homePage.setTv_list(tvData);

        //综艺
        List<SeaData> artsList = findTopCategorayByTypeId(30);
        List<DisplayDTO> artsListDTO = new ArrayList<>();
        for (SeaData source : artsList) {
            DisplayDTO target = new DisplayDTO();
            BeanUtils.copyProperties(source,target);
            artsListDTO.add(target);
        }
        DataList artsData = new DataList();
        artsData.setData(artsListDTO);
        artsData.setTitle("综艺");
        homePage.setArts_list(artsData);

        //动漫
        List<SeaData> comicList = findTopCategorayByTypeId(31);
        List<DisplayDTO> comicListDTO = new ArrayList<>();
        for (SeaData source : comicList) {
            DisplayDTO target = new DisplayDTO();
            BeanUtils.copyProperties(source,target);
            comicListDTO.add(target);
        }
        DataList comicData = new DataList();
        comicData.setData(comicListDTO);
        comicData.setTitle("动漫");
        homePage.setComic_list(comicData);

        //韩剧
        List<SeaData>  koreanList = findTopCategorayByTypeId(27);
        List<DisplayDTO> koreanListDTO = new ArrayList<>();
        for (SeaData source : koreanList) {
            DisplayDTO target = new DisplayDTO();
            BeanUtils.copyProperties(source,target);
            koreanListDTO.add(target);
        }
        DataList koreanData = new DataList();
        koreanData.setData(koreanListDTO);
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
            return  displayService.findDisplayDataRecentByTypeIds(ids);
        }else {
            return  displayService.findDisplayDataRecentByTypeId(id);
        }

    }
}
