package com.itcast.yitao.service.impl;

import com.itcast.yitao.dao.IUserDao;
import com.itcast.yitao.pojo.UserEntity;
import com.itcast.yitao.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by 311198 on 2016/12/1.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private IUserDao userDao;

    public List<UserEntity> queryAllUser( int num){
        return userDao.queryAllUser(num);
    }

    @Override
    public int counts() {
        return userDao.counts();
    }


}
