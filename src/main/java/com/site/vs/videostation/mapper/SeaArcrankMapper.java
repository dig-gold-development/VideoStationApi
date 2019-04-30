package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaArcrank;
import java.util.List;

public interface SeaArcrankMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SeaArcrank record);

    SeaArcrank selectByPrimaryKey(Short id);

    List<SeaArcrank> selectAll();

    int updateByPrimaryKey(SeaArcrank record);
}