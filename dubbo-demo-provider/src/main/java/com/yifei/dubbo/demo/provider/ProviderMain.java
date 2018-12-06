package com.yifei.dubbo.demo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yifei
 * @date 2018/4/5
 */
public class ProviderMain {
    private static final Logger logger = LoggerFactory.getLogger(ProviderMain.class);

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        logger.info(context.getDisplayName() + ": here");
        context.start();
        logger.info("dubbo-demo-provider服务已经启动!");
        System.in.read();
    }
}
