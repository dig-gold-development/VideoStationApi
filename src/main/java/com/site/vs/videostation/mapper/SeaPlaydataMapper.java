package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaPlaydata;
import java.util.List;

public interface SeaPlaydataMapper {
    int deleteByPrimaryKey(Integer vId);

    int insert(SeaPlaydata record);

    SeaPlaydata selectByPrimaryKey(Integer vId);

    List<SeaPlaydata> selectAll();

    int updateByPrimaryKey(SeaPlaydata record);
}