package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCoNews;
import java.util.List;

public interface SeaCoNewsMapper {
    int deleteByPrimaryKey(Integer nId);

    int insert(SeaCoNews record);

    SeaCoNews selectByPrimaryKey(Integer nId);

    List<SeaCoNews> selectAll();

    int updateByPrimaryKey(SeaCoNews record);
}