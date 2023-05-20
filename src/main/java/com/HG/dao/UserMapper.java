package com.HG.dao;

import com.HG.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/19/10:53
 * @Description:
 **/


@Mapper
public interface UserMapper {

        ArrayList<User> All();


}
