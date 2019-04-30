package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaJqtype implements Serializable {
    private Short tid;

    private String tname;

    private Short ishidden;

    private static final long serialVersionUID = 1L;

    public Short getTid() {
        return tid;
    }

    public void setTid(Short tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public Short getIshidden() {
        return ishidden;
    }

    public void setIshidden(Short ishidden) {
        this.ishidden = ishidden;
    }
}