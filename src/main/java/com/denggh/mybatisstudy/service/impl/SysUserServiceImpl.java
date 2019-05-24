package com.denggh.mybatisstudy.service.impl;

import com.denggh.mybatisstudy.dao.SysRoleMapper;
import com.denggh.mybatisstudy.dao.SysUserMapper;
import com.denggh.mybatisstudy.entity.SysUser;
import com.denggh.mybatisstudy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：denggh
 * @date ：Created in 2019/5/20 10:51
 * @description：
 */
@Service
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public List<SysUser> findAllUser() {
        return sysUserMapper.findAll();
    }

    @Override
    public List<String> getRole(String username) {
        return sysRoleMapper.getRoleByUsername(username);
    }

    @Override
    public SysUser getUserByName(String username) {
        return null;
    }
}
