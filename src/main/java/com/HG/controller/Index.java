package com.HG.controller;

import com.HG.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/19/8:29
 * @Description:
 **/

@Controller
public class Index {
    @RequestMapping("/index/{username}/{password}")
    public String getIndex(@PathVariable("username") String name, @PathVariable("password") String pswd,Model model) {
        User user = new User(name, pswd);
        System.out.println(user);

        model.addAttribute("user", user);
        return "success";
    }
}
