package com.site.vs.videostation.mapper;

import com.site.vs.videostation.entity.Category;



import java.util.List;

public interface CategoryMapper {
     List<Category>  getAll( int categoryId);

}
