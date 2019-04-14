package com.site.vs.videostation.service;


import com.site.vs.videostation.dao.DisplayDao;
import com.site.vs.videostation.entity.Display;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class HomePageService {
    @Autowired
    DisplayDao displayDao;

    private HashMap<String,Object> hashMap= new HashMap<String,Object>();

    public HashMap<String,Object> findHomeVideoForRecent() {

       List<Display> moiveList = displayDao.findDisplayDataRecentByTypeid(28);
        hashMap.put("move_list",moiveList);
       List<Display> teleplayList = displayDao.findDisplayDataRecentByTypeid(30);
       hashMap.put("tv_list",teleplayList);
       return hashMap;

    }
}
