package com.study.demo.oom;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 JVM参数虎置演不

 -xms10m -Xmx10m -xx: +PrintGCDetails -XX:MaxDirectMemorysize= 5m

 *GC回收时间过长时会抛lHoutofMemroyError.过长的定义是，超过98%的时间用来做G并且回
 * 收了不到2%的堆内存e 连续多次GC都只回收了不到2%的极端情况下才会抛出。假如不抛出
 *GC overhead limit 错误会发生什么情况呢?” 那就是GC清理的这么点内存很快会再次填满，
 * 迫使GC再次执行，这样就形成恶性循环，CPU使用率一-直是100%，而iGC 却没有任何成果
 *
 *full gc公式
 * 名称： gc前内存占用->gc后内存占用 该区域内存总大小
 * Full GC (Ergonomics) [PSYoungGen: 2047K->2047K(2560K)]  年轻代-fullGC之前2047K-FullGC之后2047K（总共2560k）
 * [ParOldGen: 7076K->7076K(7168K)] 9124K->9124K(9728K),
 * [Metaspace: 3219K->3219K(1056768K)], 0.0335725 secs] [Times: user=0.03 sys=0.00, real=0.03 secs]
 * [Full GC (Ergonomics) Exception in thread "main" java.lang.OutOfMemoryError: GC overhead limit exceeded
 * [PSYoungGen: 2047K->2047K(2560K)] [ParOldGen: 7078K->7078K(7168K)] 9126K->9126K(9728K), [Metaspace: 3219K->3219K(1056768K)], 0.0322561 secs] [Times: user=0.09 sys=0.00, real=0.03 secs]
 * [Full GC (Ergonomics) 	at java.lang.Integer.toString(Integer.java:403)
 * 	at java.lang.String.valueOf(String.java:3099)
 * 	at com.study.demo.oom.GCOverHeadLimitExceeded.main(GCOverHeadLimitExceeded.java:29)
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/27 22:44
 */
public class GCOverHeadLimitExceeded {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        int i = 0;
        while (true){
            list.add(String.valueOf(++i));
        }
    }
}
