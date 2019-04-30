package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaNews;
import java.util.List;

public interface SeaNewsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(SeaNews record);

    SeaNews selectByPrimaryKey(Integer nId);

    List<SeaNews> selectAll();

    int updateByPrimaryKey(SeaNews record);
}