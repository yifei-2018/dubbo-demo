package com.yifei.dubbo.demo.provider.dao.study;

import com.yifei.dubbo.demo.provider.model.bo.UserReadInfoBO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author yifei
 * @date 2018/5/14
 */
public interface UserReadInfoDao {

    /**
     * 获取用户运动信息
     *
     * @param userId 用户id
     * @return
     */
    List<UserReadInfoBO> getUserReadInfoList(@Param("userId") String userId);
}
