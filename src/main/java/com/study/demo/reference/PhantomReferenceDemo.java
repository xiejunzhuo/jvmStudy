package com.study.demo.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/**
 * 虚引用
 *
 * PhantomReference的get方法总是返回null,
 * 因此无法访问对应的引用对象。其意义在于说明一
 * 个对象已经进入finalization阶段，可以被gc回收，
 * 用来实现比finalization机制更灵活的回收操作。
 *
 *
 *换句话说，设置虛引用关联的唯一目的，就是在这个对象
 *被收集器回收的时候收到一个系统通知或者后续添加进一-步的处理。
 *Java技术允许使用finalize()方法在垃圾收集器将对象从内存中清除出去之前做必要的清理工作。
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/29 10:18
 */
public class PhantomReferenceDemo {

    /**k
     *
     * java.lang.Object@1b6d3586
     * null
     * null
     * =============================================
     * null
     * null
     * java.lang.ref.PhantomReference@4554617cxx
     * @param args
     */
    public static void main(String[] args) {
        Object object = new Object();
        ReferenceQueue<Object> referenceQueue = new ReferenceQueue<Object>();
        PhantomReference<Object> phantomReference = new PhantomReference<Object>(object,referenceQueue);
        System.out.println(object);
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());
        System.out.println("=============================================");

        object= null;
        System.gc();
        System.out.println(object);
        System.out.println(phantomReference.get());
        System.out.println(referenceQueue.poll());


    }
}
