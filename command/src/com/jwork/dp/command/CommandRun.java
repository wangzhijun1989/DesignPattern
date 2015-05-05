package com.jwork.dp.command;

/**client
 * Created by Administrator on 2015/5/5.
 */
public class CommandRun {
    public static void  main(String args[]){
        Light light = new Light();
        Command command = new LightOnCommand(light);
        LightControl control = new LightControl(command);
        control.control();
    }
}
