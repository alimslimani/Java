package com.highfi.sys.threads;

import java.util.concurrent.TimeUnit;

public class TaskRunnable {

    public static void main(String[] args) {
//        Runnable task = () -> {
//            String threadName = Thread.currentThread().getName();
//            System.out.println("Hello " + threadName);
//        };
//
//        task.run();
//
//        Thread thread = new Thread(task);
//        thread.start();
//
//        System.out.println("Done!");
        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();

    }


}
