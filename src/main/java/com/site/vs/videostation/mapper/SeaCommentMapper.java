package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaComment;
import java.util.List;

public interface SeaCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaComment record);

    SeaComment selectByPrimaryKey(Integer id);

    List<SeaComment> selectAll();

    int updateByPrimaryKey(SeaComment record);
}