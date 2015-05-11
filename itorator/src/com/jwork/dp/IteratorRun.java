package com.jwork.dp;

/**
 * µü´úÆ÷²âÊÔÀà
 * Created by wangzhijun on 2015/5/11.
 */
public class IteratorRun {
    public static void main(String args[]){
        RestaurantA a = new RestaurantA();
        RestaurantB b = new RestaurantB();
        Waiter waiter = new Waiter(a, b);
        waiter.printAItems();
        System.out.println("===========================");
        waiter.printBItems();
        System.out.println("===========================");
        waiter.printItems();
    }
}
