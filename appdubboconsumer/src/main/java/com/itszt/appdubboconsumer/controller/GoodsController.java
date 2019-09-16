package com.itszt.appdubboconsumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itszt.entity.Goods;
import com.itszt.inter.IGoodsService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Reference(version = "2.0")
    private IGoodsService iGoodsService;

    @GetMapping("goods")
    public Goods getGoods(){
        return iGoodsService.getGoods();
    }

}
