package com.jwork.dp.command;

/**
 * Created by wangzhijun on 2015/5/5.
 */
public class LightOnCommand implements Command{
    private Light light;

    public LightOnCommand (Light light){
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.lightOn();
    }

    @Override
    public void undo() {
        light.lightOn();
    }
}
