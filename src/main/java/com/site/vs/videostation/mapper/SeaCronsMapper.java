package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCrons;
import java.util.List;

public interface SeaCronsMapper {
    int deleteByPrimaryKey(Short cronid);

    int insert(SeaCrons record);

    SeaCrons selectByPrimaryKey(Short cronid);

    List<SeaCrons> selectAll();

    int updateByPrimaryKey(SeaCrons record);
}