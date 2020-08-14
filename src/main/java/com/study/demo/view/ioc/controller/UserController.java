package com.study.demo.view.ioc.controller;

import com.study.demo.view.ioc.service.UserService;

/**
 * <p>${描述}</p>
 *
 * @author ljc
 * @version 1.0
 * @date 2020/8/3 22:17
 */
public class UserController {

    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
