package com.yifei.dubbo.demo.api.service.study;


import com.sun.istack.internal.NotNull;
import com.yifei.dubbo.demo.api.constant.CmnEnum;

/**
 * @author yifei
 * @date 2018/4/5
 */
public interface ReadService {

    /**
     * 读书
     *
     * @param userId         用户id（必填）
     * @param bookTypeEnum 书类型（必填）
     * @return String
     */
    String read(@NotNull String userId, @NotNull CmnEnum.BookTypeEnum bookTypeEnum);
}
