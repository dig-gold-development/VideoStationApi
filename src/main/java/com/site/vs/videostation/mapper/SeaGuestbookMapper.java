package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.SeaGuestbook;
import java.util.List;

public interface SeaGuestbookMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SeaGuestbook record);

    SeaGuestbook selectByPrimaryKey(Integer id);

    List<SeaGuestbook> selectAll();

    int updateByPrimaryKey(SeaGuestbook record);
}