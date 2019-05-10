package com.site.vs.videostation.controller;

import com.site.vs.videostation.entity.ApiResponse;
import com.site.vs.videostation.entity.Movie;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.entity.Source;
import com.site.vs.videostation.service.DetailService;
import com.site.vs.videostation.until.ApiResponseUtil;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@RestController
@RequestMapping(value = "detail")
public class DetailController {

    @Autowired
    private DetailService detailService;


    @GetMapping(value = "/getDetailById")
    public ApiResponse findDetailById(@RequestParam("id") int id) {
        SeaData detail = detailService.findDetialById(id);
        String playContent = detail.getBody();
        String[] sourceStringArr = playContent.split("\\$\\$\\$(\\w+|\\W+)\\$\\$");
        List<Source> list = new ArrayList<>();
        Iterator sourceIterator = Arrays.stream(sourceStringArr).iterator();
        while (sourceIterator.hasNext()) {
            String sourceString = String.valueOf(sourceIterator.next());
            if (StringUtils.isNotBlank(sourceString)
                    && !"null".equals(sourceString)) {
                sourceString = sourceString.replace("$$", "");
                String[] episodeArr = sourceString.split("\\#");
                Iterator episodeIterator = Arrays.stream(episodeArr).iterator();
                Source source = new Source();
                List<Movie> movieList = new ArrayList<>();
                while (episodeIterator.hasNext()) {
                    String episode = String.valueOf(episodeIterator.next());
                    String[] unitArr = episode.split("\\$");
                    Movie movie = new Movie();

                    for (int i = 0; i < unitArr.length; i++) {
                        String content = unitArr[i];
                        if  (i == 0 ) {
                            movie.setPlayName(content);
                        }else if (i == 1) {
                            if (content.endsWith("mp4") || content.endsWith("m3u8")) {
                                movie.setIsRealUrl(1);
                            }
                            content = content.replace("https", "http");
                            movie.setPlayUrl(content);


                        } else if (i == 2) {

                            movie.setSource(content);
                            source.setSourceName(content);

                        }
                    }

                    movieList.add(movie);
                }
                source.setMovieList(movieList);
                list.add(source);
            }
        }
        detail.setList(list);
        return ApiResponseUtil.success(detail);
    }


}
