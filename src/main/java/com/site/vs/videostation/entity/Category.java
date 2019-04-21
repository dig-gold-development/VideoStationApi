package com.site.vs.videostation.entity;

import lombok.Data;

import java.util.List;

@Data
public class Category {
    private int tid;
    private int upid;
    private String tname;
    private int count;
    private List<Category> categoryList;
}
