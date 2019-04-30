package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaTemp implements Serializable {
    private Integer vId;

    private Short tid;

    private String vName;

    private Integer vState;

    private String vPic;

    private String vActor;

    private String vPublishyear;

    private String vPublisharea;

    private Integer vAddtime;

    private String vNote;

    private String vLetter;

    private String vDirector;

    private String vEnname;

    private String vLang;

    private String vPlaydata;

    private String vDes;

    private static final long serialVersionUID = 1L;

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

    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName == null ? null : vName.trim();
    }

    public Integer getvState() {
        return vState;
    }

    public void setvState(Integer vState) {
        this.vState = vState;
    }

    public String getvPic() {
        return vPic;
    }

    public void setvPic(String vPic) {
        this.vPic = vPic == null ? null : vPic.trim();
    }

    public String getvActor() {
        return vActor;
    }

    public void setvActor(String vActor) {
        this.vActor = vActor == null ? null : vActor.trim();
    }

    public String getvPublishyear() {
        return vPublishyear;
    }

    public void setvPublishyear(String vPublishyear) {
        this.vPublishyear = vPublishyear == null ? null : vPublishyear.trim();
    }

    public String getvPublisharea() {
        return vPublisharea;
    }

    public void setvPublisharea(String vPublisharea) {
        this.vPublisharea = vPublisharea == null ? null : vPublisharea.trim();
    }

    public Integer getvAddtime() {
        return vAddtime;
    }

    public void setvAddtime(Integer vAddtime) {
        this.vAddtime = vAddtime;
    }

    public String getvNote() {
        return vNote;
    }

    public void setvNote(String vNote) {
        this.vNote = vNote == null ? null : vNote.trim();
    }

    public String getvLetter() {
        return vLetter;
    }

    public void setvLetter(String vLetter) {
        this.vLetter = vLetter == null ? null : vLetter.trim();
    }

    public String getvDirector() {
        return vDirector;
    }

    public void setvDirector(String vDirector) {
        this.vDirector = vDirector == null ? null : vDirector.trim();
    }

    public String getvEnname() {
        return vEnname;
    }

    public void setvEnname(String vEnname) {
        this.vEnname = vEnname == null ? null : vEnname.trim();
    }

    public String getvLang() {
        return vLang;
    }

    public void setvLang(String vLang) {
        this.vLang = vLang == null ? null : vLang.trim();
    }

    public String getvPlaydata() {
        return vPlaydata;
    }

    public void setvPlaydata(String vPlaydata) {
        this.vPlaydata = vPlaydata == null ? null : vPlaydata.trim();
    }

    public String getvDes() {
        return vDes;
    }

    public void setvDes(String vDes) {
        this.vDes = vDes == null ? null : vDes.trim();
    }
}