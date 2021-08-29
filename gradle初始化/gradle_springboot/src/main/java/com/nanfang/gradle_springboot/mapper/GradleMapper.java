package com.nanfang.gradle_springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.nanfang.gradle_springboot.pojo.User;

import java.util.List;

public interface GradleMapper extends BaseMapper<User> {

    public List<User>findAll();
}
