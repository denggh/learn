package com.denggh.mybatisstudy.controller;

import com.denggh.mybatisstudy.common.Result;
import com.denggh.mybatisstudy.service.SysUserService;
import com.denggh.mybatisstudy.shiro.util.JwtUtil;
import com.denggh.mybatisstudy.util.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：denggh
 * @date ：Created in 2019/5/17 11:53
 * @description：
 */
@Api(value = "用户接口")
@RestController(value = "/sys/user")
public class SysUserController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("login")
    @ApiOperation("登录接口")
    public Result login(String username, String password) {
        if (username.equalsIgnoreCase("admin") && password.equalsIgnoreCase("111111")) {

            //生成token
            String token = JwtUtil.sign(username,password);
            redisUtil.set("PREFIX_USER_TOKEN " + token,token);
            redisUtil.expire("PREFIX_USER_TOKEN " + token,JwtUtil.EXPIRE_TIME/1000);
            return Result.ok("登录成功");
        } else {
            return Result.error(500, "用户名或者密码错误");
        }
    }

    @GetMapping("list")
    @ApiOperation("查询所有用户")
    public Result findAllUser(){
        return Result.ok(sysUserService.findAllUser());
    }

    @GetMapping("test")
    @ApiOperation("测试")
    public Result test(){
        return Result.ok("测试成功");
    }
}
