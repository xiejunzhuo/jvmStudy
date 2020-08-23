package com.study.demo.view.swatch;

/**
 * <p>不适用中间变量，交换数值</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/23 11:30
 */
public class ChangeValue {

    public static void main(String[] args) {
//        firstMethod();

//        userAddMethod();
        use();

    }

    private static void use() {
        int a=2,b=4;
        a = a * b; //a = 2 * 4 = 8
        b = a / b; //b = 8 / 4 = 2
        a = a / b; //a = 8 / 2 =4

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    private static void userAddMethod() {
        int a=2,b=4;
        a = a + b; //a = 2 + 4 = 6
        b = a - b; //b = 6 - 4 = 2
        a = a - b; //a = 6 - 2 = 4

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }

    private static void firstMethod() {
        int a = 4;
        int b = 6;

        a = a^b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);

        b = a^b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
        a = a^b;

        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
