package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaZyk;
import java.util.List;

public interface SeaZykMapper {
    int deleteByPrimaryKey(Integer zid);

    int insert(SeaZyk record);

    SeaZyk selectByPrimaryKey(Integer zid);

    List<SeaZyk> selectAll();

    int updateByPrimaryKey(SeaZyk record);
}