package com.site.vs.videostation.entity;


import lombok.Data;

import java.util.List;

@Data
public class Source {
    private String sourceName;
    private List<Movie> movieList;
}
