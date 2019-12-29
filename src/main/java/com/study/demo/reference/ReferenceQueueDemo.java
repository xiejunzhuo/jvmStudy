package com.study.demo.reference;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/**
 *
 * y引用队列
 *  我被回收前需要被引用队列保存下
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/29 10:25
 */
public class ReferenceQueueDemo {
   /**
    *  java.lang.Object@1b6d3586
    *  java.lang.Object@1b6d3586
    *  null
    *  ============================
    *   null
    *   null
    *   java.lang.ref.WeakReference@4554617c
    *   */
    public static void main(String[] args) {
        Object object = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        WeakReference<Object> weakReference = new WeakReference<Object>(object,referenceQueue);
        System.out.println(object);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
        System.out.println("============================");
        object = null;
        System.gc();
        System.out.println(object);
        System.out.println(weakReference.get());
        System.out.println(referenceQueue.poll());
    }
}
