package com.jwork.dp.adapter;

/**
 * client
 * client 想看鸭子飞跟叫 这两个行为
 * 但是目前没有鸭子只有火鸡，所以只能拿火鸡来冒充
 * 这时需要适配器实现 client的目标接口，并含有一个火鸡对象，
 * 用火鸡的行为来模仿目标接口的行为
 * Created by wangzhijun on 2015/5/7.
 */
public class AdapterRun {
    public static void main(String srgs[]){
        Duck duck = new MallardDuck();//创建一个野鸭子
        testDuckBehaivor(duck);

        Turkey turkey = new WildTurkey();//创建一个火鸡并测试行为
        turkey.fly();
        turkey.gobble();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);//适配火鸡
        testDuckBehaivor(turkeyAdapter);
    }

    private static void testDuckBehaivor(Duck duck) {
        duck.quack();
        duck.fly();
        System.out.println("====behaivor end");
    }
}
