package com.study.demo.view.abserver;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/14 17:28
 */
public class Subject {

    private List<IObserver> observers = new ArrayList<>();

    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state){
        this.state = state;
        notifyAllObserver();
    }

    public void attch(IObserver observer){
        observers.add(observer);
    }

    public void notifyAllObserver() {
        for (IObserver iObserver :observers){
            iObserver.update();
        }
    }
}
