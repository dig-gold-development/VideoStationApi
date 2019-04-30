package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaErradd;
import java.util.List;

public interface SeaErraddMapper {
    int insert(SeaErradd record);

    List<SeaErradd> selectAll();
}