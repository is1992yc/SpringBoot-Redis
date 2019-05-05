package com.is1992yc.demo.service;

import com.is1992yc.demo.SpringBootRedisApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringBootTest(classes = SpringBootRedisApplication.class)
public class TestServiceTest {


    @Autowired
    private TestService testService;

    @Test
    public void test(){


        try {
            System.out.println("第一次时间: "+testService.getTime());
            System.out.println("第2次时间: "+testService.getTime());
            Thread.sleep(1000*5);
            System.out.println("休眠5秒, 第3次时间: "+testService.getTime());
            Thread.sleep(1000*5);
            System.out.println("休眠5秒, 第4次时间: "+testService.getTime());
            Thread.sleep(1000*5);
            System.out.println("休眠5秒, 第5次时间: "+testService.getTime());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}