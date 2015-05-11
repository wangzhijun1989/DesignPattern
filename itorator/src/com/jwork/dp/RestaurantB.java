package com.jwork.dp;

/**
 * 采用数组方式存放自己的菜单
 * Created by wangzhijun on 2015/5/11.
 */
public class RestaurantB {
    private MenuItem[] items = new MenuItem[4];
    private int index = 0;
    public RestaurantB(){
        addItem("name1B","name1B desc",5.6d, true);
        addItem("name2B","name2B desc",10.0d, false);
        addItem("name3B","name3B desc",3.6d, true);
        addItem("name4B","name4B desc",5.6d, true);

    }

    private void addItem(String name, String desc, double price, boolean vegetarian) {
        MenuItem item = new MenuItem(name, desc, price, vegetarian);
        items[index] = item;
        index++;
    }

    public Iterator<MenuItem> createIterator(){
        return new RestauantBIterator(items);
    }
}
