package com.jwork.dp.adapter;

/**
 * 火鸡的子类，只能飞一小段距离
 * Created by wangzhijun on 2015/5/7.
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble Gobble");
    }

    @Override
    public void fly() {
        System.out.println("i can only fly a short distance");
    }
}
