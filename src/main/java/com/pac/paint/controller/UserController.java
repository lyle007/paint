package com.pac.paint.controller;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pac.paint.entity.User;
import com.pac.paint.mapper.UserMapper;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import  java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @PostMapping("/login")
    public long login(User user){
        if(StringUtils.isEmpty(user.getUserName()) || StringUtils.isEmpty(user.getPassWord())) {
            return 0;
        }
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("userName", user.getUserName());
        wrapper.eq("password", user.getPassWord());
        long num = userMapper.selectCount(wrapper);
        if (num>0) return 1;
        else return 0;
    }

    @GetMapping("/userList")
    public List getUserlist()
    {
        List userList = userMapper.selectList(null);
        return userList;
    }

    @GetMapping("/user/{id}")
    public User getUserById(@PathVariable int id)
    {
        User user = userMapper.selectById(id);
        return user;
    }

    @PostMapping("/user")
    public String save(User user) {
        int i = userMapper.updateById(user);
        if (i > 0)
             return "Save Success";
        else return "Save failed";
    }



}
