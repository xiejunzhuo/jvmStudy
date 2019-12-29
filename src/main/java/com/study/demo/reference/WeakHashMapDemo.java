package com.study.demo.reference;

import java.util.HashMap;
import java.util.WeakHashMap;

/**
 *
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/28 22:43
 */
public class WeakHashMapDemo {
    public static void main(String[] args) {
        myHashMap();
        System.out.println("============================");
        myWeakHashMap();
    }

    private static void myWeakHashMap() {
        WeakHashMap<Integer ,String> hashMap = new WeakHashMap<Integer, String>();
        Integer key = new Integer(2);
        String value = "weakHashMap";
        hashMap.put(key,value);
        System.out.println(hashMap);

        System.out.println("===============");
        key = null;
        System.out.println(hashMap);

        System.gc();
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        /*
        {2=weakHashMap}
        ===============
        {2=weakHashMap}
        {}
        0
          此处的key和hashMap中的key没关系，


        */
    }
    private static void myHashMap() {
        HashMap<Integer ,String> hashMap = new HashMap<Integer, String>();
        Integer key = new Integer(1);
        String value = "hashMap";
        hashMap.put(key,value);
        System.out.println(hashMap);

        System.out.println("===============");
        key = null;
        System.out.println(hashMap);

        System.gc();
        System.out.println(hashMap);
        System.out.println(hashMap.size());
        /*{1=hashMap}
           ===============
          {1=hashMap}
          {1=hashMap}
          1
          此处的key和hashMap中的key没关系，


        */
    }
}
