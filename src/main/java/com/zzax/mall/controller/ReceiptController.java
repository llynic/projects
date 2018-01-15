package com.zzax.mall.controller;

import com.zzax.mall.domain.Goods;
import com.zzax.mall.domain.page.PageResult;
import com.zzax.mall.domain.Receipt;
import com.zzax.mall.service.GoodsService;
import com.zzax.mall.service.ReceiptService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Description 我的仓单模块
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 10:47 星期五
 */

@Controller
@RequestMapping(value = "/receipt")
public class ReceiptController {
    public static final Logger logger = LoggerFactory.getLogger(ReceiptController.class);

    @Autowired
    private ReceiptService receiptService;

    @Autowired
    private GoodsService goodsService;

    /**
     * 我的仓单列表
     * @param result
     * @return
     */
    @RequestMapping(value = "/receiptList", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Receipt> list(PageResult result) {
        logger.info("{}", result);
        return receiptService.getList(result);
    }

    /**
     * 根据仓单ID查看仓单详情
     *
     * @return
     */
    @RequestMapping(value = "/detail/{id}", method = RequestMethod.GET)
    public String detail(@PathVariable("id") String id, Model model) {
        logger.info("当前查看的仓单id为:" + id);
        Receipt receipt = receiptService.selectReceiptById(id);
        Goods goods = goodsService.selectGoodsById(receipt.getId());
        model.addAttribute("receipt", receipt);
        logger.info("{}",receipt);
        model.addAttribute("goods", goods);
        logger.info("{}",goods);
        return "receipt/detail";
    }
}
