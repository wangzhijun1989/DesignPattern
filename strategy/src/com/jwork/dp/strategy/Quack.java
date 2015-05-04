package com.jwork.dp.strategy;

/**
 * Created by wangzhijun on 2015/5/4.
 */
public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
