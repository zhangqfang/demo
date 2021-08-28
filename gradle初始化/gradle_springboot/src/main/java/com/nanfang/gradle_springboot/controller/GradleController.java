package com.nanfang.gradle_springboot.controller;

import com.nanfang.gradle_springboot.pojo.User;
import com.nanfang.gradle_springboot.service.GrodleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(value = "Gradle测试",tags = "项目练习")
public class GradleController {
    @Autowired
    private GrodleService grodleService;

    @GetMapping("/findAll")
    @ApiOperation(value = "findAll",tags = "查询全部用户")
    public List<User> findAll() {
        return grodleService.findAll();
    }
}
