package com.yifei.dubbo.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yifei
 * @date 2019/8/11
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/get")
    @ResponseBody
    public Object get() {
        Map<String, String> map = new HashMap<>(16);
        map.put("1", "dubbo");
        map.put("2", "zk");
        return map;
    }
}
