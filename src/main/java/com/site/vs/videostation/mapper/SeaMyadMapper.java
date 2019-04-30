package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaMyad;
import java.util.List;

public interface SeaMyadMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(SeaMyad record);

    SeaMyad selectByPrimaryKey(Integer aid);

    List<SeaMyad> selectAll();

    int updateByPrimaryKey(SeaMyad record);
}