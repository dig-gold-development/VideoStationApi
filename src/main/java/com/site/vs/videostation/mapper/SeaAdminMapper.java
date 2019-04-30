package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaAdmin;
import java.util.List;

public interface SeaAdminMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaAdmin record);

    SeaAdmin selectByPrimaryKey(Integer id);

    List<SeaAdmin> selectAll();

    int updateByPrimaryKey(SeaAdmin record);
}