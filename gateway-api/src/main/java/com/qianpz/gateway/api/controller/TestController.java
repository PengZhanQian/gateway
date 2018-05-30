package com.qianpz.gateway.api.controller;

import com.qianpz.gateway.common.result.JsonResVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianpengzhan
 * @DESC ${DESCRIPTION}
 * @create 2018-05-30 18:04
 * @email qianpz@jcgroup.com.cn
 **/
@RestController
public class TestController {


    @GetMapping("/test")
    JsonResVO test(){
        return JsonResVO.buildSuccess();
    }
}
