package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaSearchKeywords;
import java.util.List;

public interface SeaSearchKeywordsMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(SeaSearchKeywords record);

    SeaSearchKeywords selectByPrimaryKey(Integer aid);

    List<SeaSearchKeywords> selectAll();

    int updateByPrimaryKey(SeaSearchKeywords record);
}