package com.qianpz.gateway.core.service.module.user.impl;

import com.qianpz.gateway.core.service.module.user.UserService;
import com.qianpz.gateway.core.service.vo.user.UserVO;
import com.qianpz.gateway.dal.auto.dao.UserDAO;
import com.qianpz.gateway.dal.auto.dataobject.UserDO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author qianpengzhan
 * @DESC ${DESCRIPTION}
 * @create 2018-05-31 10:39
 * @email qianpz@jcgroup.com.cn
 **/
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    UserDAO userDAO;

    @Override
    @Transactional
    public UserVO insert(UserVO entity) {
        if (entity != null){
            UserDO userDO = new UserDO();
            BeanUtils.copyProperties(entity,userDO);
            Long insert = userDAO.insert(userDO);
            if (insert == 1){
                UserVO userVO = new UserVO();
                BeanUtils.copyProperties(userDO,userVO);
                return userVO;
            }
        }
        return null;
    }
}
