package com.xur.controller;

import com.xur.entity.User;
import com.xur.service.UserService;
import com.xur.servlet.redis.RedisUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/User")
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisUtils redisUtils;

    @RequestMapping("/hello")
    public String index() {
        return"Hello World";
    }

    @RequestMapping("/get")
    @ResponseBody
    public String get(User user) {

        User u=userService.getNameById(user);
        redisUtils.set("xur","miss2");
        return u.toString();
    }

}
