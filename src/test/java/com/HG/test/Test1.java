package com.HG.test;

import com.HG.Service.UserService;
import com.HG.dao.Impl.UserServiceImpl;
import com.HG.dao.UserMapper;
import com.HG.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/20/23:53
 * @Description:
 **/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test1 {

    @Autowired
    private UserService userService;
    @Test
    public void testFindUserList(){
        List<User> userList = userService.All();
        System.out.println(userList);
    }

}

