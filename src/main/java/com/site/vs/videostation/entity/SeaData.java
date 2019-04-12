package com.site.vs.videostation.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class SeaData {

    @Id
    private int tid;
    private String v_name;
    private String v_state;
    private String v_pic;
    private String v_actor;
    private String v_publishyear;
    private String v_publisharea;
    private String v_addtime;
    private String v_director;


}
