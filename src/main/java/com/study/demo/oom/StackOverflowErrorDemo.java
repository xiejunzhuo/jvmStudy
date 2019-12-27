package com.study.demo.oom;

/**
 *
 * Exception in thread "main" java.lang.StackOverflowError
 *
 * 递归调用，深度调用导致吧栈撑爆了
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/27 21:09
 */
public class StackOverflowErrorDemo {
    public static void main(String[] args) {
        genObject();
    }

    private static void genObject(){
        genObject();
    }

}
