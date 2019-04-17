package com.site.vs.videostation.service;

import com.github.pagehelper.PageInfo;
import com.site.vs.videostation.dao.DisplayDao;
import com.site.vs.videostation.entity.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RankService {

    @Autowired
    DisplayDao displayDao;

    public List<Display> findRankByTypeId(int id, int page) {
       return displayDao.findRankByTypeId(id,page);
    }
}
