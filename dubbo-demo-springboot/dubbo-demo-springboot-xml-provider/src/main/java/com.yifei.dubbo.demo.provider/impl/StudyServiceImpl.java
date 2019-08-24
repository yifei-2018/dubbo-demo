package com.yifei.dubbo.demo.provider.impl;

import com.yifei.dubbo.demo.api.constant.CmnConstant;
import com.yifei.dubbo.demo.api.model.Book;
import com.yifei.dubbo.demo.api.service.StudyService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yifei
 * @date 2019/8/4
 */
@Service("studyService")
public class StudyServiceImpl implements StudyService {

    /**
     * 获取最近在读的书单
     *
     * @param userId 用户id
     * @return List<Book>
     */
    @Override
    public List<Book> getLatestBookListOfReading(String userId) {
        List<Book> bookList = new ArrayList<>();
        if (CmnConstant.DEFAULT_USER_ID.equals(userId)) {
            Book book1 = new Book();
            book1.setName("生活需要仪式感");
            book1.setAuthor("李思圆");
            bookList.add(book1);

            Book book2 = new Book();
            book2.setName("生活需要节奏感");
            book2.setAuthor("李思圆");
            bookList.add(book2);
        }
        return bookList;
    }

    /**
     * 获取最近在学的知识点清单
     *
     * @param userId 用户id
     * @return List<String>
     */
    @Override
    public List<String> getLatestKnowledgeListOfStudying(String userId) {
        List<String> knowledgeList = new ArrayList<>();
        if (CmnConstant.DEFAULT_USER_ID.equals(userId)) {
            knowledgeList.add("dubbo");
            knowledgeList.add("zookeeoer");
        }
        return knowledgeList;
    }
}
