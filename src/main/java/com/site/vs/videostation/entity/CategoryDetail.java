package com.site.vs.videostation.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CategoryDetail {

    @JsonProperty("category_list")
    public List<SeaType> getSeaTypeList() {
        return seaTypeList;
    }

    public void setSeaTypeList(List<SeaType> seaTypeList) {
        this.seaTypeList = seaTypeList;
    }

    @JsonProperty("area_list")
    public List<String> getAreaList() {
        return areaList;
    }

    public void setAreaList(List<String> areaList) {
        this.areaList = areaList;
    }

    @JsonProperty("year_list")
    public List<Integer> getYearList() {
        return yearList;
    }

    public void setYearList(List<Integer> yearList) {
        this.yearList = yearList;
    }

    @JsonProperty("vod_list")
    public List<SeaData> getSeaList() {
        return seaList;
    }

    public void setSeaList(List<SeaData> seaList) {
        this.seaList = seaList;
    }

    private List<SeaType> seaTypeList;
    private List<String> areaList;
    private List<Integer> yearList;
    private List<SeaData> seaList;
}
