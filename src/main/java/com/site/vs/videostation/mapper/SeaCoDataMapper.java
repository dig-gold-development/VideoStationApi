package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCoData;
import java.util.List;

public interface SeaCoDataMapper {
    int deleteByPrimaryKey(Integer vId);

    int insert(SeaCoData record);

    SeaCoData selectByPrimaryKey(Integer vId);

    List<SeaCoData> selectAll();

    int updateByPrimaryKey(SeaCoData record);
}