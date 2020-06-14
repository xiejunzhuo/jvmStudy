package com.study.demo.juc;

import java.util.concurrent.CountDownLatch;

/**
 * <p>CountDownLatch
 *
 * 让一些线程阻塞直到另外一些完成后才被唤醒
 * CountDownLatch主要有两个方法,当一个或多个线程调用await方法时,
 * 调用线程会被阻塞.其他线程调用countDown方法计数器减1
 * (调用countDown方法时线程不会阻塞),当计数器的值变为0,因调用await方法被阻塞的线程会被唤醒,继续执行
 *
 *
 * 在前面线程搜执行完后在执行
 * 如：所有人上完晚自习，班长最后关门
 * </p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/6 9:36
 */
public class CountDownLatchDemo {
    public static void main(String []args)throws  Exception{
//        notUseCountDownLatch();
        useCountDownLatch();
    }

    private static void useCountDownLatch() throws Exception{

        CountDownLatch countDownLatch = new CountDownLatch(6);
        for (int i = 0;i<6;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t上完晚自习，离开教室");
                //计数减一
                countDownLatch.countDown();
            },String.valueOf(i)).start();
        }
        //等待线程执行完成 减为0后执行
        countDownLatch.await();
        System.out.println(Thread.currentThread().getName()+"\t班长最后锁门走人88888");
    }

    private static void notUseCountDownLatch() {
        /**
         * 1	上完晚自习，离开教室
         * 2	上完晚自习，离开教室
         * 0	上完晚自习，离开教室
         * 4	上完晚自习，离开教室
         * main	班长最后锁门走人88888
         * 5	上完晚自习，离开教室
         * 3	上完晚自习，离开教室
         *
         *
         * 问题：班长不是最后一个走的
         */
        for (int i = 0;i<6;i++){
            new Thread(()->{
                System.out.println(Thread.currentThread().getName()+"\t上完晚自习，离开教室");
            },String.valueOf(i)).start();
        }
        System.out.println(Thread.currentThread().getName()+"\t班长最后锁门走人88888");
    }
}
