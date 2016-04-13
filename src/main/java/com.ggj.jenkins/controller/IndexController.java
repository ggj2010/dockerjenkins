package com.ggj.jenkins.controller;

import java.text.SimpleDateFormat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author:gaoguangjin
 * @Description:
 * @Email:335424093@qq.com
 * @Date 2016/4/13 13:09
 */
@Controller
public class IndexController {
    @RequestMapping(value = "index", method = RequestMethod.GET)
    public String index(Model model) throws InterruptedException {
        model.addAttribute("time", new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"));
        return "index";
    }
}
