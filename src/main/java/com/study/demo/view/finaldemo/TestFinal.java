package com.study.demo.view.finaldemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/13 10:18
 */
public class TestFinal {

    public static void main(String[] args){
        final int i = 1;

//        i = 3;  你能修改

        System.out.println(i);


        final List<String>  listStr = new ArrayList<>();

        listStr.add("final修饰的数组内容可以改变，只是不能改变引用");

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);

//        list.forEach( item -> {i += item;});

    }
}
