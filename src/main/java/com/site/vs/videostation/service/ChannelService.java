package com.site.vs.videostation.service;

import com.site.vs.videostation.SeaCmsConfig;
import com.site.vs.videostation.entity.SeaData;
import com.site.vs.videostation.entity.SeaType;
import com.site.vs.videostation.mapper.SeaTypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class ChannelService {

    @Autowired
    private SeaCmsConfig mSeaCmsConfig;

    @Autowired
    SeaTypeMapper categoryMapper;

    public List<SeaType> findHotChannel() {

        List<SeaType> types = new ArrayList<>();
        SeaType movieType = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.dianying);
        movieType.setPic("http://www.biggold.net.cn/cms/pic/icon/dianying.png");
        types.add(movieType);

        SeaType teleplayType = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.dianshiju);

        teleplayType.setPic("http://www.biggold.net.cn/cms/pic/icon/vip-.png");
        types.add(teleplayType);

        SeaType  artsType = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.zongyi);
        artsType.setPic("http://www.biggold.net.cn/cms/pic/icon/zongyi-copy.png");
        types.add(artsType);

        SeaType  comicType = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.dongman);

        comicType.setPic("http://www.biggold.net.cn/cms/pic/icon/dongman.png");
        types.add(comicType);


        return types;


    }

    public List<SeaType> findAllChannel() {
        List<SeaType> types = new ArrayList<>();
        SeaType xiju = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.xiju);
        xiju.setPic("http://www.biggold.net.cn/cms/pic/icon/xijuzhuobielin.png");
        types.add(xiju);

        SeaType aiqing = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.aiqing);
        aiqing.setPic("http://www.biggold.net.cn/cms/pic/icon/2.png");
        types.add(aiqing);

        SeaType kehuan = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.kehuan);
        kehuan.setPic("http://www.biggold.net.cn/cms/pic/icon/kehuan.png");
        types.add(kehuan);

        SeaType kongbu = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.kongbu);
        kongbu.setPic("http://www.biggold.net.cn/cms/pic/icon/weibiaoti--.png");
        types.add(kongbu);

        SeaType juqing = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.juqing);
        juqing.setPic("http://www.biggold.net.cn/cms/pic/icon/juqingjieshao.png");
        types.add(juqing);

        SeaType zhanzheng = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.zhanzheng);
        zhanzheng.setPic("http://www.biggold.net.cn/cms/pic/icon/mbjf.png");
        types.add(zhanzheng);

        SeaType zailan = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.zailan);
        zailan.setPic("http://www.biggold.net.cn/cms/pic/icon/zainan.png");
        types.add(zailan);

        SeaType qingchun = categoryMapper.getTypeInfoByTypeId(mSeaCmsConfig.qingchun);
        qingchun.setPic("http://www.biggold.net.cn/cms/pic/icon/qingchunjiqing.png");
        types.add(qingchun);

        return  types;

    }

    public  List<Short> findSubIdsById(int id) {
        List<Short> ids = new ArrayList<>();
        List<SeaType> categoryList = categoryMapper.getAll(id);

        for (SeaType c: categoryList) {
            List<SeaType> childs = c.getCategoryList();
            for (SeaType c1 : childs) {
                ids.add(c1.getTid());

            }
        }
        return  ids;
    }



}
