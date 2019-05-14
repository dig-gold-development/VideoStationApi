package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.Category;
import com.site.vs.videostation.entity.SeaData;

import java.util.List;

public interface SearchMapper {
     List<SeaData>  getAll();

     SeaData getByTid(int tid);

     SeaData getByName(String name);
}
