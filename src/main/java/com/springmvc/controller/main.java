package com.springmvc.controller;

import com.springmvc.pojo.User;
import com.springmvc.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;


@Controller
public class main {

    @Resource
    UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "hello world";
    }

    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @ResponseBody
    public int insertUser(User user){
        return userService.insertUser(user);

    }
    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @ResponseBody
    public User getUser(@PathVariable Integer id){
        return userService.getUser(id);

    }
}