package com.lloop.spidemo;

import com.lloop.spidemo.api.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ServiceLoader;

@Slf4j
@SpringBootApplication
public class ServerApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) {
        // 使用 ServiceLoader 加载所有 MyService 实现
        ServiceLoader<MyService> services = ServiceLoader.load(MyService.class);
        
        // 测试消息
        String testMessage = "Hello SPI!";
        
        // 遍历并调用所有可用的实现
        for (MyService service : services) {
            service.test(testMessage);
        }
    }
} 