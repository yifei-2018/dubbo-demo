package com.yifei.dubbo.demo.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

/**
 * @author yifei
 * @date 2019/8/13
 */
@SpringBootApplication
public class ConsumerApplication {

    private static final Logger logger= LoggerFactory.getLogger(ConsumerApplication.class);

    public static void main(String[] args) {
        // 启动服务
        ConfigurableApplicationContext context = SpringApplication.run(ConsumerApplication.class, args);
        Environment env = context.getBean(Environment.class);
        logger.info("【{}】服务启动成功！tomcat的端口：【{}】", env.getProperty("spring.application.name"), env.getProperty("server.port"));
    }
}
