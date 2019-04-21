package com.site.vs.videostation.entity;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Source {
    private String sourceName;

    @JsonProperty("list")
    private List<Movie> movieList;
}
