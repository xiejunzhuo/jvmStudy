package com.study.demo.view.exception;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/24 21:48
 */
public class TestException {

    /**
     * ExceptionA
     * @param args
     */
    public static void main(String[] args) {
        try {
            throw new ExceptionB("b");
        }catch (ExceptionA a){
            System.out.println("ExceptionA");
        }catch (Exception e){
            System.out.println("Exception");
        }
    }
}
