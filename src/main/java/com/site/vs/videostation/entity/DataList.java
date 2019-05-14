package com.site.vs.videostation.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DataList implements Serializable {
    private List<SeaData> data;
    private String title;

}
