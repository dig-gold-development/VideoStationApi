package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCck;
import java.util.List;

public interface SeaCckMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaCck record);

    SeaCck selectByPrimaryKey(Integer id);

    List<SeaCck> selectAll();

    int updateByPrimaryKey(SeaCck record);
}