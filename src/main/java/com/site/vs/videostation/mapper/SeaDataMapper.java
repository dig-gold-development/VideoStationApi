package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaData;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeaDataMapper {
    int deleteByPrimaryKey(Integer vId);

    int insert(SeaData record);

    SeaData selectByPrimaryKey(Integer vId);

    List<SeaData> selectAll();

    int updateByPrimaryKey(SeaData record);

    SeaData findDetialById(int id);
    List<SeaData> findSeaDataByTypeId(int id);
    List<SeaData> findSeaDataByFilterId(@Param("id") int id,@Param("year") Integer year,@Param("area") String area);
    List<SeaData> findSeaDataRecent();
    List<SeaData> findSeaDataByTypeIds(@Param("list") List<Short> idList);
    List<SeaData> findSeaDataByFilterIds(@Param("list") List<Short> idList,@Param("year") Integer year,@Param("area") String area);


}