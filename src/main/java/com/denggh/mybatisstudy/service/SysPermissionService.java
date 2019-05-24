package com.denggh.mybatisstudy.service;

import com.denggh.mybatisstudy.entity.SysPermission;

import java.util.List;

/**
 * @author ：denggh
 * @date ：Created in 2019/5/20 17:38
 * @description：
 */
public interface SysPermissionService {
    List<SysPermission> queryByUser(String username);
}
