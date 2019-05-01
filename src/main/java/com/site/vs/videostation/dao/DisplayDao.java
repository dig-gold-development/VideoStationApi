package com.site.vs.videostation.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.mapper.SeaDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisplayDao {
    @Autowired
    SeaDataMapper mapper;

    public List<SeaData> findDisplayDataRecentByTypeId(int id) {
        PageHelper.startPage(1, 6);
       return  mapper.findDisplayDataByTypeId(id);
    }

    public  List<SeaData> findDisplayDataRecentByTypeIds(List<Short> ids) {
        PageHelper.startPage(1, 6);
        return  mapper.findDisplayDataByTypeIds(ids);
    }

    public List<SeaData> findDisplayDataRecent() {
        return mapper.findDisplayDataRecent();
    }

    public List<SeaData> findRankByTypeId(int id ,int page) {
        PageHelper.startPage(page,10);
        List<SeaData>  disPlayList = mapper.findDisplayDataByTypeId(id);
        return disPlayList;
    }

    public  List<SeaData> findRankByTypeIds(List<Short> ids,int page) {
        PageHelper.startPage(page,10);
        List<SeaData>  disPlayList = mapper.findDisplayDataByTypeIds(ids);
        return disPlayList;
    }
}
