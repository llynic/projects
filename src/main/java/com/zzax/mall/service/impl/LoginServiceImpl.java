package com.zzax.mall.service.impl;

import com.zzax.mall.domain.Userinfo;
import com.zzax.mall.enums.Result;
import com.zzax.mall.mapper.UserinfoMapper;
import com.zzax.mall.service.LoginService;
import com.zzax.mall.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:17 星期五
 */
@Service
public class LoginServiceImpl implements LoginService {
    private Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    private UserinfoMapper userinfoMapper;

    @Override
    public Result login(Userinfo userinfo) {
        logger.info("{}", userinfo);
        if (StringUtil.isEmpty(userinfo.getUsername())) {
            return Result.USERNAME_NULL;
        } else if (StringUtil.isEmpty(userinfo.getPassword())) {
            return Result.PASSWORD_NULL;
        }

        Userinfo user = userinfoMapper.selectByUsernameAndPassword(userinfo);
        if (user != null) {
            return Result.LOGIN_SUCCESS;
        } else {
            return Result.LOGIN_FAILURE;
        }
    }
}
