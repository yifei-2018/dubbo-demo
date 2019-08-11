package com.yifei.dubbo.demo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author yifei
 * @date 2019/8/11
 */

@SpringBootApplication
public class ProviderApplication {
    private static final Logger logger = LoggerFactory.getLogger(ProviderApplication.class);

    public static void main(String[] args) {
        // 启动服务
        ConfigurableApplicationContext context = SpringApplication.run(ProviderApplication.class, args);
        Environment env = context.getBean(Environment.class);
        logger.info("【{}】服务启动成功！tomcat的端口：【{}】", env.getProperty("spring.application.name"), env.getProperty("server.port"));
    }
}
