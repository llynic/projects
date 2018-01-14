package com.zzax.mall.controller;

import com.zzax.mall.domain.page.PageResult;
import com.zzax.mall.domain.Receipt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String index() {
        return "receipt/list";
    }

    @RequestMapping(value = "/receiptList", method = RequestMethod.GET)
    @ResponseBody
    public PageResult<Receipt> list(PageResult result) {
        logger.info("{}", result);
        List list = new ArrayList();
        for (int i = 0; i < result.getPageSize(); i++) {
            Receipt receipt = new Receipt();
            //receipt.setBrand("路虎");
            receipt.setCode("CD001002003" + i);
            //receipt.setId(i);
            receipt.setStatus(i % 2 + "");
            //receipt.setPrice("123456");
            //receipt.setValid(new Date());
            receipt.setDepotAddress("郑州杞信仓库");
            list.add(receipt);
        }
        PageResult<Receipt> pageResult = new PageResult<>();
        pageResult.setTotal(50);
        pageResult.setRows(list);
        pageResult.setPageNumber(result.getPageNumber());
        pageResult.setPageSize(10);
        return pageResult;
    }

    @RequestMapping(value = "/detail", method = RequestMethod.GET)
    public String detail() {
        return "receipt/detail";
    }

    @RequestMapping(value = "/detail1", method = RequestMethod.GET)
    public String detail1() {
        return "receipt/detail1";
    }


}
