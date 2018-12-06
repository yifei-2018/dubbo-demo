package com.yifei.dubbo.demo.provider.model.entity;

import java.sql.Timestamp;

/**
 * @author yifei
 * @date 2018/5/14
 */
public class UserReadInfoEntity {

    /**
     * id
     */
    private String id;
    /**
     * 用户id
     */
    private String userId;
    /**
     * 书名
     */
    private String bookName;
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

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "UserReadInfoEntity{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
