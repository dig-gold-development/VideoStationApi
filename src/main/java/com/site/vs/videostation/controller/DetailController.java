package com.site.vs.videostation.controller;

import com.site.vs.videostation.entity.*;
import com.site.vs.videostation.service.DetailService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "detail")
public class DetailController {

    @Autowired
    private DetailService detailService;

    @GetMapping(value = "/getDetailById")
    public ApiResponse findDetailById(@RequestParam("id") int id ) {
        Detail detail = detailService.findDetialById(id);
        String playContent = detail.getBody();
        String[]  sourceStringArr = playContent.split("\\$\\$\\$\\$");



        List<Source> list = new ArrayList<>();
        detail.setList(list);

        for (String sourceString : sourceStringArr) {

            sourceString = sourceString.replace("$$", "$");
            List<Movie> movieList = new ArrayList<>();
            Source source = new Source();
           source.setMovieList(movieList);
            list.add(source);
           String[] episodeArr = sourceString.split("\\#");

           for (String episode : episodeArr) {
               String[] unitArr = episode.split("\\$");
               if (source.getSourceName() == null) {
                   source.setSourceName(unitArr[3]);
               }
               Movie movie = new Movie();
               movieList.add(movie);

               int index = 0;
               for (String unit :unitArr) {
                   if (index ==  1) {
                       movie.setPlayName(unit);
                   }else if (index == 2) {
                       if (unit.endsWith("mp4") || unit.endsWith("m3u8")) {
                           movie.setIsRealUrl(1);
                       }
                       movie.setPlayUrl(unit);
                   }else  if (index == 3) {
                       movie.setSource(unit);
                   }
                    index++;
               }
           }

        }

        ApiResponse data = ApiResponseUtil.success(detail);
        return data;
    }



}
