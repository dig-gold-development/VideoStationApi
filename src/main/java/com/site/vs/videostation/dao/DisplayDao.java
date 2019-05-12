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
       return  mapper.findSeaDataByTypeId(id);
    }

    public  List<SeaData> findDisplayDataRecentByTypeIds(List<Short> ids) {
        PageHelper.startPage(1, 6);
        return  mapper.findSeaDataByTypeIds(ids);
    }

    public List<SeaData> findDisplayDataRecent() {
        return mapper.findSeaDataRecent();
    }

    public List<SeaData> findRankByTypeId(int id ,int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<SeaData>  disPlayList = mapper.findSeaDataByTypeId(id);
        return disPlayList;
    }

    public  List<SeaData> findRankByTypeIds(List<Short> ids,int page,int pageSize) {
        PageHelper.startPage(page,pageSize);
        List<SeaData>  disPlayList = mapper.findSeaDataByTypeIds(ids);
        return disPlayList;
    }

    public List<SeaData> findListByTypeIds(List<Short> ids,Integer year,String area,int page,int pgaeSize) {
        PageHelper.startPage(page,pgaeSize);
        List<SeaData>  disPlayList = mapper.findSeaDataByFilterIds(ids,year,area);
        return disPlayList;
    }

    public List<SeaData> findListByTypeId(int id,Integer year,String area,int page,int pgaeSize) {
        PageHelper.startPage(page,pgaeSize);
        List<SeaData>  disPlayList = mapper.findSeaDataByFilterId(id,year,area);
        return disPlayList;
    }
}
