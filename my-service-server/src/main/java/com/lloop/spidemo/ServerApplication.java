package com.lloop.spidemo;

import com.lloop.spidemo.api.MyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@Slf4j
@SpringBootApplication
public class ServerApplication implements CommandLineRunner {

    @Autowired
    private List<MyService> services;

    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) {
        services.forEach(service -> service.test("Hello World!"));
    }
} 