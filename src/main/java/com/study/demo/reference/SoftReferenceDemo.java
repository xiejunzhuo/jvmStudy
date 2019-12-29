package com.study.demo.reference;

import java.lang.ref.SoftReference;

/**软引用
 * 软引用是一一种相对强张用弱化了- -些的引用，需要用java.lang.ref. SoftReference类来实现，
 * 可以让对象豁免一些垃圾收集。
 * 对于只有软引用的对象来说，
 * 当系统内存充足时它不会 被 回收，
 * 当系统内存不足时它  会被回收。
 * 软引用通常用在对内存敏感的程序中，比如高速缓存就有用到软引用，内存够用的时候就保留，不够用就回收!
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/28 21:58
 */
public class SoftReferenceDemo {

    public static void main(String[] args) {
//        memeryEnough();
        memeryNotEnough();
    }

    /**
     * 内存充足时不会被回收
     * 默认大小为物理内存的1/4
     * java.lang.Object@1b6d3586
     * java.lang.Object@1b6d3586
     * =========================
     * java.lang.Object@1b6d3586
     */
    public static void memeryEnough(){
        Object object1 = new Object();
        SoftReference<Object> softReference = new SoftReference<Object>(object1);
        System.out.println(object1);
        //获取软引用对象用get方法
        System.out.println(softReference.get());
        System.out.println("=========================");
        object1 = null;

        System.gc();
        System.out.println(softReference.get());

    }

    /**
     * jvm配置，故意产生大对象并设置小内存，导致出现oom看垃圾回收状况
     * -Xms5m -Xmx5m -XX:+PrintGCDetails
     */
    public static void memeryNotEnough(){
        Object object1 = new Object();
        SoftReference<Object> softReference = new SoftReference<Object>(object1);
        System.out.println(object1);
        //获取软引用对象用get方法
        System.out.println(softReference.get());
        System.out.println("=========================");
        object1 = null;
        //内存不够是自动gc，不需要手动调用
//        System.gc();
        try {
            byte[] bytes = new byte[30*1024*1024];
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }finally {
            System.out.println(object1);
            System.out.println(softReference.get());
        }

    }
    /*
    * java.lang.Object@1b6d3586
java.lang.Object@1b6d3586
=========================
[GC (Allocation Failure) [PSYoungGen: 1070K->504K(1536K)] 1174K->648K(5632K), 0.0010777 secs] [Times: user=0.05 sys=0.00, real=0.00 secs]
[GC (Allocation Failure) [PSYoungGen: 504K->488K(1536K)] 648K->648K(5632K), 0.0009687 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Allocation Failure) [PSYoungGen: 488K->0K(1536K)] [ParOldGen: 160K->614K(4096K)] 648K->614K(5632K), [Metaspace: 3215K->3215K(1056768K)], 0.0078493 secs] [Times: user=0.00 sys=0.00, real=0.01 secs]
[GC (Allocation Failure) [PSYoungGen: 0K->0K(1536K)] 614K->614K(5632K), 0.0003978 secs] [Times: user=0.00 sys=0.00, real=0.00 secs]
[Full GC (Allocation Failure) java.lang.OutOfMemoryError: Java heap space
	at com.study.demo.reference.SoftReferenceDemo.memeryNotEnough(SoftReferenceDemo.java:61)
	at com.study.demo.reference.SoftReferenceDemo.main(SoftReferenceDemo.java:21)
[PSYoungGen: 0K->0K(1536K)] [ParOldGen: 614K->596K(4096K)] 614K->596K(5632K), [Metaspace: 3215K->3215K(1056768K)], 0.0068656 secs] [Times: user=0.03 sys=0.00, real=0.01 secs]
null
null
    * */

}
