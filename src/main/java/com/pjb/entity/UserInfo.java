package com.pjb.entity;

/**
 * 用户信息实体类
 * @author pan_junbiao
 **/
public class UserInfo
{
    private int userId; //用户编号
    private String userAccount; //用户账号
    private String userPassword; //用户密码
    private String blogUrl; //博客地址
    private String blogRemark; //博客备注

    //省略getter与setter方法...

    public int getUserId()
    {
        return userId;
    }

    public void setUserId(int userId)
    {
        this.userId = userId;
    }

    public String getUserAccount()
    {
        return userAccount;
    }

    public void setUserAccount(String userAccount)
    {
        this.userAccount = userAccount;
    }

    public String getUserPassword()
    {
        return userPassword;
    }

    public void setUserPassword(String userPassword)
    {
        this.userPassword = userPassword;
    }

    public String getBlogUrl()
    {
        return blogUrl;
    }

    public void setBlogUrl(String blogUrl)
    {
        this.blogUrl = blogUrl;
    }

    public String getBlogRemark()
    {
        return blogRemark;
    }

    public void setBlogRemark(String blogRemark)
    {
        this.blogRemark = blogRemark;
    }
}
