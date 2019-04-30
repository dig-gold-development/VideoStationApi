package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaCoNews implements Serializable {
    private Integer nId;

    private Short tid;

    private String nTitle;

    private String nKeyword;

    private String nPic;

    private Integer nHit;

    private String nAuthor;

    private Integer nAddtime;

    private String nLetter;

    private String nOutline;

    private String tname;

    private String nFrom;

    private String nInbase;

    private String nEntitle;

    private String nContent;

    private static final long serialVersionUID = 1L;

    public Integer getnId() {
        return nId;
    }

    public void setnId(Integer nId) {
        this.nId = nId;
    }

    public Short getTid() {
        return tid;
    }

    public void setTid(Short tid) {
        this.tid = tid;
    }

    public String getnTitle() {
        return nTitle;
    }

    public void setnTitle(String nTitle) {
        this.nTitle = nTitle == null ? null : nTitle.trim();
    }

    public String getnKeyword() {
        return nKeyword;
    }

    public void setnKeyword(String nKeyword) {
        this.nKeyword = nKeyword == null ? null : nKeyword.trim();
    }

    public String getnPic() {
        return nPic;
    }

    public void setnPic(String nPic) {
        this.nPic = nPic == null ? null : nPic.trim();
    }

    public Integer getnHit() {
        return nHit;
    }

    public void setnHit(Integer nHit) {
        this.nHit = nHit;
    }

    public String getnAuthor() {
        return nAuthor;
    }

    public void setnAuthor(String nAuthor) {
        this.nAuthor = nAuthor == null ? null : nAuthor.trim();
    }

    public Integer getnAddtime() {
        return nAddtime;
    }

    public void setnAddtime(Integer nAddtime) {
        this.nAddtime = nAddtime;
    }

    public String getnLetter() {
        return nLetter;
    }

    public void setnLetter(String nLetter) {
        this.nLetter = nLetter == null ? null : nLetter.trim();
    }

    public String getnOutline() {
        return nOutline;
    }

    public void setnOutline(String nOutline) {
        this.nOutline = nOutline == null ? null : nOutline.trim();
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getnFrom() {
        return nFrom;
    }

    public void setnFrom(String nFrom) {
        this.nFrom = nFrom == null ? null : nFrom.trim();
    }

    public String getnInbase() {
        return nInbase;
    }

    public void setnInbase(String nInbase) {
        this.nInbase = nInbase == null ? null : nInbase.trim();
    }

    public String getnEntitle() {
        return nEntitle;
    }

    public void setnEntitle(String nEntitle) {
        this.nEntitle = nEntitle == null ? null : nEntitle.trim();
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }
}