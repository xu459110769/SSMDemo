package com.springmvc.service;

import com.springmvc.dao.UserMapper;
import com.springmvc.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service(value = "UserService")
public class UserService {
    @Resource
    private UserMapper userMapper;

    public User getUser(int id) {
        User u = this.userMapper.selectByPrimaryKey(id);
        if (u != null) {
            return u;
        }
        return null;
    }

    public int insertUser(User user)
    {
        return  this.userMapper.insert(user);
    }
}
