package com.jwork.dp;

/**
 * 茶是一种咖啡因饮料
 * Created by wangzhijun on 2015/5/7.
 */
public class Tea extends CaffeineBevenage{
    @Override
    protected void addCondiments() {
        System.out.println("不加佐料");
    }

    @Override
    protected void brew() {
        System.out.println("放茶叶");
    }
}
