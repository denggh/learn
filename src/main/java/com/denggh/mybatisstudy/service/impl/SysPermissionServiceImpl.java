package com.denggh.mybatisstudy.service.impl;

import com.denggh.mybatisstudy.entity.SysPermission;
import com.denggh.mybatisstudy.service.SysPermissionService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author ：denggh
 * @date ：Created in 2019/5/20 17:41
 * @description：
 */
@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Override
    public List<SysPermission> queryByUser(String username) {
        return null;
    }
}
