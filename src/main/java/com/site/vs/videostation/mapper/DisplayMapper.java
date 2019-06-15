package com.site.vs.videostation.mapper;

import com.site.vs.videostation.dto.DisplayDTO;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface DisplayMapper {
    List<DisplayDTO> findDisplayDataByTypeId(int id);
    List<DisplayDTO> findDisplayDataRecent();
    List<DisplayDTO> findDisplayDataByTypeIds(@Param("list") List<Integer> idList);

}
