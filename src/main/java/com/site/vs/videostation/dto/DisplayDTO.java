package com.site.vs.videostation.dto;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DisplayDTO {


    private  int vId;
    private  String vName;
    private  String vPic;
    private  String vActor;
    private  Integer vPublishyear;
    private  String vPublisharea;

    @JsonProperty("id")
    public int getvId() {
        return vId;
    }

    public void setvId(int vId) {
        this.vId = vId;
    }

    @JsonProperty("name")
    public String getvName() {
        return vName;
    }

    public void setvName(String vName) {
        this.vName = vName;
    }

    @JsonProperty("pic")
    public String getvPic() {
        return vPic;
    }

    public void setvPic(String vPic) {
        this.vPic = vPic;
    }

    @JsonProperty("actor")
    public String getvActor() {
        return vActor;
    }

    public void setvActor(String vActor) {
        this.vActor = vActor;
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
        this.vPublisharea = vPublisharea;
    }




}
