package com.jwork.dp.singleton;

/**
 * Initialization on Demand Holder
 * 如果需要懒加载可以使用
 * Created by wangzhijun on 2015/5/4.
 */
public class SingleTonWithHolder {
    private SingleTonWithHolder() {

    }

    private static class SingleTonHolder {
        private static SingleTonWithHolder instance = new SingleTonWithHolder();
    }

    public static SingleTonWithHolder getInstance() {
        return SingleTonHolder.instance;
    }
}
