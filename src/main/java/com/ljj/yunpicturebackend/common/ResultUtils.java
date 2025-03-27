package com.ljj.yunpicturebackend.common;

import com.ljj.yunpicturebackend.exception.ErrorCode;

/**
 * 响应结果工具类
 */
public class ResultUtils {
    /**
     * 成功响应
     * @param data 响应数据
     * @param <T> 响应数据类型
     * @return 响应结果
     */
    public static <T> BaseResponse<T> success(T data) {
        return new BaseResponse<T>(0, "success", data);
    }

    /**
     * 失败响应
     * @param errorCode 错误码
     * @return 响应结果
     */
    public static  BaseResponse<?> error(ErrorCode errorCode) {
        return new BaseResponse<>(errorCode);
    }
    /**
     * 失败响应
     * @param code 错误码
     * @param message 错误信息
     * @return 响应结果
     */
    public static  BaseResponse<?> error(int code, String message) {
        return new BaseResponse<>(code, message, null);
    }
    /**
     * 失败响应
     * @param errorCode 错误码
     *@param message 错误信息
     * @return 响应结果
     */
    public static  BaseResponse<?> error(ErrorCode errorCode, String message) {
        return new BaseResponse<>(errorCode.getCode(), message, null);
    }
}
