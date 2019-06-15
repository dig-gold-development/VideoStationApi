package com.site.vs.videostation.entity;

import com.site.vs.videostation.dto.DisplayDTO;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class DataList implements Serializable {
    private List<DisplayDTO> data;
    private String title;

}
