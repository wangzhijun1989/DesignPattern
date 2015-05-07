package com.jwork.dp;

/**
 * 咖啡因饮料
 * 高层（父类）决定算法模板，并可以定义钩子，由高层来调用子类
 * 与策略不同的是，继承与组合。
 * 策略完全替换算法（有算法族），模板是部分交给子类处理
 * Created by wangzhijun on 2015/5/7.
 */
abstract class CaffeineBevenage {
    /**
     * 准备处方
     * final不可被重写
     */
    final void preparerecipe(){
        boidWater();
        brew();
        pourInCup();
        addCondiments();
    }

    /**
     * 加佐料
     * 也可以叫hook 钩子 子类（低层）决定是否重写
     * 钩子也可以作为判断条件来处理流程if(useXXX()),useXXX()由子类来重写
     */
    protected abstract void addCondiments();

    /**
     * 倒进杯子
     */
    protected void pourInCup(){
        System.out.println("pourInCup");
    }

    /**
     * 泡
     */
    protected abstract void brew();

    /**
     * 烧水
     */
    protected void boidWater(){
        System.out.println("boidWater");
    }
}
