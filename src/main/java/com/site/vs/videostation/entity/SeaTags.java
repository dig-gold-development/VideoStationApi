package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaTags implements Serializable {
    private Integer tagid;

    private String tag;

    private Integer usenum;

    private String vids;

    private static final long serialVersionUID = 1L;

    public Integer getTagid() {
        return tagid;
    }

    public void setTagid(Integer tagid) {
        this.tagid = tagid;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    public Integer getUsenum() {
        return usenum;
    }

    public void setUsenum(Integer usenum) {
        this.usenum = usenum;
    }

    public String getVids() {
        return vids;
    }

    public void setVids(String vids) {
        this.vids = vids == null ? null : vids.trim();
    }
}