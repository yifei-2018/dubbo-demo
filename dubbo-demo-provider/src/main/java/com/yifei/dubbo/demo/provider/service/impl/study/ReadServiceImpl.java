package com.yifei.dubbo.demo.provider.service.impl.study;

import com.yifei.dubbo.demo.api.constant.CmnConstant;
import com.yifei.dubbo.demo.api.constant.CmnEnum;
import com.yifei.dubbo.demo.api.service.study.ReadService;
import com.yifei.dubbo.demo.provider.dao.study.UserReadInfoDao;
import com.yifei.dubbo.demo.provider.model.bo.UserReadInfoBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yifei
 * @date 2018/4/5
 */
@Service("readService")
public class ReadServiceImpl implements ReadService {
    private static final Logger logger = LoggerFactory.getLogger(ReadServiceImpl.class);

    @Autowired
    UserReadInfoDao userReadInfoDao;

    /**
     * 读书
     *
     * @param userId       用户id
     * @param bookTypeEnum 书类型（必填）
     * @return String
     */
    @Override
    public String read(String userId, CmnEnum.BookTypeEnum bookTypeEnum) {
        String cnName = CmnConstant.DEFAULT_NAME_CN;
        String pattenStr = "大家好，我是%s,在学习之余，我喜欢看%s类的书！";
        StringBuilder rsStrBuilder = new StringBuilder("");

        List<UserReadInfoBO> userReadInfoList = userReadInfoDao.getUserReadInfoList(userId);

        if (userReadInfoList != null && userReadInfoList.size() > 0) {
            for (UserReadInfoBO userReadInfoBO : userReadInfoList) {
                rsStrBuilder.append(rsStrBuilder.toString() + String.format(pattenStr, userReadInfoBO.getCnName(), userReadInfoBO.getBookName()) + "\n");
            }
        } else {
            rsStrBuilder.append(String.format(pattenStr, cnName, bookTypeEnum.getValue()));
        }

        if (logger.isInfoEnabled()) {
            logger.info("返回值：【{}】", rsStrBuilder.toString());
        }

        return rsStrBuilder.toString();
    }
}
