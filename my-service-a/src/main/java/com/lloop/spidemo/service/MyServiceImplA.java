package com.lloop.spidemo.service;

import com.lloop.spidemo.api.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@ConditionalOnProperty(prefix = "plugin.a", name = "enabled", havingValue = "true", matchIfMissing = true)
public class MyServiceImplA implements MyService {
    @Override
    public void test(String message) {
        log.info("MyServiceImplA processing message: {}", message);
    }
} 