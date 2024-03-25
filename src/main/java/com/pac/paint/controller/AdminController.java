package com.pac.paint.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.pac.paint.entity.Admin;
import com.pac.paint.mapper.AdminMapper;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost")
public class AdminController {

    @Autowired
    private AdminMapper aMapper;
    @GetMapping("/adminlogin")
    public long login(Admin admin){
        if(StringUtils.isEmpty(admin.getUserName()) || StringUtils.isEmpty(admin.getPassWord())) {
            return 0;
        }
        QueryWrapper wrapper = new QueryWrapper();
        wrapper.eq("userName", admin.getUserName());
        wrapper.eq("password", admin.getPassWord());
        long num = aMapper.selectCount(wrapper);
        if (num>0) return 1;
        else return 0;
    }
}
