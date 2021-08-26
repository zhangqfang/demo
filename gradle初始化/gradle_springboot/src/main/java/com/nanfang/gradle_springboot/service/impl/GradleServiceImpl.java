package com.nanfang.gradle_springboot.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.nanfang.gradle_springboot.mapper.GradleMapper;
import com.nanfang.gradle_springboot.pojo.User;
import com.nanfang.gradle_springboot.pojo.UserEnum;
import com.nanfang.gradle_springboot.service.GrodleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GradleServiceImpl implements GrodleService {
    @Autowired
    private GradleMapper gradleMapper;
    @Override
    public List<User> findAll() {

        User user = new User();
        user.setId(0);
        user.setUserName("");
        user.setPassword("");
        user.setName("");
        user.setAge(0);
        user.setEmail("");
        user.setSix(UserEnum.SIX_MAN.getCode());

        QueryWrapper<User> query = new QueryWrapper<>();
        List<User> userList = gradleMapper.selectList(query);
        return userList;
    }
}
