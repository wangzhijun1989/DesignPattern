package com.jwork.dp.command;

/**
 * Created by wangzhijun on 2015/5/5.
 */
public interface Command {
    void execute();
    void undo();
}
