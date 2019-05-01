package com.site.vs.videostation.entity;

import java.io.Serializable;
import java.util.List;

public class SeaType implements Serializable {
    private Short tid;

    private Byte upid;

    private String tname;

    private String tenname;

    private Integer torder;

    private String templist;

    private String templist1;

    private String templist2;

    private String title;

    private String keyword;

    private String description;

    private Short ishidden;

    private Short tptype;

    private String unionid;

    private List<SeaType> categoryList;

    public List<SeaType> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<SeaType> categoryList) {
        this.categoryList = categoryList;
    }

    private static final long serialVersionUID = 1L;

    public Short getTid() {
        return tid;
    }

    public void setTid(Short tid) {
        this.tid = tid;
    }

    public Byte getUpid() {
        return upid;
    }

    public void setUpid(Byte upid) {
        this.upid = upid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTenname() {
        return tenname;
    }

    public void setTenname(String tenname) {
        this.tenname = tenname == null ? null : tenname.trim();
    }

    public Integer getTorder() {
        return torder;
    }

    public void setTorder(Integer torder) {
        this.torder = torder;
    }

    public String getTemplist() {
        return templist;
    }

    public void setTemplist(String templist) {
        this.templist = templist == null ? null : templist.trim();
    }

    public String getTemplist1() {
        return templist1;
    }

    public void setTemplist1(String templist1) {
        this.templist1 = templist1 == null ? null : templist1.trim();
    }

    public String getTemplist2() {
        return templist2;
    }

    public void setTemplist2(String templist2) {
        this.templist2 = templist2 == null ? null : templist2.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Short getIshidden() {
        return ishidden;
    }

    public void setIshidden(Short ishidden) {
        this.ishidden = ishidden;
    }

    public Short getTptype() {
        return tptype;
    }

    public void setTptype(Short tptype) {
        this.tptype = tptype;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid == null ? null : unionid.trim();
    }
}