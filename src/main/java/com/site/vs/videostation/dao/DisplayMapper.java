package com.site.vs.videostation.dao;

import com.site.vs.videostation.entity.Display;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Mapper
public interface DisplayMapper {
    List<Display> findDisplayDataByTypeid(int id);
}
