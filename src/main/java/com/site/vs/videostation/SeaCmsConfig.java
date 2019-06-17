package com.site.vs.videostation;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix="cms")
@PropertySource(value = "classpath:config/seacms.properties")
public class SeaCmsConfig {
    public  int  dianying;
    public  int dianshiju;
    public  int  zongyi;
    public  int dongman;
    public  int  hanju;

    //电影子类别
    public  int xiju;
    public  int aiqing;
    public  int kehuan;
    public  int kongbu;
    public  int juqing;
    public  int zhanzheng;
    public  int zailan;
    public  int qingchun;

}
