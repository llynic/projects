package com.zzax.mall.service;

import com.zzax.mall.domain.Userinfo;
import com.zzax.mall.enums.Result;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:16 星期五
 */
public interface LoginService {
    Result login(Userinfo userinfo);
}
