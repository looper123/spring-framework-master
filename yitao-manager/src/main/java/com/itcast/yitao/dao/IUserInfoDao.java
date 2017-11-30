package com.itcast.yitao.dao;

import com.itcast.yitao.pojo.UserInfo;

/**
 * Created by 311198 on 2017/3/29.
 */
public interface IUserInfoDao {

    void addUser(UserInfo userInfo);

    UserInfo queryUserByUserId(String userId);

    void deleteUserByUserId(String userId);

    void updateUser(String userId);
}
