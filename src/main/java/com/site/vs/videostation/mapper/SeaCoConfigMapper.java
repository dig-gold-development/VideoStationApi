package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCoConfig;
import java.util.List;

public interface SeaCoConfigMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(SeaCoConfig record);

    SeaCoConfig selectByPrimaryKey(Integer cid);

    List<SeaCoConfig> selectAll();

    int updateByPrimaryKey(SeaCoConfig record);
}