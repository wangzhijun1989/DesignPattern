package com.jwork.dp;

import java.util.ArrayList;

/**
 * java 集合已实现了java自己的迭代器，不需我们去实现具体逻辑
 * Created by wangzhijun on 2015/5/11.
 */
public class RestaurantAIterator implements Iterator{
    private java.util.Iterator iterator;

    private ArrayList<MenuItem> list;

    public RestaurantAIterator(ArrayList<MenuItem> list) {
        this.list = list;
        iterator = list.iterator();
    }

    @Override

    public MenuItem next() {
       return (MenuItem)iterator.next();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }
}
