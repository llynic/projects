package com.zzax.mall.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description 我的仓单模块
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 10:47 星期五
 */

@Controller
@RequestMapping(value = "/receipt")
public class ReceiptController {
    public static final Logger logger = LoggerFactory.getLogger(ReceiptController.class);

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String index(){
        return "receipt/list";
    }



}
