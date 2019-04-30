package com.site.vs.videostation.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

public class SeaData implements Serializable {
    private Integer vId;

    private Short tid;

    private String vName;

    private Integer vState;

    private String vPic;

    private String vSpic;

    private String vGpic;

    private Integer vHit;

    private Short vMoney;

    private Short vRank;

    private Short vDigg;

    private Short vTread;

    private Short vCommend;

    private Short vWrong;

    private Short vIsmake;

    private String vActor;

    private String vColor;

    private Integer vPublishyear;

    private String vPublisharea;

    private Integer vAddtime;

    private Integer vTopic;

    private String vNote;

    private String vTags;

    private String vLetter;

    private Short vIsunion;

    private Short vRecycled;

    private String vDirector;

    private String vEnname;

    private String vLang;

    private Integer vScore;

    private Integer vScorenum;

    private String vNickname;

    private String vReweek;

    private Float vDouban;

    private Float vMtime;

    private Float vImdb;

    private String vTvs;

    private String vCompany;

    private Integer vDayhit;

    private Integer vWeekhit;

    private Integer vMonthhit;

    private Integer vDaytime;

    private Integer vWeektime;

    private Integer vMonthtime;

    private String vLen;

    private String vTotal;

    private String vVer;

    private String vPsd;

    private String vExtratype;

    private String vJq;

    private String vLongtxt;

    private String tName;

    private String body;

    private String content;

    private List<Source> list;

    public List<Source> getList() {
        return list;
    }

    public void setList(List<Source> list) {
        this.list = list;
    }

    private static final long serialVersionUID = 1L;

    @JsonProperty("id")
    public Integer getvId() {
        return vId;
    }

    public void setvId(Integer vId) {
        this.vId = vId;
    }

    public Short getTid() {
        return tid;
    }

    public void setTid(Short tid) {
        this.tid = tid;
    }

    @JsonProperty("name")
    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    @JsonIgnore
    public Integer getvState() {
        return vState;
    }

    public void setvState(Integer vState) {
        this.vState = vState;
    }

    @JsonProperty("pic")
    public String getvPic() {
        return vPic;
    }

    public void setvPic(String vPic) {
        this.vPic = vPic == null ? null : vPic.trim();
    }

    @JsonIgnore
    public String getvSpic() {
        return vSpic;
    }

    public void setvSpic(String vSpic) {
        this.vSpic = vSpic == null ? null : vSpic.trim();
    }

    @JsonIgnore
    public String getvGpic() {
        return vGpic;
    }

    public void setvGpic(String vGpic) {
        this.vGpic = vGpic == null ? null : vGpic.trim();
    }

    @JsonIgnore
    public Integer getvHit() {
        return vHit;
    }

    public void setvHit(Integer vHit) {
        this.vHit = vHit;
    }

    @JsonIgnore
    public Short getvMoney() {
        return vMoney;
    }

    public void setvMoney(Short vMoney) {
        this.vMoney = vMoney;
    }

    @JsonIgnore
    public Short getvRank() {
        return vRank;
    }

    public void setvRank(Short vRank) {
        this.vRank = vRank;
    }

    @JsonIgnore
    public Short getvDigg() {
        return vDigg;
    }

    public void setvDigg(Short vDigg) {
        this.vDigg = vDigg;
    }

    @JsonIgnore
    public Short getvTread() {
        return vTread;
    }

    public void setvTread(Short vTread) {
        this.vTread = vTread;
    }

    @JsonIgnore
    public Short getvCommend() {
        return vCommend;
    }

    public void setvCommend(Short vCommend) {
        this.vCommend = vCommend;
    }

    @JsonIgnore
    public Short getvWrong() {
        return vWrong;
    }

    public void setvWrong(Short vWrong) {
        this.vWrong = vWrong;
    }

    @JsonIgnore
    public Short getvIsmake() {
        return vIsmake;
    }

    public void setvIsmake(Short vIsmake) {
        this.vIsmake = vIsmake;
    }

    @JsonIgnore
    public String getvActor() {
        return vActor;
    }

    public void setvActor(String vActor) {
        this.vActor = vActor == null ? null : vActor.trim();
    }

    @JsonIgnore
    public String getvColor() {
        return vColor;
    }

    public void setvColor(String vColor) {
        this.vColor = vColor == null ? null : vColor.trim();
    }

    @JsonProperty("year")
    public Integer getvPublishyear() {
        return vPublishyear;
    }

    public void setvPublishyear(Integer vPublishyear) {
        this.vPublishyear = vPublishyear;
    }

    @JsonProperty("area")
    public String getvPublisharea() {
        return vPublisharea;
    }

    public void setvPublisharea(String vPublisharea) {
        this.vPublisharea = vPublisharea == null ? null : vPublisharea.trim();
    }

    @JsonProperty("time")
    public Integer getvAddtime() {
        return vAddtime;
    }

    public void setvAddtime(Integer vAddtime) {
        this.vAddtime = vAddtime;
    }

    @JsonIgnore
    public Integer getvTopic() {
        return vTopic;
    }

    public void setvTopic(Integer vTopic) {
        this.vTopic = vTopic;
    }

    @JsonIgnore
    public String getvNote() {
        return vNote;
    }

    public void setvNote(String vNote) {
        this.vNote = vNote == null ? null : vNote.trim();
    }

    @JsonIgnore
    public String getvTags() {
        return vTags;
    }

    public void setvTags(String vTags) {
        this.vTags = vTags == null ? null : vTags.trim();
    }

    @JsonIgnore
    public String getvLetter() {
        return vLetter;
    }

    public void setvLetter(String vLetter) {
        this.vLetter = vLetter == null ? null : vLetter.trim();
    }

    @JsonIgnore
    public Short getvIsunion() {
        return vIsunion;
    }

    public void setvIsunion(Short vIsunion) {
        this.vIsunion = vIsunion;
    }

    @JsonIgnore
    public Short getvRecycled() {
        return vRecycled;
    }

    public void setvRecycled(Short vRecycled) {
        this.vRecycled = vRecycled;
    }

    @JsonProperty("director")
    public String getvDirector() {
        return vDirector;
    }

    public void setvDirector(String vDirector) {
        this.vDirector = vDirector == null ? null : vDirector.trim();
    }

    @JsonProperty("enname")
    public String getvEnname() {
        return vEnname;
    }

    public void setvEnname(String vEnname) {
        this.vEnname = vEnname == null ? null : vEnname.trim();
    }

    @JsonIgnore
    public String getvLang() {
        return vLang;
    }

    public void setvLang(String vLang) {
        this.vLang = vLang == null ? null : vLang.trim();
    }

    @JsonIgnore
    public Integer getvScore() {
        return vScore;
    }

    public void setvScore(Integer vScore) {
        this.vScore = vScore;
    }

    @JsonIgnore
    public Integer getvScorenum() {
        return vScorenum;
    }

    public void setvScorenum(Integer vScorenum) {
        this.vScorenum = vScorenum;
    }

    @JsonIgnore
    public String getvNickname() {
        return vNickname;
    }

    public void setvNickname(String vNickname) {
        this.vNickname = vNickname == null ? null : vNickname.trim();
    }

    @JsonIgnore
    public String getvReweek() {
        return vReweek;
    }

    public void setvReweek(String vReweek) {
        this.vReweek = vReweek == null ? null : vReweek.trim();
    }

    @JsonIgnore
    public Float getvDouban() {
        return vDouban;
    }

    public void setvDouban(Float vDouban) {
        this.vDouban = vDouban;
    }

    @JsonIgnore
    public Float getvMtime() {
        return vMtime;
    }

    public void setvMtime(Float vMtime) {
        this.vMtime = vMtime;
    }

    @JsonIgnore
    public Float getvImdb() {
        return vImdb;
    }

    public void setvImdb(Float vImdb) {
        this.vImdb = vImdb;
    }

    @JsonIgnore
    public String getvTvs() {
        return vTvs;
    }

    public void setvTvs(String vTvs) {
        this.vTvs = vTvs == null ? null : vTvs.trim();
    }

    @JsonIgnore
    public String getvCompany() {
        return vCompany;
    }

    public void setvCompany(String vCompany) {
        this.vCompany = vCompany == null ? null : vCompany.trim();
    }

    @JsonIgnore
    public Integer getvDayhit() {
        return vDayhit;
    }

    public void setvDayhit(Integer vDayhit) {
        this.vDayhit = vDayhit;
    }

    @JsonIgnore
    public Integer getvWeekhit() {
        return vWeekhit;
    }

    public void setvWeekhit(Integer vWeekhit) {
        this.vWeekhit = vWeekhit;
    }

    @JsonIgnore
    public Integer getvMonthhit() {
        return vMonthhit;
    }

    public void setvMonthhit(Integer vMonthhit) {
        this.vMonthhit = vMonthhit;
    }

    @JsonIgnore
    public Integer getvDaytime() {
        return vDaytime;
    }

    public void setvDaytime(Integer vDaytime) {
        this.vDaytime = vDaytime;
    }

    @JsonIgnore
    public Integer getvWeektime() {
        return vWeektime;
    }

    public void setvWeektime(Integer vWeektime) {
        this.vWeektime = vWeektime;
    }

    @JsonIgnore
    public Integer getvMonthtime() {
        return vMonthtime;
    }

    public void setvMonthtime(Integer vMonthtime) {
        this.vMonthtime = vMonthtime;
    }

    @JsonIgnore
    public String getvLen() {
        return vLen;
    }

    public void setvLen(String vLen) {
        this.vLen = vLen == null ? null : vLen.trim();
    }

    @JsonIgnore
    public String getvTotal() {
        return vTotal;
    }

    public void setvTotal(String vTotal) {
        this.vTotal = vTotal == null ? null : vTotal.trim();
    }

    @JsonIgnore
    public String getvVer() {
        return vVer;
    }

    public void setvVer(String vVer) {
        this.vVer = vVer == null ? null : vVer.trim();
    }

    @JsonIgnore
    public String getvPsd() {
        return vPsd;
    }

    public void setvPsd(String vPsd) {
        this.vPsd = vPsd == null ? null : vPsd.trim();
    }

    @JsonIgnore
    public String getvExtratype() {
        return vExtratype;
    }

    public void setvExtratype(String vExtratype) {
        this.vExtratype = vExtratype == null ? null : vExtratype.trim();
    }

    @JsonIgnore
    public String getvJq() {
        return vJq;
    }

    public void setvJq(String vJq) {
        this.vJq = vJq == null ? null : vJq.trim();
    }

    @JsonIgnore
    public String getvLongtxt() {
        return vLongtxt;
    }

    public void setvLongtxt(String vLongtxt) {
        this.vLongtxt = vLongtxt == null ? null : vLongtxt.trim();
    }



    @JsonProperty("tname")
    public String gettName() { return tName; }

    public void settName(String tName) {
        this.tName = tName == null ? null : tName.trim();
    }

    @JsonIgnore
    public String getBody() { return body; }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    @JsonProperty("description")
    public String getContent() { return content; }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }


}