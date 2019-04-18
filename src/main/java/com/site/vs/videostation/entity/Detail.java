package com.site.vs.videostation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Detail {

    @JsonProperty("id")
    private  int v_id;
    @JsonProperty("name")
    private  String v_name;
    @JsonProperty("pic")
    private  String v_pic;
    @JsonProperty("actor")
    private  String v_actor;
    @JsonProperty("year")
    private  String v_publishyear;
    @JsonProperty("area")
    private  String v_publisharea;
    @JsonProperty("time")
    private  int v_addtime;
    @JsonProperty("director")
    private  String v_director;
    @JsonProperty("enname")
    private  String venname;
    @JsonProperty("vod_url_list")
    private  String body;

}
