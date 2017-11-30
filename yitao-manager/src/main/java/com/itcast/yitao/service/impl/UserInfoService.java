//package com.itcast.yitao.service.impl;
//
//import com.itcast.yitao.dao.IUserInfoDao;
//import com.itcast.yitao.pojo.UserInfo;
//import com.itcast.yitao.service.IUserInfoService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
///**
// * Created by 311198 on 2017/3/29.
// */
//@Service
//public class UserInfoService implements IUserInfoService{
//
//    @Autowired
//    private IUserInfoDao userInfoDao;
//
//    @Override
//    public void addUser(UserInfo userInfo) {
//        userInfoDao.addUser(userInfo);
//    }
//
//    @Override
//    public UserInfo queryUserByUserId(String userId) {
//        return userInfoDao.queryUserByUserId(userId);
//    }
//
//    @Override
//    public void deleteUserByUserId(String userId) {
//
//    }
//
//    @Override
//    public void updateUser(String userId) {
//
//    }
//}
