package com.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 插件配置属性类
 */
@Component
@ConfigurationProperties(prefix = "plugin")
public class PluginProperties {
    
    /**
     * 插件 A 的配置
     */
    private PluginAProperties a = new PluginAProperties();

    public PluginAProperties getA() {
        return a;
    }

    public void setA(PluginAProperties a) {
        this.a = a;
    }

    /**
     * 插件 A 的具体配置属性
     */
    public static class PluginAProperties {
        /**
         * 是否启用插件 A
         */
        private boolean enabled = true;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }
    }
} 