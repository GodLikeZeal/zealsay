package com.zeal.gateway.feign.fallback;


import com.zeal.gateway.feign.MenuDao;
import com.zeal.zealsay.common.entity.Result;
import com.zeal.zealsay.common.entity.SysMenu;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * @author lengleng
 * @date 2017/10/31
 * why add @Service when i up version ?
 * https://github.com/spring-cloud/spring-cloud-netflix/issues/762
 */
@Service
public class MenuDaoFallback implements MenuDao {
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public Result findMenuByRole(String role) {
        logger.error("调用{}异常{}","findMenuByRole",role);
        return null;
    }
}
