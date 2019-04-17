package com.site.vs.videostation.service;

import com.site.vs.videostation.entity.Detail;
import com.site.vs.videostation.mapper.DetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailService {
    @Autowired
    private DetailMapper detailMapper;

    public Detail findDetialById(int id) {
       return  detailMapper.findDetialById(id);
    }
}
