package com.yifei.dubbo.demo.provider.model.entity;

/**
 * @author yifei
 * @date 2018/5/14
 */
public class UserInfoEntity {

    /**
     * 用户id
     */
    private String userId;
    /**
     * 用户中文名称
     */
    private String cnName;
    /**
     * 用户英文名称
     */
    private String enName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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
        return "UserInfoEntity{" +
                "userId='" + userId + '\'' +
                ", cnName='" + cnName + '\'' +
                ", enName='" + enName + '\'' +
                '}';
    }
}
