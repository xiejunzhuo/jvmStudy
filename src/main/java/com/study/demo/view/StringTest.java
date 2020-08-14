package com.study.demo.view;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/7/11 8:54
 */
public class StringTest {
    public static void main(String[] args) {
        testString();
//
//        testFloat();
        testIntegerInt();


    }

    private static void testIntegerInt() {
        /**
         * false
         * true
         * true
         */
        Integer a = new Integer(3);
        Integer b = 3;
        int c = 3;
        System.out.println(a==b);//两个引用没有引用统一对象
        System.out.println(a==c); //自动拆箱成int
        System.out.println(b==c);

        System.out.println("================");

        /**
         * 简单的说，如果字面量的值在-128 到 127 之间，
         * 那么不会 new 新的 Integer 对象，
         * 而是直接引用常量池中的 Integer 对象，
         * 所以上面的面试题中 f1==f2 的 结果是 true，而 f3==f4 的结果是 false。
         * 越是貌似简单的面试题其中的玄机就 越多，需要面试者有相当深厚的功力
         */
        Integer f1 = 100,f2 =100,f3 =150,f4 =150;
        System.out.println(f1 == f2);
        System.out.println(f3 == f4);
        //true
        //false
    }

    /**
     * short s1 = 1; s1 = s1 + 1;有错吗?short s1 = 1; s1 += 1;有错吗?
     * 答：对于 short s1 = 1; s1 = s1 + 1;
     * 由于 1 是 int 类型，因此 s1+1 运算结 果也是 int 型，
     * 需要强制转换类型才能赋值给 short 型。
     * 而 short s1 = 1; s1 += 1;可以正确编译，
     * 因为 s1+= 1;相当于 s1 = (short)(s1 + 1);
     * 其中有隐含 的强制类型转换。
     */
    private static void testFloat() {
        short s1 = 1;
//        s1 = s1+1; 编译报错
        short s2 =2 ;
        s2+=1;
    }

    private static void testString() {
        String string = "tom";
        String string1 = new String("tom");
        String string2 = new String("tom");
        System.out.println(string == string1);
        System.out.println(string1 == string2);
        System.out.println(string == string1);
        /**
         * false
         * false
         * false
         */

        String string4 = "programming";
        String string5 = new String("programming");
        String string6 = "program" + "ming";
        System.out.println(string4 == string5);
        System.out.println(string4 == string6);
        System.out.println(string4.equals(string5));
        System.out.println(string4.equals(string5));
        System.out.println(string4.intern()==string5.intern());
        //false
        //true
        //true
        //true
        //true
    }
}
