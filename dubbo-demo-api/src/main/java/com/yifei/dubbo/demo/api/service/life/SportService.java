package com.yifei.dubbo.demo.api.service.life;


import com.sun.istack.internal.NotNull;
import com.yifei.dubbo.demo.api.constant.CmnEnum;

/**
 * @author yifei
 * @date 2018/4/5
 */
public interface SportService {

    /**
     * 打球
     *
     * @param userId       用户id（必填）
     * @param ballTypeEnum 球类型（必填）
     * @return String
     */
    String play(@NotNull String userId, @NotNull CmnEnum.BallTypeEnum ballTypeEnum);
}
