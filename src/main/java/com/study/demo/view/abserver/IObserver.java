package com.study.demo.view.abserver;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/14 17:27
 */
public abstract class IObserver {
    protected Subject subject;
    public abstract void update();
}
