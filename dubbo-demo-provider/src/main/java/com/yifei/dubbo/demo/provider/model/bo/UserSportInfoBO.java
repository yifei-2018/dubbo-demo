package com.yifei.dubbo.demo.provider.model.bo;

import com.yifei.dubbo.demo.provider.model.entity.UserInfoEntity;
import com.yifei.dubbo.demo.provider.model.entity.UserSportInfoEntity;

/**
 * @author yifei
 * @date 2018/5/14
 */
public class UserSportInfoBO extends UserSportInfoEntity {

    /**
     * 用户中文名称
     */
    private String cnName;
    /**
     * 用户英文名称
     */
    private String enName;

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    @Override
    public String toString() {
        return "UserSprotInfoBO{" +
                "cnName='" + cnName + '\'' +
                ", enName='" + enName + '\'' +
                '}';
    }
}
