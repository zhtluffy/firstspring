package com.itszt.newprovider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.itszt.entity.Goods;
import com.itszt.inter.IGoodsService;

@Service(version = "2.0")
public class GoodsServiceImpl implements IGoodsService {

    @Override
    public Goods getGoods() {
        System.out.println("GoodsServiceImpl.getGoods");
        return null;
    }
}
