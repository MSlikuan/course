package com.muzi.server.service;

import com.muzi.server.entity.Chapter;
import com.muzi.server.entity.ChapterExample;
import com.muzi.server.mapper.ChapterMapper;
import com.muzi.server.mapper.ChapterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    ChapterMapper chapterMapper;

    public List<Chapter> list() {
        ChapterExample chapterExample = new ChapterExample();
        chapterExample.createCriteria().andIdEqualTo("1");
        chapterExample.setOrderByClause("id desc");
        return chapterMapper.selectByExample(chapterExample);
    }

}
