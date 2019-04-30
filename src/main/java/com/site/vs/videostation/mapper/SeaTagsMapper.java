package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaTags;
import java.util.List;

public interface SeaTagsMapper {
    int deleteByPrimaryKey(Integer tagid);

    int insert(SeaTags record);

    SeaTags selectByPrimaryKey(Integer tagid);

    List<SeaTags> selectAll();

    int updateByPrimaryKey(SeaTags record);
}