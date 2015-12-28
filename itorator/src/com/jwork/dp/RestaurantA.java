package com.jwork.dp;

import java.util.ArrayList;

/**
 * 使用集合存放自己的菜单
 * Created by wangzhijun on 2015/5/11.
 */
public class RestaurantA {
    private ArrayList<MenuItem> list = new ArrayList<MenuItem>();
    public RestaurantA(){
        addItem("name1","name1 desc",5.6d, true);
        addItem("name2","name2 desc",10.0d, false);
        addItem("name3","name3 desc",3.6d, true);
        addItem("name4","name4 desc",5.6d, true);

    }

    private void addItem(String name, String desc, double price, boolean vegetarian) {
        MenuItem item = new MenuItem(name, desc, price, vegetarian);
        list.add(item);
    }

    public void getItems(){

    }

    public Iterator<MenuItem> createIterator(){
        return new RestaurantAIterator(list);
    }
}
