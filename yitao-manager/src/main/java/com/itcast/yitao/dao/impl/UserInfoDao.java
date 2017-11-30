//package com.itcast.yitao.dao.impl;
//
//import com.itcast.yitao.dao.BaseDao;
//import com.itcast.yitao.dao.IUserInfoDao;
//import com.itcast.yitao.pojo.UserInfo;
//import org.springframework.stereotype.Component;
//
///**
// * Created by 311198 on 2017/3/29.
// */
//@Component
//public class UserInfoDao extends BaseDao implements IUserInfoDao {
//
//    @Override
//    public void addUser(UserInfo userInfo) {
//        getSqlSession().insert("com.itcast.yitao.manager.userInfo.mapper.addUserInfo",userInfo);
//    }
//
//    @Override
//    public UserInfo queryUserByUserId(String userId) {
//
//
//        return getSqlSession().selectOne("com.itcast.yitao.manager.userInfo.mapper.queryUserByUserId",userId);
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
