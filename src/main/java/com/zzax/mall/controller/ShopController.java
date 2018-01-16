package com.zzax.mall.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.zzax.mall.domain.Goods;
import com.zzax.mall.domain.Receipt;
import com.zzax.mall.entity.JsonResult;
import com.zzax.mall.service.GoodsService;
import com.zzax.mall.service.ReceiptService;
import com.zzax.mall.util.StringUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * @Description 我的商品模块
 * @Created by wangzhenjia
 * @Date 21:14 2018/1/6
 */

@Controller
@RequestMapping(value = "/shop")
public class ShopController {
    public static final Logger logger = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private ReceiptService receiptService;

    @Autowired
    private GoodsService goodsService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) {
        /*if (!id.equals("-1")) {
            Receipt receipt = receiptService.selectReceiptById(id);
            Goods goods = goodsService.selectGoodsById(receipt.getId());
            model.addAttribute("receipt",receipt);
            model.addAttribute("goods",goods);
        }*/
        return "shop/add";
    }

    @RequestMapping(value = "/addShop", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult addShop(@RequestParam("id") String id) {
        logger.info("{}", id);
        return new JsonResult(true, 0000, "成功");
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail() {
        return "shop/detail";
    }
}
