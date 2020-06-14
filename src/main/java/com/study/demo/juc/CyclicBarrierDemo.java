package com.study.demo.juc;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * <p>CyclicBarrier的字面意思是可循环(Cyclic) 使用的屏障(barrier).
 * 它要做的事情是,让一组线程到达一个屏障(也可以叫做同步点)时被阻塞,
 * 知道最后一个线程到达屏障时,屏障才会开门,所有被屏障拦截的线程才会
 * 继续干活,线程进入屏障通过CyclicBarrier的await()方法.</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/6 10:27
 */
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(7,()->{System.out.println("召唤神龙");});
        for (int i=1;i<=7;i++){
            final  int tempInt = 1;
            new Thread(()->{
                    System.out.println(Thread.currentThread().getName()+"收集龙珠");
                try {
                    cyclicBarrier.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (BrokenBarrierException e) {
                    e.printStackTrace();
                }
            },String.valueOf(i)).start();


        }
    }
}
