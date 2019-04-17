package com.site.vs.videostation.dao;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.site.vs.videostation.entity.Display;
import com.site.vs.videostation.mapper.DisplayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisplayDao {
    @Autowired
    DisplayMapper mapper;

    public List<Display> findDisplayDataRecentByTypeId(int id) {
        PageHelper.startPage(1, 6);
       return  mapper.findDisplayDataRecentByTypeId(id);
    }

    public List<Display> findRankByTypeId(int id ,int page) {
        PageHelper.startPage(page,10);
        List<Display>  disPlayList = mapper.findDisplayDataRecentByTypeId(id);
        return disPlayList;


    }
}
