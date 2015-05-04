package com.jwork.dp.singleton;

/**
 * ÀÁººÊ½
 * Created by wangzhijun on 2015/5/4.
 */
public class SingleTonLazy {

    private static SingleTonLazy instance;

    private SingleTonLazy(){

    }

    public static SingleTonLazy getInstance(){
        if(instance == null){
            instance = new SingleTonLazy();
        }
        System.out.println(SingleTonLazy.class.getName() + "-->getInstance");
        return instance;
    }
}
