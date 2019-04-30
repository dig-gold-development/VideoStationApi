package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaErradd implements Serializable {
    private Integer id;

    private Integer vid;

    private String author;

    private String ip;

    private Integer sendtime;

    private String errtxt;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVid() {
        return vid;
    }

    public void setVid(Integer vid) {
        this.vid = vid;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getSendtime() {
        return sendtime;
    }

    public void setSendtime(Integer sendtime) {
        this.sendtime = sendtime;
    }

    public String getErrtxt() {
        return errtxt;
    }

    public void setErrtxt(String errtxt) {
        this.errtxt = errtxt == null ? null : errtxt.trim();
    }
}