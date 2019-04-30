package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaSearchKeywords implements Serializable {
    private Integer aid;

    private String keyword;

    private String spwords;

    private Integer count;

    private Integer result;

    private Integer lasttime;

    private Short tid;

    private static final long serialVersionUID = 1L;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getSpwords() {
        return spwords;
    }

    public void setSpwords(String spwords) {
        this.spwords = spwords == null ? null : spwords.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getLasttime() {
        return lasttime;
    }

    public void setLasttime(Integer lasttime) {
        this.lasttime = lasttime;
    }

    public Short getTid() {
        return tid;
    }

    public void setTid(Short tid) {
        this.tid = tid;
    }
}