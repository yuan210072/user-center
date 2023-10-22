package com.qiyuan.usercenter.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @author Q源
 */
@Data
public class UserRegisterRequest implements Serializable {


    private static final long serialVersionUID = -4533773498183268222L;
    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String planetCode;
}
