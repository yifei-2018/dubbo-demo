package com.yifei.dubbo.demo.consumer;

import com.yifei.dubbo.demo.api.constant.CmnConstant;
import com.yifei.dubbo.demo.api.model.Book;
import com.yifei.dubbo.demo.api.service.StudyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author yifei
 * @date 2019/8/4
 */
public class ConsumerApplication {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerApplication.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        applicationContext.start();
        logger.info("dubbo-demo-xml-consumer启动成功！");
        StudyService studyService = (StudyService) applicationContext.getBean("studyService");
        List<Book> bookList = studyService.getLatestBookListOfReading(CmnConstant.DEFAULT_USER_ID);
        logger.info("【{}】的最近在看书单：【{}】", CmnConstant.DEFAULT_USER_ID, bookList);
    }
}
