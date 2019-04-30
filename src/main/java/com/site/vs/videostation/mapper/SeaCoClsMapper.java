package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCoCls;
import java.util.List;

public interface SeaCoClsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaCoCls record);

    SeaCoCls selectByPrimaryKey(Integer id);

    List<SeaCoCls> selectAll();

    int updateByPrimaryKey(SeaCoCls record);
}