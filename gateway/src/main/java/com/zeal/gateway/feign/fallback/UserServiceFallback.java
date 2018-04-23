package com.zeal.gateway.feign.fallback;

import com.zeal.gateway.feign.UserDao;
import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.UserVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author lengleng
 * @date 2017/10/31
 * 用户服务的fallback
 */
@Service
public class UserServiceFallback implements UserDao {
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public Result findUserByUsername(String username) {
        logger.error("调用{}异常:{}", "findUserByUsername", username);
        return null;
    }
}
