package com.pjb.service.impl;

import com.pjb.entity.UserInfo;
import com.pjb.mapper.UserMapper;
import com.pjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 用户信息业务逻辑类
 * @author pan_junbiao
 **/
@Service
public class UserServiceImpl implements UserService
{

    @Autowired
    private UserMapper userMapper;

    /**
     * 新增用户，并获取自增主键
     */
    public int insertUser(UserInfo userInfo)
    {
        return userMapper.insertUser(userInfo);
    }

    /**
     * 修改用户
     */
    public int updateUser(UserInfo userInfo)
    {
        return userMapper.updateUser(userInfo);
    }

    /**
     * 删除用户
     */
    public int deleteUser(int userId)
    {
        return userMapper.deleteUser(userId);
    }

    /**
     * 根据用户ID，获取用户信息
     */
    public UserInfo getUserById(int userId)
    {
        return userMapper.getUserById(userId);
    }
}
