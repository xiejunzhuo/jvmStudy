package com.study.demo.view.exception;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/24 21:45
 */
public class ExceptionB extends ExceptionA {

    private String message;

    public ExceptionB(String message){
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
