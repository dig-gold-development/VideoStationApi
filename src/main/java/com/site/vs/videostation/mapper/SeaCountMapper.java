package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCount;
import java.util.List;

public interface SeaCountMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaCount record);

    SeaCount selectByPrimaryKey(Integer id);

    List<SeaCount> selectAll();

    int updateByPrimaryKey(SeaCount record);
}