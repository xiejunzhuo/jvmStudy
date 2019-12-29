package com.study.demo.reference;

import java.lang.ref.WeakReference;

/**
 * 弱引用
 * 只要有垃圾回收
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/28 22:18
 */
public class WeakReferenceDemo {
    public static void main(String[] args) {
        Object object = new Object();
        WeakReference<Object> weakReference = new WeakReference<Object>(object);

        System.out.println(object);
        System.out.println(weakReference.get());
        object = null;
        System.gc();
        System.out.println("=========================");
        System.out.println(object);
        System.out.println(weakReference.get());
        /*
        *
           java.lang.Object@1b6d3586
            java.lang.Object@1b6d3586
            =========================
            null
            null
        * */


    }
}
