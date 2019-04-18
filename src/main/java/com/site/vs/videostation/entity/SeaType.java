package com.site.vs.videostation.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SeaType {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int tid;
    private int upid;
    private String tname;


}
