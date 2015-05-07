package com.jwork.dp.adapter;

/**
 * 野鸭子实现了鸭子的fly 跟 quack两种行为
 * Created by wangzhijun on 2015/5/7.
 */
public class MallardDuck implements Duck{
    @Override
    public void fly() {
        System.out.println("MallardDuck fly");
    }

    @Override
    public void quack() {
        System.out.println("MallardDuck quack");
    }
}
