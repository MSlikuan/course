package com.muzi.server.service;

import com.muzi.server.entity.Test;
import com.muzi.server.entity.TestExample;
import com.muzi.server.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {

    @Resource
    TestMapper testMapper;

     List<Test>  list(){
         TestExample testExample = new TestExample();
         testExample.createCriteria().andIdEqualTo(1);
         testExample.setOrderByClause("id desc");
         return testMapper.selectByExample(testExample);
     }

 }
