package com.study.demo.view.abserver;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/14 17:43
 */
public class TestObserver {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new FirstObserver(subject);
        new SecondObserver(subject);
        new ThirdObserver(subject);



        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
