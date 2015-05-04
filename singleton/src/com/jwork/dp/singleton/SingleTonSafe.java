package com.jwork.dp.singleton;

/**
 * 线程安全的懒汉式
 * Created by wangzhijun on 2015/5/4.
 */
public class SingleTonSafe {

    private static SingleTonSafe instance;

    private SingleTonSafe(){

    }

    public static SingleTonSafe getInstance(){
        if(instance == null){
            synchronized (SingleTonSafe.class){
                if (instance == null){
                    instance = new SingleTonSafe();
                }
            }
        }
        System.out.println(SingleTonSafe.class.getName() + "-->getInstance");
        return instance;
    }

}
