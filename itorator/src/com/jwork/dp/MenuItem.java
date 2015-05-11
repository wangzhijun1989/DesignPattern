package com.jwork.dp;

/**
 * ²Ëµ¥»ùÀà
 * Created by wangzhijun on 2015/5/11.
 */
public class MenuItem {
    private String name;
    private String desc;
    private double price;
    private boolean vegetarian;

    public MenuItem(String name, String desc, double price, boolean vegetarian) {
        this.name = name;
        this.desc = desc;
        this.price = price;
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String toString(){
        return name + " " + desc + " " + price + " " + vegetarian;
    }
}
