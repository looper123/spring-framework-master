package com.itcast.yitao.dao;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import javax.annotation.Resource;

/**
 * Created by 311198 on 2016/12/1.
 */

public class BaseDao extends SqlSessionDaoSupport {

    @Resource(name="sqlSessionFactoryForMbi")
    public  void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){
          super.setSqlSessionFactory(sqlSessionFactory);
    }
}
