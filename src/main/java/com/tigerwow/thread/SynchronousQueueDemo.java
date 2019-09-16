package com.tigerwow.thread;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author Created by wanhu 2019-09-16 12:59
 */
public class SynchronousQueueDemo {
    public static void main(String[] args) throws InterruptedException {

        // 创建同步队列
        SynchronousQueue<Integer> queue = new SynchronousQueue<>(true);

        ThreadFactory factory = new ThreadFactoryBuilder().setNameFormat("demo-thread-pool-%s").build();
        // 创建3个线程的固定线程池
        ThreadPoolExecutor executorService = new ThreadPoolExecutor(4, 6, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(), factory);

        executorService.execute(() -> {
            try {
                queue.put(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            try {
                queue.put(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        executorService.execute(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        executorService.execute(() -> {
            try {
                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) executorService;
        // 获取核心线程数
        System.out.println("核心线程数:" + threadPoolExecutor.getCorePoolSize());
        // 获取线程总数
        System.out.println("线程总数:" + threadPoolExecutor.getPoolSize());
        // 获取当前活动的线程数
        System.out.println("活动的线程数:" + threadPoolExecutor.getActiveCount());

    }
}
