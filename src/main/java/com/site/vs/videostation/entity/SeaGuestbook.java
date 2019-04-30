package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaGuestbook implements Serializable {
    private Integer id;

    private Integer uid;

    private String title;

    private Integer mid;

    private Integer posttime;

    private String uname;

    private String ip;

    private Integer dtime;

    private Short ischeck;

    private String msg;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getPosttime() {
        return posttime;
    }

    public void setPosttime(Integer posttime) {
        this.posttime = posttime;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname == null ? null : uname.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getDtime() {
        return dtime;
    }

    public void setDtime(Integer dtime) {
        this.dtime = dtime;
    }

    public Short getIscheck() {
        return ischeck;
    }

    public void setIscheck(Short ischeck) {
        this.ischeck = ischeck;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}