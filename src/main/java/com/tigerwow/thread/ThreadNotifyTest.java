package com.tigerwow.thread;

/**
 * 线程通信
 * create by vvh 2019/10/22 上午10:49
 */
public class ThreadNotifyTest {
    public static void main(String[] args) throws InterruptedException {
        Gun gun = new Gun();
        Load load = new Load(gun);
        Shoot shoot = new Shoot(gun);

        Thread thread1 = new Thread(shoot);
        thread1.start();

        Thread thread2 = new Thread(load);
        thread2.start();
    }

    static class Gun {

        int total = 20;

        public Gun(int total) {
            this.total = total;
        }

        public Gun() {

        }

        public synchronized void load() throws InterruptedException {
            if (total == 0) {
                System.out.println("没有子弹了，开始装枪，" + total++);
                notify();
            }
        }

        public synchronized void shoot() throws InterruptedException {
            if (total == 0) {
                System.out.println("没有子弹了！");
                wait();
            } else {
                System.out.println("开始射击！" + --total);
            }
        }
    }

    static class Load implements Runnable {
        private Gun gun;

        public Load(Gun gun) {
            this.gun = gun;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    gun.load();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Shoot implements Runnable {
        private Gun gun;

        public Shoot(Gun gun) {
            this.gun = gun;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    gun.shoot();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
