package com.yifei.dubbo.demo.provider.model.entity;

import java.sql.Timestamp;

/**
 * @author yifei
 * @date 2018/5/14
 */
public class UserSportInfoEntity {

    /**
     * id
     */
    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 球类型
     */
    private Integer ballType;
    /**
     * 创建时间
     */
    private Timestamp createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getBallType() {
        return ballType;
    }

    public void setBallType(Integer ballType) {
        this.ballType = ballType;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserSportInfoEntity{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", ballType=" + ballType +
                ", createTime=" + createTime +
                '}';
    }
}
