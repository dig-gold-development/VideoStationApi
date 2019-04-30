package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaFavorite;
import java.util.List;

public interface SeaFavoriteMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaFavorite record);

    SeaFavorite selectByPrimaryKey(Integer id);

    List<SeaFavorite> selectAll();

    int updateByPrimaryKey(SeaFavorite record);
}