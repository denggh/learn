package com.denggh.mybatisstudy.service;

import com.denggh.mybatisstudy.entity.SysUser;

import java.util.List;

/**
 * @author ：denggh
 * @date ：Created in 2019/5/20 10:50
 * @description：
 */
public interface SysUserService {
    List<SysUser> findAllUser();

    List<String> getRole(String username);

    SysUser getUserByName(String username);
}
