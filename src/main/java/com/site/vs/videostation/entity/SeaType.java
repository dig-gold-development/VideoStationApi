package com.site.vs.videostation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SeaType {
    private String tname;
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int tid;
    private int upid;
}
