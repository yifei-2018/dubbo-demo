package com.yifei.dubbo.demo.provider.dao.life;

import com.yifei.dubbo.demo.provider.model.bo.UserSportInfoBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yifei
 * @date 2018/5/14
 */
public interface UserSportInfoDao {

    /**
     * 获取用户运动信息
     *
     * @param userId 用户id
     * @return
     */
    List<UserSportInfoBO> getUserSportInfoList(@Param("userId") String userId);
}
