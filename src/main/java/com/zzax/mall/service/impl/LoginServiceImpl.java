package com.zzax.mall.service.impl;

import com.zzax.mall.entity.User;
import com.zzax.mall.enums.Result;
import com.zzax.mall.service.LoginService;
import com.zzax.mall.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:17 星期五
 */
@Service
public class LoginServiceImpl implements LoginService{
    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Override
    public Result login(User user) {
        logger.info("{}",user);
        if (StringUtil.isEmpty(user.getUsername()) || StringUtil.isEmpty(user.getPassword())){
            return Result.LOGIN_FAILURE;
        }
        if (user.getUsername().equals("aaa") && user.getPassword().equals("bbb")){
            return Result.LOGIN_SUCCESS;
        }
        return null;
    }
}
