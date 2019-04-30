package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaCoUrl implements Serializable {
    private Integer uid;

    private Short cid;

    private Short tid;

    private String url;

    private String pic;

    private String succ;

    private Integer err;

    private Byte cotype;

    private static final long serialVersionUID = 1L;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Short getCid() {
        return cid;
    }

    public void setCid(Short cid) {
        this.cid = cid;
    }

    public Short getTid() {
        return tid;
    }

    public void setTid(Short tid) {
        this.tid = tid;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getSucc() {
        return succ;
    }

    public void setSucc(String succ) {
        this.succ = succ == null ? null : succ.trim();
    }

    public Integer getErr() {
        return err;
    }

    public void setErr(Integer err) {
        this.err = err;
    }

    public Byte getCotype() {
        return cotype;
    }

    public void setCotype(Byte cotype) {
        this.cotype = cotype;
    }
}