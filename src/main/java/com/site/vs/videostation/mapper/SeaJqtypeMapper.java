package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaJqtype;
import java.util.List;

public interface SeaJqtypeMapper {
    int deleteByPrimaryKey(Short tid);

    int insert(SeaJqtype record);

    SeaJqtype selectByPrimaryKey(Short tid);

    List<SeaJqtype> selectAll();

    int updateByPrimaryKey(SeaJqtype record);
}