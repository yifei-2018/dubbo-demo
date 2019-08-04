package com.yifei.dubbo.demo.api.model;

import java.io.Serializable;

/**
 * @author yifei
 * @date 2019/8/4
 */
public class Book implements Serializable {
    private static final long serialVersionUID = -5075956330696703485L;
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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
