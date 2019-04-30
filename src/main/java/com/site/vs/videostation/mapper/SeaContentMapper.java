package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaContent;
import java.util.List;

public interface SeaContentMapper {
    int deleteByPrimaryKey(Integer vId);

    int insert(SeaContent record);

    SeaContent selectByPrimaryKey(Integer vId);

    List<SeaContent> selectAll();

    int updateByPrimaryKey(SeaContent record);
}