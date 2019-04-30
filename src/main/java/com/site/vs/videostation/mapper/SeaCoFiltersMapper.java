package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaCoFilters;
import java.util.List;

public interface SeaCoFiltersMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaCoFilters record);

    SeaCoFilters selectByPrimaryKey(Integer id);

    List<SeaCoFilters> selectAll();

    int updateByPrimaryKey(SeaCoFilters record);
}