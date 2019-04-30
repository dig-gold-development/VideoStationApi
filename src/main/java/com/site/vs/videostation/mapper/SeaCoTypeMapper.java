package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCoType;
import java.util.List;

public interface SeaCoTypeMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(SeaCoType record);

    SeaCoType selectByPrimaryKey(Integer tid);

    List<SeaCoType> selectAll();

    int updateByPrimaryKey(SeaCoType record);
}