package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaFavorite implements Serializable {
    private Integer id;

    private Integer uid;

    private Integer vid;

    private Integer kptime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public Integer getKptime() {
        return kptime;
    }

    public void setKptime(Integer kptime) {
        this.kptime = kptime;
    }
}