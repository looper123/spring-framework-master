package com.itcast.yitao.dao.impl;

import com.github.miemiedev.mybatis.paginator.domain.PageBounds;
import com.itcast.yitao.dao.BaseDao;
import com.itcast.yitao.dao.IUserDao;
import com.itcast.yitao.pojo.UserEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 311198 on 2016/12/1.
 */
@Component
public class UserDao extends BaseDao implements IUserDao {

    @Override
    public List<UserEntity> queryAllUser(int num) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("orgLevel", 1);
//        int page = 1; //页号
        int pageSize = 10; //每页数据条数
        PageBounds pageBounds = new PageBounds(num, pageSize);
        return getSqlSession().selectList("com.itcast.yitao.manager.user.mapper.selectAll", params,pageBounds);
    }

    @Override
    public int counts() {
        return getSqlSession().selectOne("com.itcast.yitao.manager.user.mapper.counts" );
    }
}
