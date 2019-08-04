package com.yifei.dubbo.demo.api.service;

import com.yifei.dubbo.demo.api.model.Book;

import java.util.List;

/**
 * @author yifei
 * @date 2019/8/4
 */
public interface StudyService {
    /**
     * 获取最近在读的书单
     *
     * @param userId 用户id
     * @return List<Book>
     */
    List<Book> getLatestBookListOfReading(String userId);

    /**
     * 获取最近在学的知识点清单
     *
     * @param userId 用户id
     * @return List<String>
     */
    List<String> getLatestKnowledgeListOfStudying(String userId);
}
