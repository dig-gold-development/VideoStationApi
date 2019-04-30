package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaMyad implements Serializable {
    private Integer aid;

    private String adname;

    private String adenname;

    private Integer timeset;

    private String intro;

    private String adsbody;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAdname() {
        return adname;
    }

    public void setAdname(String adname) {
        this.adname = adname == null ? null : adname.trim();
    }

    public String getAdenname() {
        return adenname;
    }

    public void setAdenname(String adenname) {
        this.adenname = adenname == null ? null : adenname.trim();
    }

    public Integer getTimeset() {
        return timeset;
    }

    public void setTimeset(Integer timeset) {
        this.timeset = timeset;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public String getAdsbody() {
        return adsbody;
    }

    public void setAdsbody(String adsbody) {
        this.adsbody = adsbody == null ? null : adsbody.trim();
    }
}