package com.study.demo.oom;

/**
 *       *高并发请求服务器时,经常出现如下异常: java. lang. OutOfMemoryError: unable to create new native threadr 准确的讲i该native thread异常与对应的平台有关
 *
 *       *导致原因:
 *
 *       你的应用创建了太多线程了,一个应用进程创建多个线程超过系统承载极限
 *
 *       2你的服务 器并不允许你的应用程序创建这么多线程，linux系统默以允许单个进程可以创建的线程数是1024个，
 *
 *       你的应用创建超过这个数量,就会报java. lang. OutOfMemoryError: unable to create new native thread解决办法:
 *
 *       1.想办法降低你应用程序创建线程的数量，分析应用是否真的需要创建这么多线程，如果不是，改代码将线程数降到最低
 *
 *       2.对于有的应用，磅实需要创建很多线程远超过inux系统的默认1024个线程的限制,可以通过修改l inux服务器配置,扩大( inux默认限制
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/29 12:14
 */
public class UnableCreateNewNativeThread {
    public static void main(String[] args) {
        for (int i= 1;;i++){
            System.out.println(i);
//            new Thread(() -> {
//                try { Thread.sleep(Integer.MAX_VALUE); }catch (InterruptedException e){ e.printStackTrace(); }
//            },""+i).start();

            Thread thread = new Thread(new Runnable(){
                public void run() {
                    try {    Thread.sleep(Integer.MAX_VALUE); }catch (InterruptedException e){ e.printStackTrace(); }
                }
            });

            thread.start();
        }
    }

}
