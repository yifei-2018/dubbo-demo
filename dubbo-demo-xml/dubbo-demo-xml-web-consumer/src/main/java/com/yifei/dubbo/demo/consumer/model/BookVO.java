package com.yifei.dubbo.demo.consumer.model;

import java.io.Serializable;

/**
 * @author yifei
 * @date 2019/8/5
 */
public class BookVO implements Serializable {
    private static final long serialVersionUID = -7692041980628733103L;
    /**
     * 书名
     */
    private String name;
    /**
     * 作者
     */
    private String author;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "BookVO{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
