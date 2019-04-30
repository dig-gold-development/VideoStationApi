package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaData;
import java.util.List;

public interface SeaDataMapper {
    int deleteByPrimaryKey(Integer vId);

    int insert(SeaData record);

    SeaData selectByPrimaryKey(Integer vId);

    List<SeaData> selectAll();

    int updateByPrimaryKey(SeaData record);

    SeaData findDetialById(int id);
}