package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.Display;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface DisplayMapper {
    List<Display> findDisplayDataByTypeId(int id);
    List<Display> findDisplayDataRecent();
    List<Display> findDisplayDataByTypeIds(@Param("list") List<Integer> idList);

}
