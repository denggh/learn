package com.denggh.mybatisstudy.dao;

import com.denggh.mybatisstudy.entity.SysUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SysUserMapper extends BaseMapper<SysUser>{
    int deleteByPrimaryKey(String id);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    @Select("select * from sys_user")
    List<SysUser> findAll();
}