package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaCoCls implements Serializable {
    private Integer id;

    private String clsname;

    private Short sysclsid;

    private Byte cotype;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClsname() {
        return clsname;
    }

    public void setClsname(String clsname) {
        this.clsname = clsname == null ? null : clsname.trim();
    }

    public Short getSysclsid() {
        return sysclsid;
    }

    public void setSysclsid(Short sysclsid) {
        this.sysclsid = sysclsid;
    }

    public Byte getCotype() {
        return cotype;
    }

    public void setCotype(Byte cotype) {
        this.cotype = cotype;
    }
}