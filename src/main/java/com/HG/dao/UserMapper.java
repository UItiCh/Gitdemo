package com.HG.dao;

import com.HG.pojo.User;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/19/10:53
 * @Description:
 **/
public interface UserMapper {

        User getUserById(int id);
        void insertUser(User user);
        void updateUser(User user);
        void deleteUser(int id);

}
