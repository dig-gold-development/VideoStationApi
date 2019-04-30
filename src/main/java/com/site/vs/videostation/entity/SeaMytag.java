package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaMytag implements Serializable {
    private Integer aid;

    private String tagname;

    private String tagdes;

    private Integer addtime;

    private String tagcontent;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname == null ? null : tagname.trim();
    }

    public String getTagdes() {
        return tagdes;
    }

    public void setTagdes(String tagdes) {
        this.tagdes = tagdes == null ? null : tagdes.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public String getTagcontent() {
        return tagcontent;
    }

    public void setTagcontent(String tagcontent) {
        this.tagcontent = tagcontent == null ? null : tagcontent.trim();
    }
}