package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaTemp;
import java.util.List;

public interface SeaTempMapper {
    int deleteByPrimaryKey(Integer vId);

    int insert(SeaTemp record);

    SeaTemp selectByPrimaryKey(Integer vId);

    List<SeaTemp> selectAll();

    int updateByPrimaryKey(SeaTemp record);
}