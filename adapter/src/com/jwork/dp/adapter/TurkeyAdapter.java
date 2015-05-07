package com.jwork.dp.adapter;

/**
 * Created by wangzhijun on 2015/5/7.
 */
public class TurkeyAdapter implements Duck{

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey){
        this.turkey = turkey;
    }

    @Override
    public void fly() {
        for (int i=0;i<5;i++){
            turkey.fly();
        }
    }

    @Override
    public void quack() {
        turkey.gobble();
    }
}
