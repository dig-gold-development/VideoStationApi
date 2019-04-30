package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaMember;
import java.util.List;

public interface SeaMemberMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaMember record);

    SeaMember selectByPrimaryKey(Integer id);

    List<SeaMember> selectAll();

    int updateByPrimaryKey(SeaMember record);
}