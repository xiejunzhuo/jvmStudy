package com.study.demo.view.abserver;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/14 17:41
 */
public class ThirdObserver extends IObserver {

    public ThirdObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println( "Third String: "
                + Integer.toHexString( subject.getState() ).toUpperCase() );
    }
}
