package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaPlaydata implements Serializable {
    private Integer vId;

    private Short tid;

    private String body;

    private String body1;

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

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    public String getBody1() {
        return body1;
    }

    public void setBody1(String body1) {
        this.body1 = body1 == null ? null : body1.trim();
    }
}