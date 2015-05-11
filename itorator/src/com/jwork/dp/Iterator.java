package com.jwork.dp;

/**
 * 定义自己的迭代器接口, 对外看来，数据格式统一，
 * 外界只需调用，next（）, hasNext（）统一的方法。
 * 而不需要知道 里面的具体实现
 * Created by wangzhijun on 2015/5/11.
 */
public interface Iterator<T> {
    T next();
    boolean hasNext();
}
