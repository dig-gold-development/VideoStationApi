package com.site.vs.videostation.dao;


import com.site.vs.videostation.entity.VideoUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.mybatis.spring.annotation.MapperScan;


public interface VideoUserDao {
	
	@Select("select * from video_user where name = #{name}")
	public VideoUser getById(@Param("name") long id);


}
