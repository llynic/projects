package com.zzax.mall.util;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zzax.mall.domain.vin.NullVinDetail;
import com.zzax.mall.domain.vin.VinDetail;
import org.apache.http.HttpResponse;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description 根据汽车Vin号 查询汽车的信息
 * @Created By : wangzhenjia
 * @DATE 2018-01-17 16:40 星期三
 */
public class VinUtil {

    private static final Logger logger = LoggerFactory.getLogger(VinUtil.class);

    public static VinDetail getVinDetailJson(String vinCode){
        VinDetail vinDetail = new VinDetail();
        String jsonStr="";
        String host = "http://jisuvindm.market.alicloudapi.com";
        String path = "/vin/query";
        String method = "GET";
        String appcode = "4cbb9e0a1f6f4297bd8f15db385c5ff5";
        Map<String, String> headers = new HashMap<>();
        //最后在header中的格式(中间是英文空格)为Authorization:APPCODE 83359fd73fe94948385f570e3c139105
        headers.put("Authorization", "APPCODE " + appcode);
        Map<String, String> querys = new HashMap<>();
        querys.put("vin", vinCode);
        try {
            HttpResponse response = HttpUtil.doGet(host, path, method, headers, querys);
            jsonStr= EntityUtils.toString(response.getEntity());
            vinDetail= JSON.parseObject(jsonStr, VinDetail.class);
        } catch (Exception e) {
            NullVinDetail nullVinDetail =new NullVinDetail();
            nullVinDetail= JSON.parseObject(jsonStr, NullVinDetail.class);
            vinDetail=new VinDetail(nullVinDetail.getStatus(),nullVinDetail.getMsg());
        }
        return vinDetail;
    }


    public static void main(String[] args) {
        VinDetail vinDetail = getVinDetailJson("LJ12EKR26G4004949");
        logger.info("{}",vinDetail);
    }
}
