package com.zeal.auth.feign.fallback;


import com.zeal.auth.feign.UserDao;
import com.zeal.zealsay.common.entity.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lengleng
 * @date 2017/10/31
 * 用户服务的fallback
 */
@Service
public class UserDaoFallbackService implements UserDao {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result findUserByUsername(String username) {
        logger.error("调用{}异常:{}", "findUserByUsername", username);
        return null;
    }

    /**
     * 通过手机号查询用户、角色信息
     *
     * @param mobile 手机号
     * @return UserVo
     */
    @Override
    public Result findUserByMobile(String mobile) {
        logger.error("调用{}异常:{}", "通过手机号查询用户", mobile);
        return null;
    }

    /**
     * 根据OpenId查询用户信息
     *
     * @param openId openId
     * @return UserVo
     */
    @Override
    public Result findUserByOpenId(String openId) {
        logger.error("调用{}异常:{}", "通过OpenId查询用户", openId);
        return null;
    }
}
