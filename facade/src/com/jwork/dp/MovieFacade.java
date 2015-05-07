package com.jwork.dp;

/**
 * Created by wangzhijun on 2015/5/7.
 */
public class MovieFacade {
    private Light light;
    private Screen screen;
    private Popper popper;

    public MovieFacade(Light light, Screen screen, Popper popper) {
        this.light = light;
        this.screen = screen;
        this.popper = popper;
    }

    public void startMovie(){
        popper.on();
        popper.pop();

        light.lightOff();

        screen.down();
    }
}
