package com.study.demo.oom;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * 	at java.util.Arrays.copyOf(Arrays.java:3332)
 * 	at java.lang.AbstractStringBuilder.ensureCapacityInternal(AbstractStringBuilder.java:124)
 * 	at java.lang.AbstractStringBuilder.append(AbstractStringBuilder.java:674)
 * 	at java.lang.StringBuilder.append(StringBuilder.java:208)
 * 	at com.study.demo.oom.JavaHeapSpace.main(JavaHeapSpace.java:16)
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/27 22:19
 */
public class JavaHeapSpace {
    /**
     * 每次new出一个对象 再加上设置 -Xms10m -Xmx10m来设置初始堆大小和最大值
     * 很容易出现堆内存溢出
     * @param args
     */
    public static void main(String[] args) {
        //outHeapSpace();
        byte [] bytes = new byte[50*1024*1024];
        return;
    }

    private static void outHeapSpace() {
        String str = "青年开发者日志";
        while (true){
            str = str+ new Random().nextInt(11111111)+new Random().nextInt(22222222);
            str.intern();
        }
    }
}
