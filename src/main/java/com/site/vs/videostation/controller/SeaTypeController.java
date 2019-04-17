package com.site.vs.videostation.controller;


import com.site.vs.videostation.repository.SeaTypeRepository;
import com.site.vs.videostation.entity.SeaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "types")
public class SeaTypeController  {
    @Autowired
    private SeaTypeRepository seaTypeRepository;

    @ResponseBody
    @GetMapping
    public List<SeaType> selAll() {
        return seaTypeRepository.findAll();
    }

}
