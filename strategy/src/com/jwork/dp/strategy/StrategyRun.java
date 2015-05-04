package com.jwork.dp.strategy;

/**
 * Created by wangzhijun on 2015/5/4.
 */
public class StrategyRun {
    public static void main(String args[]){
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }
}
