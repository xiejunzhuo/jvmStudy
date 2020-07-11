package com.study.demo.view;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

/**
 * <p>获取方法上的注解值</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/14 20:21
 */
public class TestAnn {
    public static void main(String[] args)throws Exception {
        //获取方法上的注解
        Dog dog = new Dog();
        Method eat = dog.getClass().getMethod("eat");
        VIP annotation = eat.getAnnotation(VIP.class);
        String start = annotation.start();
        System.out.println(start);

    }
}

/**
 * @author ljc
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface VIP{
    String start() default "";
}

class Dog{

    @VIP(start = "五颗星")
    public void eat(){

    }
}