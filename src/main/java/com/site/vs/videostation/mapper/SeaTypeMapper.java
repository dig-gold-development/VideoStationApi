package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SeaTypeMapper {
    int deleteByPrimaryKey(Short tid);

    int insert(SeaType record);

    SeaType selectByPrimaryKey(Short tid);

    List<SeaType> selectAll();

    int updateByPrimaryKey(SeaType record);

    List<SeaType>  getAll( int categoryId);

    SeaType  getTypeInfoByTypeId(int id);


}