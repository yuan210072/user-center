package com.qiyuan.usercenter.common;



/**
 * 自定义错误码
 */
public enum ErrorCode {
    //请求成功
    SUCCESS(0,"ok",""),
    //请求参数错误
    PARAMS_ERROR(40000,"请求参数错误",""),
    //请求数据错误
    NULL_ERROR(40001,"请求数据错误",""),
    //用户未登录
    NO_LOGIN(40100,"未登录",""),
    //用户没有该权限
    NO_AUTH(40101,"无权限",""),
    //系统内部异常
    SYSTEM_ERROR(50000,"系统内部异常","");
    /**
     * 状态码信息
     */
    private final int code;
    /**
     * 状态码描述详情
     */
    private final String message;
    /**
     * 描述信息
     */
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public String getDescription() {
        return description;
    }
}
