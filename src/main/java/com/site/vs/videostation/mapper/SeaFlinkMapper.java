package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaFlink;
import java.util.List;

public interface SeaFlinkMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SeaFlink record);

    SeaFlink selectByPrimaryKey(Short id);

    List<SeaFlink> selectAll();

    int updateByPrimaryKey(SeaFlink record);
}