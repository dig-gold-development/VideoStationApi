package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaCoConfig implements Serializable {
    private Integer cid;

    private String cname;

    private Integer getlistnum;

    private Integer getconnum;

    private Byte cotype;

    private static final long serialVersionUID = 1L;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname == null ? null : cname.trim();
    }

    public Integer getGetlistnum() {
        return getlistnum;
    }

    public void setGetlistnum(Integer getlistnum) {
        this.getlistnum = getlistnum;
    }

    public Integer getGetconnum() {
        return getconnum;
    }

    public void setGetconnum(Integer getconnum) {
        this.getconnum = getconnum;
    }

    public Byte getCotype() {
        return cotype;
    }

    public void setCotype(Byte cotype) {
        this.cotype = cotype;
    }
}