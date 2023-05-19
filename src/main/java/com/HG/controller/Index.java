package com.HG.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/19/8:29
 * @Description:
 **/

@Controller
public class Index {
    @RequestMapping("/index")
    public String getIndex(Model model) {
        model.addAttribute("name", "index");
        return "ssuccess";
    }
}
