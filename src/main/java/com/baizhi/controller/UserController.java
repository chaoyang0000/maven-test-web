package com.baizhi.controller;

import com.baizhi.entity.User;
import com.baizhi.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/getAll")


    public String getAll(Map map) {
        List<User> list = userService.getAll();
        map.put("list", list);
        return "success";
    }
}
