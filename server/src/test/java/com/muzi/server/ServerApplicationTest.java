package com.muzi.server;

import com.muzi.server.service.TestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class ServerApplicationTest {

    @Autowired
    TestService testService;

    @Test
    void contextLoads() {
        
    }
}
