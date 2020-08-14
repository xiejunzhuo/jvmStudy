package com.study.demo.view.ioc;

import com.study.demo.view.ioc.controller.UserController;
import com.study.demo.view.ioc.service.UserService;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/3 22:19
 */
public class MyTest {

    public static void main(String[] args) throws Exception{
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        UserService userService = new UserService();
        Field userServiceField = clazz.getDeclaredField("userService");
        userServiceField.setAccessible(true);
        //只有通过方法才能设置具体的属性值
        String name = userServiceField.getName();
        //拼接方法名称
        name = name.substring(0,1).toUpperCase()+ name.substring(1,name.length());

        String setName = "set"+name;
        //通过方法注入属性的对象
        Method method = clazz.getMethod(setName, UserService.class);
        //反射
        method.invoke(userController,userService);
        System.out.println(userController.getUserService());

    }
}
