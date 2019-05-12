package com.site.vs.videostation.service;

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
    SeaTypeMapper categoryMapper;

    public List<SeaType> findHotChannel() {

        List<SeaType> types = new ArrayList<>();
        SeaType movieType = categoryMapper.getTypeInfoByTypeId(28);
        types.add(movieType);

        SeaType teleplayType = categoryMapper.getTypeInfoByTypeId(29);
        types.add(teleplayType);

        SeaType  artsType = categoryMapper.getTypeInfoByTypeId(30);
        types.add(artsType);

        SeaType  comicType = categoryMapper.getTypeInfoByTypeId(31);
        types.add(comicType);


        return types;


    }

    public List<SeaType> findAllChannel() {
        List<SeaType> types = new ArrayList<>();
        SeaType xiju = categoryMapper.getTypeInfoByTypeId(34);
        types.add(xiju);

        SeaType aiqing = categoryMapper.getTypeInfoByTypeId(35);
        types.add(aiqing);

        SeaType kehuan = categoryMapper.getTypeInfoByTypeId(37);
        types.add(kehuan);

        SeaType kongbu = categoryMapper.getTypeInfoByTypeId(45);
        types.add(kongbu);

        SeaType juqing = categoryMapper.getTypeInfoByTypeId(46);
        types.add(juqing);

        SeaType zhanzheng = categoryMapper.getTypeInfoByTypeId(47);
        types.add(zhanzheng);

        SeaType zailan = categoryMapper.getTypeInfoByTypeId(48);
        types.add(zailan);

        SeaType qingchun = categoryMapper.getTypeInfoByTypeId(50);
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
