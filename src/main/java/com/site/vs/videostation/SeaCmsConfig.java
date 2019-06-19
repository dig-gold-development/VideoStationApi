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

    public int getDianying() {
        return dianying;
    }

    public void setDianying(int dianying) {
        this.dianying = dianying;
    }

    public int getDianshiju() {
        return dianshiju;
    }

    public void setDianshiju(int dianshiju) {
        this.dianshiju = dianshiju;
    }

    public int getZongyi() {
        return zongyi;
    }

    public void setZongyi(int zongyi) {
        this.zongyi = zongyi;
    }

    public int getDongman() {
        return dongman;
    }

    public void setDongman(int dongman) {
        this.dongman = dongman;
    }

    public int getHanju() {
        return hanju;
    }

    public void setHanju(int hanju) {
        this.hanju = hanju;
    }

    public int getXiju() {
        return xiju;
    }

    public void setXiju(int xiju) {
        this.xiju = xiju;
    }

    public int getAiqing() {
        return aiqing;
    }

    public void setAiqing(int aiqing) {
        this.aiqing = aiqing;
    }

    public int getKehuan() {
        return kehuan;
    }

    public void setKehuan(int kehuan) {
        this.kehuan = kehuan;
    }

    public int getKongbu() {
        return kongbu;
    }

    public void setKongbu(int kongbu) {
        this.kongbu = kongbu;
    }

    public int getJuqing() {
        return juqing;
    }

    public void setJuqing(int juqing) {
        this.juqing = juqing;
    }

    public int getZhanzheng() {
        return zhanzheng;
    }

    public void setZhanzheng(int zhanzheng) {
        this.zhanzheng = zhanzheng;
    }

    public int getZailan() {
        return zailan;
    }

    public void setZailan(int zailan) {
        this.zailan = zailan;
    }

    public int getQingchun() {
        return qingchun;
    }

    public void setQingchun(int qingchun) {
        this.qingchun = qingchun;
    }
}
