package com.jwork.dp;

/**
 * 实现数组方式的迭代器
 * Created by wangzhijun on 2015/5/11.
 */
public class RestauantBIterator implements Iterator{

    private MenuItem[] items;

    private int position;

    public RestauantBIterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public MenuItem next() {
        if (hasNext()){
            MenuItem item = items[position];
            position++;
            return item;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }else{
            return true;
        }
    }
}
