package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.Category;
import com.site.vs.videostation.entity.SeaData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SearchMapper {
     List<SeaData>  getAll();

     List<SeaData> getByTid(int tid);

     List<SeaData> getByName(String name);

     List<SeaData> getByTidAndTName(@Param("id") int tid, @Param("name")String name);
     List<SeaData> getByTidsAndTName(@Param("list") List<Short> idList, @Param("name")String name);


}
