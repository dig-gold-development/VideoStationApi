package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaMemberGroup implements Serializable {
    private Integer gid;

    private String gname;

    private String gtype;

    private String gAuth;

    private Integer gUpgrade;

    private Integer gAuthvalue;

    private static final long serialVersionUID = 1L;

    public Integer getGid() {
        return gid;
    }

    public void setGid(Integer gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname == null ? null : gname.trim();
    }

    public String getGtype() {
        return gtype;
    }

    public void setGtype(String gtype) {
        this.gtype = gtype == null ? null : gtype.trim();
    }

    public String getgAuth() {
        return gAuth;
    }

    public void setgAuth(String gAuth) {
        this.gAuth = gAuth == null ? null : gAuth.trim();
    }

    public Integer getgUpgrade() {
        return gUpgrade;
    }

    public void setgUpgrade(Integer gUpgrade) {
        this.gUpgrade = gUpgrade;
    }

    public Integer getgAuthvalue() {
        return gAuthvalue;
    }

    public void setgAuthvalue(Integer gAuthvalue) {
        this.gAuthvalue = gAuthvalue;
    }
}