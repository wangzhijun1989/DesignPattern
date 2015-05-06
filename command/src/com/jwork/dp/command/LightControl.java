package com.jwork.dp.command;

/**
 * invoker
 * Created by wangzhijun on 2015/5/5.
 */
public class LightControl {
    private Command command;

    public LightControl(Command command){
        this.command = command;
    }
    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void control(){
        command.execute();
    }
}
