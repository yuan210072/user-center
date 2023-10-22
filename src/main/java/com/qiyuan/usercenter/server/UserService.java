package com.qiyuan.usercenter.server;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qiyuan.usercenter.model.User;

import javax.servlet.http.HttpServletRequest;

/**
* @author Q源
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-10-18 15:42:52
*/
public interface UserService extends IService<User> {
    /**
     * 用户注册
     * @param userAccount 用户账户
     * @param userPassword 用户密码
     * @param checkPassword 确认密码
     * @return 新用户id
     */
    Long userRegister(String userAccount,String userPassword,String checkPassword,String planetCode);

    /**
     * @param userAccount  用户账号
     * @param userPassword 密码
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 密码脱敏
     * @param originUser
     * @return
     */

    User getSafetyUser(User originUser);

    /**
     * 请求用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
