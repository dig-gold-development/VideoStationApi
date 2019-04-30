package com.site.vs.videostation.entity;

import java.io.Serializable;

public class SeaCrons implements Serializable {
    private Short cronid;

    private Boolean available;

    private String type;

    private String name;

    private String filename;

    private Integer lastrun;

    private Integer nextrun;

    private Boolean weekday;

    private Byte day;

    private Byte hour;

    private String minute;

    private static final long serialVersionUID = 1L;

    public Short getCronid() {
        return cronid;
    }

    public void setCronid(Short cronid) {
        this.cronid = cronid;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    public Integer getLastrun() {
        return lastrun;
    }

    public void setLastrun(Integer lastrun) {
        this.lastrun = lastrun;
    }

    public Integer getNextrun() {
        return nextrun;
    }

    public void setNextrun(Integer nextrun) {
        this.nextrun = nextrun;
    }

    public Boolean getWeekday() {
        return weekday;
    }

    public void setWeekday(Boolean weekday) {
        this.weekday = weekday;
    }

    public Byte getDay() {
        return day;
    }

    public void setDay(Byte day) {
        this.day = day;
    }

    public Byte getHour() {
        return hour;
    }

    public void setHour(Byte hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute == null ? null : minute.trim();
    }
}