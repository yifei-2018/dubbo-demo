package com.yifei.dubbo.demo.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author yifei
 * @date 2019/8/4
 */
public class ProviderApplication {
    private static final Logger logger = LoggerFactory.getLogger(ProviderApplication.class);

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-provider.xml");
        applicationContext.start();
        logger.info("dubbo-demo-xml-provider启动成功！");
        // 让程序保持启动状态
        System.in.read();
    }
}
