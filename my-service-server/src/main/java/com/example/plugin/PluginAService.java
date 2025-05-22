package com.example.plugin;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

/**
 * 插件 A 的服务类
 * 通过 @ConditionalOnProperty 注解控制是否启用该服务
 */
@Service
@ConditionalOnProperty(prefix = "plugin.a", name = "enabled", havingValue = "true", matchIfMissing = true)
public class PluginAService {

    /**
     * 插件 A 的示例方法
     */
    public void doSomething() {
        System.out.println("插件 A 正在执行...");
    }
} 