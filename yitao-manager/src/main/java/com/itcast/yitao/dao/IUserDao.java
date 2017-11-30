package com.itcast.yitao.dao;

import com.itcast.yitao.pojo.UserEntity;

import java.util.List;

/**
 * Created by 311198 on 2016/12/1.
 */
public interface IUserDao {

    List<UserEntity> queryAllUser(int num );

    int counts();
}
