package com.study.demo.oom;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * JVM参教
 * <p>
 * -XX:Metaspacesize=8m -xx :MaxMetaspacesize= 8mJava 8及之后的版本使用Metaspace来替代永久代。
 * <p>
 * r Metaspace是方法区Hotspot中的实现，它与持久代最大的区别在f: Metaspace并不在虚拟机内存中而是使用本地内存
 * 也即在java8中classe metadata(the virtual machines internal presentation of Java class),被存储在叫做Metaspace i的native memory
 * <p>
 * 永久代(java8后被原空间Metaspace取代了) 存放了以下信息:
 * <p>
 * 虚拟机加载的类信息
 * 常量池
 * 静态变量
 * 即时编译后的代码
 * <p>
 * 模拟Metaspace空间溢出，我们不断生成类往元空间滞，类 古据的空间总是会超过Metaspace指定的空间大小r
 *
 * @author 谢君卓
 * @version 1.0
 * @date 2019/12/29 13:18
 */
public class MetaSpaceDemo {
    static class MetaSpaceOOmTest {
    }

    public static void main(final String[] args) {
        int i = 1;
        while (true) {
            i++;
            try {
                Enhancer enhancer = new Enhancer();
                enhancer.setSuperclass(MetaSpaceOOmTest.class);
                enhancer.setUseCache(false);
                enhancer.setCallback(new MethodInterceptor() {
                    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                        return methodProxy.invokeSuper(o, args);
                    }
                });
            } catch (Throwable e) {
                System.out.println("*************第：" + i + "个对象创建时异常");
                e.printStackTrace();
            }
        }
    }

}
