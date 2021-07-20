package com.pjb.controller;

import com.pjb.entity.UserInfo;
import com.pjb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * 用户控制器
 * @author pan_junbiao
 **/
@Controller
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    /**
     * 新增用户
     *
     * @author pan_junbiao
     */
    @RequestMapping("/insertUser")
    @ResponseBody
    public boolean insertUser()
    {
        boolean result = false;

        //创建新用户
        UserInfo userInfo = new UserInfo();
        userInfo.setUserAccount("pan_junbiao的博客");
        userInfo.setUserPassword("123456");
        userInfo.setBlogUrl("https://blog.csdn.net/pan_junbiao");
        userInfo.setBlogRemark("您好，欢迎访问 pan_junbiao的博客");
        int count = userService.insertUser(userInfo);

        //返回结果
        result = count > 0 ? true : false;
        return true;
    }

    /**
     * 修改用户
     *
     * @author pan_junbiao
     */
    @RequestMapping("/updateUser")
    @ResponseBody
    public boolean updateUser(int userId)
    {
        boolean result = false;

        //创建修改用户
        UserInfo userInfo = new UserInfo();
        userInfo.setUserId(userId);
        userInfo.setUserAccount("pan_junbiao的博客_02");
        userInfo.setUserPassword("123456");
        userInfo.setBlogUrl("https://blog.csdn.net/pan_junbiao");
        userInfo.setBlogRemark("您好，欢迎访问 pan_junbiao的博客");
        int count = userService.updateUser(userInfo);

        //返回结果
        result = count > 0 ? true : false;
        return true;
    }

    /**
     * 删除用户
     *
     * @author pan_junbiao
     */
    @RequestMapping("/deleteUser")
    @ResponseBody
    public boolean deleteUser(int userId)
    {
        boolean result = false;

        //执行删除用户
        int count = userService.deleteUser(userId);

        //返回结果
        result = count > 0 ? true : false;
        return true;
    }

    /**
     * 根据用户ID，获取用户信息
     *
     * @author pan_junbiao
     */
    @RequestMapping("/getUserById")
    public ModelAndView getUserById(int userId)
    {
        UserInfo userInfo = userService.getUserById(userId);

        //返回结果
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("userInfo", userInfo);
        modelAndView.setViewName("userInfo.html");
        return modelAndView;
    }
}
