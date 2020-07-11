package com.study.demo.view;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/6/14 22:32
 */
public class TestCount {
    public static void main(String[] args) {
        Count count = new Count();
        count.count(count.getCount()).getCount();
        new Count().count(count.getCount());
    }

    public static class Count{
        volatile  Integer count = 2018;
        public Count count(Integer count){
            System.out.println(++count);
            return this;
        }
        public Integer getCount(){
            System.out.println(++count);
            return count;
        }
    }


}
