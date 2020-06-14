package com.study.demo.gc;

import java.nio.channels.Selector;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/13 9:42
 */
public class Sequence {

    Select select = new Select();
    ReverseSelector select2 = new ReverseSelector();
    Object []objects = new Object[5];

    public int i = 0;
    public void add (Object object) {
        if (i< this.objects.length-1){
            objects[i] = object;
            i ++;
        }
    }

    class Select {
        public void  getObejct(){
            for(Object obj :objects){
                System.out.println(obj);
            }
        }
    }

    class ReverseSelector{
        public void  getObejct(){
            for(int j = objects.length-1;j>=0 ;j--){
                System.out.println(objects[j]);
            }
        }
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence();
        sequence.add("ssss");
        sequence.add("www");
        sequence.add("sswwwss");
        sequence.add("segsgsss");

        sequence.select.getObejct();

        System.out.println("-----------------------------");
        sequence.select2.getObejct();
    }
}
