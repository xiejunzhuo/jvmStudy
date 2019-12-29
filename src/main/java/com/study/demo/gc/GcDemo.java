package com.study.demo.gc;

import java.util.Random;

/**
 * -Xms10m -Xmx10m -XX:+PrintGcDetails -XX:+Pr intCommandL ineFlags -XX: +UseSerialGc  (DefNew+ Tenured)
 * <p>
 * I
 * <p>
 * -Xms10m -Xmx10m -XX: +PrintGCDetails -XX: +PrintCommandL ineFlags - xX: +UseParNewGC  (ParNew+ Tenured)
 * <p>
 * HiHA: Java HotSpot(TM) 64-Bit Server VM warning:
 * <p>
 * Using the ParNew young collector with the Serial old collector is deprecatedand will likely be removed in a future release
 * <p>
 * -Xms10m -Xmx10m -XX: +PrintGCDetails -XX:+PrintCommandL ineFlags -XX: +UseParallelGC  (PSYoungGen+ParOldGen)
 * <p>
 * 4
 * <p>
 * " 4.1
 * <p>
 * -Xms10m -Xmx10m -xX: +PrintGCDetails -xX: +PrintCommandL ineFlags -XX: +UseParallelOldGc  (PSYoungGen+ParOl dGen)
 * 4.2 TetiUseParallelGC
 * <p>
 * Xms10m -Xmx10m - xX:+PrintGCDetails -Xx:+PrintCommandL ineFlags  (PSYoungGen+ParOl dGen)
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/29 23:00
 */
public class GcDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("9**GCDemo hello");
        try {
            String str = "atguigu";
            while (true) {
                str += str + new Random().nextInt(777777) + new Random().nextInt(8888888);
                str.intern();
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }
}
