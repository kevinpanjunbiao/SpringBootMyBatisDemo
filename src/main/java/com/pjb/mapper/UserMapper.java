package com.pjb.mapper;

import com.pjb.entity.UserInfo;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

/**
 * 用户信息Mapper动态代理接口
 * @author pan_junbiao
 **/
@Mapper
@Repository
public interface UserMapper
{
    /**
     * 新增用户，并获取自增主键
     */
    @Insert("INSERT INTO tb_user(user_account,user_password,blog_url,blog_remark) VALUES(#{userAccount},#{userPassword},#{blogUrl},#{blogRemark})")
    @Options(useGeneratedKeys = true, keyColumn = "user_id", keyProperty = "userId")
    //或者：@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyColumn = "user_id", keyProperty = "userId",before = false, resultType = Integer.class)
    public int insertUser(UserInfo userInfo);

    /**
     * 修改用户
     */
    @Update("UPDATE tb_user SET user_account = #{userAccount} ,user_password = #{userPassword} ,blog_url=#{blogUrl} ,blog_remark=#{blogRemark} WHERE user_id = #{userId}")
    public int updateUser(UserInfo userInfo);

    /**
     * 删除用户
     */
    @Delete("DELETE FROM tb_user WHERE user_id = #{userId}")
    public int deleteUser(int userId);

    /**
     * 根据用户ID，获取用户信息
     */
    @Select("SELECT * FROM tb_user WHERE user_id = #{userId}")
    public UserInfo getUserById(int userId);
}