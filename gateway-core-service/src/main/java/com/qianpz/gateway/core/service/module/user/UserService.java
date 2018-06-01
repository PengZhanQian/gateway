package com.qianpz.gateway.core.service.module.user;

import com.qianpz.gateway.core.service.vo.user.UserVO;

/**
 * @author qianpengzhan
 * @DESC ${DESCRIPTION}
 * @create 2018-05-31 10:39
 * @email qianpz@jcgroup.com.cn
 **/
public interface UserService {
    /**
     * 插入表
     * @param entity entity
     * @return Long
     */
    UserVO insert(UserVO entity);
}
