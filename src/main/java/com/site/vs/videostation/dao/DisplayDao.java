package com.site.vs.videostation.dao;

import com.github.pagehelper.PageHelper;
import com.site.vs.videostation.entity.Display;
import com.site.vs.videostation.mapper.DisplayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisplayDao {
    @Autowired
    DisplayMapper mapper;
    public List<Display> findDisplayDataRecentByTypeid(int id) {
        PageHelper.startPage(1, 6);
       return  mapper.findDisplayDataRecentByTypeid(id);
    }
}
