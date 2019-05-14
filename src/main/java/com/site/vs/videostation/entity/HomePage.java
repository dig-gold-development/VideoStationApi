package com.site.vs.videostation.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class HomePage implements Serializable {
   private List<SeaData> slide_list;
   private DataList move_list;
   private DataList tv_list;
   private DataList arts_list;
   private DataList comic_list;
   private DataList korean_list;


}
