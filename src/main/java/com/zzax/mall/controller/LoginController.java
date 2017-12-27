package com.zzax.mall.controller;

import com.zzax.mall.domain.Userinfo;
import com.zzax.mall.entity.JsonResult;
import com.zzax.mall.enums.Result;
import com.zzax.mall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 11:04 星期五
 */
@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 用户提交登录信息
     * @param userinfo
     * @return json信息
     */
    @PostMapping("/login")
    public JsonResult login(Userinfo userinfo){
        Result result = loginService.login(userinfo);
        return JsonResult.parse(result);
    }




}
