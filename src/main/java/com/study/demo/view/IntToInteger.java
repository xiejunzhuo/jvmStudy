package com.study.demo.view;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.Arrays;

/**
 * <p>intArray 将基本类型的数组转为包装类型的数组</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/14 20:00
 */
public class IntToInteger {

    public static void main(String[] args) {
        int [] intArray = {9,5,2,7};
        Integer[] integers = Arrays.stream(intArray).boxed().toArray(Integer[]::new);
        System.out.println(Arrays.toString(integers));
    }
}
