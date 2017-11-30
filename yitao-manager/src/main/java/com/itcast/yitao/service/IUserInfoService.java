package com.itcast.yitao.service;

import com.itcast.yitao.pojo.UserInfo;

/**
 * Created by 311198 on 2017/3/29.
 */
public interface IUserInfoService {

     void addUser(UserInfo userInfo);

     UserInfo queryUserByUserId(String userId);

     void deleteUserByUserId(String userId);

     void updateUser(String userId);
}
