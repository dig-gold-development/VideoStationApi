package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaMemberGroup;
import java.util.List;

public interface SeaMemberGroupMapper {
    int deleteByPrimaryKey(Integer gid);

    int insert(SeaMemberGroup record);

    SeaMemberGroup selectByPrimaryKey(Integer gid);

    List<SeaMemberGroup> selectAll();

    int updateByPrimaryKey(SeaMemberGroup record);
}