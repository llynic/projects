package com.zzax.mall.controller;

import com.sun.org.apache.regexp.internal.RE;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description 我的商品模块
 * @Created by wangzhenjia
 * @Date 21:14 2018/1/6
 */

@Controller
@RequestMapping(value = "/shop")
public class ShopController {
    public static final Logger logger = LoggerFactory.getLogger(ShopController.class);

    @RequestMapping(value = "/add",method = RequestMethod.GET)
    public String addShop(){
        return "shop/add";
    }

    @RequestMapping(value = "/detail",method = RequestMethod.GET)
    public String detail(){
        return "shop/detail";
    }
}
