package com.study.demo.view.synchronizedone;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/13 17:07
 */
public class TestSynchronized {

    public synchronized void test1(){
        System.out.println("test1 begin");
        try {
            Thread.sleep(10000);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("test1 end");
    }

    public synchronized void test2(){
        System.out.println("test2 begin");
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("test2 end");
    }



    public static void main(String[] args) throws Exception{

        TestSynchronized testSynchronized = new TestSynchronized();
         class TestThread extends Thread{
            @Override
            public void run() {

                testSynchronized.test1();
            }
        }

         class TestThread2 extends Thread{

            @Override
            public void run() {
                testSynchronized.test2();
            }
        }

        TestThread testThread = new TestThread();
        testThread.start();

        TestThread2 testThread2 = new TestThread2();
        testThread2.start();

    }
}
