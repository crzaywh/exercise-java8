package com.tigerwow.thread;

/**
 * @author Created by wanhu 2019-10-02 15:05
 */
public class InterruptDemo {

    public static void main(String[] args) throws InterruptedException {
        MyTestThread myTestThread = new MyTestThread();
        myTestThread.start();

        Thread.sleep(1000);
        myTestThread.interrupt();

//        Thread.currentThread().interrupt();

        myTestThread.join();

//        System.out.println("当前线程状态是否已经中断：" + Thread.interrupted());
        System.out.println("当前线程状态是否已经中断：" + myTestThread.isInterrupted());

    }
}
