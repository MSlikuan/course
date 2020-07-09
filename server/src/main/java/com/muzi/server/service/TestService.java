package com.muzi.server.service;

import com.muzi.server.entity.Test;
import com.muzi.server.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {
    @Autowired
    public TestMapper testMapper;

    public List<Test> list(){
        return testMapper.list();
    }
 }
