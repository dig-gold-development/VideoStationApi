package com.site.vs.videostation.entity;

import lombok.Data;

import java.util.List;

@Data
public class HomePage {
   private List<Display> slide_list;
   private DataList move_list;
   private DataList tv_list;
   private DataList arts_list;
   private DataList comic_list;
   private DataList korean_list;


}
