package com.provider.bean;

import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author : zhaofei
 * @create 2024/5/10 11:11
 */
@Component
@NacosPropertySource(dataId = "config-demo.yml", autoRefreshed = true)
@ConfigurationProperties(prefix = "config")
public class ConfigDemo {
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
