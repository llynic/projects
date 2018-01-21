package com.zzax.mall.controller;

import com.alibaba.fastjson.JSONObject;
import com.sun.org.apache.regexp.internal.RE;
import com.zzax.mall.domain.Goods;
import com.zzax.mall.domain.Receipt;
import com.zzax.mall.domain.Shop;
import com.zzax.mall.domain.page.PageResult;
import com.zzax.mall.domain.vin.VinDetail;
import com.zzax.mall.entity.JsonResult;
import com.zzax.mall.enums.Result;
import com.zzax.mall.service.GoodsService;
import com.zzax.mall.service.ReceiptService;
import com.zzax.mall.service.ShopService;
import com.zzax.mall.util.CodeUtil;
import com.zzax.mall.util.StringUtil;
import com.zzax.mall.util.VinUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * @Description 我的商品模块
 * @Created by wangzhenjia
 * @Date 21:14 2018/1/6
 */

@Controller
@RequestMapping(value = "/shop")
public class ShopController {
    private static final Logger logger = LoggerFactory.getLogger(ShopController.class);

    @Autowired
    private ReceiptService receiptService;
    @Autowired
    private GoodsService goodsService;
    @Autowired
    private ShopService shopService;


    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public String list(PageResult result,Model model){
        List<Shop> shops = shopService.getShopList(result);
        model.addAttribute("shops",shops);
        return "shop/list";
    }


    /**
     * 我的商品列表
     * @param result
     * @return
     */
    /*@RequestMapping(value = "/shopList", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Receipt> list(PageResult result) {
        logger.info("{}", result);
        return shopService.getList(result);
    }*/


    /**
     * 添加商品
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "/add/{id}", method = RequestMethod.GET)
    public String add(@PathVariable("id") String id, Model model) {
        if (null != id && Integer.valueOf(id) > 0) {
            Receipt receipt = receiptService.selectReceiptById(id);
            Goods goods = goodsService.selectGoodsById(receipt.getId());

            logger.info(goods.getVinCode());
            //VinDetail vinDetail = VinUtil.getVinDetailJson(goods.getVinCode());
            //logger.info("{}",vinDetail);
            //model.addAttribute("result", vinDetail.getResult());
            model.addAttribute("receipt", receipt);
            model.addAttribute("goods", goods);

            return "shop/add1";
        } else {
            return "shop/add";
        }
    }

    /**
     * 添加商品-选择仓单
     *
     * @param id
     * @return
     */
    @RequestMapping(value = "/selectReceipt", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult selectReceipt(@RequestParam("id") String id) {
        logger.info("{}", id);
        return new JsonResult(true, 0000, "成功");
    }

    /**
     * 保存商品(未上架)
     * @param goods
     * @return
     */
    @RequestMapping(value = "/saveShop", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult saveShop(Goods goods) {
        boolean ret = shopService.saveToShop(goods);
        if (ret) {
            return JsonResult.parse(Result.SUCCESS);
        } else {
            return JsonResult.parse(Result.FAILURE);
        }
    }

    /**
     * 直接上架商品
     * @param goods
     * @return
     */
    @RequestMapping(value = "/shelveShop", method = RequestMethod.POST)
    @ResponseBody
    public JsonResult shelveShop(Goods goods) {
        boolean ret = shopService.shelveShop(goods);
        if (ret) {
            return JsonResult.parse(Result.SUCCESS);
        } else {
            return JsonResult.parse(Result.FAILURE);
        }
    }


    /**
     * 查看商品详情
     *
     * @return
     */
    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail() {
        return "shop/detail";
    }
}
