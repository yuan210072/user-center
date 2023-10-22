package com.qiyuan.usercenter.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用返回类
 * @param <T>
 */
@Data
public class BaseResponse<T> implements Serializable {
    //返回值状态码
    private int code;
    //返回值数据
    private T data;
    //返回消息
    private String message;
    //描述
    private String description;

    public BaseResponse(int code, T data, String message,String description) {
        this.code = code;
        this.data = data;
        this.message = message;
        this.description = description;
    }



    public BaseResponse(int code, T data) {
        this(code,data,"","");
    }
    public BaseResponse(int code, T data,String message) {
        this(code,data,message,"");
    }
    public BaseResponse(ErrorCode errorCode){
        this(errorCode.getCode(),null,errorCode.getMessage(),errorCode.getDescription());

    }
}
