package com.yifei.dubbo.demo.consumer;

import com.yifei.dubbo.demo.api.constant.CmnEnum;
import com.yifei.dubbo.demo.api.service.life.SportService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yifei
 * @date 2018/4/6
 */
public class ConsumerMain {
    private static final Logger logger = LoggerFactory.getLogger(ConsumerMain.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        context.start();
        logger.info("dubbo-demo-consumer start");

        SportService sportService = context.getBean(SportService.class);
        String playResult = sportService.play("111", CmnEnum.BallTypeEnum.BADMINTON);
        logger.info(playResult);
    }
}
