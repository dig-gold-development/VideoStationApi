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

    public List<SeaType> findAllChannel() {

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
