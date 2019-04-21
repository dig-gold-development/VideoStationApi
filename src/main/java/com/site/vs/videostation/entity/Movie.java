package com.site.vs.videostation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Movie {

    @JsonProperty("play_name")
    private  String playName;
    @JsonProperty("play_url")
    private  String playUrl;
    private  String source;
    @JsonProperty("is_real_url")
    private  int isRealUrl;
}
