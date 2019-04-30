package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaZyk implements Serializable {
    private Integer zid;

    private String zname;

    private String zapi;

    private String zinfo;

    private static final long serialVersionUID = 1L;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public String getZname() {
        return zname;
    }

    public void setZname(String zname) {
        this.zname = zname == null ? null : zname.trim();
    }

    public String getZapi() {
        return zapi;
    }

    public void setZapi(String zapi) {
        this.zapi = zapi == null ? null : zapi.trim();
    }

    public String getZinfo() {
        return zinfo;
    }

    public void setZinfo(String zinfo) {
        this.zinfo = zinfo == null ? null : zinfo.trim();
    }
}