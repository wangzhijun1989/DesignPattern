package com.jwork.dp;

/**
 * 外观模式启动方法
 * 准备看电影，需要一系列操作
 * Created by wangzhijun on 2015/5/7.
 */
public class FacadeRun {
    public static void main(String args[]){
        Light light = new Light();
        Screen screen = new Screen();
        Popper popper = new Popper();
        //and so on
        MovieFacade facade = new MovieFacade(light,screen,popper);

        facade.startMovie();
    }
}
