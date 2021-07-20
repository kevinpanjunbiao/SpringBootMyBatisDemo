package com.pjb.service;

import com.pjb.entity.UserInfo;

/**
 * 用户信息业务逻辑接口
 * @author pan_junbiao
 **/
public interface UserService
{
    /**
     * 新增用户，并获取自增主键
     */
    public int insertUser(UserInfo userInfo);

    /**
     * 修改用户
     */
    public int updateUser(UserInfo userInfo);

    /**
     * 删除用户
     */
    public int deleteUser(int userId);

    /**
     * 根据用户ID，获取用户信息
     */
    public UserInfo getUserById(int userId);
}
