package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaBuy;
import java.util.List;

public interface SeaBuyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaBuy record);

    SeaBuy selectByPrimaryKey(Integer id);

    List<SeaBuy> selectAll();

    int updateByPrimaryKey(SeaBuy record);
}