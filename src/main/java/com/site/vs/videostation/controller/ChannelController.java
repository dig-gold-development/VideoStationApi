package com.site.vs.videostation.controller;

import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.SeaType;
import com.site.vs.videostation.service.ChannelService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "channel")
public class ChannelController {

    @Autowired
    private ChannelService channelService;
    @GetMapping(value = "/getChannels")
    public ApiResponse findAllChannel() {

        List<SeaType> hotChannel = channelService.findHotChannel();
        List<SeaType> allChannel = channelService.findAllChannel();


        Map channel = new HashMap<>();
        channel.put("hot",hotChannel);
        channel.put("channels",allChannel);

        return ApiResponseUtil.success(channel);

    }


}
