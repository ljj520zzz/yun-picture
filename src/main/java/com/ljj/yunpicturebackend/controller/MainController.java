package com.ljj.yunpicturebackend.controller;

import com.ljj.yunpicturebackend.common.BaseResponse;
import com.ljj.yunpicturebackend.common.ResultUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.transform.Result;

@RestController
@RequestMapping("/")
public class MainController {
    /**
     * 健康检查
     */
    @RequestMapping("/health")
    public BaseResponse<String> health() {
        return ResultUtils.success("ok");
    }
}
