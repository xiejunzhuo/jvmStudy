package com.study.demo.view.exception;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/24 21:43
 */
public class ExceptionA extends Exception {

    private String msg;

    public ExceptionA(){

    }

    public ExceptionA(String msg) {
        super(msg);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
