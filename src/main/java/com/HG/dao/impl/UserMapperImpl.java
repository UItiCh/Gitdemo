package com.HG.dao.impl;

import com.HG.dao.UserMapper;
import com.HG.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/19/10:54
 * @Description:
 **/

@Repository
public class UserMapperImpl implements UserMapper {

    private final SqlSessionTemplate sqlSessionTemplate;
    @Autowired
    public UserMapperImpl(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public User getUserById(int id) {
        return sqlSessionTemplate.selectOne("getUserById", id);
    }

    @Override
    public void insertUser(User user) {
        sqlSessionTemplate.insert("insertUser", user);
    }

    @Override
    public void updateUser(User user) {
        sqlSessionTemplate.update("updateUser", user);
    }

    @Override
    public void deleteUser(int id) {
        sqlSessionTemplate.delete("deleteUser", id);
    }
}
}
