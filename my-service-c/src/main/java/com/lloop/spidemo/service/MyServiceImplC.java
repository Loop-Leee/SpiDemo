package com.lloop.spidemo.service;

import com.lloop.spidemo.api.MyService;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MyServiceImplC implements MyService {
    @Override
    public void test(String message) {
        log.info("MyServiceImplC processing message: {}", message);
    }
} 