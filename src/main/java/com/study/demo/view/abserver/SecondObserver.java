package com.study.demo.view.abserver;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/14 17:39
 */
public class SecondObserver extends IObserver
{
    public SecondObserver(Subject subject) {
        this.subject = subject;
        this.subject.attch(this);
    }

    @Override
    public void update() {
        System.out.println( "Second String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
