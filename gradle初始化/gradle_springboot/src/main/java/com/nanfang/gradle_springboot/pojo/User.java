package com.nanfang.gradle_springboot.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tb_user")
@ApiModel(description = "用户实体",value = "User")
public class User {
    @ApiModelProperty(notes = "用户id")
    private Integer id;
    @ApiModelProperty(notes = "用户账号")
    private String UserName;
    @ApiModelProperty(notes = "用户密码")
    private String password;
    @ApiModelProperty(notes = "用户名字")
    private String name;
    @ApiModelProperty(notes = "用户年纪")
    private Integer age;
    @ApiModelProperty(notes = "用户邮箱")
    private String email;
    @ApiModelProperty(notes = "用户性别")
    private Integer six;



}

