package com.zzax.mall.service.impl;

import com.zzax.mall.domain.User;
import com.zzax.mall.enums.Result;
import com.zzax.mall.service.LoginService;
import com.zzax.mall.util.SessionUtil;
import com.zzax.mall.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.util.WebUtils;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:17 星期五
 */
@Service
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);
    String username = "aaa";
    String password = "123";
    String nickname = "llynic";


    @Override
    public Result login(User user) {
        logger.info("{}", user);
        if (StringUtil.isEmpty(user.getUsername())) {
            return Result.USERNAME_NULL;
        } else if (StringUtil.isEmpty(user.getPassword())) {
            return Result.PASSWORD_NULL;
        }

        if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
            SessionUtil.setUserInSession(user);
            return Result.LOGIN_SUCCESS;
        } else {
            return Result.LOGIN_FAILURE;
        }
    }
}
