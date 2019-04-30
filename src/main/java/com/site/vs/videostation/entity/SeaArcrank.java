package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaArcrank implements Serializable {
    private Short id;

    private Short rank;

    private String membername;

    private Short adminrank;

    private Short money;

    private Integer scores;

    private String purviews;

    private static final long serialVersionUID = 1L;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Short getRank() {
        return rank;
    }

    public void setRank(Short rank) {
        this.rank = rank;
    }

    public String getMembername() {
        return membername;
    }

    public void setMembername(String membername) {
        this.membername = membername == null ? null : membername.trim();
    }

    public Short getAdminrank() {
        return adminrank;
    }

    public void setAdminrank(Short adminrank) {
        this.adminrank = adminrank;
    }

    public Short getMoney() {
        return money;
    }

    public void setMoney(Short money) {
        this.money = money;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public String getPurviews() {
        return purviews;
    }

    public void setPurviews(String purviews) {
        this.purviews = purviews == null ? null : purviews.trim();
    }
}