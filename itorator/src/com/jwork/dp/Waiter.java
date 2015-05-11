package com.jwork.dp;

/**
 * 女服务员有如下方法，若依照目前餐厅 只能获取集合分别遍历两个餐厅菜单，
 * 因此我们实现了iterator,而且对外开放，使得 使用者加入自己的逻辑控制，
 * 本例中加入了是否是素食方法
 * Created by wangzhijun on 2015/5/11.
 */
public class Waiter {
    private RestaurantA restaurantA;
    private RestaurantB restaurantB;

    public Waiter(RestaurantA restaurantA, RestaurantB restaurantB) {
        this.restaurantA = restaurantA;
        this.restaurantB = restaurantB;
    }

    public void printAItems(){
        Iterator<MenuItem> iterator = restaurantA.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    public void printBItems(){
        Iterator<MenuItem> iterator = restaurantB.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public void printItems(){
        printAItems();
        printBItems();
    }

    public void printVegetarianItem(){
        while(restaurantA.createIterator().hasNext()){
            MenuItem item = restaurantA.createIterator().next();
            if(item.isVegetarian()){
                System.out.println(item);
            }
        }
    }

    public boolean isItemVegetarian(String itemName){
        return false;
    }
}
