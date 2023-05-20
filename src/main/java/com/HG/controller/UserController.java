package com.HG.controller;

import com.HG.Service.UserService;
import com.HG.dao.Impl.UserServiceImpl;
import com.HG.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/21/0:44
 * @Description:
 **/
@Controller
public class UserController {
    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ModelAndView getAllUsers() {
        ArrayList<User> allUsers = userService.All();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("users", allUsers);
        modelAndView.setViewName("all");
        return modelAndView;
    }
}
