package com.jwork.dp.strategy;

/**
 * Created by wangzhijun on 2015/5/4.
 */
public class MallardDuck extends Duck{
    public MallardDuck() {
        name = "mallard";
        color = "green";
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

}
