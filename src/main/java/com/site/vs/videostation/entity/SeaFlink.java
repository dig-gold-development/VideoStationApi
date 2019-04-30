package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaFlink implements Serializable {
    private Short id;

    private Short sortrank;

    private String url;

    private String webname;

    private String msg;

    private String email;

    private String logo;

    private Integer dtime;

    private Short ischeck;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getSortrank() {
        return sortrank;
    }

    public void setSortrank(Short sortrank) {
        this.sortrank = sortrank;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getWebname() {
        return webname;
    }

    public void setWebname(String webname) {
        this.webname = webname == null ? null : webname.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
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
}