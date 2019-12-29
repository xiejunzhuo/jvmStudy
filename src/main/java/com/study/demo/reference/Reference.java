package com.study.demo.reference;

/**
 * 强引用
 *
 * 存在强引用的对象不会被gc回收
 * 当内存不足，JVM开始垃圾回收，对于强引用的对象，就算是出现了OOM也不会对该对象进行回收，死都不收
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/28 21:42
 */
public class Reference {
    public static void main(String[] args) {
        Object object1 = new Object();
        Object object2 = object1;
        System.out.println(object1);
        System.out.println(object2);
        System.out.println("======================================");
        System.gc();
        System.out.println(object1);
        System.out.println(object2);
        System.out.println("======================================");
        object1 = null;
        System.gc();
        System.out.println(object1);
        System.out.println(object2);

    }

    /*
     * java.lang.Object@1b6d3586
     * java.lang.Object@1b6d3586
     * ======================================
     * java.lang.Object@1b6d3586
     * java.lang.Object@1b6d3586
     * ======================================
     * null
     * java.lang.Object@1b6d3586
     *
     */
}
