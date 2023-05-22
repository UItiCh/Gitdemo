package com.HG.controller;

import com.HG.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/22/8:45
 * @Description:
 **/
@Controller
public class index {
    @RequestMapping("/index")
    public String getindex(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.getWriter().write("hello world");
        return "success";
    }

    @RequestMapping("/index2")
    @ResponseBody
    public String getindex2()  {
        return "hello world";
    }

    @RequestMapping("/index3")
    @ResponseBody
    public User getindex3()  {
        return new User(1,"admin","123456");
    }
}
