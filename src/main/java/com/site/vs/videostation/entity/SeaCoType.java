package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaCoType implements Serializable {
    private Integer tid;

    private Short cid;

    private String tname;

    private String siteurl;

    private Short getherday;

    private String playfrom;

    private String autocls;

    private Short classid;

    private String coding;

    private String sock;

    private Integer addtime;

    private Integer cjtime;

    private Boolean isok;

    private Byte cotype;

    private String listconfig;

    private String itemconfig;

    private static final long serialVersionUID = 1L;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Short getCid() {
        return cid;
    }

    public void setCid(Short cid) {
        this.cid = cid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getSiteurl() {
        return siteurl;
    }

    public void setSiteurl(String siteurl) {
        this.siteurl = siteurl == null ? null : siteurl.trim();
    }

    public Short getGetherday() {
        return getherday;
    }

    public void setGetherday(Short getherday) {
        this.getherday = getherday;
    }

    public String getPlayfrom() {
        return playfrom;
    }

    public void setPlayfrom(String playfrom) {
        this.playfrom = playfrom == null ? null : playfrom.trim();
    }

    public String getAutocls() {
        return autocls;
    }

    public void setAutocls(String autocls) {
        this.autocls = autocls == null ? null : autocls.trim();
    }

    public Short getClassid() {
        return classid;
    }

    public void setClassid(Short classid) {
        this.classid = classid;
    }

    public String getCoding() {
        return coding;
    }

    public void setCoding(String coding) {
        this.coding = coding == null ? null : coding.trim();
    }

    public String getSock() {
        return sock;
    }

    public void setSock(String sock) {
        this.sock = sock == null ? null : sock.trim();
    }

    public Integer getAddtime() {
        return addtime;
    }

    public void setAddtime(Integer addtime) {
        this.addtime = addtime;
    }

    public Integer getCjtime() {
        return cjtime;
    }

    public void setCjtime(Integer cjtime) {
        this.cjtime = cjtime;
    }

    public Boolean getIsok() {
        return isok;
    }

    public void setIsok(Boolean isok) {
        this.isok = isok;
    }

    public Byte getCotype() {
        return cotype;
    }

    public void setCotype(Byte cotype) {
        this.cotype = cotype;
    }

    public String getListconfig() {
        return listconfig;
    }

    public void setListconfig(String listconfig) {
        this.listconfig = listconfig == null ? null : listconfig.trim();
    }

    public String getItemconfig() {
        return itemconfig;
    }

    public void setItemconfig(String itemconfig) {
        this.itemconfig = itemconfig == null ? null : itemconfig.trim();
    }
}