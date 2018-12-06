package com.yifei.dubbo.demo.provider.service.impl.life;

import com.yifei.dubbo.demo.api.constant.CmnConstant;
import com.yifei.dubbo.demo.api.constant.CmnEnum;
import com.yifei.dubbo.demo.api.service.life.SportService;
import com.yifei.dubbo.demo.provider.dao.life.UserSportInfoDao;
import com.yifei.dubbo.demo.provider.model.bo.UserSportInfoBO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yifei
 * @date 2018/4/5
 */
@Service("sportService")
public class SportServiceImpl implements SportService {
    private static final Logger logger = LoggerFactory.getLogger(SportServiceImpl.class);

    @Autowired
    UserSportInfoDao userSportInfoDao;

    /**
     * 打球
     *
     * @param userId       用户id
     * @param ballTypeEnum 球类型
     * @return String
     */
    @Override
    public String play(String userId, CmnEnum.BallTypeEnum ballTypeEnum) {
        String cnName = CmnConstant.DEFAULT_NAME_CN;
        String pattenStr = "大家好，我是%s,在生活闲暇时，我喜欢打%s！";
        StringBuilder rsStrBuilder = new StringBuilder("");

        List<UserSportInfoBO> userSportInfoBOList = userSportInfoDao.getUserSportInfoList(userId);

        if (userSportInfoBOList != null && userSportInfoBOList.size() > 0) {
            for (UserSportInfoBO userSportInfoBO : userSportInfoBOList) {
                rsStrBuilder.append(rsStrBuilder.toString() + String.format(pattenStr, userSportInfoBO.getCnName(), CmnEnum.BallTypeEnum.getName(userSportInfoBO.getBallType())) + "\n");
            }
        } else {
            rsStrBuilder.append(String.format(pattenStr, cnName, ballTypeEnum.getValue()));
        }

        if (logger.isInfoEnabled()) {
            logger.info("返回值：【{}】", rsStrBuilder.toString());
        }

        return rsStrBuilder.toString();
    }
}
