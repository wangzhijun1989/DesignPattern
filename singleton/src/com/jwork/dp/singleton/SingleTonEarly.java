package com.jwork.dp.singleton;

/**
 * ¶öººÊ½
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
