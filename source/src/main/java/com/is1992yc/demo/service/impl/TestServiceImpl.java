package com.is1992yc.demo.service.impl;

import com.is1992yc.demo.service.TestService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * @author yican
 */
@Service
public class TestServiceImpl implements TestService {


    @Override
    @Cacheable(value = "test")
    public long getTime() {
        return System.currentTimeMillis();
    }
}
