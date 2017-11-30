package com.itcast.yitao.service;

import com.itcast.yitao.pojo.UserEntity;

import java.util.List;

/**
 * Created by 311198 on 2016/12/1.
 */
public interface IUserService {

    List<UserEntity> queryAllUser(int num);

    int counts();
}
