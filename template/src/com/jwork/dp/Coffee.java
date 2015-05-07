package com.jwork.dp;

/**
 * 咖啡是一种咖啡因饮料
 * Created by wangzhijun on 2015/5/7.
 */
public class Coffee extends CaffeineBevenage{
    @Override
    protected void addCondiments() {
        System.out.println("加牛奶");
    }

    @Override
    protected void brew() {
        System.out.println("放咖啡");
    }
}
