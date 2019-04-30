package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCoUrl;
import java.util.List;

public interface SeaCoUrlMapper {
    int deleteByPrimaryKey(Integer uid);

    int insert(SeaCoUrl record);

    SeaCoUrl selectByPrimaryKey(Integer uid);

    List<SeaCoUrl> selectAll();

    int updateByPrimaryKey(SeaCoUrl record);
}