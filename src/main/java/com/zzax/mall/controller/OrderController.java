package com.zzax.mall.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description 订单管理类
 * @Created by wangzhenjia
 * @Date 21:14 2018/1/6
 */
@Controller
@RequestMapping(value = "/order")
public class OrderController {
    /**
     * 我的订单列表
     * @return
     */
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(){
        return "order/list";
    }
}
