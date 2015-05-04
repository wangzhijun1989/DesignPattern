package com.jwork.dp.singleton;

/**
 * 饿汉式
 * 如果单例对象不大，允许非懒加载，可以使用这个方式
 * Created by wangzhijun on 2015/5/4.
 */
public class SingleTonEarly {

    private static SingleTonEarly instance = new SingleTonEarly();

    private SingleTonEarly(){

    }

    public static SingleTonEarly getInstance(){
        System.out.println(SingleTonEarly.class.getName() + "-->getInstance");
        return instance;
    }

}
