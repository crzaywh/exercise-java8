package com.tigerwow.thread;

import java.util.concurrent.ThreadFactory;

/**
 * @author Created by wanhu 2019-09-11 14:11
 */
public class MyThreadPool implements ThreadFactory {

    @Override
    public Thread newThread(Runnable r) {
        return new Thread("");
    }
}
