package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaMytag;
import java.util.List;

public interface SeaMytagMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(SeaMytag record);

    SeaMytag selectByPrimaryKey(Integer aid);

    List<SeaMytag> selectAll();

    int updateByPrimaryKey(SeaMytag record);
}