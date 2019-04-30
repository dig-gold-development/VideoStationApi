package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaCoFilters implements Serializable {
    private Integer id;

    private String name;

    private Boolean rcolumn;

    private Boolean uesmode;

    private String sfind;

    private String sstart;

    private String send;

    private String sreplace;

    private Boolean flag;

    private Byte cotype;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getRcolumn() {
        return rcolumn;
    }

    public void setRcolumn(Boolean rcolumn) {
        this.rcolumn = rcolumn;
    }

    public Boolean getUesmode() {
        return uesmode;
    }

    public void setUesmode(Boolean uesmode) {
        this.uesmode = uesmode;
    }

    public String getSfind() {
        return sfind;
    }

    public void setSfind(String sfind) {
        this.sfind = sfind == null ? null : sfind.trim();
    }

    public String getSstart() {
        return sstart;
    }

    public void setSstart(String sstart) {
        this.sstart = sstart == null ? null : sstart.trim();
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send == null ? null : send.trim();
    }

    public String getSreplace() {
        return sreplace;
    }

    public void setSreplace(String sreplace) {
        this.sreplace = sreplace == null ? null : sreplace.trim();
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    public Byte getCotype() {
        return cotype;
    }

    public void setCotype(Byte cotype) {
        this.cotype = cotype;
    }
}