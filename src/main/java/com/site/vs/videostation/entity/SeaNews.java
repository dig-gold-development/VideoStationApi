package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaNews implements Serializable {
    private Integer nId;

    private Short tid;

    private String nTitle;

    private String nPic;

    private Integer nHit;

    private Short nMoney;

    private Short nRank;

    private Short nDigg;

    private Short nTread;

    private Short nCommend;

    private String nAuthor;

    private String nColor;

    private Integer nAddtime;

    private Short nNote;

    private String nLetter;

    private Short nIsunion;

    private Short nRecycled;

    private String nEntitle;

    private String nOutline;

    private String nKeyword;

    private String nFrom;

    private Long nScore;

    private Integer nScorenum;

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

    public Short getnMoney() {
        return nMoney;
    }

    public void setnMoney(Short nMoney) {
        this.nMoney = nMoney;
    }

    public Short getnRank() {
        return nRank;
    }

    public void setnRank(Short nRank) {
        this.nRank = nRank;
    }

    public Short getnDigg() {
        return nDigg;
    }

    public void setnDigg(Short nDigg) {
        this.nDigg = nDigg;
    }

    public Short getnTread() {
        return nTread;
    }

    public void setnTread(Short nTread) {
        this.nTread = nTread;
    }

    public Short getnCommend() {
        return nCommend;
    }

    public void setnCommend(Short nCommend) {
        this.nCommend = nCommend;
    }

    public String getnAuthor() {
        return nAuthor;
    }

    public void setnAuthor(String nAuthor) {
        this.nAuthor = nAuthor == null ? null : nAuthor.trim();
    }

    public String getnColor() {
        return nColor;
    }

    public void setnColor(String nColor) {
        this.nColor = nColor == null ? null : nColor.trim();
    }

    public Integer getnAddtime() {
        return nAddtime;
    }

    public void setnAddtime(Integer nAddtime) {
        this.nAddtime = nAddtime;
    }

    public Short getnNote() {
        return nNote;
    }

    public void setnNote(Short nNote) {
        this.nNote = nNote;
    }

    public String getnLetter() {
        return nLetter;
    }

    public void setnLetter(String nLetter) {
        this.nLetter = nLetter == null ? null : nLetter.trim();
    }

    public Short getnIsunion() {
        return nIsunion;
    }

    public void setnIsunion(Short nIsunion) {
        this.nIsunion = nIsunion;
    }

    public Short getnRecycled() {
        return nRecycled;
    }

    public void setnRecycled(Short nRecycled) {
        this.nRecycled = nRecycled;
    }

    public String getnEntitle() {
        return nEntitle;
    }

    public void setnEntitle(String nEntitle) {
        this.nEntitle = nEntitle == null ? null : nEntitle.trim();
    }

    public String getnOutline() {
        return nOutline;
    }

    public void setnOutline(String nOutline) {
        this.nOutline = nOutline == null ? null : nOutline.trim();
    }

    public String getnKeyword() {
        return nKeyword;
    }

    public void setnKeyword(String nKeyword) {
        this.nKeyword = nKeyword == null ? null : nKeyword.trim();
    }

    public String getnFrom() {
        return nFrom;
    }

    public void setnFrom(String nFrom) {
        this.nFrom = nFrom == null ? null : nFrom.trim();
    }

    public Long getnScore() {
        return nScore;
    }

    public void setnScore(Long nScore) {
        this.nScore = nScore;
    }

    public Integer getnScorenum() {
        return nScorenum;
    }

    public void setnScorenum(Integer nScorenum) {
        this.nScorenum = nScorenum;
    }

    public String getnContent() {
        return nContent;
    }

    public void setnContent(String nContent) {
        this.nContent = nContent == null ? null : nContent.trim();
    }
}