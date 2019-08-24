package com.yifei.dubbo.demo.consumer.controller;

import com.yifei.dubbo.demo.api.constant.CmnConstant;
import com.yifei.dubbo.demo.api.service.StudyService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yifei
 * @date 2019/8/13
 */
@Controller
@RequestMapping("/consumer")
public class ConsumerController {

    @Resource
    private StudyService studyService;

    @RequestMapping("/test")
    @ResponseBody
    public Object test() {
        List<String> list = studyService.getLatestKnowledgeListOfStudying(CmnConstant.DEFAULT_USER_ID);
        return list;
    }
}
