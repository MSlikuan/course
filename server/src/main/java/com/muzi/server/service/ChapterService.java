package com.muzi.server.service;

import com.muzi.server.dto.ChapterDTO;
import com.muzi.server.entity.Chapter;
import com.muzi.server.entity.ChapterExample;
import com.muzi.server.mapper.ChapterMapper;
import com.muzi.server.mapper.ChapterMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class ChapterService {

    @Resource
    ChapterMapper chapterMapper;

    public List<ChapterDTO> list() {
        ChapterExample chapterExample = new ChapterExample();
        List<Chapter> chapters = chapterMapper.selectByExample(chapterExample);
        List<ChapterDTO> chapterDTOs = new ArrayList<ChapterDTO>();

        for (Chapter chapter : chapters) {
            ChapterDTO chapterDTO = new ChapterDTO();
            BeanUtils.copyProperties(chapter, chapterDTO);
            chapterDTOs.add(chapterDTO);
        }
        return chapterDTOs;
    }

}
