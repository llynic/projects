package com.zzax.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description
 * @Created by wangzhenjia
 * @Date 21:14 2018/1/6
 */

@Controller
@RequestMapping(value = "/shop")
public class ShopController {
    public static final Logger logger = LoggerFactory.getLogger(ReceiptController.class);

    @GetMapping("/myshop")
    public String index(){
        return "receipt/accessory";
    }
}
