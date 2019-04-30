package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaTopic;
import java.util.List;

public interface SeaTopicMapper {
    int deleteByPrimaryKey(Short id);

    int insert(SeaTopic record);

    SeaTopic selectByPrimaryKey(Short id);

    List<SeaTopic> selectAll();

    int updateByPrimaryKey(SeaTopic record);
}