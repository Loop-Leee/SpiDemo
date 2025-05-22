package com.lloop.spidemo.config;

import com.lloop.spidemo.api.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * @Author lloop
 * @Create 2025/5/22 19:18
 */
@Configuration
public class MyServiceConfig {

    /**
     * 注入所有符合条件的 MyService 实现
     * Spring 会根据 @ConditionalOnProperty 的配置来决定注入哪些实现
     */
    @Autowired(required = false)
    private List<MyService> services;

    @PostConstruct
    public void init() {
        if (services != null) {
            String testMessage = "插件已加载";
            // 遍历并调用所有可用的实现
            for (MyService service : services) {
                service.test(testMessage);
            }
        }
    }
}
