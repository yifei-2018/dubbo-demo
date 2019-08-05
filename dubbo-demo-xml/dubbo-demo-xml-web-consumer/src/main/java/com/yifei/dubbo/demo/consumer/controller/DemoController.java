package com.yifei.dubbo.demo.consumer.controller;

import com.yifei.dubbo.demo.api.model.Book;
import com.yifei.dubbo.demo.api.service.StudyService;
import com.yifei.dubbo.demo.consumer.model.BookVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

/**
 * @author yifei
 * @date 2019/8/5
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    private static final Logger logger = LoggerFactory.getLogger(DemoController.class);

    @Resource
    private StudyService studyService;

    /**
     * 获取最近在读书单
     *
     * @param request 请求
     * @return List<BookVO>
     */
    @RequestMapping("/latestBookListOfReading")
    @ResponseBody
    public List<BookVO> getLatestBookListOfReading(HttpServletRequest request) {
        // 用户id
        String userId = request.getParameter("userId");
        logger.info("获取书单参数：userId：【{}】", userId);
        List<Book> bookList = studyService.getLatestBookListOfReading(userId);
        logger.info("userId：【{}】，获取书单结果：【{}】", userId, bookList);
        List<BookVO> bookVOList = new ArrayList<>();
        if (bookList == null || bookList.isEmpty()) {
            return bookVOList;
        }

        for (Book book : bookList) {
            BookVO bookVO = new BookVO();
            bookVO.setName(book.getName());
            bookVO.setAuthor(book.getAuthor());
            bookVOList.add(bookVO);
        }
        return bookVOList;
    }
}
