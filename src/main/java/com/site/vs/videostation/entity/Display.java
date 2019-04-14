package com.site.vs.videostation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Display {

    @JsonProperty("id")
    private  int v_id;
    @JsonProperty("name")
    private  String v_name;
    @JsonProperty("pic")
    private  String v_pic;

}
