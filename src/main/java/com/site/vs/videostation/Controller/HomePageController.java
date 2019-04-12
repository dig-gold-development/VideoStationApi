package com.site.vs.videostation.Controller;


import com.site.vs.videostation.dao.DisplayMapper;
import com.site.vs.videostation.dao.SeaTypeRepository;
import com.site.vs.videostation.entity.Display;
import com.site.vs.videostation.entity.SeaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "home")
public class HomePageController {
    @Autowired
    private DisplayMapper displayMapper;
    @ResponseBody
    @GetMapping
    public List<Display> getHomePage() {
        return displayMapper.findDisplayDataByTypeid(30);
    }
}
