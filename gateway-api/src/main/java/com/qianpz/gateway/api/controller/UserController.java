package com.qianpz.gateway.api.controller;

import com.qianpz.gateway.common.result.JsonResVO;
import com.qianpz.gateway.core.service.module.user.UserService;
import com.qianpz.gateway.core.service.vo.user.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qianpengzhan
 * @DESC ${DESCRIPTION}
 * @create 2018-06-01 00:27
 * @email qianpz@jcgroup.com.cn
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("/User/Info")
    JsonResVO insertUser(@RequestBody UserVO userVO){
        UserVO insert = userService.insert(userVO);
        return JsonResVO.buildSuccess(insert);
    }
}
