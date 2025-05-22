package com.lloop.spidemo.service;

import com.lloop.spidemo.api.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@ConditionalOnProperty(prefix = "plugin.c", name = "enabled", havingValue = "true", matchIfMissing = true)
public class MyServiceImplC implements MyService {
    @Override
    public void test(String message) {
        log.info("MyServiceImplC processing message: {}", message);
    }
} 