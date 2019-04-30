package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaIe;
import java.util.List;

public interface SeaIeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaIe record);

    SeaIe selectByPrimaryKey(Integer id);

    List<SeaIe> selectAll();

    int updateByPrimaryKey(SeaIe record);
}