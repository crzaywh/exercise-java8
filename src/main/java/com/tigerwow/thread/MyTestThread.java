package com.tigerwow.thread;

/**
 * @author Created by wanhu 2019-10-02 15:39
 */
public class MyTestThread extends Thread {

    private int totalCount = 2000;

    @Override
    public void run() {
        System.out.println("执行线程...");
        for (int i = 0; i < totalCount; i++) {
            System.out.println("totalCount=" + totalCount--);
        }
    }
}
