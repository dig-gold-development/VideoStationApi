package com.site.vs.videostation.service;

import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.mapper.SeaDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class DetailService {
    @Autowired
    private SeaDataMapper seaDataMapper;

    public SeaData findDetialById(int id) {
       return  seaDataMapper.findDetialById(id);
    }
}
